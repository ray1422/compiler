// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CactusParser}.
 */
public interface CactusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CactusParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(CactusParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(CactusParser.TokenContext ctx);
}