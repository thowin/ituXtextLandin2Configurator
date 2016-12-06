package itu.xtext.landin2.configurator.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import itu.xtext.landin2.configurator.services.ExcoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExcoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'\\r\\n'", "' '", "'('", "')'", "','", "'and'", "'or'", "'equals'", "'requires'", "'is'", "'are'", "'excludes'", "'not'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalExcoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExcoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExcoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExco.g"; }



     	private ExcoGrammarAccess grammarAccess;

        public InternalExcoParser(TokenStream input, ExcoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ExcoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalExco.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalExco.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalExco.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalExco.g:71:1: ruleModel returns [EObject current=null] : ( (lv_configurator_0_0= ruleConfigurator ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_configurator_0_0 = null;



        	enterRule();

        try {
            // InternalExco.g:77:2: ( ( (lv_configurator_0_0= ruleConfigurator ) ) )
            // InternalExco.g:78:2: ( (lv_configurator_0_0= ruleConfigurator ) )
            {
            // InternalExco.g:78:2: ( (lv_configurator_0_0= ruleConfigurator ) )
            // InternalExco.g:79:3: (lv_configurator_0_0= ruleConfigurator )
            {
            // InternalExco.g:79:3: (lv_configurator_0_0= ruleConfigurator )
            // InternalExco.g:80:4: lv_configurator_0_0= ruleConfigurator
            {

            				newCompositeNode(grammarAccess.getModelAccess().getConfiguratorConfiguratorParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_configurator_0_0=ruleConfigurator();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"configurator",
            					lv_configurator_0_0,
            					"itu.xtext.landin2.configurator.Exco.Configurator");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleConfigurator"
    // InternalExco.g:100:1: entryRuleConfigurator returns [EObject current=null] : iv_ruleConfigurator= ruleConfigurator EOF ;
    public final EObject entryRuleConfigurator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurator = null;


        try {
            // InternalExco.g:100:53: (iv_ruleConfigurator= ruleConfigurator EOF )
            // InternalExco.g:101:2: iv_ruleConfigurator= ruleConfigurator EOF
            {
             newCompositeNode(grammarAccess.getConfiguratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigurator=ruleConfigurator();

            state._fsp--;

             current =iv_ruleConfigurator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigurator"


    // $ANTLR start "ruleConfigurator"
    // InternalExco.g:107:1: ruleConfigurator returns [EObject current=null] : ( ( (lv_title_0_0= ruleTitle ) ) otherlv_1= '\\r\\n' ( (lv_expression_2_0= ruleExpression ) )+ ) ;
    public final EObject ruleConfigurator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_title_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalExco.g:113:2: ( ( ( (lv_title_0_0= ruleTitle ) ) otherlv_1= '\\r\\n' ( (lv_expression_2_0= ruleExpression ) )+ ) )
            // InternalExco.g:114:2: ( ( (lv_title_0_0= ruleTitle ) ) otherlv_1= '\\r\\n' ( (lv_expression_2_0= ruleExpression ) )+ )
            {
            // InternalExco.g:114:2: ( ( (lv_title_0_0= ruleTitle ) ) otherlv_1= '\\r\\n' ( (lv_expression_2_0= ruleExpression ) )+ )
            // InternalExco.g:115:3: ( (lv_title_0_0= ruleTitle ) ) otherlv_1= '\\r\\n' ( (lv_expression_2_0= ruleExpression ) )+
            {
            // InternalExco.g:115:3: ( (lv_title_0_0= ruleTitle ) )
            // InternalExco.g:116:4: (lv_title_0_0= ruleTitle )
            {
            // InternalExco.g:116:4: (lv_title_0_0= ruleTitle )
            // InternalExco.g:117:5: lv_title_0_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getConfiguratorAccess().getTitleTitleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_title_0_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfiguratorRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_0_0,
            						"itu.xtext.landin2.configurator.Exco.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConfiguratorAccess().getControl000dControl000aKeyword_1());
            		
            // InternalExco.g:138:3: ( (lv_expression_2_0= ruleExpression ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExco.g:139:4: (lv_expression_2_0= ruleExpression )
            	    {
            	    // InternalExco.g:139:4: (lv_expression_2_0= ruleExpression )
            	    // InternalExco.g:140:5: lv_expression_2_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getConfiguratorAccess().getExpressionExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_expression_2_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfiguratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expression",
            	    						lv_expression_2_0,
            	    						"itu.xtext.landin2.configurator.Exco.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigurator"


    // $ANTLR start "entryRuleTitle"
    // InternalExco.g:161:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalExco.g:161:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalExco.g:162:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalExco.g:168:1: ruleTitle returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ' ' | this_ID_2= RULE_ID )* ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalExco.g:174:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ' ' | this_ID_2= RULE_ID )* ) )
            // InternalExco.g:175:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ' ' | this_ID_2= RULE_ID )* )
            {
            // InternalExco.g:175:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ' ' | this_ID_2= RULE_ID )* )
            // InternalExco.g:176:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ' ' | this_ID_2= RULE_ID )*
            {
            // InternalExco.g:176:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExco.g:177:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExco.g:177:4: (lv_name_0_0= RULE_ID )
            // InternalExco.g:178:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTitleAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalExco.g:194:3: (otherlv_1= ' ' | this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }
                else if ( (LA2_0==RULE_ID) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalExco.g:195:4: otherlv_1= ' '
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTitleAccess().getSpaceKeyword_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalExco.g:200:4: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				newLeafNode(this_ID_2, grammarAccess.getTitleAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleExpression"
    // InternalExco.g:209:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalExco.g:209:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalExco.g:210:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalExco.g:216:1: ruleExpression returns [EObject current=null] : ( ( ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* ) | ( (lv_paranthesis_3_0= ruleParenthesisExpression ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_operation_1_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_paranthesis_3_0 = null;



        	enterRule();

        try {
            // InternalExco.g:222:2: ( ( ( ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* ) | ( (lv_paranthesis_3_0= ruleParenthesisExpression ) ) ) )
            // InternalExco.g:223:2: ( ( ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* ) | ( (lv_paranthesis_3_0= ruleParenthesisExpression ) ) )
            {
            // InternalExco.g:223:2: ( ( ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* ) | ( (lv_paranthesis_3_0= ruleParenthesisExpression ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExco.g:224:3: ( ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* )
                    {
                    // InternalExco.g:224:3: ( ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* )
                    // InternalExco.g:225:4: ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )*
                    {
                    // InternalExco.g:225:4: ( (lv_left_0_0= ruleAtomicExpression ) )
                    // InternalExco.g:226:5: (lv_left_0_0= ruleAtomicExpression )
                    {
                    // InternalExco.g:226:5: (lv_left_0_0= ruleAtomicExpression )
                    // InternalExco.g:227:6: lv_left_0_0= ruleAtomicExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getLeftAtomicExpressionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_left_0_0=ruleAtomicExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_0_0,
                    							"itu.xtext.landin2.configurator.Exco.AtomicExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalExco.g:244:4: ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        alt3 = dfa3.predict(input);
                        switch (alt3) {
                    	case 1 :
                    	    // InternalExco.g:245:5: ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) )
                    	    {
                    	    // InternalExco.g:245:5: ( (lv_operation_1_0= ruleOperation ) )
                    	    // InternalExco.g:246:6: (lv_operation_1_0= ruleOperation )
                    	    {
                    	    // InternalExco.g:246:6: (lv_operation_1_0= ruleOperation )
                    	    // InternalExco.g:247:7: lv_operation_1_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getOperationOperationParserRuleCall_0_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_operation_1_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operation",
                    	    								lv_operation_1_0,
                    	    								"itu.xtext.landin2.configurator.Exco.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalExco.g:264:5: ( (lv_right_2_0= ruleExpression ) )
                    	    // InternalExco.g:265:6: (lv_right_2_0= ruleExpression )
                    	    {
                    	    // InternalExco.g:265:6: (lv_right_2_0= ruleExpression )
                    	    // InternalExco.g:266:7: lv_right_2_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_0_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_right_2_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"right",
                    	    								lv_right_2_0,
                    	    								"itu.xtext.landin2.configurator.Exco.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalExco.g:286:3: ( (lv_paranthesis_3_0= ruleParenthesisExpression ) )
                    {
                    // InternalExco.g:286:3: ( (lv_paranthesis_3_0= ruleParenthesisExpression ) )
                    // InternalExco.g:287:4: (lv_paranthesis_3_0= ruleParenthesisExpression )
                    {
                    // InternalExco.g:287:4: (lv_paranthesis_3_0= ruleParenthesisExpression )
                    // InternalExco.g:288:5: lv_paranthesis_3_0= ruleParenthesisExpression
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getParanthesisParenthesisExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_paranthesis_3_0=ruleParenthesisExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"paranthesis",
                    						lv_paranthesis_3_0,
                    						"itu.xtext.landin2.configurator.Exco.ParenthesisExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleParenthesisExpression"
    // InternalExco.g:309:1: entryRuleParenthesisExpression returns [EObject current=null] : iv_ruleParenthesisExpression= ruleParenthesisExpression EOF ;
    public final EObject entryRuleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisExpression = null;


        try {
            // InternalExco.g:309:62: (iv_ruleParenthesisExpression= ruleParenthesisExpression EOF )
            // InternalExco.g:310:2: iv_ruleParenthesisExpression= ruleParenthesisExpression EOF
            {
             newCompositeNode(grammarAccess.getParenthesisExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesisExpression=ruleParenthesisExpression();

            state._fsp--;

             current =iv_ruleParenthesisExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesisExpression"


    // $ANTLR start "ruleParenthesisExpression"
    // InternalExco.g:316:1: ruleParenthesisExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalExco.g:322:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // InternalExco.g:323:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // InternalExco.g:323:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // InternalExco.g:324:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            this_Expression_1=ruleExpression();

            state._fsp--;


            			current = this_Expression_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesisExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalExco.g:344:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalExco.g:344:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalExco.g:345:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;

             current =iv_ruleAtomicExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalExco.g:351:1: ruleAtomicExpression returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ruleSep this_ID_2= RULE_ID )* ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalExco.g:357:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ruleSep this_ID_2= RULE_ID )* ) )
            // InternalExco.g:358:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleSep this_ID_2= RULE_ID )* )
            {
            // InternalExco.g:358:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleSep this_ID_2= RULE_ID )* )
            // InternalExco.g:359:3: ( (lv_name_0_0= RULE_ID ) ) ( ruleSep this_ID_2= RULE_ID )*
            {
            // InternalExco.g:359:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExco.g:360:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExco.g:360:4: (lv_name_0_0= RULE_ID )
            // InternalExco.g:361:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAtomicExpressionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalExco.g:377:3: ( ruleSep this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalExco.g:378:4: ruleSep this_ID_2= RULE_ID
            	    {

            	    				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getSepParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_10);
            	    ruleSep();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    				newLeafNode(this_ID_2, grammarAccess.getAtomicExpressionAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleSep"
    // InternalExco.g:394:1: entryRuleSep returns [String current=null] : iv_ruleSep= ruleSep EOF ;
    public final String entryRuleSep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSep = null;


        try {
            // InternalExco.g:394:43: (iv_ruleSep= ruleSep EOF )
            // InternalExco.g:395:2: iv_ruleSep= ruleSep EOF
            {
             newCompositeNode(grammarAccess.getSepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSep=ruleSep();

            state._fsp--;

             current =iv_ruleSep.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSep"


    // $ANTLR start "ruleSep"
    // InternalExco.g:401:1: ruleSep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | (kw= ',' this_WS_2= RULE_WS ) ) ;
    public final AntlrDatatypeRuleToken ruleSep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_WS_2=null;


        	enterRule();

        try {
            // InternalExco.g:407:2: ( (kw= ',' | (kw= ',' this_WS_2= RULE_WS ) ) )
            // InternalExco.g:408:2: (kw= ',' | (kw= ',' this_WS_2= RULE_WS ) )
            {
            // InternalExco.g:408:2: (kw= ',' | (kw= ',' this_WS_2= RULE_WS ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_WS) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalExco.g:409:3: kw= ','
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSepAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExco.g:415:3: (kw= ',' this_WS_2= RULE_WS )
                    {
                    // InternalExco.g:415:3: (kw= ',' this_WS_2= RULE_WS )
                    // InternalExco.g:416:4: kw= ',' this_WS_2= RULE_WS
                    {
                    kw=(Token)match(input,15,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSepAccess().getCommaKeyword_1_0());
                    			
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_2); 

                    				current.merge(this_WS_2);
                    			

                    				newLeafNode(this_WS_2, grammarAccess.getSepAccess().getWSTerminalRuleCall_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSep"


    // $ANTLR start "entryRuleOperation"
    // InternalExco.g:433:1: entryRuleOperation returns [String current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final String entryRuleOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperation = null;


        try {
            // InternalExco.g:433:49: (iv_ruleOperation= ruleOperation EOF )
            // InternalExco.g:434:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalExco.g:440:1: ruleOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Binop_0= ruleBinop | this_Unop_1= ruleUnop ) ;
    public final AntlrDatatypeRuleToken ruleOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Binop_0 = null;

        AntlrDatatypeRuleToken this_Unop_1 = null;



        	enterRule();

        try {
            // InternalExco.g:446:2: ( (this_Binop_0= ruleBinop | this_Unop_1= ruleUnop ) )
            // InternalExco.g:447:2: (this_Binop_0= ruleBinop | this_Unop_1= ruleUnop )
            {
            // InternalExco.g:447:2: (this_Binop_0= ruleBinop | this_Unop_1= ruleUnop )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=16 && LA7_0<=22)) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalExco.g:448:3: this_Binop_0= ruleBinop
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getBinopParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Binop_0=ruleBinop();

                    state._fsp--;


                    			current.merge(this_Binop_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExco.g:459:3: this_Unop_1= ruleUnop
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getUnopParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Unop_1=ruleUnop();

                    state._fsp--;


                    			current.merge(this_Unop_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleBinop"
    // InternalExco.g:473:1: entryRuleBinop returns [String current=null] : iv_ruleBinop= ruleBinop EOF ;
    public final String entryRuleBinop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinop = null;


        try {
            // InternalExco.g:473:45: (iv_ruleBinop= ruleBinop EOF )
            // InternalExco.g:474:2: iv_ruleBinop= ruleBinop EOF
            {
             newCompositeNode(grammarAccess.getBinopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinop=ruleBinop();

            state._fsp--;

             current =iv_ruleBinop.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinop"


    // $ANTLR start "ruleBinop"
    // InternalExco.g:480:1: ruleBinop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' | kw= 'equals' | kw= 'requires' | kw= 'is' | kw= 'are' | kw= 'excludes' ) ;
    public final AntlrDatatypeRuleToken ruleBinop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalExco.g:486:2: ( (kw= 'and' | kw= 'or' | kw= 'equals' | kw= 'requires' | kw= 'is' | kw= 'are' | kw= 'excludes' ) )
            // InternalExco.g:487:2: (kw= 'and' | kw= 'or' | kw= 'equals' | kw= 'requires' | kw= 'is' | kw= 'are' | kw= 'excludes' )
            {
            // InternalExco.g:487:2: (kw= 'and' | kw= 'or' | kw= 'equals' | kw= 'requires' | kw= 'is' | kw= 'are' | kw= 'excludes' )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            case 19:
                {
                alt8=4;
                }
                break;
            case 20:
                {
                alt8=5;
                }
                break;
            case 21:
                {
                alt8=6;
                }
                break;
            case 22:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalExco.g:488:3: kw= 'and'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getAndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExco.g:494:3: kw= 'or'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getOrKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalExco.g:500:3: kw= 'equals'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getEqualsKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalExco.g:506:3: kw= 'requires'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getRequiresKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalExco.g:512:3: kw= 'is'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getIsKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalExco.g:518:3: kw= 'are'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getAreKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalExco.g:524:3: kw= 'excludes'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getExcludesKeyword_6());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinop"


    // $ANTLR start "entryRuleUnop"
    // InternalExco.g:533:1: entryRuleUnop returns [String current=null] : iv_ruleUnop= ruleUnop EOF ;
    public final String entryRuleUnop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnop = null;


        try {
            // InternalExco.g:533:44: (iv_ruleUnop= ruleUnop EOF )
            // InternalExco.g:534:2: iv_ruleUnop= ruleUnop EOF
            {
             newCompositeNode(grammarAccess.getUnopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnop=ruleUnop();

            state._fsp--;

             current =iv_ruleUnop.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnop"


    // $ANTLR start "ruleUnop"
    // InternalExco.g:540:1: ruleUnop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'not' ;
    public final AntlrDatatypeRuleToken ruleUnop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalExco.g:546:2: (kw= 'not' )
            // InternalExco.g:547:2: kw= 'not'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUnopAccess().getNotKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnop"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\4\11\uffff";
    static final String dfa_4s = "\1\27\11\uffff";
    static final String dfa_5s = "\1\uffff\1\2\10\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\10\uffff\2\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 244:4: ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000FF0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});

}