package com.devdaniel.icss.Service;

import com.devdaniel.icss.ICSSModel;
import com.devdaniel.icss.Service.icss.ast.AST;
import com.devdaniel.icss.Service.icss.checker.Checker;
import com.devdaniel.icss.Service.icss.checker.SemanticError;
import com.devdaniel.icss.Service.icss.generator.Generator;
import com.devdaniel.icss.Service.icss.parser.ASTListener;
import com.devdaniel.icss.Service.icss.parser.ICSSLexer;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import com.devdaniel.icss.Service.icss.transforms.EliminateOptionals;
import com.devdaniel.icss.Service.icss.transforms.EvalExpressions;
import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;
import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class IcssService implements ANTLRErrorListener{

    private List<String> errors;

    public ICSSModel parse (ICSSModel icssModel) throws Exception {
        errors = new ArrayList<>();
        AST ast = this.parseToAST(icssModel.getIcss());
        if( errors.isEmpty()) {
            this.check(ast);
            this.transform(ast);
            icssModel.setCss(this.generate(ast));
            return icssModel;
        } else {
            throw new SyntaxException(errors.get(0));
        }

    }

    private AST parseToAST (String icss) {
        CharStream inputStream = CharStreams.fromString(icss);
        ICSSLexer lexer = new ICSSLexer(inputStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(this);
        try {

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //Parse (with Antlr's generated parser)
            ICSSParser parser = new ICSSParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(this);

            ParseTree parseTree = parser.stylesheet();

            ASTListener listener = new ASTListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, parseTree);

            return listener.getAST();

        } catch (RecognitionException e) {
            throw new InternalException("Something went wrong");

        } catch (ParseCancellationException e) {
            throw new SyntaxException("Syntax Error");
        }
    }

    private void check (AST ast) throws Exception {
        if (ast != null) {

            (new Checker()).check(ast);

            ArrayList<SemanticError> errors = ast.getErrors();
            if (!errors.isEmpty()) {
                throw new Exception(errors.toString());
            }
        }
    }

    private void transform (AST ast) {
        if (ast != null && ast.checked) {

            new EvalExpressions().apply(ast);
            new EliminateOptionals().apply(ast);
        }
    }

    private String generate(AST ast) {
        if (ast != null && ast.checked) {

            Generator generator = new Generator();
            return generator.generate(ast);
        }

        return "";
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        this.errors.add("Syntax error: " + s);
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

    }
}
