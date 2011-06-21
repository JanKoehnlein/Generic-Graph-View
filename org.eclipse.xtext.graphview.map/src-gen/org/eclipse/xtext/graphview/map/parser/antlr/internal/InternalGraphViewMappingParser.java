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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'diagram'", "'type'", "'{'", "'}'", "'import'", "'.'", "'*'", "'node'", "'for'", "'each'", "'label'", "'edge'", "'->'", "'create'", "'('", "')'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'while'", "'do'", "';'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:76:1: ruleDiagramMapping returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' ) ;
    public final EObject ruleDiagramMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_typeGuard_4_0 = null;

        EObject lv_mappings_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
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

                if ( (LA2_0==18||(LA2_0>=21 && LA2_0<=22)) ) {
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:176:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:177:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:178:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport280);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport290); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:185:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:188:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:189:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:189:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:189:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:193:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:194:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:194:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:195:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport348);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:219:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:220:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:221:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard385);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard396); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:228:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:231:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:232:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:232:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:233:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard443);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:243:1: (kw= '.' kw= '*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:244:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildcard462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNameWithWildcard475); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:263:1: entryRuleAbstractExpressionMapping returns [EObject current=null] : iv_ruleAbstractExpressionMapping= ruleAbstractExpressionMapping EOF ;
    public final EObject entryRuleAbstractExpressionMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExpressionMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:264:2: (iv_ruleAbstractExpressionMapping= ruleAbstractExpressionMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:265:2: iv_ruleAbstractExpressionMapping= ruleAbstractExpressionMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractExpressionMappingRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractExpressionMapping_in_entryRuleAbstractExpressionMapping517);
            iv_ruleAbstractExpressionMapping=ruleAbstractExpressionMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractExpressionMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractExpressionMapping527); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:272:1: ruleAbstractExpressionMapping returns [EObject current=null] : (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping ) ;
    public final EObject ruleAbstractExpressionMapping() throws RecognitionException {
        EObject current = null;

        EObject this_NodeMapping_0 = null;

        EObject this_LabelMapping_1 = null;

        EObject this_EdgeMapping_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:275:28: ( (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:276:1: (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:276:1: (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:277:5: this_NodeMapping_0= ruleNodeMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getNodeMappingParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeMapping_in_ruleAbstractExpressionMapping574);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:287:5: this_LabelMapping_1= ruleLabelMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getLabelMappingParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabelMapping_in_ruleAbstractExpressionMapping601);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:297:5: this_EdgeMapping_2= ruleEdgeMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getEdgeMappingParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEdgeMapping_in_ruleAbstractExpressionMapping628);
                    this_EdgeMapping_2=ruleEdgeMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EdgeMapping_2; 
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:313:1: entryRuleNodeMapping returns [EObject current=null] : iv_ruleNodeMapping= ruleNodeMapping EOF ;
    public final EObject entryRuleNodeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:314:2: (iv_ruleNodeMapping= ruleNodeMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:315:2: iv_ruleNodeMapping= ruleNodeMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeMappingRule()); 
            }
            pushFollow(FOLLOW_ruleNodeMapping_in_entryRuleNodeMapping663);
            iv_ruleNodeMapping=ruleNodeMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeMapping673); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:322:1: ruleNodeMapping returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' ) ;
    public final EObject ruleNodeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_multi_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression_4_0 = null;

        EObject lv_mappings_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:325:28: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:326:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:326:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:326:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleNodeMapping710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeMappingAccess().getNodeKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:330:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:331:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:331:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:332:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeMapping727); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleNodeMapping744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:352:1: ( (lv_multi_3_0= 'each' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:353:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:353:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:354:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,20,FOLLOW_20_in_ruleNodeMapping762); if (state.failed) return current;
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:367:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:368:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:368:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:369:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeMappingAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleNodeMapping797);
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleNodeMapping809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNodeMappingAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:389:1: ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||(LA6_0>=21 && LA6_0<=22)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:390:1: (lv_mappings_6_0= ruleAbstractExpressionMapping )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:390:1: (lv_mappings_6_0= ruleAbstractExpressionMapping )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:391:3: lv_mappings_6_0= ruleAbstractExpressionMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeMappingAccess().getMappingsAbstractExpressionMappingParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractExpressionMapping_in_ruleNodeMapping830);
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
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleNodeMapping843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getNodeMappingAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:419:1: entryRuleLabelMapping returns [EObject current=null] : iv_ruleLabelMapping= ruleLabelMapping EOF ;
    public final EObject entryRuleLabelMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:420:2: (iv_ruleLabelMapping= ruleLabelMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:421:2: iv_ruleLabelMapping= ruleLabelMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelMappingRule()); 
            }
            pushFollow(FOLLOW_ruleLabelMapping_in_entryRuleLabelMapping879);
            iv_ruleLabelMapping=ruleLabelMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabelMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelMapping889); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:428:1: ruleLabelMapping returns [EObject current=null] : (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleLabelMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_multi_3_0=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:431:28: ( (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:432:1: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:432:1: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:432:3: otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleLabelMapping926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLabelMappingAccess().getLabelKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:436:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:437:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:437:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:438:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabelMapping943); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleLabelMapping960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLabelMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:458:1: ( (lv_multi_3_0= 'each' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:459:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:459:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:460:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,20,FOLLOW_20_in_ruleLabelMapping978); if (state.failed) return current;
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:473:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:474:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:474:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:475:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabelMappingAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleLabelMapping1013);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:499:1: entryRuleEdgeMapping returns [EObject current=null] : iv_ruleEdgeMapping= ruleEdgeMapping EOF ;
    public final EObject entryRuleEdgeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:500:2: (iv_ruleEdgeMapping= ruleEdgeMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:501:2: iv_ruleEdgeMapping= ruleEdgeMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeMappingRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeMapping_in_entryRuleEdgeMapping1049);
            iv_ruleEdgeMapping=ruleEdgeMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeMapping1059); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:508:1: ruleEdgeMapping returns [EObject current=null] : (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) ) ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}' ) ;
    public final EObject ruleEdgeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_multi_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_expression_4_0 = null;

        EObject lv_sourceMapping_6_0 = null;

        EObject lv_targetMapping_8_0 = null;

        EObject lv_mappings_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:511:28: ( (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) ) ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:512:1: (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) ) ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:512:1: (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) ) ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:512:3: otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) ) ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleEdgeMapping1096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEdgeMappingAccess().getEdgeKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:516:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:517:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:517:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:518:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEdgeMapping1113); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleEdgeMapping1130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEdgeMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:538:1: ( (lv_multi_3_0= 'each' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:539:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:539:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:540:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,20,FOLLOW_20_in_ruleEdgeMapping1148); if (state.failed) return current;
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:553:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:554:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:554:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:555:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleEdgeMapping1183);
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEdgeMapping1195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEdgeMappingAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:575:1: ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:576:1: (lv_sourceMapping_6_0= ruleEdgeEndMapping )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:576:1: (lv_sourceMapping_6_0= ruleEdgeEndMapping )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:577:3: lv_sourceMapping_6_0= ruleEdgeEndMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getSourceMappingEdgeEndMappingParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1216);
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

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleEdgeMapping1229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEdgeMappingAccess().getHyphenMinusGreaterThanSignKeyword_7());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:597:1: ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:598:1: (lv_targetMapping_8_0= ruleEdgeEndMapping )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:598:1: (lv_targetMapping_8_0= ruleEdgeEndMapping )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:599:3: lv_targetMapping_8_0= ruleEdgeEndMapping
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getTargetMappingEdgeEndMappingParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1250);
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:615:2: ( (lv_mappings_9_0= ruleLabelMapping ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:616:1: (lv_mappings_9_0= ruleLabelMapping )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:616:1: (lv_mappings_9_0= ruleLabelMapping )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:617:3: lv_mappings_9_0= ruleLabelMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getMappingsLabelMappingParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLabelMapping_in_ruleEdgeMapping1271);
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
            	    break loop10;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleEdgeMapping1284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getEdgeMappingAccess().getRightCurlyBracketKeyword_10());
                  
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:645:1: entryRuleEdgeEndMapping returns [EObject current=null] : iv_ruleEdgeEndMapping= ruleEdgeEndMapping EOF ;
    public final EObject entryRuleEdgeEndMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeEndMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:646:2: (iv_ruleEdgeEndMapping= ruleEdgeEndMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:647:2: iv_ruleEdgeEndMapping= ruleEdgeEndMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeEndMappingRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeEndMapping_in_entryRuleEdgeEndMapping1320);
            iv_ruleEdgeEndMapping=ruleEdgeEndMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeEndMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeEndMapping1330); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:654:1: ruleEdgeEndMapping returns [EObject current=null] : ( ( (lv_create_0_0= 'create' ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleEdgeEndMapping() throws RecognitionException {
        EObject current = null;

        Token lv_create_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:657:28: ( ( ( (lv_create_0_0= 'create' ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:658:1: ( ( (lv_create_0_0= 'create' ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:658:1: ( ( (lv_create_0_0= 'create' ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:658:2: ( (lv_create_0_0= 'create' ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:658:2: ( (lv_create_0_0= 'create' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:659:1: (lv_create_0_0= 'create' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:659:1: (lv_create_0_0= 'create' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:660:3: lv_create_0_0= 'create'
                    {
                    lv_create_0_0=(Token)match(input,24,FOLLOW_24_in_ruleEdgeEndMapping1373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_create_0_0, grammarAccess.getEdgeEndMappingAccess().getCreateCreateKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEdgeEndMappingRule());
                      	        }
                             		setWithLastConsumed(current, "create", true, "create");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:673:3: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:674:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:674:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:675:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeEndMappingRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEdgeEndMapping1407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEdgeEndMappingAccess().getMappingNodeMappingCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleEdgeEndMapping1419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEdgeEndMappingAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:690:1: ( (lv_expression_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:691:1: (lv_expression_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:691:1: (lv_expression_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:692:3: lv_expression_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeEndMappingAccess().getExpressionXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleEdgeEndMapping1440);
            lv_expression_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeEndMappingRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleEdgeEndMapping1452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEdgeEndMappingAccess().getRightParenthesisKeyword_4());
                  
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


    // $ANTLR start "entryRuleXExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:720:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:721:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:722:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1488);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1498); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:729:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:732:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:734:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1544);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:750:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:751:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:752:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1578);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1588); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:759:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:762:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:763:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:763:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==27) ) {
                    alt13=1;
                }
                else if ( (LA13_1==EOF||(LA13_1>=RULE_ID && LA13_1<=RULE_STRING)||(LA13_1>=13 && LA13_1<=14)||(LA13_1>=16 && LA13_1<=19)||(LA13_1>=21 && LA13_1<=23)||(LA13_1>=25 && LA13_1<=26)||(LA13_1>=28 && LA13_1<=49)||(LA13_1>=51 && LA13_1<=75)) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_STRING)||LA13_0==13||LA13_0==19||LA13_0==25||LA13_0==37||(LA13_0>=39 && LA13_0<=40)||LA13_0==44||LA13_0==49||LA13_0==52||LA13_0==54||(LA13_0>=58 && LA13_0<=59)||LA13_0==63||(LA13_0>=65 && LA13_0<=72)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:763:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:763:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:763:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:763:3: ()
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:764:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:769:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:770:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:770:1: ( ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:771:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1646);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1662);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:792:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:793:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:793:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:794:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1682);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:811:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:811:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:812:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1712);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:820:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==28) ) {
                        int LA12_1 = input.LA(2);

                        if ( (synpred1_InternalGraphViewMapping()) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:820:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:820:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:820:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:825:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:825:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:825:7: ()
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:826:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:831:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:832:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:832:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:833:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1765);
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

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:846:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:847:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:847:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:848:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1788);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:872:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:873:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:874:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1828);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1839); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:881:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:884:28: (kw= '=' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:886:2: kw= '='
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpSingleAssign1876); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:899:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:900:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:901:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1916);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1927); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:908:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:911:28: (kw= '+=' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:913:2: kw= '+='
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpMultiAssign1964); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:926:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:927:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:928:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2003);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2013); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:935:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:938:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:939:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:939:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:940:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2060);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:948:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred2_InternalGraphViewMapping()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:948:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:948:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:948:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:953:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:953:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:953:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:954:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:959:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:960:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:960:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:961:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2113);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:974:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:975:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:975:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:976:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2136);
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
            	    break loop14;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1000:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1001:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1002:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2175);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2186); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1009:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1012:28: (kw= '||' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1014:2: kw= '||'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOr2223); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1027:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1028:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1029:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2262);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2272); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1036:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1039:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1040:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1040:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1041:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2319);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1049:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred3_InternalGraphViewMapping()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1049:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1049:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1049:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1054:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1054:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1054:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1055:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1060:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1061:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1061:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1062:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2372);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1075:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1076:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1076:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1077:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2395);
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
            	    break loop15;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1101:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1102:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1103:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2434);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2445); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1110:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1113:28: (kw= '&&' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1115:2: kw= '&&'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleOpAnd2482); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1128:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1129:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1130:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2521);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2531); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1137:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1140:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1141:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1141:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1142:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2578);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1150:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred4_InternalGraphViewMapping()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==32) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred4_InternalGraphViewMapping()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1150:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1150:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1150:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1155:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1155:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1155:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1156:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1161:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1162:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1162:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1163:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2631);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1176:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1177:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1177:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1178:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2654);
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
            	    break loop16;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1202:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1203:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1204:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2693);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2704); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1211:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1214:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1215:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1215:1: (kw= '==' | kw= '!=' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            else if ( (LA17_0==32) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1216:2: kw= '=='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpEquality2742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1223:2: kw= '!='
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpEquality2761); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1236:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1237:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1238:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2801);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2811); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1248:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1249:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1249:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1250:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2858);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1258:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop18:
            do {
                int alt18=3;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred5_InternalGraphViewMapping()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA18_6 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt18=2;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1258:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1258:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1258:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1258:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1258:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1260:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1260:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1260:6: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1261:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleXRelationalExpression2894); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1270:3: ( ( ruleQualifiedName ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1271:1: ( ruleQualifiedName )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1271:1: ( ruleQualifiedName )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1272:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2919);
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
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1286:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1286:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1286:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1286:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1286:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1291:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1291:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1291:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1292:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1297:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1298:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1298:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1299:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2980);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1312:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1313:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1313:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1314:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3003);
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
            	    break loop18;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1338:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1339:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1340:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3043);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3054); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1347:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1350:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1351:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1351:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt19=1;
                }
                break;
            case 35:
                {
                alt19=2;
                }
                break;
            case 36:
                {
                alt19=3;
                }
                break;
            case 37:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1352:2: kw= '>='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare3092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1359:2: kw= '<='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare3111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1366:2: kw= '>'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare3130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1373:2: kw= '<'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpCompare3149); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1386:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1387:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1388:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3189);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3199); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1395:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1398:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1399:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1399:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1400:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3246);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1408:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred7_InternalGraphViewMapping()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==38) ) {
                    int LA20_3 = input.LA(2);

                    if ( (synpred7_InternalGraphViewMapping()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1408:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1408:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1408:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1413:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1413:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1413:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1414:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1419:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1420:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1420:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1421:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3299);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1434:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1435:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1435:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1436:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3322);
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
            	    break loop20;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1460:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1461:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1462:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3361);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3372); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1469:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1472:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1473:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1473:1: (kw= '->' | kw= '..' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            else if ( (LA21_0==38) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1474:2: kw= '->'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpOther3410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1481:2: kw= '..'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther3429); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1494:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1495:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1496:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3469);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3479); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1503:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1506:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1507:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1507:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1508:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3526);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1516:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred8_InternalGraphViewMapping()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==40) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred8_InternalGraphViewMapping()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1516:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1516:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1516:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1521:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1521:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1521:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1522:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1527:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1528:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1528:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1529:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3579);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1542:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1543:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1543:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1544:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3602);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1568:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1569:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1570:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3641);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3652); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1577:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1580:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1581:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1581:1: (kw= '+' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            else if ( (LA23_0==40) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1582:2: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpAdd3690); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1589:2: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpAdd3709); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1602:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1603:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1604:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3749);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3759); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1611:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1614:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1615:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1615:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1616:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3806);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1624:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt24=1;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1624:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1624:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1624:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1629:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1629:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1629:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1630:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1635:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1636:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1636:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1637:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3859);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1650:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1651:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1651:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1652:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3882);
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
            	    break loop24;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1676:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1677:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1678:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3921);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3932); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1685:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1688:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1689:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1689:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt25=1;
                }
                break;
            case 41:
                {
                alt25=2;
                }
                break;
            case 42:
                {
                alt25=3;
                }
                break;
            case 43:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1690:2: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleOpMulti3970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1697:2: kw= '**'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti3989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1704:2: kw= '/'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti4008); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1711:2: kw= '%'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpMulti4027); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1724:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1725:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1726:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4067);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4077); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1733:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1736:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1737:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1737:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=39 && LA26_0<=40)||LA26_0==44) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)||LA26_0==13||LA26_0==19||LA26_0==25||LA26_0==37||LA26_0==49||LA26_0==52||LA26_0==54||(LA26_0>=58 && LA26_0<=59)||LA26_0==63||(LA26_0>=65 && LA26_0<=72)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1737:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1737:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1737:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1737:3: ()
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1738:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1743:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1744:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1744:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1745:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4135);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1758:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1759:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1759:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1760:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4156);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1778:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4185);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1794:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1795:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1796:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4221);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4232); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1803:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1806:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1807:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1807:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt27=1;
                }
                break;
            case 40:
                {
                alt27=2;
                }
                break;
            case 39:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1808:2: kw= '!'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpUnary4270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1815:2: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary4289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1822:2: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary4308); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1835:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1836:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1837:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4348);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4358); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1844:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1847:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1848:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1848:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1849:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4405);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1857:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==45) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred10_InternalGraphViewMapping()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1857:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1857:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1857:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1859:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1859:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1859:6: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1860:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXCastedExpression4440); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1869:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1870:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1870:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1871:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4463);
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
            	    break loop28;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1895:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1896:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1897:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4501);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4511); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1904:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1907:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1908:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1908:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1909:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4558);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1917:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop35:
            do {
                int alt35=3;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred11_InternalGraphViewMapping()) ) {
                        alt35=1;
                    }
                    else if ( (synpred12_InternalGraphViewMapping()) ) {
                        alt35=2;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred12_InternalGraphViewMapping()) ) {
                        alt35=2;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred12_InternalGraphViewMapping()) ) {
                        alt35=2;
                    }


                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1917:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1917:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1917:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1917:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1917:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1923:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1923:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1923:26: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1924:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall4607); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1933:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1935:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4630);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4646);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1956:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1957:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1957:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1958:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4668);
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
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1975:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1975:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1975:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1975:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1975:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1991:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1991:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1991:8: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1992:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1997:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1997:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall4754); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2002:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2002:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2004:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4778); if (state.failed) return current;
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
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2018:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2018:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2019:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2019:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2020:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4815); if (state.failed) return current;
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2033:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==37) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2033:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall4844); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2037:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2038:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2038:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2039:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4865);
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

            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2055:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==48) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2055:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4878); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2059:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2060:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2060:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2061:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4899);
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
            	            	    break loop30;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall4913); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2081:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2082:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2082:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2083:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4938);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2096:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2096:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2096:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2096:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2103:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2104:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall4972); if (state.failed) return current;
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

            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2117:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt33=3;
            	            alt33 = dfa33.predict(input);
            	            switch (alt33) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2117:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2117:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2117:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2129:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2130:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5047);
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
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2147:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2147:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2147:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2147:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2148:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2148:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2149:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5075);
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

            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2165:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop32:
            	                    do {
            	                        int alt32=2;
            	                        int LA32_0 = input.LA(1);

            	                        if ( (LA32_0==48) ) {
            	                            alt32=1;
            	                        }


            	                        switch (alt32) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2165:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall5088); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2169:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2170:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2170:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2171:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5109);
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
            	                    	    break loop32;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall5126); if (state.failed) return current;
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2199:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2200:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2201:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5167);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5177); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2208:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2211:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2212:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2212:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt36=13;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt36=1;
                }
                break;
            case 13:
                {
                alt36=2;
                }
                break;
            case 54:
                {
                alt36=3;
                }
                break;
            case RULE_ID:
            case 37:
            case 63:
                {
                alt36=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 49:
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt36=5;
                }
                break;
            case 52:
                {
                alt36=6;
                }
                break;
            case 19:
                {
                alt36=7;
                }
                break;
            case 58:
                {
                alt36=8;
                }
                break;
            case 59:
                {
                alt36=9;
                }
                break;
            case 70:
                {
                alt36=10;
                }
                break;
            case 71:
                {
                alt36=11;
                }
                break;
            case 72:
                {
                alt36=12;
                }
                break;
            case 25:
                {
                alt36=13;
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2213:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5224);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2223:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5251);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2233:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5278);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2243:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5305);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2253:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5332);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2263:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5359);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2273:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5386);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2283:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5413);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2293:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5440);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2303:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5467);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2313:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5494);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2323:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5521);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2333:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5548);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2349:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2350:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2351:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5583);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5593); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2358:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2361:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2362:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2362:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt37=1;
                }
                break;
            case 66:
            case 67:
                {
                alt37=2;
                }
                break;
            case RULE_INT:
                {
                alt37=3;
                }
                break;
            case 68:
                {
                alt37=4;
                }
                break;
            case RULE_STRING:
                {
                alt37=5;
                }
                break;
            case 69:
                {
                alt37=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2363:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5640);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2373:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5667);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2383:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5694);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2393:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5721);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2403:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5748);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2413:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5775);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2429:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2430:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2431:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5810);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5820); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2438:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2441:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2442:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2442:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2442:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2442:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2443:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXClosure5866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2452:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==25||LA39_0==75) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2452:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2452:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2453:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2453:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2454:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5888);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2470:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==48) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2470:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5901); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2474:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2475:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2475:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2476:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5922);
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2496:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2497:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2497:1: (lv_expression_6_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2498:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5959);
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

            otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXClosure5971); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2526:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2527:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2528:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6007);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6017); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2535:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2538:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2539:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2539:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2539:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2539:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2539:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2550:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2550:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2550:6: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2551:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2556:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==25||LA41_0==75) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2556:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2556:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2557:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2557:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2558:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6115);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2574:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==48) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2574:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXShortClosure6128); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2578:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2579:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2579:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2580:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6149);
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
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXShortClosure6165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2600:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2601:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2601:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2602:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6188);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2626:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2627:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2628:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6224);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6234); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2635:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2638:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2639:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2639:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2639:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleXParenthesizedExpression6271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6293);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXParenthesizedExpression6304); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2664:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2665:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2666:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6340);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6350); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2673:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2676:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2677:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2677:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2677:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2677:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2678:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXIfExpression6396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXIfExpression6408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2691:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2692:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2692:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2693:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6429);
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

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleXIfExpression6441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2713:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2714:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2714:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2715:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6462);
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2731:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==53) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred16_InternalGraphViewMapping()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2731:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2731:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2731:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleXIfExpression6483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2736:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2737:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2737:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2738:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6505);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2762:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2763:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2764:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6543);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6553); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2771:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2774:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2775:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2775:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2775:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2775:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2776:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2785:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==55) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2785:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2785:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2786:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2786:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2787:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6621);
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

                    otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2807:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2808:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2808:1: (lv_switch_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2809:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6656);
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleXSwitchExpression6668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2829:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||LA44_0==25||LA44_0==55||LA44_0==57||LA44_0==75) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2830:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2830:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2831:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6689);
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
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2847:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2847:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2855:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2856:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2856:1: (lv_default_9_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2857:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6736);
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

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleXSwitchExpression6750); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2885:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2886:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2887:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6786);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6796); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2894:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2897:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2898:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2898:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2898:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2898:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==25||LA46_0==75) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2899:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2899:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2900:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6842);
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2916:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==57) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2916:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXCasePart6856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2920:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2921:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2921:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2922:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6877);
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

            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXCasePart6891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2942:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2943:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2943:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2944:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6912);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2968:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2969:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2970:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6948);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6958); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2977:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2980:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2981:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2981:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2981:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2981:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2982:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleXForLoopExpression7004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXForLoopExpression7016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2995:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2996:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2996:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2997:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7037);
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

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXForLoopExpression7049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3017:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3018:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3018:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3019:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7070);
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

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXForLoopExpression7082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3039:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3040:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3040:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3041:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7103);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3065:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3066:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3067:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7139);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7149); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3074:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3077:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3078:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3078:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3078:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3078:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3079:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXWhileExpression7195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXWhileExpression7207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3092:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3093:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3093:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3094:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7228);
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

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleXWhileExpression7240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3114:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3115:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3115:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3116:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7261);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3140:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3141:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3142:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7297);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7307); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3149:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3152:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3153:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3153:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3153:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3153:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3154:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression7353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3163:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3164:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3164:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3165:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7374);
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

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression7386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXDoWhileExpression7398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3189:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3190:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3190:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3191:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7419);
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

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXDoWhileExpression7431); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3219:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3220:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3221:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7467);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7477); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3228:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3231:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3232:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3232:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3232:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3232:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3233:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression7523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3242:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_STRING)||LA49_0==13||LA49_0==19||LA49_0==25||LA49_0==37||(LA49_0>=39 && LA49_0<=40)||LA49_0==44||LA49_0==49||LA49_0==52||LA49_0==54||(LA49_0>=58 && LA49_0<=59)||(LA49_0>=61 && LA49_0<=63)||(LA49_0>=65 && LA49_0<=72)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3242:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3242:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3243:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3243:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3244:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7545);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3260:2: (otherlv_3= ';' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==60) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3260:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXBlockExpression7558); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleXBlockExpression7574); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3276:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3277:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3278:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7610);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7620); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3285:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3288:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3289:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3289:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=61 && LA50_0<=62)) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_STRING)||LA50_0==13||LA50_0==19||LA50_0==25||LA50_0==37||(LA50_0>=39 && LA50_0<=40)||LA50_0==44||LA50_0==49||LA50_0==52||LA50_0==54||(LA50_0>=58 && LA50_0<=59)||LA50_0==63||(LA50_0>=65 && LA50_0<=72)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3290:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7667);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3300:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7694);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3316:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3317:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3318:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7729);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7739); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3325:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3328:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3329:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3329:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3329:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3329:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3330:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3335:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==61) ) {
                alt51=1;
            }
            else if ( (LA51_0==62) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3335:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3335:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3336:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3336:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3337:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration7792); if (state.failed) return current;
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3351:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration7823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3355:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred17_InternalGraphViewMapping()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==25) && (synpred17_InternalGraphViewMapping())) {
                alt52=1;
            }
            else if ( (LA52_0==75) && (synpred17_InternalGraphViewMapping())) {
                alt52=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3355:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3355:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3355:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3363:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3363:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3363:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3364:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3364:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3365:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7871);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3381:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3382:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3382:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3383:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7892);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3400:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3400:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3401:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3401:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3402:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7921);
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3418:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==27) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3418:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXVariableDeclaration7935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3422:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3423:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3423:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3424:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7956);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3448:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3449:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3450:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7994);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8004); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3457:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3460:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3461:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3461:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3461:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3461:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_ID||LA54_1==16||LA54_1==37) ) {
                    alt54=1;
                }
            }
            else if ( (LA54_0==25||LA54_0==75) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3462:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3462:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3463:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8050);
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3479:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3480:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3480:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3481:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8072);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3505:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3506:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3507:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8108);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8118); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3514:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3517:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3518:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3518:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3518:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3518:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3519:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3524:2: ( ( ruleStaticQualifier ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==64) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3525:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3525:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3526:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8175);
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3539:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==37) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3539:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXFeatureCall8189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3543:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3544:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3544:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3545:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8210);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3561:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==48) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3561:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXFeatureCall8223); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3565:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3566:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3566:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3567:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8244);
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
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleXFeatureCall8258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3587:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3588:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3588:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3589:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8283);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3602:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3602:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3602:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3602:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3609:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3610:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall8317); if (state.failed) return current;
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3623:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt59=3;
                    alt59 = dfa59.predict(input);
                    switch (alt59) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3623:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3623:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3623:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3635:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3636:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8392);
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
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3653:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3653:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3653:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3653:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3654:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3654:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3655:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8420);
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

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3671:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==48) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3671:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,48,FOLLOW_48_in_ruleXFeatureCall8433); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3675:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3676:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3676:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3677:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8454);
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
                            	    break loop58;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall8471); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3705:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3706:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3707:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8510);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8521); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3714:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3717:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3718:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3718:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==63) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3719:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8568);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3731:2: kw= 'super'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleIdOrSuper8592); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3744:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3745:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3746:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8633);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8644); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3753:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3756:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3757:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3757:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    int LA62_2 = input.LA(2);

                    if ( (LA62_2==64) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3758:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8691);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,64,FOLLOW_64_in_ruleStaticQualifier8709); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3782:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3783:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3784:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8750);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8760); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3791:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3794:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3795:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3795:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3795:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3795:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3796:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXConstructorCall8806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3805:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3806:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3806:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3807:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8829);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3820:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==37) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3820:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleXConstructorCall8842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3824:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3825:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3825:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3826:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8863);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3842:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==48) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3842:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleXConstructorCall8876); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3846:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3847:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3847:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3848:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8897);
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
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleXConstructorCall8911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall8925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3872:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt66=3;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3872:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3872:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3872:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3884:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3885:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8987);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3902:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3902:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3902:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3902:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3903:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3903:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3904:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9015);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3920:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==48) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3920:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,48,FOLLOW_48_in_ruleXConstructorCall9028); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3924:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3925:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3925:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3926:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9049);
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
                    	    break loop65;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall9066); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3954:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3955:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3956:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9102);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9112); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3963:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3966:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3967:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3967:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3967:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3967:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3968:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3973:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==66) ) {
                alt67=1;
            }
            else if ( (LA67_0==67) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3973:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXBooleanLiteral9159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3978:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3978:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3979:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3979:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3980:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,67,FOLLOW_67_in_ruleXBooleanLiteral9183); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4001:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4002:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4003:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9233);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9243); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4010:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4013:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4014:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4014:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4014:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4014:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4015:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXNullLiteral9289); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4032:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4033:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4034:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9325);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9335); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4041:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4044:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4045:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4045:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4045:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4045:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4046:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4051:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4052:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4052:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4053:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9386); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4077:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4078:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4079:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9427);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9437); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4086:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4089:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4090:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4090:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4090:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4090:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4091:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4096:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4097:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4097:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4098:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9488); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4122:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4123:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4124:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9529);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9539); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4131:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4134:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4135:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4135:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4135:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4135:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4136:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXTypeLiteral9585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXTypeLiteral9597); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4149:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4150:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4150:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4151:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9620);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleXTypeLiteral9632); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4176:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4177:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4178:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9668);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9678); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4185:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4188:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4189:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4189:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4189:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4189:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4190:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXThrowExpression9724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4199:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4200:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4200:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4201:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9745);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4225:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4226:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4227:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9781);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9791); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4234:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4237:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4238:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4238:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4238:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4238:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4239:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXReturnExpression9837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4248:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4248:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4253:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4254:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9868);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4278:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4279:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4280:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9905);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9915); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4287:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4290:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4291:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4291:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4291:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4291:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4292:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression9961); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4301:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4302:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4302:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4303:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9982);
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4319:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==74) ) {
                alt71=1;
            }
            else if ( (LA71_0==73) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4319:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4319:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4319:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4319:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==74) ) {
                            int LA69_2 = input.LA(2);

                            if ( (synpred22_InternalGraphViewMapping()) ) {
                                alt69=1;
                            }


                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4319:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4321:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4322:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10012);
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
                    	    if ( cnt69 >= 1 ) break loop69;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
                    } while (true);

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4338:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==73) ) {
                        int LA70_1 = input.LA(2);

                        if ( (synpred23_InternalGraphViewMapping()) ) {
                            alt70=1;
                        }
                    }
                    switch (alt70) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4338:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4338:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4338:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression10034); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4343:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4344:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4344:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4345:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10056);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4362:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4362:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4362:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression10078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4366:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4367:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4367:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4368:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10099);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4392:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4393:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4394:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10137);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10147); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4401:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4404:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4405:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4405:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4405:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4405:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4405:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleXCatchClause10192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleXCatchClause10205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4414:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4415:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4415:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4416:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause10226);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleXCatchClause10238); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4436:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4437:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4437:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4438:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10259);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4462:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4463:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4464:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10296);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10307); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4471:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4474:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4475:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4475:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4476:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10354);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4486:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==16) ) {
                    int LA72_2 = input.LA(2);

                    if ( (LA72_2==RULE_ID) ) {
                        int LA72_3 = input.LA(3);

                        if ( (synpred25_InternalGraphViewMapping()) ) {
                            alt72=1;
                        }


                    }


                }


                switch (alt72) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4486:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4486:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4486:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName10382); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10405);
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
            	    break loop72;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4513:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4514:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4515:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10452);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10462); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4522:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4525:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4526:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4526:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            else if ( (LA73_0==25||LA73_0==75) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4527:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10509);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4537:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10536);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4553:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4554:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4555:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10571);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10581); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4562:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4565:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4566:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4566:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4566:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4566:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==25) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4566:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleXFunctionTypeRef10619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4570:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4571:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4571:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4572:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10640);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4588:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==48) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4588:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXFunctionTypeRef10653); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4592:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4593:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4593:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4594:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10674);
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
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleXFunctionTypeRef10688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleXFunctionTypeRef10702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4618:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4619:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4619:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4620:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10723);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4644:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4645:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4646:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10759);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10769); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4653:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4656:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4657:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4657:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4657:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4657:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4658:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4658:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4659:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10817);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4672:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4672:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4672:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4672:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleJvmParameterizedTypeReference10838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4677:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4678:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4678:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4679:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10860);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4695:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==48) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4695:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleJvmParameterizedTypeReference10873); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4699:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4700:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4700:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4701:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10894);
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
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleJvmParameterizedTypeReference10908); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4729:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4730:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4731:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10946);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10956); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4738:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4741:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4742:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4742:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID||LA78_0==25||LA78_0==75) ) {
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4743:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11003);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4753:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11030);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4769:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4770:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4771:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11065);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11075); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4778:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4781:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4782:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4782:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4782:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4782:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4783:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleJvmWildcardTypeReference11121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4792:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==77) ) {
                alt79=1;
            }
            else if ( (LA79_0==63) ) {
                alt79=2;
            }
            switch (alt79) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4792:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4792:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4793:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4793:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4794:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11143);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4811:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4811:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4812:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4812:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4813:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11170);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4837:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4838:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4839:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11208);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11218); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4846:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4849:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4850:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4850:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4850:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBound11255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4854:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4855:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4855:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4856:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11276);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4880:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4881:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4882:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11312);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11322); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4889:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4892:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4893:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4893:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4893:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBoundAnded11359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4897:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4898:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4898:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4899:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11380);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4923:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4924:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4925:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11416);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11426); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4932:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4935:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4936:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4936:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4936:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleJvmLowerBound11463); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4940:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4941:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4941:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4942:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11484);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4968:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4969:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4970:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11523);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11534); if (state.failed) return current;

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4977:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4980:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4981:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11573); if (state.failed) return current;
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:820:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:820:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:820:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:820:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:820:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:821:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:821:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:822:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:822:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:823:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewMapping1733);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:948:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:948:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:948:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:948:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:948:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:949:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:949:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:950:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:950:1: ( ruleOpOr )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:951:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewMapping2081);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1049:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1049:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1049:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1049:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1049:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1050:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1050:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1051:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1051:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1052:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewMapping2340);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1150:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1150:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1150:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1150:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1150:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1151:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1151:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1152:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1152:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1153:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewMapping2599);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1258:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1258:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1258:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1258:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1258:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1259:1: 
        {
        }

        match(input,33,FOLLOW_33_in_synpred5_InternalGraphViewMapping2875); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGraphViewMapping

    // $ANTLR start synpred6_InternalGraphViewMapping
    public final void synpred6_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1286:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1286:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1286:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1286:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1286:10: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1287:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1287:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1288:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1288:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1289:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewMapping2948);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1408:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1408:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1408:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1408:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1408:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1409:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1409:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1410:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1410:1: ( ruleOpOther )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1411:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewMapping3267);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1516:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1516:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1516:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1516:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1516:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1517:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1517:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1518:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1518:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1519:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewMapping3547);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1624:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1624:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1624:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1624:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1624:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1625:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1625:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1626:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1626:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1627:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewMapping3827);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1857:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1857:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1857:4: ( () 'as' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1857:5: () 'as'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1857:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1858:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred10_InternalGraphViewMapping4421); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalGraphViewMapping

    // $ANTLR start synpred11_InternalGraphViewMapping
    public final void synpred11_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1917:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1917:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1917:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1917:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1917:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1918:1: 
        {
        }

        match(input,16,FOLLOW_16_in_synpred11_InternalGraphViewMapping4575); if (state.failed) return ;
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1919:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1920:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1920:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1921:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalGraphViewMapping4584);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewMapping4590);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalGraphViewMapping

    // $ANTLR start synpred12_InternalGraphViewMapping
    public final void synpred12_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1975:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1975:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1975:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1975:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1975:10: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1976:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1976:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt80=3;
        switch ( input.LA(1) ) {
        case 16:
            {
            alt80=1;
            }
            break;
        case 46:
            {
            alt80=2;
            }
            break;
        case 47:
            {
            alt80=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 80, 0, input);

            throw nvae;
        }

        switch (alt80) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1976:4: '.'
                {
                match(input,16,FOLLOW_16_in_synpred12_InternalGraphViewMapping4693); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1978:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1978:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1979:1: ( '?.' )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1979:1: ( '?.' )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1980:2: '?.'
                {
                match(input,46,FOLLOW_46_in_synpred12_InternalGraphViewMapping4707); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1985:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1985:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1986:1: ( '*.' )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1986:1: ( '*.' )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1987:2: '*.'
                {
                match(input,47,FOLLOW_47_in_synpred12_InternalGraphViewMapping4727); if (state.failed) return ;

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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2096:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2097:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2097:1: ( '(' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2098:2: '('
        {
        match(input,25,FOLLOW_25_in_synpred13_InternalGraphViewMapping4954); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGraphViewMapping

    // $ANTLR start synpred14_InternalGraphViewMapping
    public final void synpred14_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2117:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2117:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2117:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2117:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2117:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2118:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2118:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt82=2;
        int LA82_0 = input.LA(1);

        if ( (LA82_0==RULE_ID||LA82_0==25||LA82_0==75) ) {
            alt82=1;
        }
        switch (alt82) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2118:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2118:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2119:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2119:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2120:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping5006);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2122:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop81:
                do {
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==48) ) {
                        alt81=1;
                    }


                    switch (alt81) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2122:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,48,FOLLOW_48_in_synpred14_InternalGraphViewMapping5013); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2123:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2124:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2124:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2125:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping5020);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop81;
                    }
                } while (true);


                }
                break;

        }

        match(input,50,FOLLOW_50_in_synpred14_InternalGraphViewMapping5030); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalGraphViewMapping

    // $ANTLR start synpred16_InternalGraphViewMapping
    public final void synpred16_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2731:4: ( 'else' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2731:6: 'else'
        {
        match(input,53,FOLLOW_53_in_synpred16_InternalGraphViewMapping6475); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalGraphViewMapping

    // $ANTLR start synpred17_InternalGraphViewMapping
    public final void synpred17_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3355:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3355:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3355:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3355:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3355:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3356:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3356:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3357:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewMapping7841);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3359:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3360:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3360:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3361:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalGraphViewMapping7850);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3602:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3603:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3603:1: ( '(' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3604:2: '('
        {
        match(input,25,FOLLOW_25_in_synpred18_InternalGraphViewMapping8299); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalGraphViewMapping

    // $ANTLR start synpred19_InternalGraphViewMapping
    public final void synpred19_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3623:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3623:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3623:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3623:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3623:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3624:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3624:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( (LA86_0==RULE_ID||LA86_0==25||LA86_0==75) ) {
            alt86=1;
        }
        switch (alt86) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3624:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3624:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3625:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3625:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3626:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8351);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3628:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop85:
                do {
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==48) ) {
                        alt85=1;
                    }


                    switch (alt85) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3628:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,48,FOLLOW_48_in_synpred19_InternalGraphViewMapping8358); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3629:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3630:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3630:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3631:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8365);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop85;
                    }
                } while (true);


                }
                break;

        }

        match(input,50,FOLLOW_50_in_synpred19_InternalGraphViewMapping8375); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalGraphViewMapping

    // $ANTLR start synpred20_InternalGraphViewMapping
    public final void synpred20_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3872:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3872:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3872:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3872:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3872:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3873:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3873:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==RULE_ID||LA88_0==25||LA88_0==75) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3873:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3873:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3874:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3874:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3875:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping8946);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3877:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==48) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3877:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,48,FOLLOW_48_in_synpred20_InternalGraphViewMapping8953); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3878:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3879:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3879:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3880:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping8960);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop87;
                    }
                } while (true);


                }
                break;

        }

        match(input,50,FOLLOW_50_in_synpred20_InternalGraphViewMapping8970); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalGraphViewMapping

    // $ANTLR start synpred21_InternalGraphViewMapping
    public final void synpred21_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4248:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4249:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4249:1: ( ruleXExpression )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4250:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewMapping9851);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalGraphViewMapping

    // $ANTLR start synpred22_InternalGraphViewMapping
    public final void synpred22_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4319:5: ( 'catch' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4319:7: 'catch'
        {
        match(input,74,FOLLOW_74_in_synpred22_InternalGraphViewMapping9996); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalGraphViewMapping

    // $ANTLR start synpred23_InternalGraphViewMapping
    public final void synpred23_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4338:5: ( 'finally' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4338:7: 'finally'
        {
        match(input,73,FOLLOW_73_in_synpred23_InternalGraphViewMapping10026); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalGraphViewMapping

    // $ANTLR start synpred25_InternalGraphViewMapping
    public final void synpred25_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4486:3: ( '.' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4487:2: '.'
        {
        match(input,16,FOLLOW_16_in_synpred25_InternalGraphViewMapping10373); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalGraphViewMapping

    // $ANTLR start synpred26_InternalGraphViewMapping
    public final void synpred26_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4672:4: ( '<' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4672:6: '<'
        {
        match(input,37,FOLLOW_37_in_synpred26_InternalGraphViewMapping10830); if (state.failed) return ;

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


    protected DFA34 dfa34 = new DFA34(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA77 dfa77 = new DFA77(this);
    static final String DFA34_eotS =
        "\77\uffff";
    static final String DFA34_eofS =
        "\1\2\76\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA34_maxS =
        "\1\113\1\0\75\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA34_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\1\1\2\1\uffff"+
            "\26\2\1\uffff\15\2\1\uffff\13\2",
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
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2096:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\34\uffff";
    static final String DFA33_eofS =
        "\34\uffff";
    static final String DFA33_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA33_maxS =
        "\1\113\2\0\31\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\2\5\6\uffff\1\5\5\uffff\1\5\5\uffff\1\2\1\33\12\uffff\1"+
            "\5\1\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\2\5\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "2117:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA33_0==RULE_ID) ) {s = 1;}

                        else if ( (LA33_0==25) ) {s = 2;}

                        else if ( (LA33_0==75) && (synpred14_InternalGraphViewMapping())) {s = 3;}

                        else if ( (LA33_0==50) && (synpred14_InternalGraphViewMapping())) {s = 4;}

                        else if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_STRING)||LA33_0==13||LA33_0==19||LA33_0==37||(LA33_0>=39 && LA33_0<=40)||LA33_0==44||LA33_0==49||LA33_0==52||LA33_0==54||(LA33_0>=58 && LA33_0<=59)||LA33_0==63||(LA33_0>=65 && LA33_0<=72)) ) {s = 5;}

                        else if ( (LA33_0==26) ) {s = 27;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\77\uffff";
    static final String DFA60_eofS =
        "\1\2\76\uffff";
    static final String DFA60_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA60_maxS =
        "\1\113\1\0\75\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA60_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\1\1\2\1\uffff"+
            "\26\2\1\uffff\15\2\1\uffff\13\2",
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
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3602:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\34\uffff";
    static final String DFA59_eofS =
        "\34\uffff";
    static final String DFA59_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA59_maxS =
        "\1\113\2\0\31\uffff";
    static final String DFA59_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA59_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\1\2\5\6\uffff\1\5\5\uffff\1\5\5\uffff\1\2\1\33\12\uffff\1"+
            "\5\1\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\2\5\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "3623:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_0 = input.LA(1);

                         
                        int index59_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA59_0==RULE_ID) ) {s = 1;}

                        else if ( (LA59_0==25) ) {s = 2;}

                        else if ( (LA59_0==75) && (synpred19_InternalGraphViewMapping())) {s = 3;}

                        else if ( (LA59_0==50) && (synpred19_InternalGraphViewMapping())) {s = 4;}

                        else if ( ((LA59_0>=RULE_INT && LA59_0<=RULE_STRING)||LA59_0==13||LA59_0==19||LA59_0==37||(LA59_0>=39 && LA59_0<=40)||LA59_0==44||LA59_0==49||LA59_0==52||LA59_0==54||(LA59_0>=58 && LA59_0<=59)||LA59_0==63||(LA59_0>=65 && LA59_0<=72)) ) {s = 5;}

                        else if ( (LA59_0==26) ) {s = 27;}

                         
                        input.seek(index59_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
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
            "\1\1\2\5\6\uffff\1\5\5\uffff\1\5\5\uffff\1\2\1\33\12\uffff\1"+
            "\5\1\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\2\5\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "3872:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA66_0==25) ) {s = 2;}

                        else if ( (LA66_0==75) && (synpred20_InternalGraphViewMapping())) {s = 3;}

                        else if ( (LA66_0==50) && (synpred20_InternalGraphViewMapping())) {s = 4;}

                        else if ( ((LA66_0>=RULE_INT && LA66_0<=RULE_STRING)||LA66_0==13||LA66_0==19||LA66_0==37||(LA66_0>=39 && LA66_0<=40)||LA66_0==44||LA66_0==49||LA66_0==52||LA66_0==54||(LA66_0>=58 && LA66_0<=59)||LA66_0==63||(LA66_0>=65 && LA66_0<=72)) ) {s = 5;}

                        else if ( (LA66_0==26) ) {s = 27;}

                         
                        input.seek(index66_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGraphViewMapping()) ) {s = 4;}

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
    static final String DFA68_eotS =
        "\77\uffff";
    static final String DFA68_eofS =
        "\1\31\76\uffff";
    static final String DFA68_minS =
        "\1\4\30\0\46\uffff";
    static final String DFA68_maxS =
        "\1\113\30\0\46\uffff";
    static final String DFA68_acceptS =
        "\31\uffff\1\2\44\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\46\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\1\1\15\1\17\6\uffff\1\6\1\31\1\uffff\3\31\1\22\1\uffff\3"+
            "\31\1\uffff\1\30\1\31\1\uffff\11\31\1\10\1\31\1\4\1\3\3\31\1"+
            "\2\4\31\1\12\1\uffff\1\31\1\21\1\31\1\7\3\31\1\23\1\24\3\31"+
            "\1\11\1\uffff\1\5\1\13\1\14\1\16\1\20\1\25\1\26\1\27\3\31",
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
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "4248:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_2 = input.LA(1);

                         
                        int index68_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA68_3 = input.LA(1);

                         
                        int index68_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA68_4 = input.LA(1);

                         
                        int index68_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA68_5 = input.LA(1);

                         
                        int index68_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA68_6 = input.LA(1);

                         
                        int index68_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA68_7 = input.LA(1);

                         
                        int index68_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA68_8 = input.LA(1);

                         
                        int index68_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA68_9 = input.LA(1);

                         
                        int index68_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA68_10 = input.LA(1);

                         
                        int index68_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA68_11 = input.LA(1);

                         
                        int index68_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA68_12 = input.LA(1);

                         
                        int index68_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA68_13 = input.LA(1);

                         
                        int index68_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA68_14 = input.LA(1);

                         
                        int index68_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA68_15 = input.LA(1);

                         
                        int index68_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA68_16 = input.LA(1);

                         
                        int index68_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA68_17 = input.LA(1);

                         
                        int index68_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA68_18 = input.LA(1);

                         
                        int index68_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA68_19 = input.LA(1);

                         
                        int index68_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA68_20 = input.LA(1);

                         
                        int index68_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA68_21 = input.LA(1);

                         
                        int index68_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA68_22 = input.LA(1);

                         
                        int index68_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA68_23 = input.LA(1);

                         
                        int index68_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA68_24 = input.LA(1);

                         
                        int index68_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\77\uffff";
    static final String DFA77_eofS =
        "\1\2\76\uffff";
    static final String DFA77_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA77_maxS =
        "\1\113\1\0\75\uffff";
    static final String DFA77_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA77_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA77_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\2\2\1\uffff"+
            "\11\2\1\1\14\2\1\uffff\15\2\1\uffff\13\2",
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
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "4672:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleDiagramMapping_in_entryRuleDiagramMapping75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramMapping85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDiagramMapping131 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_11_in_ruleDiagramMapping144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDiagramMapping165 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDiagramMapping177 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleDiagramMapping198 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDiagramMapping210 = new BitSet(new long[]{0x0000000000644000L});
    public static final BitSet FOLLOW_ruleAbstractExpressionMapping_in_ruleDiagramMapping231 = new BitSet(new long[]{0x0000000000644000L});
    public static final BitSet FOLLOW_14_in_ruleDiagramMapping244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard443 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildcard462 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNameWithWildcard475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractExpressionMapping_in_entryRuleAbstractExpressionMapping517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractExpressionMapping527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeMapping_in_ruleAbstractExpressionMapping574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelMapping_in_ruleAbstractExpressionMapping601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeMapping_in_ruleAbstractExpressionMapping628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeMapping_in_entryRuleNodeMapping663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeMapping673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNodeMapping710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeMapping727 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeMapping744 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_20_in_ruleNodeMapping762 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleNodeMapping797 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNodeMapping809 = new BitSet(new long[]{0x0000000000644000L});
    public static final BitSet FOLLOW_ruleAbstractExpressionMapping_in_ruleNodeMapping830 = new BitSet(new long[]{0x0000000000644000L});
    public static final BitSet FOLLOW_14_in_ruleNodeMapping843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelMapping_in_entryRuleLabelMapping879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelMapping889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleLabelMapping926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabelMapping943 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLabelMapping960 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_20_in_ruleLabelMapping978 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleLabelMapping1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeMapping_in_entryRuleEdgeMapping1049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeMapping1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEdgeMapping1096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEdgeMapping1113 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEdgeMapping1130 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_20_in_ruleEdgeMapping1148 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleEdgeMapping1183 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEdgeMapping1195 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1216 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEdgeMapping1229 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1250 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_ruleLabelMapping_in_ruleEdgeMapping1271 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeMapping1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeEndMapping_in_entryRuleEdgeEndMapping1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeEndMapping1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEdgeEndMapping1373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEdgeEndMapping1407 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEdgeEndMapping1419 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleEdgeEndMapping1440 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEdgeEndMapping1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1646 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1662 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1712 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1765 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpSingleAssign1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpMultiAssign1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2060 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2113 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2136 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOr2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2319 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2372 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2395 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpAnd2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2578 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2631 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2654 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpEquality2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpEquality2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2858 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_33_in_ruleXRelationalExpression2894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2919 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2980 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3003 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpCompare3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3246 = new BitSet(new long[]{0x0000004000800002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3299 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3322 = new BitSet(new long[]{0x0000004000800002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpOther3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3526 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3579 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3602 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpAdd3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpAdd3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3806 = new BitSet(new long[]{0x00000E0000020002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3859 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3882 = new BitSet(new long[]{0x00000E0000020002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpMulti3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpMulti4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4135 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpUnary4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4405 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleXCastedExpression4440 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4463 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4558 = new BitSet(new long[]{0x0000C00000010002L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall4607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4630 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4646 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4668 = new BitSet(new long[]{0x0000C00000010002L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall4754 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4778 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4815 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall4844 = new BitSet(new long[]{0x0000000002000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4865 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4878 = new BitSet(new long[]{0x0000000002000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4899 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall4913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4938 = new BitSet(new long[]{0x0000C00002010002L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall4972 = new BitSet(new long[]{0x8C5611A006182070L,0x00000000000009FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5047 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5075 = new BitSet(new long[]{0x0001000004000000L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall5088 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5109 = new BitSet(new long[]{0x0001000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall5126 = new BitSet(new long[]{0x0000C00000010002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXClosure5866 = new BitSet(new long[]{0x0004000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5888 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5901 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5922 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5938 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5959 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXClosure5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6115 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXShortClosure6128 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6149 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXShortClosure6165 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleXParenthesizedExpression6271 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6293 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXParenthesizedExpression6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXIfExpression6396 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXIfExpression6408 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6429 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXIfExpression6441 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6462 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXIfExpression6483 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6599 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6621 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6633 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6656 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXSwitchExpression6668 = new BitSet(new long[]{0x0280000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6689 = new BitSet(new long[]{0x0380000002004010L,0x0000000000000800L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6703 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6715 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6736 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXSwitchExpression6750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6842 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXCasePart6856 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6877 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXCasePart6891 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXForLoopExpression7004 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXForLoopExpression7016 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7037 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXForLoopExpression7049 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7070 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXForLoopExpression7082 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXWhileExpression7195 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXWhileExpression7207 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7228 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXWhileExpression7240 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression7353 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7374 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression7386 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXDoWhileExpression7398 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7419 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXDoWhileExpression7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression7523 = new BitSet(new long[]{0xEC5211A002186070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7545 = new BitSet(new long[]{0xFC5211A002186070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_60_in_ruleXBlockExpression7558 = new BitSet(new long[]{0xEC5211A002186070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_14_in_ruleXBlockExpression7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration7792 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration7823 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7892 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7921 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleXVariableDeclaration7935 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8175 = new BitSet(new long[]{0x8000002000000010L});
    public static final BitSet FOLLOW_37_in_ruleXFeatureCall8189 = new BitSet(new long[]{0x0000000002000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8210 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_48_in_ruleXFeatureCall8223 = new BitSet(new long[]{0x0000000002000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8244 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXFeatureCall8258 = new BitSet(new long[]{0x8000002000000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8283 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall8317 = new BitSet(new long[]{0x8C5611A006182070L,0x00000000000009FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8392 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8420 = new BitSet(new long[]{0x0001000004000000L});
    public static final BitSet FOLLOW_48_in_ruleXFeatureCall8433 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8454 = new BitSet(new long[]{0x0001000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleIdOrSuper8592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleStaticQualifier8709 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXConstructorCall8806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8829 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_37_in_ruleXConstructorCall8842 = new BitSet(new long[]{0x0000000002000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8863 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_48_in_ruleXConstructorCall8876 = new BitSet(new long[]{0x0000000002000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8897 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXConstructorCall8911 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall8925 = new BitSet(new long[]{0x8C5611A006182070L,0x00000000000009FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8987 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9015 = new BitSet(new long[]{0x0001000004000000L});
    public static final BitSet FOLLOW_48_in_ruleXConstructorCall9028 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9049 = new BitSet(new long[]{0x0001000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall9066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXBooleanLiteral9159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXBooleanLiteral9183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXNullLiteral9289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTypeLiteral9585 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXTypeLiteral9597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9620 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXTypeLiteral9632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXThrowExpression9724 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXReturnExpression9837 = new BitSet(new long[]{0x8C5211A002182072L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression9961 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10012 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression10034 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression10078 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXCatchClause10192 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXCatchClause10205 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause10226 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXCatchClause10238 = new BitSet(new long[]{0x8C5211A002182070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10354 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName10382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10405 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleXFunctionTypeRef10619 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10640 = new BitSet(new long[]{0x0001000004000000L});
    public static final BitSet FOLLOW_48_in_ruleXFunctionTypeRef10653 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10674 = new BitSet(new long[]{0x0001000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXFunctionTypeRef10688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleXFunctionTypeRef10702 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10817 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleJvmParameterizedTypeReference10838 = new BitSet(new long[]{0x0000000002000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10860 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_48_in_ruleJvmParameterizedTypeReference10873 = new BitSet(new long[]{0x0000000002000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10894 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_36_in_ruleJvmParameterizedTypeReference10908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmWildcardTypeReference11121 = new BitSet(new long[]{0x8000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBound11255 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBoundAnded11359 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleJvmLowerBound11463 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewMapping1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewMapping2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewMapping2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewMapping2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred5_InternalGraphViewMapping2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewMapping2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewMapping3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewMapping3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewMapping3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred10_InternalGraphViewMapping4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred11_InternalGraphViewMapping4575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalGraphViewMapping4584 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewMapping4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred12_InternalGraphViewMapping4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred12_InternalGraphViewMapping4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred12_InternalGraphViewMapping4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred13_InternalGraphViewMapping4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping5006 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_synpred14_InternalGraphViewMapping5013 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping5020 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_50_in_synpred14_InternalGraphViewMapping5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred16_InternalGraphViewMapping6475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewMapping7841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalGraphViewMapping7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred18_InternalGraphViewMapping8299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8351 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_synpred19_InternalGraphViewMapping8358 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8365 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_50_in_synpred19_InternalGraphViewMapping8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping8946 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_synpred20_InternalGraphViewMapping8953 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping8960 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_50_in_synpred20_InternalGraphViewMapping8970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewMapping9851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred22_InternalGraphViewMapping9996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred23_InternalGraphViewMapping10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred25_InternalGraphViewMapping10373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred26_InternalGraphViewMapping10830 = new BitSet(new long[]{0x0000000000000002L});

}