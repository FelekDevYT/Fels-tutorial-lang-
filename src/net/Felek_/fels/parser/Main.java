package net.Felek_.fels.parser;

import java.util.List;

import net.Felek_.fels.parser.ast.Expression;

public class Main {
	public static void main(String[]args) {
		final String input = "2 + 2";
		final List<Token>tokens = new Lexer(input).tokenize();
		for(Token token : tokens) {
			System.out.println(token);
		}
		
		final List<Expression> expressions = new Parser(tokens).parse();
		for(Expression expr : expressions) {
			System.out.println(expr+" = "+expr.eval());
		}
	}
}
