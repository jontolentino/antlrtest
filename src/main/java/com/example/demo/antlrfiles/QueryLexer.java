package com.example.demo.antlrfiles;// Generated from Query.g4 by ANTLR 4.13.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class QueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NULL=9, 
		ID=10, NUMBER=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "NULL", 
			"ID", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'FROM'", "'('", "')'", "'SELECT'", "'ADD'", "';'", "','", "'='", 
			"'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "NULL", "ID", "NUMBER", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public QueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Query.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\fV\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0005\t;\b\t\n\t\f\t>\t\t\u0001\t\u0003\tA\b\t\u0001"+
		"\n\u0004\nD\b\n\u000b\n\f\nE\u0001\n\u0001\n\u0004\nJ\b\n\u000b\n\f\n"+
		"K\u0003\nN\b\n\u0001\u000b\u0004\u000bQ\b\u000b\u000b\u000b\f\u000bR\u0001"+
		"\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0001\u0000\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  [\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003\u001e\u0001"+
		"\u0000\u0000\u0000\u0005 \u0001\u0000\u0000\u0000\u0007\"\u0001\u0000"+
		"\u0000\u0000\t)\u0001\u0000\u0000\u0000\u000b-\u0001\u0000\u0000\u0000"+
		"\r/\u0001\u0000\u0000\u0000\u000f1\u0001\u0000\u0000\u0000\u00113\u0001"+
		"\u0000\u0000\u0000\u0013@\u0001\u0000\u0000\u0000\u0015C\u0001\u0000\u0000"+
		"\u0000\u0017P\u0001\u0000\u0000\u0000\u0019\u001a\u0005F\u0000\u0000\u001a"+
		"\u001b\u0005R\u0000\u0000\u001b\u001c\u0005O\u0000\u0000\u001c\u001d\u0005"+
		"M\u0000\u0000\u001d\u0002\u0001\u0000\u0000\u0000\u001e\u001f\u0005(\u0000"+
		"\u0000\u001f\u0004\u0001\u0000\u0000\u0000 !\u0005)\u0000\u0000!\u0006"+
		"\u0001\u0000\u0000\u0000\"#\u0005S\u0000\u0000#$\u0005E\u0000\u0000$%"+
		"\u0005L\u0000\u0000%&\u0005E\u0000\u0000&\'\u0005C\u0000\u0000\'(\u0005"+
		"T\u0000\u0000(\b\u0001\u0000\u0000\u0000)*\u0005A\u0000\u0000*+\u0005"+
		"D\u0000\u0000+,\u0005D\u0000\u0000,\n\u0001\u0000\u0000\u0000-.\u0005"+
		";\u0000\u0000.\f\u0001\u0000\u0000\u0000/0\u0005,\u0000\u00000\u000e\u0001"+
		"\u0000\u0000\u000012\u0005=\u0000\u00002\u0010\u0001\u0000\u0000\u0000"+
		"34\u0005n\u0000\u000045\u0005u\u0000\u000056\u0005l\u0000\u000067\u0005"+
		"l\u0000\u00007\u0012\u0001\u0000\u0000\u00008<\u0007\u0000\u0000\u0000"+
		"9;\u0007\u0001\u0000\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=A\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000?A\u0003\u0015\n\u0000@8\u0001\u0000"+
		"\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0014\u0001\u0000\u0000\u0000"+
		"BD\u0007\u0002\u0000\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FM\u0001\u0000"+
		"\u0000\u0000GI\u0005.\u0000\u0000HJ\u0007\u0002\u0000\u0000IH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000N\u0016\u0001\u0000\u0000\u0000OQ\u0007\u0003"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TU\u0006\u000b\u0000\u0000U\u0018\u0001\u0000\u0000\u0000\u0007\u0000"+
		"<@EKMR\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}