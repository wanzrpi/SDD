// $ANTLR 3.3 Nov 30, 2010 12:46:29 com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g 2014-12-16 12:58:46

package main.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BooleanExprLexer extends Lexer {
    public static final int EOF=-1;
    public static final int LPAREN=4;
    public static final int RPAREN=5;
    public static final int AND=6;
    public static final int OR=7;
    public static final int NOT=8;
    public static final int TRUE=9;
    public static final int FALSE=10;
    public static final int NAME=11;
    public static final int QUOTED_NAME=12;
    public static final int WS=13;

    // delegates
    // delegators

    public BooleanExprLexer() {;} 
    public BooleanExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BooleanExprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g"; }

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:17:8: ( '(' )
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:17:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:18:8: ( ')' )
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:18:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:19:5: ( '&' )
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:19:7: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:20:4: ( '|' )
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:20:6: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:21:5: ( '!' )
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:21:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:22:6: ( 'true' )
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:22:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:23:7: ( 'false' )
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:23:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:24:6: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )+ )
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:24:8: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )+
            {
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:24:8: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "QUOTED_NAME"
    public final void mQUOTED_NAME() throws RecognitionException {
        try {
            int _type = QUOTED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:25:13: ( '\\'' (~ ( '\\r' | '\\n' | '\\'' ) )+ '\\'' )
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:25:15: '\\'' (~ ( '\\r' | '\\n' | '\\'' ) )+ '\\''
            {
            match('\''); 
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:25:19: (~ ( '\\r' | '\\n' | '\\'' ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:25:19: ~ ( '\\r' | '\\n' | '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_NAME"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:26:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:26:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:26:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case '\t':
                case '\n':
                case '\r':
                case ' ':
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:1:8: ( LPAREN | RPAREN | AND | OR | NOT | TRUE | FALSE | NAME | QUOTED_NAME | WS )
        int alt4=10;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:1:10: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 2 :
                // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:1:17: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 3 :
                // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:1:24: AND
                {
                mAND(); 

                }
                break;
            case 4 :
                // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:1:28: OR
                {
                mOR(); 

                }
                break;
            case 5 :
                // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:1:31: NOT
                {
                mNOT(); 

                }
                break;
            case 6 :
                // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:1:35: TRUE
                {
                mTRUE(); 

                }
                break;
            case 7 :
                // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:1:40: FALSE
                {
                mFALSE(); 

                }
                break;
            case 8 :
                // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:1:46: NAME
                {
                mNAME(); 

                }
                break;
            case 9 :
                // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:1:51: QUOTED_NAME
                {
                mQUOTED_NAME(); 

                }
                break;
            case 10 :
                // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:1:63: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\6\uffff\2\10\3\uffff\4\10\1\21\1\10\1\uffff\1\23\1\uffff";
    static final String DFA4_eofS =
        "\24\uffff";
    static final String DFA4_minS =
        "\1\11\5\uffff\1\162\1\141\3\uffff\1\165\1\154\1\145\1\163\1\60\1"+
        "\145\1\uffff\1\60\1\uffff";
    static final String DFA4_maxS =
        "\1\174\5\uffff\1\162\1\141\3\uffff\1\165\1\154\1\145\1\163\1\172"+
        "\1\145\1\uffff\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\10\1\11\1\12\6\uffff\1\6"+
        "\1\uffff\1\7";
    static final String DFA4_specialS =
        "\24\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\12\2\uffff\1\12\22\uffff\1\12\1\5\4\uffff\1\3\1\11\1\1\1"+
            "\2\6\uffff\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\5\10\1\7"+
            "\15\10\1\6\6\10\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "\1\14",
            "",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
            "\1\22",
            "",
            "\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( LPAREN | RPAREN | AND | OR | NOT | TRUE | FALSE | NAME | QUOTED_NAME | WS );";
        }
    }
 

}