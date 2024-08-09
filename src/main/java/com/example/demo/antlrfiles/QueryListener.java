package com.example.demo.antlrfiles;// Generated from Query.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueryParser}.
 */
public interface QueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(QueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(QueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(QueryParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(QueryParser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(QueryParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(QueryParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#keyValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePairs(QueryParser.KeyValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#keyValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePairs(QueryParser.KeyValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(QueryParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(QueryParser.KeyValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(QueryParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(QueryParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(QueryParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(QueryParser.ValueContext ctx);
}