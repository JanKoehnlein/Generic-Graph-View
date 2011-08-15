package org.eclipse.xtext.graphview.map.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.graphview.map.services.GraphViewMappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGraphViewMappingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'diagram'", "'type'", "'{'", "'}'", "'unless'", "'import'", "'.'", "'*'", "'node'", "'for'", "'each'", "'label'", "'edge'", "'=>'", "'ref'", "'call'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'while'", "'do'", "';'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalGraphViewMappingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphViewMappingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphViewMappingParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g"; }



     	private GraphViewMappingGrammarAccess grammarAccess;
     	
        public InternalGraphViewMappingParser(TokenStream input, GraphViewMappingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DiagramMapping";	
       	}
       	
       	@Override
       	protected GraphViewMappingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDiagramMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:67:1: entryRuleDiagramMapping returns [EObject current=null] : iv_ruleDiagramMapping= ruleDiagramMapping EOF ;
    public final EObject entryRuleDiagramMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:68:2: (iv_ruleDiagramMapping= ruleDiagramMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:69:2: iv_ruleDiagramMapping= ruleDiagramMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramMappingRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramMapping_in_entryRuleDiagramMapping75);
            iv_ruleDiagramMapping=ruleDiagramMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramMapping85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDiagramMapping"


    // $ANTLR start "ruleDiagramMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:76:1: ruleDiagramMapping returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' (otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleDiagramMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_typeGuard_4_0 = null;

        EObject lv_mappings_6_0 = null;

        EObject lv_unlessCondition_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' (otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' (otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' (otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' (otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDiagramMappingAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleDiagramMapping131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDiagramMappingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleDiagramMapping144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDiagramMappingAccess().getDiagramKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:102:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:103:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:103:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:104:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDiagramMappingAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDiagramMapping165);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDiagramMappingRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDiagramMapping177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDiagramMappingAccess().getTypeKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:124:1: ( (lv_typeGuard_4_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:125:1: (lv_typeGuard_4_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:125:1: (lv_typeGuard_4_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:126:3: lv_typeGuard_4_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDiagramMappingAccess().getTypeGuardJvmTypeReferenceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleDiagramMapping198);
            lv_typeGuard_4_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDiagramMappingRule());
              	        }
                     		set(
                     			current, 
                     			"typeGuard",
                      		lv_typeGuard_4_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDiagramMapping210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDiagramMappingAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:146:1: ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19||(LA2_0>=22 && LA2_0<=23)||LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:147:1: (lv_mappings_6_0= ruleAbstractExpressionMapping )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:147:1: (lv_mappings_6_0= ruleAbstractExpressionMapping )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:148:3: lv_mappings_6_0= ruleAbstractExpressionMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDiagramMappingAccess().getMappingsAbstractExpressionMappingParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractExpressionMapping_in_ruleDiagramMapping231);
            	    lv_mappings_6_0=ruleAbstractExpressionMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDiagramMappingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappings",
            	              		lv_mappings_6_0, 
            	              		"AbstractExpressionMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleDiagramMapping244); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDiagramMappingAccess().getRightCurlyBracketKeyword_7());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:168:1: (otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:168:3: otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDiagramMapping257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getDiagramMappingAccess().getUnlessKeyword_8_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:172:1: ( (lv_unlessCondition_9_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:173:1: (lv_unlessCondition_9_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:173:1: (lv_unlessCondition_9_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:174:3: lv_unlessCondition_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramMappingAccess().getUnlessConditionXExpressionParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleDiagramMapping278);
                    lv_unlessCondition_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDiagramMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"unlessCondition",
                              		lv_unlessCondition_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDiagramMapping"


    // $ANTLR start "entryRuleImport"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:198:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:199:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:200:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport316);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport326); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:207:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:210:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:211:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:211:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:211:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleImport363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:215:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:216:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:216:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:217:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport384);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:241:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:242:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:243:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard421);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard432); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:250:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:253:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:254:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:254:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:255:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard479);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:265:1: (kw= '.' kw= '*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:266:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNameWithWildcard498); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedNameWithWildcard511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleAbstractExpressionMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:285:1: entryRuleAbstractExpressionMapping returns [EObject current=null] : iv_ruleAbstractExpressionMapping= ruleAbstractExpressionMapping EOF ;
    public final EObject entryRuleAbstractExpressionMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExpressionMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:286:2: (iv_ruleAbstractExpressionMapping= ruleAbstractExpressionMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:287:2: iv_ruleAbstractExpressionMapping= ruleAbstractExpressionMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractExpressionMappingRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractExpressionMapping_in_entryRuleAbstractExpressionMapping553);
            iv_ruleAbstractExpressionMapping=ruleAbstractExpressionMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractExpressionMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractExpressionMapping563); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractExpressionMapping"


    // $ANTLR start "ruleAbstractExpressionMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:294:1: ruleAbstractExpressionMapping returns [EObject current=null] : (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping | this_MappingCall_3= ruleMappingCall ) ;
    public final EObject ruleAbstractExpressionMapping() throws RecognitionException {
        EObject current = null;

        EObject this_NodeMapping_0 = null;

        EObject this_LabelMapping_1 = null;

        EObject this_EdgeMapping_2 = null;

        EObject this_MappingCall_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:297:28: ( (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping | this_MappingCall_3= ruleMappingCall ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:298:1: (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping | this_MappingCall_3= ruleMappingCall )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:298:1: (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping | this_MappingCall_3= ruleMappingCall )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:299:5: this_NodeMapping_0= ruleNodeMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getNodeMappingParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeMapping_in_ruleAbstractExpressionMapping610);
                    this_NodeMapping_0=ruleNodeMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NodeMapping_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:309:5: this_LabelMapping_1= ruleLabelMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getLabelMappingParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabelMapping_in_ruleAbstractExpressionMapping637);
                    this_LabelMapping_1=ruleLabelMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LabelMapping_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:319:5: this_EdgeMapping_2= ruleEdgeMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getEdgeMappingParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEdgeMapping_in_ruleAbstractExpressionMapping664);
                    this_EdgeMapping_2=ruleEdgeMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EdgeMapping_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:329:5: this_MappingCall_3= ruleMappingCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getMappingCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMappingCall_in_ruleAbstractExpressionMapping691);
                    this_MappingCall_3=ruleMappingCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MappingCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAbstractExpressionMapping"


    // $ANTLR start "entryRuleNodeMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:345:1: entryRuleNodeMapping returns [EObject current=null] : iv_ruleNodeMapping= ruleNodeMapping EOF ;
    public final EObject entryRuleNodeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:346:2: (iv_ruleNodeMapping= ruleNodeMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:347:2: iv_ruleNodeMapping= ruleNodeMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeMappingRule()); 
            }
            pushFollow(FOLLOW_ruleNodeMapping_in_entryRuleNodeMapping726);
            iv_ruleNodeMapping=ruleNodeMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeMapping736); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeMapping"


    // $ANTLR start "ruleNodeMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:354:1: ruleNodeMapping returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' (otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleNodeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_multi_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_expression_4_0 = null;

        EObject lv_mappings_6_0 = null;

        EObject lv_unlessCondition_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:357:28: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' (otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:358:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' (otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:358:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' (otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:358:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' (otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleNodeMapping773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeMappingAccess().getNodeKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:362:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:363:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:363:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:364:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeMapping790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getNodeMappingAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeMappingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleNodeMapping807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:384:1: ( (lv_multi_3_0= 'each' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:385:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:385:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:386:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,21,FOLLOW_21_in_ruleNodeMapping825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_multi_3_0, grammarAccess.getNodeMappingAccess().getMultiEachKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNodeMappingRule());
                      	        }
                             		setWithLastConsumed(current, "multi", true, "each");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:399:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:400:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:400:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:401:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeMappingAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleNodeMapping860);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNodeMappingRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleNodeMapping872); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNodeMappingAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:421:1: ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19||(LA7_0>=22 && LA7_0<=23)||LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:422:1: (lv_mappings_6_0= ruleAbstractExpressionMapping )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:422:1: (lv_mappings_6_0= ruleAbstractExpressionMapping )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:423:3: lv_mappings_6_0= ruleAbstractExpressionMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeMappingAccess().getMappingsAbstractExpressionMappingParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractExpressionMapping_in_ruleNodeMapping893);
            	    lv_mappings_6_0=ruleAbstractExpressionMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeMappingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappings",
            	              		lv_mappings_6_0, 
            	              		"AbstractExpressionMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleNodeMapping906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getNodeMappingAccess().getRightCurlyBracketKeyword_7());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:443:1: (otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:443:3: otherlv_8= 'unless' ( (lv_unlessCondition_9_0= ruleXExpression ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleNodeMapping919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getNodeMappingAccess().getUnlessKeyword_8_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:447:1: ( (lv_unlessCondition_9_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:448:1: (lv_unlessCondition_9_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:448:1: (lv_unlessCondition_9_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:449:3: lv_unlessCondition_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeMappingAccess().getUnlessConditionXExpressionParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleNodeMapping940);
                    lv_unlessCondition_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"unlessCondition",
                              		lv_unlessCondition_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNodeMapping"


    // $ANTLR start "entryRuleLabelMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:473:1: entryRuleLabelMapping returns [EObject current=null] : iv_ruleLabelMapping= ruleLabelMapping EOF ;
    public final EObject entryRuleLabelMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:474:2: (iv_ruleLabelMapping= ruleLabelMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:475:2: iv_ruleLabelMapping= ruleLabelMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelMappingRule()); 
            }
            pushFollow(FOLLOW_ruleLabelMapping_in_entryRuleLabelMapping978);
            iv_ruleLabelMapping=ruleLabelMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabelMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelMapping988); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLabelMapping"


    // $ANTLR start "ruleLabelMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:482:1: ruleLabelMapping returns [EObject current=null] : (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) (otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleLabelMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_multi_3_0=null;
        Token otherlv_5=null;
        EObject lv_expression_4_0 = null;

        EObject lv_unlessCondition_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:485:28: ( (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) (otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:486:1: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) (otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:486:1: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) (otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:486:3: otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) (otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleLabelMapping1025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLabelMappingAccess().getLabelKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:490:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:491:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:491:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:492:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabelMapping1042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLabelMappingAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLabelMappingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleLabelMapping1059); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLabelMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:512:1: ( (lv_multi_3_0= 'each' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:513:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:513:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:514:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,21,FOLLOW_21_in_ruleLabelMapping1077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_multi_3_0, grammarAccess.getLabelMappingAccess().getMultiEachKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLabelMappingRule());
                      	        }
                             		setWithLastConsumed(current, "multi", true, "each");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:527:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:528:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:528:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:529:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabelMappingAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleLabelMapping1112);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLabelMappingRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:545:2: (otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:545:4: otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleLabelMapping1125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getLabelMappingAccess().getUnlessKeyword_5_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:549:1: ( (lv_unlessCondition_6_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:550:1: (lv_unlessCondition_6_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:550:1: (lv_unlessCondition_6_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:551:3: lv_unlessCondition_6_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLabelMappingAccess().getUnlessConditionXExpressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleLabelMapping1146);
                    lv_unlessCondition_6_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLabelMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"unlessCondition",
                              		lv_unlessCondition_6_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLabelMapping"


    // $ANTLR start "entryRuleEdgeMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:575:1: entryRuleEdgeMapping returns [EObject current=null] : iv_ruleEdgeMapping= ruleEdgeMapping EOF ;
    public final EObject entryRuleEdgeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:576:2: (iv_ruleEdgeMapping= ruleEdgeMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:577:2: iv_ruleEdgeMapping= ruleEdgeMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeMappingRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeMapping_in_entryRuleEdgeMapping1184);
            iv_ruleEdgeMapping=ruleEdgeMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeMapping1194); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEdgeMapping"


    // $ANTLR start "ruleEdgeMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:584:1: ruleEdgeMapping returns [EObject current=null] : (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '=>' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )? ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}' (otherlv_11= 'unless' ( (lv_unlessCondition_12_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleEdgeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_multi_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_expression_4_0 = null;

        EObject lv_sourceMapping_6_0 = null;

        EObject lv_targetMapping_8_0 = null;

        EObject lv_mappings_9_0 = null;

        EObject lv_unlessCondition_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:587:28: ( (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '=>' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )? ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}' (otherlv_11= 'unless' ( (lv_unlessCondition_12_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:588:1: (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '=>' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )? ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}' (otherlv_11= 'unless' ( (lv_unlessCondition_12_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:588:1: (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '=>' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )? ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}' (otherlv_11= 'unless' ( (lv_unlessCondition_12_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:588:3: otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '=>' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )? ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}' (otherlv_11= 'unless' ( (lv_unlessCondition_12_0= ruleXExpression ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleEdgeMapping1231); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEdgeMappingAccess().getEdgeKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:592:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:593:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:593:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:594:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEdgeMapping1248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEdgeMappingAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeMappingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEdgeMapping1265); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEdgeMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:614:1: ( (lv_multi_3_0= 'each' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:615:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:615:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:616:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,21,FOLLOW_21_in_ruleEdgeMapping1283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_multi_3_0, grammarAccess.getEdgeMappingAccess().getMultiEachKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEdgeMappingRule());
                      	        }
                             		setWithLastConsumed(current, "multi", true, "each");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:629:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:630:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:630:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:631:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleEdgeMapping1318);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeMappingRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEdgeMapping1330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEdgeMappingAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:651:1: ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=25 && LA12_0<=26)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:652:1: (lv_sourceMapping_6_0= ruleEdgeEndMapping )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:652:1: (lv_sourceMapping_6_0= ruleEdgeEndMapping )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:653:3: lv_sourceMapping_6_0= ruleEdgeEndMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getSourceMappingEdgeEndMappingParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1351);
                    lv_sourceMapping_6_0=ruleEdgeEndMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"sourceMapping",
                              		lv_sourceMapping_6_0, 
                              		"EdgeEndMapping");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleEdgeMapping1364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEdgeMappingAccess().getEqualsSignGreaterThanSignKeyword_7());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:673:1: ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=25 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:674:1: (lv_targetMapping_8_0= ruleEdgeEndMapping )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:674:1: (lv_targetMapping_8_0= ruleEdgeEndMapping )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:675:3: lv_targetMapping_8_0= ruleEdgeEndMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getTargetMappingEdgeEndMappingParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1385);
                    lv_targetMapping_8_0=ruleEdgeEndMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"targetMapping",
                              		lv_targetMapping_8_0, 
                              		"EdgeEndMapping");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:691:3: ( (lv_mappings_9_0= ruleLabelMapping ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:692:1: (lv_mappings_9_0= ruleLabelMapping )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:692:1: (lv_mappings_9_0= ruleLabelMapping )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:693:3: lv_mappings_9_0= ruleLabelMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getMappingsLabelMappingParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLabelMapping_in_ruleEdgeMapping1407);
            	    lv_mappings_9_0=ruleLabelMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEdgeMappingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappings",
            	              		lv_mappings_9_0, 
            	              		"LabelMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleEdgeMapping1420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getEdgeMappingAccess().getRightCurlyBracketKeyword_10());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:713:1: (otherlv_11= 'unless' ( (lv_unlessCondition_12_0= ruleXExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:713:3: otherlv_11= 'unless' ( (lv_unlessCondition_12_0= ruleXExpression ) )
                    {
                    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleEdgeMapping1433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getEdgeMappingAccess().getUnlessKeyword_11_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:717:1: ( (lv_unlessCondition_12_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:718:1: (lv_unlessCondition_12_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:718:1: (lv_unlessCondition_12_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:719:3: lv_unlessCondition_12_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getUnlessConditionXExpressionParserRuleCall_11_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleEdgeMapping1454);
                    lv_unlessCondition_12_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"unlessCondition",
                              		lv_unlessCondition_12_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEdgeMapping"


    // $ANTLR start "entryRuleEdgeEndMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:743:1: entryRuleEdgeEndMapping returns [EObject current=null] : iv_ruleEdgeEndMapping= ruleEdgeEndMapping EOF ;
    public final EObject entryRuleEdgeEndMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeEndMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:744:2: (iv_ruleEdgeEndMapping= ruleEdgeEndMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:745:2: iv_ruleEdgeEndMapping= ruleEdgeEndMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeEndMappingRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeEndMapping_in_entryRuleEdgeEndMapping1492);
            iv_ruleEdgeEndMapping=ruleEdgeEndMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeEndMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeEndMapping1502); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEdgeEndMapping"


    // $ANTLR start "ruleEdgeEndMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:752:1: ruleEdgeEndMapping returns [EObject current=null] : ( (otherlv_0= 'ref' | ( (lv_call_1_0= 'call' ) ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleEdgeEndMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_call_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:755:28: ( ( (otherlv_0= 'ref' | ( (lv_call_1_0= 'call' ) ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:756:1: ( (otherlv_0= 'ref' | ( (lv_call_1_0= 'call' ) ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:756:1: ( (otherlv_0= 'ref' | ( (lv_call_1_0= 'call' ) ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:756:2: (otherlv_0= 'ref' | ( (lv_call_1_0= 'call' ) ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:756:2: (otherlv_0= 'ref' | ( (lv_call_1_0= 'call' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            else if ( (LA16_0==26) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:756:4: otherlv_0= 'ref'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleEdgeEndMapping1540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getEdgeEndMappingAccess().getRefKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:761:6: ( (lv_call_1_0= 'call' ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:761:6: ( (lv_call_1_0= 'call' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:762:1: (lv_call_1_0= 'call' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:762:1: (lv_call_1_0= 'call' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:763:3: lv_call_1_0= 'call'
                    {
                    lv_call_1_0=(Token)match(input,26,FOLLOW_26_in_ruleEdgeEndMapping1564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_call_1_0, grammarAccess.getEdgeEndMappingAccess().getCallCallKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEdgeEndMappingRule());
                      	        }
                             		setWithLastConsumed(current, "call", true, "call");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:776:3: ( (otherlv_2= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:777:1: (otherlv_2= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:777:1: (otherlv_2= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:778:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeEndMappingRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEdgeEndMapping1598); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getEdgeEndMappingAccess().getReferencedMappingAbstractMappingDefinitionCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEdgeEndMapping1610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEdgeEndMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:793:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:794:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:794:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:795:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeEndMappingAccess().getExpressionXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleEdgeEndMapping1631);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeEndMappingRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEdgeEndMapping"


    // $ANTLR start "entryRuleMappingCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:819:1: entryRuleMappingCall returns [EObject current=null] : iv_ruleMappingCall= ruleMappingCall EOF ;
    public final EObject entryRuleMappingCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:820:2: (iv_ruleMappingCall= ruleMappingCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:821:2: iv_ruleMappingCall= ruleMappingCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingCallRule()); 
            }
            pushFollow(FOLLOW_ruleMappingCall_in_entryRuleMappingCall1667);
            iv_ruleMappingCall=ruleMappingCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingCall1677); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMappingCall"


    // $ANTLR start "ruleMappingCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:828:1: ruleMappingCall returns [EObject current=null] : (otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) (otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleMappingCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_multi_3_0=null;
        Token otherlv_5=null;
        EObject lv_expression_4_0 = null;

        EObject lv_unlessCondition_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:831:28: ( (otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) (otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:832:1: (otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) (otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:832:1: (otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) (otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:832:3: otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) (otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMappingCall1714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMappingCallAccess().getCallKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:836:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:837:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:837:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:838:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMappingCallRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMappingCall1734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getMappingCallAccess().getReferencedMappingAbstractMappingDefinitionCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMappingCall1746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMappingCallAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:853:1: ( (lv_multi_3_0= 'each' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:854:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:854:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:855:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,21,FOLLOW_21_in_ruleMappingCall1764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_multi_3_0, grammarAccess.getMappingCallAccess().getMultiEachKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMappingCallRule());
                      	        }
                             		setWithLastConsumed(current, "multi", true, "each");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:868:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:869:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:869:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:870:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingCallAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleMappingCall1799);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMappingCallRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:886:2: (otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:886:4: otherlv_5= 'unless' ( (lv_unlessCondition_6_0= ruleXExpression ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleMappingCall1812); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMappingCallAccess().getUnlessKeyword_5_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:890:1: ( (lv_unlessCondition_6_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:891:1: (lv_unlessCondition_6_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:891:1: (lv_unlessCondition_6_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:892:3: lv_unlessCondition_6_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMappingCallAccess().getUnlessConditionXExpressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleMappingCall1833);
                    lv_unlessCondition_6_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMappingCallRule());
                      	        }
                             		set(
                             			current, 
                             			"unlessCondition",
                              		lv_unlessCondition_6_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMappingCall"


    // $ANTLR start "entryRuleXExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:916:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:917:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:918:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1871);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1881); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:925:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:928:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:930:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1927);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:946:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:947:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:948:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1961);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1971); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:955:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:958:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:959:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:959:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||(LA20_1>=RULE_ID && LA20_1<=RULE_STRING)||(LA20_1>=13 && LA20_1<=15)||(LA20_1>=17 && LA20_1<=20)||(LA20_1>=22 && LA20_1<=24)||LA20_1==26||(LA20_1>=28 && LA20_1<=52)||(LA20_1>=54 && LA20_1<=77)) ) {
                    alt20=2;
                }
                else if ( (LA20_1==27) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA20_0>=RULE_INT && LA20_0<=RULE_STRING)||LA20_0==13||LA20_0==20||LA20_0==37||(LA20_0>=40 && LA20_0<=41)||LA20_0==45||LA20_0==50||LA20_0==52||LA20_0==55||LA20_0==57||(LA20_0>=61 && LA20_0<=62)||LA20_0==66||(LA20_0>=68 && LA20_0<=75)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:959:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:959:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:959:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:959:3: ()
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:960:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:965:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:966:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:966:1: ( ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:967:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment2029);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2045);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:988:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:989:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:989:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:990:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2065);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1007:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1007:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1008:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2095);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1016:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==28) ) {
                        int LA19_1 = input.LA(2);

                        if ( (synpred1_InternalGraphViewMapping()) ) {
                            alt19=1;
                        }
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1016:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1016:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1016:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1021:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1021:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1021:7: ()
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1022:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1027:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1028:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1028:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1029:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2148);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1042:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1043:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1043:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1044:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2171);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1068:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1069:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1070:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2211);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2222); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1077:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1080:28: (kw= '=' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1082:2: kw= '='
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpSingleAssign2259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1095:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1096:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1097:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2299);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2310); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1104:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1107:28: (kw= '+=' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1109:2: kw= '+='
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpMultiAssign2347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1122:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1123:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1124:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2386);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2396); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1131:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1134:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1135:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1135:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1136:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2443);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1144:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred2_InternalGraphViewMapping()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1144:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1144:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1144:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1149:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1149:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1149:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1150:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1155:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1156:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1156:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1157:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2496);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1170:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1171:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1171:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1172:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2519);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1196:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1197:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1198:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2558);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2569); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1205:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1208:28: (kw= '||' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1210:2: kw= '||'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOr2606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1223:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1224:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1225:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2645);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2655); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1232:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1235:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1236:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1236:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1237:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2702);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred3_InternalGraphViewMapping()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1250:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1250:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1250:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1251:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1256:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1257:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1257:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1258:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2755);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1271:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1272:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1272:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1273:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2778);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1297:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1298:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1299:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2817);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2828); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1306:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1309:28: (kw= '&&' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1311:2: kw= '&&'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleOpAnd2865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1324:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1325:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1326:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2904);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2914); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1333:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1336:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1337:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1337:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1338:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2961);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1346:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred4_InternalGraphViewMapping()) ) {
                        alt23=1;
                    }


                }
                else if ( (LA23_0==32) ) {
                    int LA23_3 = input.LA(2);

                    if ( (synpred4_InternalGraphViewMapping()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1346:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1346:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1346:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1351:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1351:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1351:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1352:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1357:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1358:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1358:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1359:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3014);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1373:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1373:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1374:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3037);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1398:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1399:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1400:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3076);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3087); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1407:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1410:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1411:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1411:1: (kw= '==' | kw= '!=' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            else if ( (LA24_0==32) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1412:2: kw= '=='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpEquality3125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1419:2: kw= '!='
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpEquality3144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1432:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1433:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1434:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3184);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3194); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1441:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1444:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1445:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1445:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1446:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3241);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1454:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop25:
            do {
                int alt25=3;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA25_2 = input.LA(2);

                    if ( (synpred5_InternalGraphViewMapping()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA25_3 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt25=2;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA25_4 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt25=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA25_5 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt25=2;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA25_6 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt25=2;
                    }


                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1454:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1454:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1454:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1454:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1454:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1456:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1456:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1456:6: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1457:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleXRelationalExpression3277); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1466:3: ( ( ruleQualifiedName ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1467:1: ( ruleQualifiedName )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1467:1: ( ruleQualifiedName )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1468:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3302);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1482:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1482:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1482:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1482:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1482:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1487:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1487:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1487:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1488:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1493:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1494:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1494:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1495:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3363);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1508:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1509:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1509:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1510:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3386);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1534:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1535:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1536:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3426);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3437); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1543:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1546:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1547:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1547:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt26=1;
                }
                break;
            case 35:
                {
                alt26=2;
                }
                break;
            case 36:
                {
                alt26=3;
                }
                break;
            case 37:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1548:2: kw= '>='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare3475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1555:2: kw= '<='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare3494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1562:2: kw= '>'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare3513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1569:2: kw= '<'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpCompare3532); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1582:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1583:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1584:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3572);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3582); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1591:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1594:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1595:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1595:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1596:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3629);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1604:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==38) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred7_InternalGraphViewMapping()) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==39) ) {
                    int LA27_3 = input.LA(2);

                    if ( (synpred7_InternalGraphViewMapping()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1604:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1604:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1604:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1609:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1609:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1609:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1610:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1615:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1616:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1616:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1617:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3682);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1630:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1631:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1631:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1632:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3705);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1656:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1657:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1658:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3744);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3755); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1665:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1668:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1669:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1669:1: (kw= '->' | kw= '..' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            else if ( (LA28_0==39) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1670:2: kw= '->'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther3793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1677:2: kw= '..'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther3812); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1690:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1691:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1692:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3852);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3862); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1699:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1702:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1703:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1703:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1704:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3909);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1712:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred8_InternalGraphViewMapping()) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==41) ) {
                    int LA29_3 = input.LA(2);

                    if ( (synpred8_InternalGraphViewMapping()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1712:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1712:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1712:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1717:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1717:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1717:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1718:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1723:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1724:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1724:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1725:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3962);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1738:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1739:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1739:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1740:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3985);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1764:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1765:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1766:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd4024);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd4035); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1773:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1776:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1777:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1777:1: (kw= '+' | kw= '-' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            else if ( (LA30_0==41) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1778:2: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpAdd4073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1785:2: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpAdd4092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1798:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1799:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1800:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4132);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4142); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1807:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1810:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1811:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1811:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1812:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4189);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1820:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop31:
            do {
                int alt31=2;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA31_5 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt31=1;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1820:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1820:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1820:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1825:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1825:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1825:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1826:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1831:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1832:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1832:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1833:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4242);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1846:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1847:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1847:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1848:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4265);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1872:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1873:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1874:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4304);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4315); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1881:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1884:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1885:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1885:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt32=1;
                }
                break;
            case 42:
                {
                alt32=2;
                }
                break;
            case 43:
                {
                alt32=3;
                }
                break;
            case 44:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1886:2: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleOpMulti4353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1893:2: kw= '**'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti4372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1900:2: kw= '/'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpMulti4391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1907:2: kw= '%'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpMulti4410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1920:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1921:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1922:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4450);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4460); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1929:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1932:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1933:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1933:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=40 && LA33_0<=41)||LA33_0==45) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)||LA33_0==13||LA33_0==20||LA33_0==37||LA33_0==50||LA33_0==52||LA33_0==55||LA33_0==57||(LA33_0>=61 && LA33_0<=62)||LA33_0==66||(LA33_0>=68 && LA33_0<=75)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1933:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1933:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1933:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1933:3: ()
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1939:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1940:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1940:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1941:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4518);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1954:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1955:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1955:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1956:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4539);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1974:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4568);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1990:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1991:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1992:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4604);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4615); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1999:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2002:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt34=1;
                }
                break;
            case 41:
                {
                alt34=2;
                }
                break;
            case 40:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2004:2: kw= '!'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpUnary4653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2011:2: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpUnary4672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2018:2: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary4691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2031:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2032:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2033:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4731);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4741); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2040:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2043:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2044:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2044:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2045:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4788);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2053:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==46) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred10_InternalGraphViewMapping()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2053:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2053:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2053:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2055:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2055:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2055:6: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2056:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXCastedExpression4823); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2065:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2066:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2066:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2067:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4846);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2091:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2092:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2093:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4884);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4894); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2100:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2103:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2104:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2104:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2105:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4941);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2113:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop42:
            do {
                int alt42=3;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA42_2 = input.LA(2);

                    if ( (synpred11_InternalGraphViewMapping()) ) {
                        alt42=1;
                    }
                    else if ( (synpred12_InternalGraphViewMapping()) ) {
                        alt42=2;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA42_3 = input.LA(2);

                    if ( (synpred12_InternalGraphViewMapping()) ) {
                        alt42=2;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA42_4 = input.LA(2);

                    if ( (synpred12_InternalGraphViewMapping()) ) {
                        alt42=2;
                    }


                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2113:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2113:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2113:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2113:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2113:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2119:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2119:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2119:26: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2120:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall4990); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2129:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2130:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2130:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2131:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5013);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5029);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2152:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2153:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2153:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2154:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5051);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2171:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2171:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2171:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2171:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2171:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2187:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2187:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2187:8: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2188:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2193:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt36=3;
            	    switch ( input.LA(1) ) {
            	    case 17:
            	        {
            	        alt36=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt36=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt36=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt36) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2193:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall5137); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2198:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2198:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2199:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2199:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2200:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall5161); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2214:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2214:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2215:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2215:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2216:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall5198); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2229:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==37) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2229:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall5227); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2233:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2234:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2234:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2235:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5248);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2251:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop37:
            	            do {
            	                int alt37=2;
            	                int LA37_0 = input.LA(1);

            	                if ( (LA37_0==49) ) {
            	                    alt37=1;
            	                }


            	                switch (alt37) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2251:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall5261); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2255:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2256:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2256:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2257:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5282);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop37;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall5296); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2277:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2278:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2278:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2279:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5321);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2292:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt41=2;
            	    alt41 = dfa41.predict(input);
            	    switch (alt41) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2292:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2292:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2292:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2299:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2300:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall5355); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2313:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt40=3;
            	            alt40 = dfa40.predict(input);
            	            switch (alt40) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2313:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2313:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2313:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2325:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2326:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5430);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2343:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2343:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2343:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2343:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2344:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2344:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2345:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5458);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2361:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop39:
            	                    do {
            	                        int alt39=2;
            	                        int LA39_0 = input.LA(1);

            	                        if ( (LA39_0==49) ) {
            	                            alt39=1;
            	                        }


            	                        switch (alt39) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2361:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall5471); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2365:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2366:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2366:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2367:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5492);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop39;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,51,FOLLOW_51_in_ruleXMemberFeatureCall5509); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2395:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2396:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2397:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5550);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5560); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2404:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2407:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2408:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2408:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt43=13;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt43=1;
                }
                break;
            case 13:
                {
                alt43=2;
                }
                break;
            case 57:
                {
                alt43=3;
                }
                break;
            case RULE_ID:
            case 37:
            case 66:
                {
                alt43=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 52:
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt43=5;
                }
                break;
            case 55:
                {
                alt43=6;
                }
                break;
            case 20:
                {
                alt43=7;
                }
                break;
            case 61:
                {
                alt43=8;
                }
                break;
            case 62:
                {
                alt43=9;
                }
                break;
            case 73:
                {
                alt43=10;
                }
                break;
            case 74:
                {
                alt43=11;
                }
                break;
            case 75:
                {
                alt43=12;
                }
                break;
            case 50:
                {
                alt43=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2409:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5607);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2419:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5634);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2429:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5661);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2439:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5688);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2449:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5715);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2459:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5742);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2469:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5769);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2479:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5796);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2489:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5823);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2499:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5850);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2509:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5877);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2519:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5904);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2529:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5931);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2545:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2546:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2547:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5966);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5976); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2554:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2557:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2558:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2558:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt44=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt44=1;
                }
                break;
            case 69:
            case 70:
                {
                alt44=2;
                }
                break;
            case RULE_INT:
                {
                alt44=3;
                }
                break;
            case 71:
                {
                alt44=4;
                }
                break;
            case RULE_STRING:
                {
                alt44=5;
                }
                break;
            case 72:
                {
                alt44=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2559:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral6023);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2569:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6050);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2579:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral6077);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2589:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral6104);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2599:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral6131);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2609:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6158);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2625:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2626:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2627:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6193);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6203); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2634:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_formalParameters_2_0 = null;

        EObject lv_formalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2637:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2638:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2638:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2638:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2638:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2639:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXClosure6249); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2648:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==24||LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2648:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2648:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2649:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2649:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2650:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6271);
                    lv_formalParameters_2_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_2_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2666:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==49) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2666:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXClosure6284); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2670:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2671:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2671:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2672:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6305);
                    	    lv_formalParameters_4_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_4_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleXClosure6321); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2692:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2693:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2693:1: (lv_expression_6_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2694:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure6342);
            lv_expression_6_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXClosure6354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2722:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2723:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2724:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6390);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6400); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2731:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2734:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2735:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2735:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2735:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2735:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2735:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2746:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2746:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2746:6: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2747:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2752:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==24||LA48_0==50) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2752:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2752:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2753:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2753:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2754:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6498);
                    lv_formalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2770:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==49) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2770:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXShortClosure6511); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2774:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2775:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2775:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2776:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6532);
                    	    lv_formalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleXShortClosure6548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2796:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2797:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2797:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2798:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6571);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2822:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2823:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2824:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6607);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6617); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2831:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2834:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2835:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2835:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2835:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleXParenthesizedExpression6654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6676);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleXParenthesizedExpression6687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2860:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2861:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2862:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6723);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6733); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2869:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2872:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2873:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2873:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2873:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2873:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2874:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXIfExpression6779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression6791); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2887:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2888:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2888:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2889:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6812);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression6824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2909:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2910:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2910:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2911:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6845);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2927:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==56) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred16_InternalGraphViewMapping()) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2927:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2927:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2927:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleXIfExpression6866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2932:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2933:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2933:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2934:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6888);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2958:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2959:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2960:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6926);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6936); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2967:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2970:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2971:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2971:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2971:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2971:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2972:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2981:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==58) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2981:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2981:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2982:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2982:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2983:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7004);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression7016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3003:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3004:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3004:1: (lv_switch_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3005:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7039);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleXSwitchExpression7051); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3025:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID||LA51_0==24||LA51_0==50||LA51_0==58||LA51_0==60) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3026:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3026:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3027:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7072);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3043:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==59) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3043:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression7086); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression7098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3051:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3052:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3052:1: (lv_default_9_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3053:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7119);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleXSwitchExpression7133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3081:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3082:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3083:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7169);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7179); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3090:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3093:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3094:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3094:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3094:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3094:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID||LA53_0==24||LA53_0==50) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3095:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3095:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3096:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7225);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3112:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==60) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3112:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXCasePart7239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3116:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3117:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3117:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3118:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7260);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXCasePart7274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3138:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3139:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3139:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3140:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7295);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3164:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3165:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3166:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7331);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7341); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3173:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3176:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3177:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3177:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3177:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3177:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3178:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleXForLoopExpression7387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXForLoopExpression7399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3191:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3192:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3192:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3193:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7420);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleXForLoopExpression7432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3213:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3214:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3214:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3215:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7453);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleXForLoopExpression7465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3235:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3236:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3236:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3237:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7486);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3261:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3262:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3263:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7522);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7532); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3270:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3273:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3274:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3274:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3274:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3274:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3275:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXWhileExpression7578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXWhileExpression7590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3288:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3289:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3289:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3290:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7611);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXWhileExpression7623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3310:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3311:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3311:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3312:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7644);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3336:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3337:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3338:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7680);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7690); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3345:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3348:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3349:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3349:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3349:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3349:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3350:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXDoWhileExpression7736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3359:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3360:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3360:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3361:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7757);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression7769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXDoWhileExpression7781); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3385:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3386:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3386:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3387:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7802);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleXDoWhileExpression7814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3415:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3416:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3417:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7850);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7860); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3424:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3427:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3428:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3428:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3428:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3428:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3429:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression7906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3438:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_STRING)||LA56_0==13||LA56_0==20||LA56_0==37||(LA56_0>=40 && LA56_0<=41)||LA56_0==45||LA56_0==50||LA56_0==52||LA56_0==55||LA56_0==57||(LA56_0>=61 && LA56_0<=62)||(LA56_0>=64 && LA56_0<=66)||(LA56_0>=68 && LA56_0<=75)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3438:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3438:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3439:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3439:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3440:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7928);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3456:2: (otherlv_3= ';' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==63) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3456:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleXBlockExpression7941); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleXBlockExpression7957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3472:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3473:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3474:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7993);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8003); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3481:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3484:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3485:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3485:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=64 && LA57_0<=65)) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==13||LA57_0==20||LA57_0==37||(LA57_0>=40 && LA57_0<=41)||LA57_0==45||LA57_0==50||LA57_0==52||LA57_0==55||LA57_0==57||(LA57_0>=61 && LA57_0<=62)||LA57_0==66||(LA57_0>=68 && LA57_0<=75)) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3486:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8050);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3496:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8077);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3512:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3513:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3514:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8112);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8122); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3521:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3524:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3525:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3525:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3525:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3525:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3526:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3531:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==64) ) {
                alt58=1;
            }
            else if ( (LA58_0==65) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3531:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3531:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3532:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3532:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3533:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,64,FOLLOW_64_in_ruleXVariableDeclaration8175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3547:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleXVariableDeclaration8206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3551:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (synpred17_InternalGraphViewMapping()) ) {
                    alt59=1;
                }
                else if ( (true) ) {
                    alt59=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA59_0==50) && (synpred17_InternalGraphViewMapping())) {
                alt59=1;
            }
            else if ( (LA59_0==24) && (synpred17_InternalGraphViewMapping())) {
                alt59=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3551:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3551:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3551:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3559:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3559:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3559:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3560:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3560:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3561:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8254);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3577:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3578:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3578:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3579:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8275);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3596:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3596:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3597:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3597:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3598:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8304);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3614:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==27) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3614:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXVariableDeclaration8318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3618:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3619:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3619:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3620:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8339);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3644:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3645:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3646:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8377);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8387); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3653:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3656:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3657:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3657:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3657:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3657:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==RULE_ID||LA61_1==17||LA61_1==37) ) {
                    alt61=1;
                }
            }
            else if ( (LA61_0==24||LA61_0==50) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3658:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3658:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3659:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8433);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3675:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3676:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3676:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3677:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8455);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3701:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3702:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3703:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8491);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8501); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3710:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3713:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3714:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3714:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3714:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3714:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3715:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3720:2: ( ( ruleStaticQualifier ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==67) ) {
                    alt62=1;
                }
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3721:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3721:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3722:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8558);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3735:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==37) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3735:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXFeatureCall8572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3739:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3740:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3740:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3741:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8593);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3757:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==49) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3757:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXFeatureCall8606); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3761:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3762:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3762:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3763:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8627);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleXFeatureCall8641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3783:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3784:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3784:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3785:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8666);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3798:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3798:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3798:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3798:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3805:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3806:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,50,FOLLOW_50_in_ruleXFeatureCall8700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3819:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt66=3;
                    alt66 = dfa66.predict(input);
                    switch (alt66) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3819:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3819:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3819:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3831:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3832:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8775);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3849:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3849:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3849:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3849:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3850:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3850:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3851:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8803);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3867:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==49) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3867:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,49,FOLLOW_49_in_ruleXFeatureCall8816); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3871:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3872:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3872:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3873:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8837);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop65;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,51,FOLLOW_51_in_ruleXFeatureCall8854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3901:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3902:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3903:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8893);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8904); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3910:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3913:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3914:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3914:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            else if ( (LA68_0==66) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3915:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8951);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3927:2: kw= 'super'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleIdOrSuper8975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3940:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3941:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3942:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9016);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9027); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3949:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3952:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3953:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3953:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID) ) {
                    int LA69_2 = input.LA(2);

                    if ( (LA69_2==67) ) {
                        alt69=1;
                    }


                }


                switch (alt69) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3954:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9074);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,67,FOLLOW_67_in_ruleStaticQualifier9092); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3978:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3979:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3980:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9133);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9143); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3987:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3990:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3991:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3991:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3991:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3991:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3992:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXConstructorCall9189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4001:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4002:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4002:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4003:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9212);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4016:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==37) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4016:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleXConstructorCall9225); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4020:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4021:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4021:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4022:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9246);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4038:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==49) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4038:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleXConstructorCall9259); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4042:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4043:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4043:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4044:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9280);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleXConstructorCall9294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleXConstructorCall9308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4068:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt73=3;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4068:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4068:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4068:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4080:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4081:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9370);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4098:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4098:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4098:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4098:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4099:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4099:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4100:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9398);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4116:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==49) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4116:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,49,FOLLOW_49_in_ruleXConstructorCall9411); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4120:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4121:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4121:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4122:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9432);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,51,FOLLOW_51_in_ruleXConstructorCall9449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4150:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4151:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4152:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9485);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9495); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4159:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4162:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4163:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4163:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4163:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4163:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4164:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4169:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==69) ) {
                alt74=1;
            }
            else if ( (LA74_0==70) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4169:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXBooleanLiteral9542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4174:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4174:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4175:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4175:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4176:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral9566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4197:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4198:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4199:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9616);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9626); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4206:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4209:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4210:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4210:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4210:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4210:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4211:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXNullLiteral9672); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4228:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4229:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4230:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9708);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9718); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4237:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4240:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4241:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4241:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4241:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4241:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4242:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4247:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4248:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4248:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4249:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4273:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4274:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4275:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9810);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9820); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4282:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4285:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4286:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4286:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4286:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4286:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4287:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4292:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4293:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4293:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4294:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4318:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4319:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4320:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9912);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9922); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4327:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4330:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4331:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4331:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4331:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4331:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4332:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXTypeLiteral9968); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXTypeLiteral9980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4345:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4346:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4346:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4347:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10003);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXTypeLiteral10015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4372:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4373:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4374:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10051);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10061); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4381:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4384:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4385:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4385:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4385:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4385:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4386:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXThrowExpression10107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4395:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4396:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4396:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4397:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10128);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4421:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4422:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4423:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10164);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10174); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4430:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4433:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4434:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4434:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4434:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4434:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4435:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXReturnExpression10220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4444:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4444:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4449:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4450:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10251);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4474:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4475:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4476:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10288);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10298); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4483:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4486:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4487:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4487:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4487:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4487:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4488:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4497:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4498:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4498:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4499:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10365);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4515:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==77) ) {
                alt78=1;
            }
            else if ( (LA78_0==76) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4515:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4515:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4515:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4515:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==77) ) {
                            int LA76_2 = input.LA(2);

                            if ( (synpred22_InternalGraphViewMapping()) ) {
                                alt76=1;
                            }


                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4515:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4517:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4518:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10395);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt76 >= 1 ) break loop76;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4534:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==76) ) {
                        int LA77_1 = input.LA(2);

                        if ( (synpred23_InternalGraphViewMapping()) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4534:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4534:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4534:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10417); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4539:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4540:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4540:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4541:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10439);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4558:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4558:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4558:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4562:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4563:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4563:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4564:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10482);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4588:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4589:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4590:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10520);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10530); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4597:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4600:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4601:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4601:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4601:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4601:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4601:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleXCatchClause10575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXCatchClause10588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4610:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4611:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4611:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4612:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause10609);
            lv_declaredParam_2_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXCatchClause10621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4632:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4633:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4633:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4634:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10642);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4658:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4659:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4660:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10679);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10690); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4667:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4670:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4671:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4671:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4672:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10737);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4682:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==17) ) {
                    int LA79_2 = input.LA(2);

                    if ( (LA79_2==RULE_ID) ) {
                        int LA79_3 = input.LA(3);

                        if ( (synpred25_InternalGraphViewMapping()) ) {
                            alt79=1;
                        }


                    }


                }


                switch (alt79) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4682:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4682:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4682:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedName10765); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10788);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4709:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4710:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4711:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10835);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10845); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4718:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4721:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4722:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4722:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID) ) {
                alt80=1;
            }
            else if ( (LA80_0==24||LA80_0==50) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4723:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10892);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4733:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10919);
                    this_XFunctionTypeRef_1=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4749:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4750:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4751:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10954);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10964); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4758:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4761:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4762:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4762:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4762:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4762:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==50) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4762:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleXFunctionTypeRef11002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4766:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4767:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4767:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4768:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11023);
                    lv_paramTypes_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                      	        }
                             		add(
                             			current, 
                             			"paramTypes",
                              		lv_paramTypes_1_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4784:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==49) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4784:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXFunctionTypeRef11036); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4788:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4789:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4789:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4790:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11057);
                    	    lv_paramTypes_3_0=ruleJvmTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"paramTypes",
                    	              		lv_paramTypes_3_0, 
                    	              		"JvmTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXFunctionTypeRef11071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleXFunctionTypeRef11085); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4814:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4815:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4815:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4816:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11106);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4840:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4841:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4842:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11142);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11152); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4849:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4852:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4853:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4853:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4853:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4853:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4854:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4854:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4855:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11200);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4868:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4868:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4868:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4868:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleJvmParameterizedTypeReference11221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4873:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4874:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4874:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4875:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11243);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4891:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==49) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4891:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleJvmParameterizedTypeReference11256); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4895:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4896:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4896:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4897:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11277);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleJvmParameterizedTypeReference11291); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4925:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4926:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4927:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11329);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11339); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4934:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4937:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4938:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4938:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID||LA85_0==24||LA85_0==50) ) {
                alt85=1;
            }
            else if ( (LA85_0==78) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4939:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11386);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4949:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11413);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4965:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4966:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4967:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11448);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11458); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4974:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4977:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4978:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4978:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4978:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4978:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4979:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleJvmWildcardTypeReference11504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4988:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt86=3;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==79) ) {
                alt86=1;
            }
            else if ( (LA86_0==66) ) {
                alt86=2;
            }
            switch (alt86) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4988:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4988:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4989:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4989:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4990:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11526);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5007:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5007:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5008:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5008:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5009:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11553);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5033:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5034:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5035:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11591);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11601); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5042:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5045:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5046:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5046:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5046:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleJvmUpperBound11638); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5050:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5051:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5051:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5052:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11659);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5076:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5077:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5078:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11695);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11705); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5085:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5088:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5089:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5089:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5089:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmUpperBoundAnded11742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5093:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5094:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5094:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5095:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11763);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5119:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5120:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5121:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11799);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11809); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5128:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5131:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5132:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5132:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5132:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleJvmLowerBound11846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5136:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5137:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5137:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5138:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11867);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5164:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5165:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5166:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11906);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11917); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5173:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5176:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5177:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalGraphViewMapping
    public final void synpred1_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1016:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1016:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1016:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1016:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1016:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1017:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1017:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1018:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1018:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1019:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewMapping2116);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalGraphViewMapping

    // $ANTLR start synpred2_InternalGraphViewMapping
    public final void synpred2_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1144:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1144:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1144:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1144:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1144:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1145:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1145:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1146:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1146:1: ( ruleOpOr )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1147:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewMapping2464);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalGraphViewMapping

    // $ANTLR start synpred3_InternalGraphViewMapping
    public final void synpred3_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1246:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1246:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1247:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1247:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1248:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewMapping2723);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalGraphViewMapping

    // $ANTLR start synpred4_InternalGraphViewMapping
    public final void synpred4_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1346:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1346:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1346:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1346:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1346:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1347:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1347:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1348:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1348:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1349:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewMapping2982);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalGraphViewMapping

    // $ANTLR start synpred5_InternalGraphViewMapping
    public final void synpred5_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1454:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1454:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1454:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1454:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1454:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1455:1: 
        {
        }

        match(input,33,FOLLOW_33_in_synpred5_InternalGraphViewMapping3258); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGraphViewMapping

    // $ANTLR start synpred6_InternalGraphViewMapping
    public final void synpred6_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1482:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1482:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1482:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1482:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1482:10: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1483:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1483:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1484:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1484:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1485:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewMapping3331);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalGraphViewMapping

    // $ANTLR start synpred7_InternalGraphViewMapping
    public final void synpred7_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1604:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1604:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1604:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1604:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1604:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1605:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1605:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1606:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1606:1: ( ruleOpOther )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1607:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewMapping3650);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalGraphViewMapping

    // $ANTLR start synpred8_InternalGraphViewMapping
    public final void synpred8_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1712:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1712:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1712:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1712:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1712:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1713:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1713:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1714:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1714:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1715:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewMapping3930);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalGraphViewMapping

    // $ANTLR start synpred9_InternalGraphViewMapping
    public final void synpred9_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1820:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1820:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1820:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1820:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1820:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1821:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1821:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1822:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1822:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1823:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewMapping4210);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalGraphViewMapping

    // $ANTLR start synpred10_InternalGraphViewMapping
    public final void synpred10_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2053:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2053:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2053:4: ( () 'as' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2053:5: () 'as'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2053:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2054:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred10_InternalGraphViewMapping4804); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalGraphViewMapping

    // $ANTLR start synpred11_InternalGraphViewMapping
    public final void synpred11_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2113:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2113:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2113:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2113:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2113:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2114:1: 
        {
        }

        match(input,17,FOLLOW_17_in_synpred11_InternalGraphViewMapping4958); if (state.failed) return ;
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2115:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2116:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2116:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2117:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalGraphViewMapping4967);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewMapping4973);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalGraphViewMapping

    // $ANTLR start synpred12_InternalGraphViewMapping
    public final void synpred12_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2171:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2171:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2171:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2171:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2171:10: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2172:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2172:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt87=3;
        switch ( input.LA(1) ) {
        case 17:
            {
            alt87=1;
            }
            break;
        case 47:
            {
            alt87=2;
            }
            break;
        case 48:
            {
            alt87=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 87, 0, input);

            throw nvae;
        }

        switch (alt87) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2172:4: '.'
                {
                match(input,17,FOLLOW_17_in_synpred12_InternalGraphViewMapping5076); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2174:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2174:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2175:1: ( '?.' )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2175:1: ( '?.' )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2176:2: '?.'
                {
                match(input,47,FOLLOW_47_in_synpred12_InternalGraphViewMapping5090); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2181:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2181:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2182:1: ( '*.' )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2182:1: ( '*.' )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2183:2: '*.'
                {
                match(input,48,FOLLOW_48_in_synpred12_InternalGraphViewMapping5110); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalGraphViewMapping

    // $ANTLR start synpred13_InternalGraphViewMapping
    public final void synpred13_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2292:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2293:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2293:1: ( '(' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2294:2: '('
        {
        match(input,50,FOLLOW_50_in_synpred13_InternalGraphViewMapping5337); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGraphViewMapping

    // $ANTLR start synpred14_InternalGraphViewMapping
    public final void synpred14_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2313:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2313:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2313:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2313:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2313:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2314:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2314:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==RULE_ID||LA89_0==24||LA89_0==50) ) {
            alt89=1;
        }
        switch (alt89) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2314:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2314:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2315:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2315:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2316:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping5389);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2318:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop88:
                do {
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==49) ) {
                        alt88=1;
                    }


                    switch (alt88) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2318:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,49,FOLLOW_49_in_synpred14_InternalGraphViewMapping5396); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2319:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2320:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2320:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2321:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping5403);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop88;
                    }
                } while (true);


                }
                break;

        }

        match(input,53,FOLLOW_53_in_synpred14_InternalGraphViewMapping5413); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalGraphViewMapping

    // $ANTLR start synpred16_InternalGraphViewMapping
    public final void synpred16_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2927:4: ( 'else' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2927:6: 'else'
        {
        match(input,56,FOLLOW_56_in_synpred16_InternalGraphViewMapping6858); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalGraphViewMapping

    // $ANTLR start synpred17_InternalGraphViewMapping
    public final void synpred17_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3551:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3551:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3551:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3551:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3551:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3552:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3552:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3553:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewMapping8224);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3555:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3556:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3556:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3557:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalGraphViewMapping8233);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalGraphViewMapping

    // $ANTLR start synpred18_InternalGraphViewMapping
    public final void synpred18_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3798:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3799:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3799:1: ( '(' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3800:2: '('
        {
        match(input,50,FOLLOW_50_in_synpred18_InternalGraphViewMapping8682); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalGraphViewMapping

    // $ANTLR start synpred19_InternalGraphViewMapping
    public final void synpred19_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3819:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3819:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3819:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3819:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3819:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3820:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3820:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==RULE_ID||LA93_0==24||LA93_0==50) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3820:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3820:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3821:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3821:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3822:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8734);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3824:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==49) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3824:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,49,FOLLOW_49_in_synpred19_InternalGraphViewMapping8741); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3825:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3826:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3826:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3827:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8748);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop92;
                    }
                } while (true);


                }
                break;

        }

        match(input,53,FOLLOW_53_in_synpred19_InternalGraphViewMapping8758); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalGraphViewMapping

    // $ANTLR start synpred20_InternalGraphViewMapping
    public final void synpred20_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4068:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4068:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4068:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4068:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4068:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4069:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4069:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==24||LA95_0==50) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4069:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4069:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4070:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4070:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4071:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping9329);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4073:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==49) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4073:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,49,FOLLOW_49_in_synpred20_InternalGraphViewMapping9336); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4074:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4075:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4075:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4076:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping9343);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop94;
                    }
                } while (true);


                }
                break;

        }

        match(input,53,FOLLOW_53_in_synpred20_InternalGraphViewMapping9353); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalGraphViewMapping

    // $ANTLR start synpred21_InternalGraphViewMapping
    public final void synpred21_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4444:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4445:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4445:1: ( ruleXExpression )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4446:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewMapping10234);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalGraphViewMapping

    // $ANTLR start synpred22_InternalGraphViewMapping
    public final void synpred22_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4515:5: ( 'catch' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4515:7: 'catch'
        {
        match(input,77,FOLLOW_77_in_synpred22_InternalGraphViewMapping10379); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalGraphViewMapping

    // $ANTLR start synpred23_InternalGraphViewMapping
    public final void synpred23_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4534:5: ( 'finally' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4534:7: 'finally'
        {
        match(input,76,FOLLOW_76_in_synpred23_InternalGraphViewMapping10409); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalGraphViewMapping

    // $ANTLR start synpred25_InternalGraphViewMapping
    public final void synpred25_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4682:3: ( '.' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4683:2: '.'
        {
        match(input,17,FOLLOW_17_in_synpred25_InternalGraphViewMapping10756); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalGraphViewMapping

    // $ANTLR start synpred26_InternalGraphViewMapping
    public final void synpred26_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4868:4: ( '<' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4868:6: '<'
        {
        match(input,37,FOLLOW_37_in_synpred26_InternalGraphViewMapping11213); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalGraphViewMapping

    // Delegated rules

    public final boolean synpred19_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA41 dfa41 = new DFA41(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA84 dfa84 = new DFA84(this);
    static final String DFA41_eotS =
        "\101\uffff";
    static final String DFA41_eofS =
        "\1\2\100\uffff";
    static final String DFA41_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA41_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA41_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA41_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA41_transitionS = {
            "\3\2\6\uffff\3\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\26\2\1\1\2\2\1\uffff\15\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "2292:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\34\uffff";
    static final String DFA40_eofS =
        "\34\uffff";
    static final String DFA40_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA40_maxS =
        "\1\113\2\0\31\uffff";
    static final String DFA40_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA40_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\2\5\6\uffff\1\5\6\uffff\1\5\3\uffff\1\3\14\uffff\1\5\2"+
            "\uffff\2\5\3\uffff\1\5\4\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5"+
            "\1\uffff\1\5\3\uffff\2\5\3\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "2313:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_0 = input.LA(1);

                         
                        int index40_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA40_0==RULE_ID) ) {s = 1;}

                        else if ( (LA40_0==50) ) {s = 2;}

                        else if ( (LA40_0==24) && (synpred14_InternalGraphViewMapping())) {s = 3;}

                        else if ( (LA40_0==53) && (synpred14_InternalGraphViewMapping())) {s = 4;}

                        else if ( ((LA40_0>=RULE_INT && LA40_0<=RULE_STRING)||LA40_0==13||LA40_0==20||LA40_0==37||(LA40_0>=40 && LA40_0<=41)||LA40_0==45||LA40_0==52||LA40_0==55||LA40_0==57||(LA40_0>=61 && LA40_0<=62)||LA40_0==66||(LA40_0>=68 && LA40_0<=75)) ) {s = 5;}

                        else if ( (LA40_0==51) ) {s = 27;}

                         
                        input.seek(index40_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_2 = input.LA(1);

                         
                        int index40_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index40_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\101\uffff";
    static final String DFA67_eofS =
        "\1\2\100\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA67_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA67_transitionS = {
            "\3\2\6\uffff\3\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\26\2\1\1\2\2\1\uffff\15\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3798:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\34\uffff";
    static final String DFA66_eofS =
        "\34\uffff";
    static final String DFA66_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA66_maxS =
        "\1\113\2\0\31\uffff";
    static final String DFA66_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA66_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\1\2\5\6\uffff\1\5\6\uffff\1\5\3\uffff\1\3\14\uffff\1\5\2"+
            "\uffff\2\5\3\uffff\1\5\4\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5"+
            "\1\uffff\1\5\3\uffff\2\5\3\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3819:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_0 = input.LA(1);

                         
                        int index66_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA66_0==RULE_ID) ) {s = 1;}

                        else if ( (LA66_0==50) ) {s = 2;}

                        else if ( (LA66_0==24) && (synpred19_InternalGraphViewMapping())) {s = 3;}

                        else if ( (LA66_0==53) && (synpred19_InternalGraphViewMapping())) {s = 4;}

                        else if ( ((LA66_0>=RULE_INT && LA66_0<=RULE_STRING)||LA66_0==13||LA66_0==20||LA66_0==37||(LA66_0>=40 && LA66_0<=41)||LA66_0==45||LA66_0==52||LA66_0==55||LA66_0==57||(LA66_0>=61 && LA66_0<=62)||LA66_0==66||(LA66_0>=68 && LA66_0<=75)) ) {s = 5;}

                        else if ( (LA66_0==51) ) {s = 27;}

                         
                        input.seek(index66_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\34\uffff";
    static final String DFA73_eofS =
        "\34\uffff";
    static final String DFA73_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA73_maxS =
        "\1\113\2\0\31\uffff";
    static final String DFA73_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA73_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\1\2\5\6\uffff\1\5\6\uffff\1\5\3\uffff\1\3\14\uffff\1\5\2"+
            "\uffff\2\5\3\uffff\1\5\4\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5"+
            "\1\uffff\1\5\3\uffff\2\5\3\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "4068:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_0 = input.LA(1);

                         
                        int index73_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA73_0==RULE_ID) ) {s = 1;}

                        else if ( (LA73_0==50) ) {s = 2;}

                        else if ( (LA73_0==24) && (synpred20_InternalGraphViewMapping())) {s = 3;}

                        else if ( (LA73_0==53) && (synpred20_InternalGraphViewMapping())) {s = 4;}

                        else if ( ((LA73_0>=RULE_INT && LA73_0<=RULE_STRING)||LA73_0==13||LA73_0==20||LA73_0==37||(LA73_0>=40 && LA73_0<=41)||LA73_0==45||LA73_0==52||LA73_0==55||LA73_0==57||(LA73_0>=61 && LA73_0<=62)||LA73_0==66||(LA73_0>=68 && LA73_0<=75)) ) {s = 5;}

                        else if ( (LA73_0==51) ) {s = 27;}

                         
                        input.seek(index73_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA75_eotS =
        "\101\uffff";
    static final String DFA75_eofS =
        "\1\31\100\uffff";
    static final String DFA75_minS =
        "\1\4\30\0\50\uffff";
    static final String DFA75_maxS =
        "\1\115\30\0\50\uffff";
    static final String DFA75_acceptS =
        "\31\uffff\1\2\46\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\50\uffff}>";
    static final String[] DFA75_transitionS = {
            "\1\1\1\15\1\17\6\uffff\1\6\2\31\1\uffff\3\31\1\22\1\uffff\3"+
            "\31\1\uffff\1\31\1\uffff\11\31\1\10\2\31\1\4\1\3\3\31\1\2\4"+
            "\31\1\30\1\31\1\12\1\uffff\1\31\1\21\1\31\1\7\3\31\1\23\1\24"+
            "\3\31\1\11\1\uffff\1\5\1\13\1\14\1\16\1\20\1\25\1\26\1\27\2"+
            "\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "4444:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA75_2 = input.LA(1);

                         
                        int index75_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA75_3 = input.LA(1);

                         
                        int index75_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA75_4 = input.LA(1);

                         
                        int index75_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA75_5 = input.LA(1);

                         
                        int index75_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA75_6 = input.LA(1);

                         
                        int index75_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA75_7 = input.LA(1);

                         
                        int index75_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA75_8 = input.LA(1);

                         
                        int index75_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA75_9 = input.LA(1);

                         
                        int index75_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA75_10 = input.LA(1);

                         
                        int index75_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA75_11 = input.LA(1);

                         
                        int index75_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA75_12 = input.LA(1);

                         
                        int index75_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA75_13 = input.LA(1);

                         
                        int index75_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA75_14 = input.LA(1);

                         
                        int index75_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA75_15 = input.LA(1);

                         
                        int index75_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA75_16 = input.LA(1);

                         
                        int index75_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA75_17 = input.LA(1);

                         
                        int index75_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA75_18 = input.LA(1);

                         
                        int index75_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA75_19 = input.LA(1);

                         
                        int index75_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA75_20 = input.LA(1);

                         
                        int index75_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA75_21 = input.LA(1);

                         
                        int index75_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA75_22 = input.LA(1);

                         
                        int index75_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA75_23 = input.LA(1);

                         
                        int index75_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA75_24 = input.LA(1);

                         
                        int index75_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA84_eotS =
        "\101\uffff";
    static final String DFA84_eofS =
        "\1\2\100\uffff";
    static final String DFA84_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA84_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA84_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA84_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA84_transitionS = {
            "\3\2\6\uffff\3\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\11\2\1\1\17\2\1\uffff\15\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "4868:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_1 = input.LA(1);

                         
                        int index84_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewMapping()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index84_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleDiagramMapping_in_entryRuleDiagramMapping75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramMapping85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDiagramMapping131 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_11_in_ruleDiagramMapping144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDiagramMapping165 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDiagramMapping177 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleDiagramMapping198 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDiagramMapping210 = new BitSet(new long[]{0x0000000004C84000L});
    public static final BitSet FOLLOW_ruleAbstractExpressionMapping_in_ruleDiagramMapping231 = new BitSet(new long[]{0x0000000004C84000L});
    public static final BitSet FOLLOW_14_in_ruleDiagramMapping244 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleDiagramMapping257 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleDiagramMapping278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleImport363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard479 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNameWithWildcard498 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedNameWithWildcard511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractExpressionMapping_in_entryRuleAbstractExpressionMapping553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractExpressionMapping563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeMapping_in_ruleAbstractExpressionMapping610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelMapping_in_ruleAbstractExpressionMapping637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeMapping_in_ruleAbstractExpressionMapping664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingCall_in_ruleAbstractExpressionMapping691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeMapping_in_entryRuleNodeMapping726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeMapping736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNodeMapping773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeMapping790 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNodeMapping807 = new BitSet(new long[]{0x6294232000302070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_21_in_ruleNodeMapping825 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleNodeMapping860 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNodeMapping872 = new BitSet(new long[]{0x0000000004C84000L});
    public static final BitSet FOLLOW_ruleAbstractExpressionMapping_in_ruleNodeMapping893 = new BitSet(new long[]{0x0000000004C84000L});
    public static final BitSet FOLLOW_14_in_ruleNodeMapping906 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleNodeMapping919 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleNodeMapping940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelMapping_in_entryRuleLabelMapping978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelMapping988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLabelMapping1025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabelMapping1042 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLabelMapping1059 = new BitSet(new long[]{0x6294232000302070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_21_in_ruleLabelMapping1077 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleLabelMapping1112 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleLabelMapping1125 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleLabelMapping1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeMapping_in_entryRuleEdgeMapping1184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeMapping1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEdgeMapping1231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEdgeMapping1248 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEdgeMapping1265 = new BitSet(new long[]{0x6294232000302070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_21_in_ruleEdgeMapping1283 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleEdgeMapping1318 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEdgeMapping1330 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1351 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEdgeMapping1364 = new BitSet(new long[]{0x0000000006404000L});
    public static final BitSet FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1385 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_ruleLabelMapping_in_ruleEdgeMapping1407 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeMapping1420 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEdgeMapping1433 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleEdgeMapping1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeEndMapping_in_entryRuleEdgeEndMapping1492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeEndMapping1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEdgeEndMapping1540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26_in_ruleEdgeEndMapping1564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEdgeEndMapping1598 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEdgeEndMapping1610 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleEdgeEndMapping1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingCall_in_entryRuleMappingCall1667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingCall1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMappingCall1714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMappingCall1734 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMappingCall1746 = new BitSet(new long[]{0x6294232000302070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_21_in_ruleMappingCall1764 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleMappingCall1799 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleMappingCall1812 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleMappingCall1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment2029 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2045 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2095 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2148 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpSingleAssign2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpMultiAssign2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2443 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2496 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2519 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOr2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2702 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2755 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2778 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpAnd2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2961 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3014 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3037 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpEquality3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpEquality3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3241 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_33_in_ruleXRelationalExpression3277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3302 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3363 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3386 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpCompare3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3629 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3682 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3705 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpOther3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3909 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3962 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3985 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd4024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpAdd4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpAdd4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4189 = new BitSet(new long[]{0x00001C0000040002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4242 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4265 = new BitSet(new long[]{0x00001C0000040002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpMulti4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpMulti4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpMulti4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4518 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpUnary4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpUnary4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4788 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXCastedExpression4823 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4846 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4941 = new BitSet(new long[]{0x0001800000020002L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall4990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5013 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5029 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5051 = new BitSet(new long[]{0x0001800000020002L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall5137 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall5161 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall5198 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall5227 = new BitSet(new long[]{0x0004000001000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5248 = new BitSet(new long[]{0x0002001000000000L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall5261 = new BitSet(new long[]{0x0004000001000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5282 = new BitSet(new long[]{0x0002001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall5296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5321 = new BitSet(new long[]{0x0005800000020002L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall5355 = new BitSet(new long[]{0x62BC232001102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5430 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5458 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall5471 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5492 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXMemberFeatureCall5509 = new BitSet(new long[]{0x0001800000020002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXClosure6249 = new BitSet(new long[]{0x0024000001000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6271 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXClosure6284 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6305 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXClosure6321 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure6342 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXClosure6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6498 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXShortClosure6511 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6532 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXShortClosure6548 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXParenthesizedExpression6654 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6676 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXParenthesizedExpression6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXIfExpression6779 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression6791 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6812 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression6824 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6845 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXIfExpression6866 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6982 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7004 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression7016 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7039 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXSwitchExpression7051 = new BitSet(new long[]{0x1404000001000010L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7072 = new BitSet(new long[]{0x1C04000001004010L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression7086 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression7098 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7119 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXSwitchExpression7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7225 = new BitSet(new long[]{0x1400000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXCasePart7239 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7260 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXCasePart7274 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleXForLoopExpression7387 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXForLoopExpression7399 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7420 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXForLoopExpression7432 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7453 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXForLoopExpression7465 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXWhileExpression7578 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXWhileExpression7590 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7611 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXWhileExpression7623 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXDoWhileExpression7736 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7757 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression7769 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXDoWhileExpression7781 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7802 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXDoWhileExpression7814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression7906 = new BitSet(new long[]{0x6294232000106070L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7928 = new BitSet(new long[]{0xE294232000106070L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_63_in_ruleXBlockExpression7941 = new BitSet(new long[]{0x6294232000106070L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_14_in_ruleXBlockExpression7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXVariableDeclaration8175 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_65_in_ruleXVariableDeclaration8206 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8275 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8304 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleXVariableDeclaration8318 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8558 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_37_in_ruleXFeatureCall8572 = new BitSet(new long[]{0x0004000001000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8593 = new BitSet(new long[]{0x0002001000000000L});
    public static final BitSet FOLLOW_49_in_ruleXFeatureCall8606 = new BitSet(new long[]{0x0004000001000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8627 = new BitSet(new long[]{0x0002001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXFeatureCall8641 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8666 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXFeatureCall8700 = new BitSet(new long[]{0x62BC232001102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8775 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8803 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXFeatureCall8816 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8837 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXFeatureCall8854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleIdOrSuper8975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleStaticQualifier9092 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXConstructorCall9189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9212 = new BitSet(new long[]{0x0004002000000000L});
    public static final BitSet FOLLOW_37_in_ruleXConstructorCall9225 = new BitSet(new long[]{0x0004000001000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9246 = new BitSet(new long[]{0x0002001000000000L});
    public static final BitSet FOLLOW_49_in_ruleXConstructorCall9259 = new BitSet(new long[]{0x0004000001000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9280 = new BitSet(new long[]{0x0002001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXConstructorCall9294 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXConstructorCall9308 = new BitSet(new long[]{0x62BC232001102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9370 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9398 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXConstructorCall9411 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9432 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXConstructorCall9449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXBooleanLiteral9542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral9566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXNullLiteral9672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTypeLiteral9968 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXTypeLiteral9980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10003 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXTypeLiteral10015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXThrowExpression10107 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXReturnExpression10220 = new BitSet(new long[]{0x6294232000102072L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10344 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10395 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10417 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10461 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXCatchClause10575 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXCatchClause10588 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause10609 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXCatchClause10621 = new BitSet(new long[]{0x6294232000102070L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10737 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedName10765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10788 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXFunctionTypeRef11002 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11023 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXFunctionTypeRef11036 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11057 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXFunctionTypeRef11071 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXFunctionTypeRef11085 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11200 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleJvmParameterizedTypeReference11221 = new BitSet(new long[]{0x0004000001000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11243 = new BitSet(new long[]{0x0002001000000000L});
    public static final BitSet FOLLOW_49_in_ruleJvmParameterizedTypeReference11256 = new BitSet(new long[]{0x0004000001000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11277 = new BitSet(new long[]{0x0002001000000000L});
    public static final BitSet FOLLOW_36_in_ruleJvmParameterizedTypeReference11291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmWildcardTypeReference11504 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008004L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmUpperBound11638 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmUpperBoundAnded11742 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleJvmLowerBound11846 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewMapping2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewMapping2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewMapping2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewMapping2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred5_InternalGraphViewMapping3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewMapping3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewMapping3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewMapping3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewMapping4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred10_InternalGraphViewMapping4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred11_InternalGraphViewMapping4958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalGraphViewMapping4967 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewMapping4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred12_InternalGraphViewMapping5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred12_InternalGraphViewMapping5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred12_InternalGraphViewMapping5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred13_InternalGraphViewMapping5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping5389 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_49_in_synpred14_InternalGraphViewMapping5396 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping5403 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_53_in_synpred14_InternalGraphViewMapping5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred16_InternalGraphViewMapping6858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewMapping8224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalGraphViewMapping8233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred18_InternalGraphViewMapping8682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8734 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_49_in_synpred19_InternalGraphViewMapping8741 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8748 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_53_in_synpred19_InternalGraphViewMapping8758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping9329 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_49_in_synpred20_InternalGraphViewMapping9336 = new BitSet(new long[]{0x0004000001000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping9343 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_53_in_synpred20_InternalGraphViewMapping9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewMapping10234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred22_InternalGraphViewMapping10379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred23_InternalGraphViewMapping10409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred25_InternalGraphViewMapping10756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred26_InternalGraphViewMapping11213 = new BitSet(new long[]{0x0000000000000002L});

}