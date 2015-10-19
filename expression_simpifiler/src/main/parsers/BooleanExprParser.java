// $ANTLR 3.3 Nov 30, 2010 12:46:29 com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g 2015-02-03 07:19:25

package main.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class BooleanExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LPAREN", "RPAREN", "AND", "OR", "NOT", "TRUE", "FALSE", "NAME", "QUOTED_NAME", "WS"
    };
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


        public BooleanExprParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BooleanExprParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return BooleanExprParser.tokenNames; }
    public String getGrammarFileName() { return "com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g"; }


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:28:1: expression : orexpression ;
    public final BooleanExprParser.expression_return expression() throws RecognitionException {
        BooleanExprParser.expression_return retval = new BooleanExprParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        BooleanExprParser.orexpression_return orexpression1 = null;



        try {
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:28:12: ( orexpression )
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:28:14: orexpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orexpression_in_expression179);
            orexpression1=orexpression();

            state._fsp--;

            adaptor.addChild(root_0, orexpression1.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class orexpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orexpression"
    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:29:1: orexpression : andexpression ( OR andexpression )* ;
    public final BooleanExprParser.orexpression_return orexpression() throws RecognitionException {
        BooleanExprParser.orexpression_return retval = new BooleanExprParser.orexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR3=null;
        BooleanExprParser.andexpression_return andexpression2 = null;

        BooleanExprParser.andexpression_return andexpression4 = null;


        Object OR3_tree=null;

        try {
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:29:14: ( andexpression ( OR andexpression )* )
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:29:16: andexpression ( OR andexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andexpression_in_orexpression186);
            andexpression2=andexpression();

            state._fsp--;

            adaptor.addChild(root_0, andexpression2.getTree());
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:29:30: ( OR andexpression )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case OR:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:29:31: OR andexpression
            	    {
            	    OR3=(Token)match(input,OR,FOLLOW_OR_in_orexpression189); 
            	    OR3_tree = (Object)adaptor.create(OR3);
            	    root_0 = (Object)adaptor.becomeRoot(OR3_tree, root_0);

            	    pushFollow(FOLLOW_andexpression_in_orexpression192);
            	    andexpression4=andexpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, andexpression4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orexpression"

    public static class andexpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andexpression"
    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:30:1: andexpression : notexpression ( AND notexpression )* ;
    public final BooleanExprParser.andexpression_return andexpression() throws RecognitionException {
        BooleanExprParser.andexpression_return retval = new BooleanExprParser.andexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND6=null;
        BooleanExprParser.notexpression_return notexpression5 = null;

        BooleanExprParser.notexpression_return notexpression7 = null;


        Object AND6_tree=null;

        try {
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:30:15: ( notexpression ( AND notexpression )* )
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:30:17: notexpression ( AND notexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notexpression_in_andexpression201);
            notexpression5=notexpression();

            state._fsp--;

            adaptor.addChild(root_0, notexpression5.getTree());
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:30:31: ( AND notexpression )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case AND:
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:30:32: AND notexpression
            	    {
            	    AND6=(Token)match(input,AND,FOLLOW_AND_in_andexpression204); 
            	    AND6_tree = (Object)adaptor.create(AND6);
            	    root_0 = (Object)adaptor.becomeRoot(AND6_tree, root_0);

            	    pushFollow(FOLLOW_notexpression_in_andexpression207);
            	    notexpression7=notexpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, notexpression7.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "andexpression"

    public static class notexpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notexpression"
    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:31:1: notexpression : ( NOT atom | atom );
    public final BooleanExprParser.notexpression_return notexpression() throws RecognitionException {
        BooleanExprParser.notexpression_return retval = new BooleanExprParser.notexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT8=null;
        BooleanExprParser.atom_return atom9 = null;

        BooleanExprParser.atom_return atom10 = null;


        Object NOT8_tree=null;

        try {
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:31:15: ( NOT atom | atom )
            int alt3=2;
            switch ( input.LA(1) ) {
            case NOT:
                {
                alt3=1;
                }
                break;
            case LPAREN:
            case TRUE:
            case FALSE:
            case NAME:
            case QUOTED_NAME:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:31:17: NOT atom
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT8=(Token)match(input,NOT,FOLLOW_NOT_in_notexpression216); 
                    NOT8_tree = (Object)adaptor.create(NOT8);
                    root_0 = (Object)adaptor.becomeRoot(NOT8_tree, root_0);

                    pushFollow(FOLLOW_atom_in_notexpression219);
                    atom9=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom9.getTree());

                    }
                    break;
                case 2 :
                    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:31:29: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_notexpression223);
                    atom10=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notexpression"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:32:1: atom : ( TRUE | FALSE | NAME | QUOTED_NAME | LPAREN orexpression RPAREN );
    public final BooleanExprParser.atom_return atom() throws RecognitionException {
        BooleanExprParser.atom_return retval = new BooleanExprParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRUE11=null;
        Token FALSE12=null;
        Token NAME13=null;
        Token QUOTED_NAME14=null;
        Token LPAREN15=null;
        Token RPAREN17=null;
        BooleanExprParser.orexpression_return orexpression16 = null;


        Object TRUE11_tree=null;
        Object FALSE12_tree=null;
        Object NAME13_tree=null;
        Object QUOTED_NAME14_tree=null;
        Object LPAREN15_tree=null;
        Object RPAREN17_tree=null;

        try {
            // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:32:6: ( TRUE | FALSE | NAME | QUOTED_NAME | LPAREN orexpression RPAREN )
            int alt4=5;
            switch ( input.LA(1) ) {
            case TRUE:
                {
                alt4=1;
                }
                break;
            case FALSE:
                {
                alt4=2;
                }
                break;
            case NAME:
                {
                alt4=3;
                }
                break;
            case QUOTED_NAME:
                {
                alt4=4;
                }
                break;
            case LPAREN:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:32:8: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE11=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom230); 
                    TRUE11_tree = (Object)adaptor.create(TRUE11);
                    adaptor.addChild(root_0, TRUE11_tree);


                    }
                    break;
                case 2 :
                    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:32:15: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE12=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom234); 
                    FALSE12_tree = (Object)adaptor.create(FALSE12);
                    adaptor.addChild(root_0, FALSE12_tree);


                    }
                    break;
                case 3 :
                    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:32:23: NAME
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME13=(Token)match(input,NAME,FOLLOW_NAME_in_atom238); 
                    NAME13_tree = (Object)adaptor.create(NAME13);
                    adaptor.addChild(root_0, NAME13_tree);


                    }
                    break;
                case 4 :
                    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:32:30: QUOTED_NAME
                    {
                    root_0 = (Object)adaptor.nil();

                    QUOTED_NAME14=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_atom242); 
                    QUOTED_NAME14_tree = (Object)adaptor.create(QUOTED_NAME14);
                    adaptor.addChild(root_0, QUOTED_NAME14_tree);


                    }
                    break;
                case 5 :
                    // com/bpodgursky/jbool_expressions/parsers/BooleanExpr.g:32:44: LPAREN orexpression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom246); 
                    pushFollow(FOLLOW_orexpression_in_atom249);
                    orexpression16=orexpression();

                    state._fsp--;

                    adaptor.addChild(root_0, orexpression16.getTree());
                    RPAREN17=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom251); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_orexpression_in_expression179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_orexpression186 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_OR_in_orexpression189 = new BitSet(new long[]{0x0000000000001F10L});
    public static final BitSet FOLLOW_andexpression_in_orexpression192 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_notexpression_in_andexpression201 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AND_in_andexpression204 = new BitSet(new long[]{0x0000000000001F10L});
    public static final BitSet FOLLOW_notexpression_in_andexpression207 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_NOT_in_notexpression216 = new BitSet(new long[]{0x0000000000001F10L});
    public static final BitSet FOLLOW_atom_in_notexpression219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_notexpression223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_atom238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_atom242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom246 = new BitSet(new long[]{0x0000000000001F10L});
    public static final BitSet FOLLOW_orexpression_in_atom249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_atom251 = new BitSet(new long[]{0x0000000000000002L});

}