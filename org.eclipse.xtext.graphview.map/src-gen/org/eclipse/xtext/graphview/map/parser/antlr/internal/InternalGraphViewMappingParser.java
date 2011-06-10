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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'diagram'", "'type'", "'import'", "'.'", "'*'", "'node'", "'for'", "'each'", "'{'", "'}'", "'label'", "'edge'", "'->'", "'('", "')'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'while'", "'do'", "';'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:76:1: ruleDiagramMapping returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) ( (lv_mappings_5_0= ruleAbstractExpressionMapping ) )* ) ;
    public final EObject ruleDiagramMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_typeGuard_4_0 = null;

        EObject lv_mappings_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) ( (lv_mappings_5_0= ruleAbstractExpressionMapping ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) ( (lv_mappings_5_0= ruleAbstractExpressionMapping ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) ( (lv_mappings_5_0= ruleAbstractExpressionMapping ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) ( (lv_mappings_5_0= ruleAbstractExpressionMapping ) )*
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:142:2: ( (lv_mappings_5_0= ruleAbstractExpressionMapping ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||(LA2_0>=21 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:143:1: (lv_mappings_5_0= ruleAbstractExpressionMapping )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:143:1: (lv_mappings_5_0= ruleAbstractExpressionMapping )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:144:3: lv_mappings_5_0= ruleAbstractExpressionMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDiagramMappingAccess().getMappingsAbstractExpressionMappingParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractExpressionMapping_in_ruleDiagramMapping219);
            	    lv_mappings_5_0=ruleAbstractExpressionMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDiagramMappingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappings",
            	              		lv_mappings_5_0, 
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:168:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:169:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:170:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport256);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport266); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:177:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:180:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:181:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:181:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:181:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:185:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:186:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:186:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:187:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport324);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:211:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:212:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:213:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard361);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard372); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:220:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:223:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:224:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:224:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:225:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard419);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:235:1: (kw= '.' kw= '*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:236:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildcard438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildcard451); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:255:1: entryRuleAbstractExpressionMapping returns [EObject current=null] : iv_ruleAbstractExpressionMapping= ruleAbstractExpressionMapping EOF ;
    public final EObject entryRuleAbstractExpressionMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExpressionMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:256:2: (iv_ruleAbstractExpressionMapping= ruleAbstractExpressionMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:257:2: iv_ruleAbstractExpressionMapping= ruleAbstractExpressionMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractExpressionMappingRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractExpressionMapping_in_entryRuleAbstractExpressionMapping493);
            iv_ruleAbstractExpressionMapping=ruleAbstractExpressionMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractExpressionMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractExpressionMapping503); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:264:1: ruleAbstractExpressionMapping returns [EObject current=null] : (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping ) ;
    public final EObject ruleAbstractExpressionMapping() throws RecognitionException {
        EObject current = null;

        EObject this_NodeMapping_0 = null;

        EObject this_LabelMapping_1 = null;

        EObject this_EdgeMapping_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:267:28: ( (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:268:1: (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:268:1: (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:269:5: this_NodeMapping_0= ruleNodeMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getNodeMappingParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeMapping_in_ruleAbstractExpressionMapping550);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:279:5: this_LabelMapping_1= ruleLabelMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getLabelMappingParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabelMapping_in_ruleAbstractExpressionMapping577);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:289:5: this_EdgeMapping_2= ruleEdgeMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getEdgeMappingParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEdgeMapping_in_ruleAbstractExpressionMapping604);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:305:1: entryRuleNodeMapping returns [EObject current=null] : iv_ruleNodeMapping= ruleNodeMapping EOF ;
    public final EObject entryRuleNodeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:306:2: (iv_ruleNodeMapping= ruleNodeMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:307:2: iv_ruleNodeMapping= ruleNodeMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeMappingRule()); 
            }
            pushFollow(FOLLOW_ruleNodeMapping_in_entryRuleNodeMapping639);
            iv_ruleNodeMapping=ruleNodeMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeMapping649); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:314:1: ruleNodeMapping returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:317:28: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:318:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:318:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:318:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleNodeMapping686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeMappingAccess().getNodeKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:322:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:323:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:323:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:324:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeMapping703); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleNodeMapping720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:344:1: ( (lv_multi_3_0= 'each' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:345:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:345:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:346:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,18,FOLLOW_18_in_ruleNodeMapping738); if (state.failed) return current;
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:359:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:360:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:360:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:361:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeMappingAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleNodeMapping773);
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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleNodeMapping785); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNodeMappingAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:381:1: ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16||(LA6_0>=21 && LA6_0<=22)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:382:1: (lv_mappings_6_0= ruleAbstractExpressionMapping )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:382:1: (lv_mappings_6_0= ruleAbstractExpressionMapping )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:383:3: lv_mappings_6_0= ruleAbstractExpressionMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeMappingAccess().getMappingsAbstractExpressionMappingParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractExpressionMapping_in_ruleNodeMapping806);
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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleNodeMapping819); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:411:1: entryRuleLabelMapping returns [EObject current=null] : iv_ruleLabelMapping= ruleLabelMapping EOF ;
    public final EObject entryRuleLabelMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:412:2: (iv_ruleLabelMapping= ruleLabelMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:413:2: iv_ruleLabelMapping= ruleLabelMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelMappingRule()); 
            }
            pushFollow(FOLLOW_ruleLabelMapping_in_entryRuleLabelMapping855);
            iv_ruleLabelMapping=ruleLabelMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabelMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelMapping865); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:420:1: ruleLabelMapping returns [EObject current=null] : (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleLabelMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_multi_3_0=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:423:28: ( (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:424:1: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:424:1: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:424:3: otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleLabelMapping902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLabelMappingAccess().getLabelKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:428:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:429:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:429:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:430:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabelMapping919); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleLabelMapping936); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLabelMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:450:1: ( (lv_multi_3_0= 'each' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:451:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:451:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:452:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,18,FOLLOW_18_in_ruleLabelMapping954); if (state.failed) return current;
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:465:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:466:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:466:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:467:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabelMappingAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleLabelMapping989);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:491:1: entryRuleEdgeMapping returns [EObject current=null] : iv_ruleEdgeMapping= ruleEdgeMapping EOF ;
    public final EObject entryRuleEdgeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:492:2: (iv_ruleEdgeMapping= ruleEdgeMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:493:2: iv_ruleEdgeMapping= ruleEdgeMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeMappingRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeMapping_in_entryRuleEdgeMapping1025);
            iv_ruleEdgeMapping=ruleEdgeMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeMapping1035); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:500:1: ruleEdgeMapping returns [EObject current=null] : (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) ) otherlv_9= '}' ) ;
    public final EObject ruleEdgeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_multi_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_expression_4_0 = null;

        EObject lv_sourceMapping_6_0 = null;

        EObject lv_targetMapping_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:503:28: ( (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) ) otherlv_9= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:504:1: (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) ) otherlv_9= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:504:1: (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) ) otherlv_9= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:504:3: otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleEdgeMapping1072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEdgeMappingAccess().getEdgeKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:508:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:509:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:509:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:510:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEdgeMapping1089); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleEdgeMapping1106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEdgeMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:530:1: ( (lv_multi_3_0= 'each' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:531:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:531:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:532:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,18,FOLLOW_18_in_ruleEdgeMapping1124); if (state.failed) return current;
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:545:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:546:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:546:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:547:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleEdgeMapping1159);
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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEdgeMapping1171); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEdgeMappingAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:567:1: ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:568:1: (lv_sourceMapping_6_0= ruleEdgeEndMapping )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:568:1: (lv_sourceMapping_6_0= ruleEdgeEndMapping )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:569:3: lv_sourceMapping_6_0= ruleEdgeEndMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getSourceMappingEdgeEndMappingParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1192);
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

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleEdgeMapping1205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEdgeMappingAccess().getHyphenMinusGreaterThanSignKeyword_7());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:589:1: ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:590:1: (lv_targetMapping_8_0= ruleEdgeEndMapping )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:590:1: (lv_targetMapping_8_0= ruleEdgeEndMapping )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:591:3: lv_targetMapping_8_0= ruleEdgeEndMapping
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getTargetMappingEdgeEndMappingParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1226);
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

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleEdgeMapping1238); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getEdgeMappingAccess().getRightCurlyBracketKeyword_9());
                  
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:619:1: entryRuleEdgeEndMapping returns [EObject current=null] : iv_ruleEdgeEndMapping= ruleEdgeEndMapping EOF ;
    public final EObject entryRuleEdgeEndMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeEndMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:620:2: (iv_ruleEdgeEndMapping= ruleEdgeEndMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:621:2: iv_ruleEdgeEndMapping= ruleEdgeEndMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeEndMappingRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeEndMapping_in_entryRuleEdgeEndMapping1274);
            iv_ruleEdgeEndMapping=ruleEdgeEndMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeEndMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeEndMapping1284); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:628:1: ruleEdgeEndMapping returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleXExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleEdgeEndMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:631:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleXExpression ) ) otherlv_3= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:632:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleXExpression ) ) otherlv_3= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:632:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleXExpression ) ) otherlv_3= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:632:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleXExpression ) ) otherlv_3= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:632:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:633:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:633:1: (otherlv_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:634:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeEndMappingRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEdgeEndMapping1329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEdgeEndMappingAccess().getMappingNodeMappingCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEdgeEndMapping1341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEdgeEndMappingAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:649:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:650:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:650:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:651:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeEndMappingAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleEdgeEndMapping1362);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeEndMappingRule());
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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleEdgeEndMapping1374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEdgeEndMappingAccess().getRightParenthesisKeyword_3());
                  
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:679:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:680:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:681:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1410);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1420); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:688:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:691:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:693:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1466);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:709:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:710:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:711:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1500);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1510); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:718:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:721:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:722:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:722:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||(LA11_1>=RULE_ID && LA11_1<=RULE_STRING)||(LA11_1>=14 && LA11_1<=17)||(LA11_1>=19 && LA11_1<=25)||(LA11_1>=27 && LA11_1<=48)||(LA11_1>=50 && LA11_1<=74)) ) {
                    alt11=2;
                }
                else if ( (LA11_1==26) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_STRING)||LA11_0==17||LA11_0==19||LA11_0==24||LA11_0==36||(LA11_0>=38 && LA11_0<=39)||LA11_0==43||LA11_0==48||LA11_0==51||LA11_0==53||(LA11_0>=57 && LA11_0<=58)||LA11_0==62||(LA11_0>=64 && LA11_0<=71)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:722:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:722:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:722:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:722:3: ()
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:723:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:728:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:729:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:729:1: ( ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:730:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1568);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1584);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:751:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:752:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:752:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:753:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1604);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:770:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:770:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:771:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1634);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:779:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==27) ) {
                        int LA10_1 = input.LA(2);

                        if ( (synpred1_InternalGraphViewMapping()) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:779:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:779:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:779:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:784:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:784:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:784:7: ()
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:785:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:790:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:791:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:791:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:792:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1687);
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

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:805:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:806:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:806:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:807:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1710);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:831:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:832:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:833:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1750);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1761); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:840:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:843:28: (kw= '=' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:845:2: kw= '='
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpSingleAssign1798); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:858:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:859:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:860:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1838);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1849); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:867:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:870:28: (kw= '+=' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:872:2: kw= '+='
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpMultiAssign1886); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:885:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:886:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:887:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1925);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1935); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:894:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:897:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:898:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:898:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:899:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1982);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:907:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred2_InternalGraphViewMapping()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:907:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:907:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:907:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:912:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:912:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:912:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:913:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:918:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:919:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:919:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:920:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2035);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:933:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:934:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:934:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:935:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2058);
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
            	    break loop12;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:959:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:960:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:961:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2097);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2108); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:968:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:971:28: (kw= '||' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:973:2: kw= '||'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOr2145); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:986:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:987:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:988:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2184);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2194); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:995:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:998:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:999:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:999:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1000:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2241);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1008:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred3_InternalGraphViewMapping()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1008:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1008:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1008:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1013:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1013:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1013:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1014:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1019:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1020:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1020:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1021:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2294);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1034:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1035:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1035:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1036:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2317);
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
            	    break loop13;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1060:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1061:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1062:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2356);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2367); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1069:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1072:28: (kw= '&&' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1074:2: kw= '&&'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpAnd2404); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1087:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1088:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1089:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2443);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2453); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1096:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1099:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1100:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1100:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1101:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2500);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1109:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred4_InternalGraphViewMapping()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==31) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred4_InternalGraphViewMapping()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1109:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1109:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1109:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1114:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1114:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1114:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1115:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1120:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1121:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1121:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1122:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2553);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1135:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1136:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1136:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1137:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2576);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1161:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1162:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1163:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2615);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2626); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1170:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1173:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1174:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1174:1: (kw= '==' | kw= '!=' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            else if ( (LA15_0==31) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1175:2: kw= '=='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpEquality2664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1182:2: kw= '!='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpEquality2683); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1195:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1196:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1197:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2723);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2733); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1204:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1207:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1208:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1208:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1209:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2780);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1217:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop16:
            do {
                int alt16=3;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred5_InternalGraphViewMapping()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA16_6 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt16=2;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1217:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1217:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1217:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1217:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1217:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1219:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1219:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1219:6: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1220:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXRelationalExpression2816); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1229:3: ( ( ruleQualifiedName ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1230:1: ( ruleQualifiedName )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1230:1: ( ruleQualifiedName )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1231:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2841);
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
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1250:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1250:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1250:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1251:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1256:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1257:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1257:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1258:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2902);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1271:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1272:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1272:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1273:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2925);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1297:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1298:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1299:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2965);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2976); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1306:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1309:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1310:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1310:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt17=1;
                }
                break;
            case 34:
                {
                alt17=2;
                }
                break;
            case 35:
                {
                alt17=3;
                }
                break;
            case 36:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1311:2: kw= '>='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpCompare3014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1318:2: kw= '<='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare3033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1325:2: kw= '>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare3052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1332:2: kw= '<'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare3071); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1345:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1346:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1347:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3111);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3121); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1354:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1357:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1358:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1358:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1359:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3168);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1367:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred7_InternalGraphViewMapping()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==37) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred7_InternalGraphViewMapping()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1367:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1367:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1367:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1373:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1378:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1379:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1379:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1380:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3221);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1393:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1394:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1394:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1395:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3244);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1419:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1420:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1421:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3283);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3294); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1428:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1431:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1432:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1432:1: (kw= '->' | kw= '..' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            else if ( (LA19_0==37) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1433:2: kw= '->'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpOther3332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1440:2: kw= '..'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther3351); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1453:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1454:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1455:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3391);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3401); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1462:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1465:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1466:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1466:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1467:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3448);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1475:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred8_InternalGraphViewMapping()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==39) ) {
                    int LA20_3 = input.LA(2);

                    if ( (synpred8_InternalGraphViewMapping()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1475:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1475:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1475:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1480:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1480:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1480:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1481:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1486:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1487:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1487:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1488:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3501);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1501:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1502:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1502:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1503:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3524);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1527:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1528:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1529:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3563);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3574); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1536:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1539:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1540:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1540:1: (kw= '+' | kw= '-' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            else if ( (LA21_0==39) ) {
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1541:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpAdd3612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1548:2: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpAdd3631); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1561:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1562:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1563:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3671);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3681); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1570:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1573:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1574:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1574:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1575:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3728);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1583:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    int LA22_2 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA22_3 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA22_4 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA22_5 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt22=1;
                    }


                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1583:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1583:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1583:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1588:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1588:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1588:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1589:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1594:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1595:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1595:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1596:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3781);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1609:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1610:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1610:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1611:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3804);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1635:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1636:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1637:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3843);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3854); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1644:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1647:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1648:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1648:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt23=1;
                }
                break;
            case 40:
                {
                alt23=2;
                }
                break;
            case 41:
                {
                alt23=3;
                }
                break;
            case 42:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1649:2: kw= '*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleOpMulti3892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1656:2: kw= '**'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti3911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1663:2: kw= '/'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti3930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1670:2: kw= '%'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti3949); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1683:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1684:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1685:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3989);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3999); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1692:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1695:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1696:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1696:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=38 && LA24_0<=39)||LA24_0==43) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)||LA24_0==17||LA24_0==19||LA24_0==24||LA24_0==36||LA24_0==48||LA24_0==51||LA24_0==53||(LA24_0>=57 && LA24_0<=58)||LA24_0==62||(LA24_0>=64 && LA24_0<=71)) ) {
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1696:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1696:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1696:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1696:3: ()
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1697:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1702:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1703:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1703:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1704:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4057);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1717:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1718:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1718:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1719:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4078);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1737:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4107);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1753:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1754:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1755:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4143);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4154); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1762:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1765:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1766:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1766:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt25=1;
                }
                break;
            case 39:
                {
                alt25=2;
                }
                break;
            case 38:
                {
                alt25=3;
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1767:2: kw= '!'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary4192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1774:2: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary4211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1781:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpUnary4230); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1794:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1795:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1796:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4270);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4280); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1803:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1806:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1807:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1807:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1808:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4327);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1816:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred10_InternalGraphViewMapping()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1816:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1816:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1816:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1818:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1818:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1818:6: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1819:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXCastedExpression4362); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1828:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1829:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1829:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1830:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4385);
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
            	    break loop26;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1854:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1855:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1856:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4423);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4433); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1863:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1866:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1867:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1867:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1868:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4480);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1876:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop33:
            do {
                int alt33=3;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred11_InternalGraphViewMapping()) ) {
                        alt33=1;
                    }
                    else if ( (synpred12_InternalGraphViewMapping()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred12_InternalGraphViewMapping()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred12_InternalGraphViewMapping()) ) {
                        alt33=2;
                    }


                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1876:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1876:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1876:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1876:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1876:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1882:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1882:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1882:26: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1883:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall4529); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1892:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1893:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1893:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1894:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4552);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4568);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1915:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1916:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1916:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1917:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4590);
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
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1950:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1950:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1950:8: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1951:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1956:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 14:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 46:
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
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1956:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall4676); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1961:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1961:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1962:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1962:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1963:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4700); if (state.failed) return current;
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
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1977:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1977:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1978:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1978:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1979:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4737); if (state.failed) return current;
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1992:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==36) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1992:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall4766); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1996:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1997:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1997:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1998:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4787);
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

            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2014:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop28:
            	            do {
            	                int alt28=2;
            	                int LA28_0 = input.LA(1);

            	                if ( (LA28_0==47) ) {
            	                    alt28=1;
            	                }


            	                switch (alt28) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2014:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4800); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2018:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2019:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2019:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2020:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4821);
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
            	            	    break loop28;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,35,FOLLOW_35_in_ruleXMemberFeatureCall4835); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2040:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2041:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2041:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2042:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4860);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2055:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt32=2;
            	    alt32 = dfa32.predict(input);
            	    switch (alt32) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2055:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2055:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2055:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2062:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2063:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall4894); if (state.failed) return current;
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

            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2076:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt31=3;
            	            alt31 = dfa31.predict(input);
            	            switch (alt31) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2076:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2076:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2076:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2088:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2089:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4969);
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
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2106:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2106:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2106:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2106:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2107:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2107:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2108:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4997);
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

            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2124:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop30:
            	                    do {
            	                        int alt30=2;
            	                        int LA30_0 = input.LA(1);

            	                        if ( (LA30_0==47) ) {
            	                            alt30=1;
            	                        }


            	                        switch (alt30) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2124:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall5010); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2128:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2129:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2129:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2130:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5031);
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
            	                    	    break loop30;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall5048); if (state.failed) return current;
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
            	    break loop33;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2158:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2159:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2160:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5089);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5099); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2167:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2170:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2171:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2171:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt34=13;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt34=1;
                }
                break;
            case 19:
                {
                alt34=2;
                }
                break;
            case 53:
                {
                alt34=3;
                }
                break;
            case RULE_ID:
            case 36:
            case 62:
                {
                alt34=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 48:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt34=5;
                }
                break;
            case 51:
                {
                alt34=6;
                }
                break;
            case 17:
                {
                alt34=7;
                }
                break;
            case 57:
                {
                alt34=8;
                }
                break;
            case 58:
                {
                alt34=9;
                }
                break;
            case 69:
                {
                alt34=10;
                }
                break;
            case 70:
                {
                alt34=11;
                }
                break;
            case 71:
                {
                alt34=12;
                }
                break;
            case 24:
                {
                alt34=13;
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2172:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5146);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2182:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5173);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2192:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5200);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2202:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5227);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2212:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5254);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2222:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5281);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2232:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5308);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2242:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5335);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2252:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5362);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2262:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5389);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2272:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5416);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2282:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5443);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2292:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5470);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2308:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2309:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2310:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5505);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5515); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2317:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2320:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2321:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2321:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt35=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt35=1;
                }
                break;
            case 65:
            case 66:
                {
                alt35=2;
                }
                break;
            case RULE_INT:
                {
                alt35=3;
                }
                break;
            case 67:
                {
                alt35=4;
                }
                break;
            case RULE_STRING:
                {
                alt35=5;
                }
                break;
            case 68:
                {
                alt35=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2322:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5562);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2332:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5589);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2342:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5616);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2352:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5643);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2362:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5670);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2372:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5697);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2388:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2389:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2390:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5732);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5742); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2397:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2400:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2401:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2401:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2401:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2401:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2402:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2411:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||LA37_0==24||LA37_0==74) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2411:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2411:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2412:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2412:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2413:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5810);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2429:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==47) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2429:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5823); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2433:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2434:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2434:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2435:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5844);
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
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleXClosure5860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2455:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2456:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2456:1: (lv_expression_6_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2457:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5881);
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

            otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5893); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2485:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2486:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2487:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5929);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5939); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2494:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2497:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2498:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2498:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2498:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2498:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2498:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2509:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2509:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2509:6: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2510:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2515:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==24||LA39_0==74) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2515:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2515:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2516:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2516:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2517:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6037);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2533:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==47) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2533:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXShortClosure6050); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2537:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2538:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2538:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2539:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6071);
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXShortClosure6087); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2559:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2560:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2560:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2561:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6110);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2585:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2586:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2587:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6146);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6156); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2594:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2597:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2598:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2598:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2598:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleXParenthesizedExpression6193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6215);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXParenthesizedExpression6226); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2623:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2624:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2625:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6262);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6272); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2632:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2635:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2636:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2636:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2636:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2636:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2637:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression6318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXIfExpression6330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2650:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2651:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2651:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2652:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6351);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXIfExpression6363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2672:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2673:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2673:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2674:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6384);
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2690:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==52) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred16_InternalGraphViewMapping()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2690:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2690:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2690:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleXIfExpression6405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2695:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2696:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2696:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2697:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6427);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2721:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2722:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2723:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6465);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6475); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2730:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2733:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2734:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2734:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2734:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2734:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2735:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2744:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==54) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2744:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2744:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2745:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2745:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2746:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6543);
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

                    otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2766:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2767:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2767:1: (lv_switch_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2768:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6578);
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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleXSwitchExpression6590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2788:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID||LA42_0==24||LA42_0==54||LA42_0==56||LA42_0==74) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2789:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2789:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2790:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6611);
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
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2806:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==55) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2806:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6625); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6637); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2814:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2815:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2815:1: (lv_default_9_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2816:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6658);
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

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleXSwitchExpression6672); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2844:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2845:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2846:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6708);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6718); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2853:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2856:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2857:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2857:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2857:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2857:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==24||LA44_0==74) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2858:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2858:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2859:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6764);
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2875:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2875:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart6778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2879:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2880:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2880:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2881:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6799);
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

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXCasePart6813); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2901:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2902:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2902:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2903:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6834);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2927:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2928:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2929:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6870);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6880); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2936:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2939:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2940:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2940:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2940:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2940:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2941:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleXForLoopExpression6926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXForLoopExpression6938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2954:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2955:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2955:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2956:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6959);
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

            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXForLoopExpression6971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2976:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2977:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2977:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2978:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6992);
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

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXForLoopExpression7004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2998:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2999:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2999:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3000:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7025);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3024:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3025:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3026:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7061);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7071); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3033:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3036:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3037:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3037:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3037:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3037:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3038:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXWhileExpression7117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXWhileExpression7129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3051:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3052:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3052:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3053:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7150);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXWhileExpression7162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3073:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3074:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3074:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3075:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7183);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3099:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3100:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3101:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7219);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7229); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3108:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3111:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3112:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3112:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3112:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3112:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3113:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression7275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3122:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3123:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3123:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3124:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7296);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXDoWhileExpression7308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXDoWhileExpression7320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3148:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3149:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3149:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3150:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7341);
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

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXDoWhileExpression7353); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3178:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3179:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3180:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7389);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7399); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3187:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3190:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3191:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3191:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3191:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3191:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3192:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleXBlockExpression7445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3201:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_STRING)||LA47_0==17||LA47_0==19||LA47_0==24||LA47_0==36||(LA47_0>=38 && LA47_0<=39)||LA47_0==43||LA47_0==48||LA47_0==51||LA47_0==53||(LA47_0>=57 && LA47_0<=58)||(LA47_0>=60 && LA47_0<=62)||(LA47_0>=64 && LA47_0<=71)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3201:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3201:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3202:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3202:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3203:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7467);
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

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3219:2: (otherlv_3= ';' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==59) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3219:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleXBlockExpression7480); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXBlockExpression7496); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3235:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3236:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3237:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7532);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7542); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3244:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3247:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3248:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3248:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=60 && LA48_0<=61)) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_STRING)||LA48_0==17||LA48_0==19||LA48_0==24||LA48_0==36||(LA48_0>=38 && LA48_0<=39)||LA48_0==43||LA48_0==48||LA48_0==51||LA48_0==53||(LA48_0>=57 && LA48_0<=58)||LA48_0==62||(LA48_0>=64 && LA48_0<=71)) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3249:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7589);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3259:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7616);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3275:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3276:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3277:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7651);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7661); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3284:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3287:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3288:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3288:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3288:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3288:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3289:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3294:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            else if ( (LA49_0==61) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3294:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3294:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3295:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3295:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3296:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration7714); if (state.failed) return current;
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3310:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration7745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3314:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred17_InternalGraphViewMapping()) ) {
                    alt50=1;
                }
                else if ( (true) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA50_0==24) && (synpred17_InternalGraphViewMapping())) {
                alt50=1;
            }
            else if ( (LA50_0==74) && (synpred17_InternalGraphViewMapping())) {
                alt50=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3314:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3314:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3314:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3322:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3322:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3322:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3323:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3323:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3324:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7793);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3340:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3341:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3341:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3342:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7814);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3359:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3359:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3360:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3360:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3361:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7843);
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3377:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==26) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3377:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXVariableDeclaration7857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3381:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3382:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3382:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3383:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7878);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3407:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3408:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3409:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7916);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7926); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3416:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3419:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3420:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3420:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3420:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3420:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_ID||LA52_1==14||LA52_1==36) ) {
                    alt52=1;
                }
            }
            else if ( (LA52_0==24||LA52_0==74) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3421:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3421:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3422:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7972);
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3438:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3439:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3439:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3440:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7994);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3464:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3465:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3466:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8030);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8040); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3473:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3476:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3477:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3477:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3477:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3477:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3478:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3483:2: ( ( ruleStaticQualifier ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==63) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3484:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3484:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3485:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8097);
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3498:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==36) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3498:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleXFeatureCall8111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3502:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3503:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3503:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3504:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8132);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3520:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==47) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3520:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8145); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3524:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3525:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3525:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3526:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8166);
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
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleXFeatureCall8180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3546:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3547:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3547:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3548:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8205);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3561:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3561:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3561:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3561:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3568:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3569:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall8239); if (state.failed) return current;
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3582:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt57=3;
                    alt57 = dfa57.predict(input);
                    switch (alt57) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3582:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3582:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3582:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3594:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3595:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8314);
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
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3612:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3612:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3612:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3612:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3613:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3613:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3614:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8342);
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

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3630:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==47) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3630:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8355); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3634:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3635:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3635:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3636:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8376);
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
                            	    break loop56;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall8393); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3664:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3665:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3666:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8432);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8443); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3673:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3676:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3677:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3677:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            else if ( (LA59_0==62) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3678:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8490);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3690:2: kw= 'super'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleIdOrSuper8514); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3703:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3704:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3705:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8555);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8566); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3712:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3715:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3716:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3716:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID) ) {
                    int LA60_2 = input.LA(2);

                    if ( (LA60_2==63) ) {
                        alt60=1;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3717:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8613);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,63,FOLLOW_63_in_ruleStaticQualifier8631); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3741:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3742:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3743:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8672);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8682); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3750:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3753:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3754:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3754:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3754:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3754:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3755:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXConstructorCall8728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3764:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3765:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3765:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3766:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8751);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3779:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==36) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3779:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleXConstructorCall8764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3783:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3784:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3784:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3785:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8785);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3801:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==47) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3801:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall8798); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3805:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3806:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3806:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3807:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8819);
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleXConstructorCall8833); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall8847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3831:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt64=3;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3831:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3831:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3831:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3843:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3844:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8909);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3861:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3861:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3861:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3861:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3862:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3862:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3863:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8937);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3879:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==47) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3879:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall8950); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3883:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3884:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3884:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3885:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8971);
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
                    	    break loop63;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall8988); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3913:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3914:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3915:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9024);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9034); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3922:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3925:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3926:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3926:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3926:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3926:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3927:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3932:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==65) ) {
                alt65=1;
            }
            else if ( (LA65_0==66) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3932:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral9081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3937:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3937:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3938:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3938:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3939:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,66,FOLLOW_66_in_ruleXBooleanLiteral9105); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3960:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3961:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3962:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9155);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9165); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3969:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3972:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3973:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3973:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3973:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3973:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3974:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXNullLiteral9211); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3991:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3992:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3993:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9247);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9257); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4000:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4003:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4004:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4004:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4004:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4004:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4005:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4010:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4011:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4011:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4012:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9308); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4036:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4037:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4038:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9349);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9359); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4045:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4048:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4049:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4049:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4049:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4049:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4050:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4055:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4056:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4056:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4057:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9410); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4081:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4082:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4083:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9451);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9461); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4090:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4093:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4094:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4094:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4094:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4094:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4095:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTypeLiteral9507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXTypeLiteral9519); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4108:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4109:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4109:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4110:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9542);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXTypeLiteral9554); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4135:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4136:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4137:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9590);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9600); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4144:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4147:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4148:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4148:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4148:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4148:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4149:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXThrowExpression9646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4158:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4159:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4159:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4160:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9667);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4184:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4185:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4186:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9703);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9713); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4193:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4196:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4197:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4197:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4197:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4197:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4198:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXReturnExpression9759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4207:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4207:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4212:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4213:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9790);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4237:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4238:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4239:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9827);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9837); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4246:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4249:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4250:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4250:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4250:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4250:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4251:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4260:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4261:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4261:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4262:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9904);
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

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4278:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==73) ) {
                alt69=1;
            }
            else if ( (LA69_0==72) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4278:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4278:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4278:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4278:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==73) ) {
                            int LA67_2 = input.LA(2);

                            if ( (synpred22_InternalGraphViewMapping()) ) {
                                alt67=1;
                            }


                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4278:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4280:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4281:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9934);
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
                    	    if ( cnt67 >= 1 ) break loop67;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4297:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==72) ) {
                        int LA68_1 = input.LA(2);

                        if ( (synpred23_InternalGraphViewMapping()) ) {
                            alt68=1;
                        }
                    }
                    switch (alt68) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4297:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4297:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4297:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression9956); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4302:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4303:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4303:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4304:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9978);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4321:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4321:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4321:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression10000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4325:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4326:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4326:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4327:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10021);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4351:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4352:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4353:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10059);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10069); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4360:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4363:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4364:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4364:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4364:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4364:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4364:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleXCatchClause10114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleXCatchClause10127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4373:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4374:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4374:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4375:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause10148);
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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleXCatchClause10160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4395:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4396:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4396:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4397:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10181);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4421:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4422:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4423:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10218);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10229); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4430:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4433:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4434:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4434:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4435:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10276);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4445:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==14) ) {
                    int LA70_2 = input.LA(2);

                    if ( (LA70_2==RULE_ID) ) {
                        int LA70_3 = input.LA(3);

                        if ( (synpred25_InternalGraphViewMapping()) ) {
                            alt70=1;
                        }


                    }


                }


                switch (alt70) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4445:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4445:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4445:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName10304); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10327);
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
            	    break loop70;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4472:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4473:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4474:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10374);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10384); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4481:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4484:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4485:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4485:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                alt71=1;
            }
            else if ( (LA71_0==24||LA71_0==74) ) {
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4486:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10431);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4496:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10458);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4512:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4513:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4514:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10493);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10503); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4521:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4524:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4525:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4525:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4525:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4525:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==24) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4525:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleXFunctionTypeRef10541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4529:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4530:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4530:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4531:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10562);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4547:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==47) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4547:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXFunctionTypeRef10575); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4551:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4552:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4552:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4553:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10596);
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
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXFunctionTypeRef10610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleXFunctionTypeRef10624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4577:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4578:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4578:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4579:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10645);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4603:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4604:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4605:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10681);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10691); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4612:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4615:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4616:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4616:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4616:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4616:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4617:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4617:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4618:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10739);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4631:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4631:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4631:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4631:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleJvmParameterizedTypeReference10760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4636:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4637:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4637:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4638:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10782);
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

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4654:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==47) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4654:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleJvmParameterizedTypeReference10795); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4658:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4659:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4659:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4660:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10816);
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
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleJvmParameterizedTypeReference10830); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4688:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4689:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4690:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10868);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10878); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4697:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4700:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4701:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4701:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID||LA76_0==24||LA76_0==74) ) {
                alt76=1;
            }
            else if ( (LA76_0==75) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4702:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10925);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4712:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10952);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4728:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4729:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4730:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10987);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10997); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4737:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4740:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4741:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4741:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4741:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4741:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4742:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleJvmWildcardTypeReference11043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4751:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt77=3;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==76) ) {
                alt77=1;
            }
            else if ( (LA77_0==62) ) {
                alt77=2;
            }
            switch (alt77) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4751:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4751:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4752:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4752:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4753:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11065);
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
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4770:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4770:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4771:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4771:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4772:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11092);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4796:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4797:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4798:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11130);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11140); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4805:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4808:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4809:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4809:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4809:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBound11177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4813:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4814:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4814:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4815:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11198);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4839:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4840:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4841:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11234);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11244); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4848:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4851:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4852:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4852:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4852:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBoundAnded11281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4856:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4857:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4857:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4858:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11302);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4882:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4883:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4884:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11338);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11348); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4891:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4894:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4895:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4895:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4895:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleJvmLowerBound11385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4899:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4900:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4900:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4901:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11406);
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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4927:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4928:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4929:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11445);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11456); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4936:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4939:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4940:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11495); if (state.failed) return current;
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:779:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:779:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:779:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:779:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:779:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:780:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:780:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:781:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:781:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:782:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewMapping1655);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:907:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:907:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:907:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:907:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:907:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:908:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:908:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:909:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:909:1: ( ruleOpOr )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:910:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewMapping2003);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1008:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1008:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1008:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1008:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1008:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1009:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1009:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1010:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1010:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1011:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewMapping2262);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1109:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1109:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1109:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1109:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1109:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1110:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1110:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1111:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1111:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1112:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewMapping2521);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1217:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1217:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1217:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1217:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1217:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1218:1: 
        {
        }

        match(input,32,FOLLOW_32_in_synpred5_InternalGraphViewMapping2797); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGraphViewMapping

    // $ANTLR start synpred6_InternalGraphViewMapping
    public final void synpred6_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1245:10: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1246:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1246:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1247:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1247:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1248:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewMapping2870);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1367:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1367:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1367:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1367:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1367:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1368:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1368:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1369:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1369:1: ( ruleOpOther )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1370:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewMapping3189);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1475:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1475:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1475:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1475:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1475:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1476:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1476:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1477:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1477:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1478:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewMapping3469);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1583:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1583:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1583:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1583:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1583:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1584:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1584:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1585:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1585:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1586:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewMapping3749);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1816:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1816:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1816:4: ( () 'as' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1816:5: () 'as'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1816:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1817:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred10_InternalGraphViewMapping4343); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalGraphViewMapping

    // $ANTLR start synpred11_InternalGraphViewMapping
    public final void synpred11_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1876:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1876:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1876:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1876:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1876:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1877:1: 
        {
        }

        match(input,14,FOLLOW_14_in_synpred11_InternalGraphViewMapping4497); if (state.failed) return ;
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1878:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1879:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1879:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1880:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalGraphViewMapping4506);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewMapping4512);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalGraphViewMapping

    // $ANTLR start synpred12_InternalGraphViewMapping
    public final void synpred12_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:10: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1935:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1935:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt78=3;
        switch ( input.LA(1) ) {
        case 14:
            {
            alt78=1;
            }
            break;
        case 45:
            {
            alt78=2;
            }
            break;
        case 46:
            {
            alt78=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 78, 0, input);

            throw nvae;
        }

        switch (alt78) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1935:4: '.'
                {
                match(input,14,FOLLOW_14_in_synpred12_InternalGraphViewMapping4615); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1937:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1937:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1938:1: ( '?.' )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1938:1: ( '?.' )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1939:2: '?.'
                {
                match(input,45,FOLLOW_45_in_synpred12_InternalGraphViewMapping4629); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1944:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1944:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1945:1: ( '*.' )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1945:1: ( '*.' )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1946:2: '*.'
                {
                match(input,46,FOLLOW_46_in_synpred12_InternalGraphViewMapping4649); if (state.failed) return ;

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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2055:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2056:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2056:1: ( '(' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2057:2: '('
        {
        match(input,24,FOLLOW_24_in_synpred13_InternalGraphViewMapping4876); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGraphViewMapping

    // $ANTLR start synpred14_InternalGraphViewMapping
    public final void synpred14_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2076:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2076:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2076:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2076:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2076:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2077:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2077:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt80=2;
        int LA80_0 = input.LA(1);

        if ( (LA80_0==RULE_ID||LA80_0==24||LA80_0==74) ) {
            alt80=1;
        }
        switch (alt80) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2077:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2077:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2078:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2078:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2079:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping4928);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2081:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop79:
                do {
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==47) ) {
                        alt79=1;
                    }


                    switch (alt79) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2081:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred14_InternalGraphViewMapping4935); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2082:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2083:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2083:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2084:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping4942);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop79;
                    }
                } while (true);


                }
                break;

        }

        match(input,49,FOLLOW_49_in_synpred14_InternalGraphViewMapping4952); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalGraphViewMapping

    // $ANTLR start synpred16_InternalGraphViewMapping
    public final void synpred16_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2690:4: ( 'else' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2690:6: 'else'
        {
        match(input,52,FOLLOW_52_in_synpred16_InternalGraphViewMapping6397); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalGraphViewMapping

    // $ANTLR start synpred17_InternalGraphViewMapping
    public final void synpred17_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3314:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3314:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3314:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3314:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3314:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3315:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3315:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3316:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewMapping7763);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3318:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3319:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3319:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3320:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalGraphViewMapping7772);
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
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3561:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3562:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3562:1: ( '(' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3563:2: '('
        {
        match(input,24,FOLLOW_24_in_synpred18_InternalGraphViewMapping8221); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalGraphViewMapping

    // $ANTLR start synpred19_InternalGraphViewMapping
    public final void synpred19_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3582:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3582:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3582:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3582:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3582:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3583:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3583:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==RULE_ID||LA84_0==24||LA84_0==74) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3583:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3583:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3584:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3584:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3585:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8273);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3587:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop83:
                do {
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==47) ) {
                        alt83=1;
                    }


                    switch (alt83) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3587:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred19_InternalGraphViewMapping8280); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3588:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3589:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3589:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3590:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8287);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop83;
                    }
                } while (true);


                }
                break;

        }

        match(input,49,FOLLOW_49_in_synpred19_InternalGraphViewMapping8297); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalGraphViewMapping

    // $ANTLR start synpred20_InternalGraphViewMapping
    public final void synpred20_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3831:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3831:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3831:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3831:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3831:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3832:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3832:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( (LA86_0==RULE_ID||LA86_0==24||LA86_0==74) ) {
            alt86=1;
        }
        switch (alt86) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3832:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3832:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3833:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3833:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3834:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping8868);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3836:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop85:
                do {
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==47) ) {
                        alt85=1;
                    }


                    switch (alt85) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3836:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred20_InternalGraphViewMapping8875); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3837:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3838:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3838:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3839:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping8882);
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

        match(input,49,FOLLOW_49_in_synpred20_InternalGraphViewMapping8892); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalGraphViewMapping

    // $ANTLR start synpred21_InternalGraphViewMapping
    public final void synpred21_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4207:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4208:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4208:1: ( ruleXExpression )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4209:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewMapping9773);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalGraphViewMapping

    // $ANTLR start synpred22_InternalGraphViewMapping
    public final void synpred22_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4278:5: ( 'catch' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4278:7: 'catch'
        {
        match(input,73,FOLLOW_73_in_synpred22_InternalGraphViewMapping9918); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalGraphViewMapping

    // $ANTLR start synpred23_InternalGraphViewMapping
    public final void synpred23_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4297:5: ( 'finally' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4297:7: 'finally'
        {
        match(input,72,FOLLOW_72_in_synpred23_InternalGraphViewMapping9948); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalGraphViewMapping

    // $ANTLR start synpred25_InternalGraphViewMapping
    public final void synpred25_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4445:3: ( '.' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4446:2: '.'
        {
        match(input,14,FOLLOW_14_in_synpred25_InternalGraphViewMapping10295); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalGraphViewMapping

    // $ANTLR start synpred26_InternalGraphViewMapping
    public final void synpred26_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4631:4: ( '<' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4631:6: '<'
        {
        match(input,36,FOLLOW_36_in_synpred26_InternalGraphViewMapping10752); if (state.failed) return ;

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


    protected DFA32 dfa32 = new DFA32(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA75 dfa75 = new DFA75(this);
    static final String DFA32_eotS =
        "\77\uffff";
    static final String DFA32_eofS =
        "\1\2\76\uffff";
    static final String DFA32_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA32_maxS =
        "\1\112\1\0\75\uffff";
    static final String DFA32_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA32_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA32_transitionS = {
            "\3\2\7\uffff\4\2\1\uffff\5\2\1\1\1\2\1\uffff\26\2\1\uffff\15"+
            "\2\1\uffff\13\2",
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "2055:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\34\uffff";
    static final String DFA31_eofS =
        "\34\uffff";
    static final String DFA31_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA31_maxS =
        "\1\112\2\0\31\uffff";
    static final String DFA31_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA31_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\2\5\12\uffff\1\5\1\uffff\1\5\4\uffff\1\2\1\33\12\uffff"+
            "\1\5\1\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\1\uffff\1\5\1\uffff"+
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "2076:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_0 = input.LA(1);

                         
                        int index31_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_0==RULE_ID) ) {s = 1;}

                        else if ( (LA31_0==24) ) {s = 2;}

                        else if ( (LA31_0==74) && (synpred14_InternalGraphViewMapping())) {s = 3;}

                        else if ( (LA31_0==49) && (synpred14_InternalGraphViewMapping())) {s = 4;}

                        else if ( ((LA31_0>=RULE_INT && LA31_0<=RULE_STRING)||LA31_0==17||LA31_0==19||LA31_0==36||(LA31_0>=38 && LA31_0<=39)||LA31_0==43||LA31_0==48||LA31_0==51||LA31_0==53||(LA31_0>=57 && LA31_0<=58)||LA31_0==62||(LA31_0>=64 && LA31_0<=71)) ) {s = 5;}

                        else if ( (LA31_0==25) ) {s = 27;}

                         
                        input.seek(index31_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\77\uffff";
    static final String DFA58_eofS =
        "\1\2\76\uffff";
    static final String DFA58_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA58_maxS =
        "\1\112\1\0\75\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA58_transitionS = {
            "\3\2\7\uffff\4\2\1\uffff\5\2\1\1\1\2\1\uffff\26\2\1\uffff\15"+
            "\2\1\uffff\13\2",
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

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3561:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\34\uffff";
    static final String DFA57_eofS =
        "\34\uffff";
    static final String DFA57_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA57_maxS =
        "\1\112\2\0\31\uffff";
    static final String DFA57_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA57_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\1\2\5\12\uffff\1\5\1\uffff\1\5\4\uffff\1\2\1\33\12\uffff"+
            "\1\5\1\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\1\uffff\1\5\1\uffff"+
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

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3582:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_0==RULE_ID) ) {s = 1;}

                        else if ( (LA57_0==24) ) {s = 2;}

                        else if ( (LA57_0==74) && (synpred19_InternalGraphViewMapping())) {s = 3;}

                        else if ( (LA57_0==49) && (synpred19_InternalGraphViewMapping())) {s = 4;}

                        else if ( ((LA57_0>=RULE_INT && LA57_0<=RULE_STRING)||LA57_0==17||LA57_0==19||LA57_0==36||(LA57_0>=38 && LA57_0<=39)||LA57_0==43||LA57_0==48||LA57_0==51||LA57_0==53||(LA57_0>=57 && LA57_0<=58)||LA57_0==62||(LA57_0>=64 && LA57_0<=71)) ) {s = 5;}

                        else if ( (LA57_0==25) ) {s = 27;}

                         
                        input.seek(index57_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_2 = input.LA(1);

                         
                        int index57_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index57_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\34\uffff";
    static final String DFA64_eofS =
        "\34\uffff";
    static final String DFA64_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA64_maxS =
        "\1\112\2\0\31\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\2\5\12\uffff\1\5\1\uffff\1\5\4\uffff\1\2\1\33\12\uffff"+
            "\1\5\1\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\1\uffff\1\5\1\uffff"+
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

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3831:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_0 = input.LA(1);

                         
                        int index64_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_0==RULE_ID) ) {s = 1;}

                        else if ( (LA64_0==24) ) {s = 2;}

                        else if ( (LA64_0==74) && (synpred20_InternalGraphViewMapping())) {s = 3;}

                        else if ( (LA64_0==49) && (synpred20_InternalGraphViewMapping())) {s = 4;}

                        else if ( ((LA64_0>=RULE_INT && LA64_0<=RULE_STRING)||LA64_0==17||LA64_0==19||LA64_0==36||(LA64_0>=38 && LA64_0<=39)||LA64_0==43||LA64_0==48||LA64_0==51||LA64_0==53||(LA64_0>=57 && LA64_0<=58)||LA64_0==62||(LA64_0>=64 && LA64_0<=71)) ) {s = 5;}

                        else if ( (LA64_0==25) ) {s = 27;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\77\uffff";
    static final String DFA66_eofS =
        "\1\31\76\uffff";
    static final String DFA66_minS =
        "\1\4\30\0\46\uffff";
    static final String DFA66_maxS =
        "\1\112\30\0\46\uffff";
    static final String DFA66_acceptS =
        "\31\uffff\1\2\44\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\46\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\1\1\15\1\17\7\uffff\3\31\1\22\1\uffff\1\6\4\31\1\30\1\31"+
            "\1\uffff\11\31\1\10\1\31\1\4\1\3\3\31\1\2\4\31\1\12\1\uffff"+
            "\1\31\1\21\1\31\1\7\3\31\1\23\1\24\3\31\1\11\1\uffff\1\5\1\13"+
            "\1\14\1\16\1\20\1\25\1\26\1\27\3\31",
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
            return "4207:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_3 = input.LA(1);

                         
                        int index66_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA66_4 = input.LA(1);

                         
                        int index66_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA66_5 = input.LA(1);

                         
                        int index66_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA66_6 = input.LA(1);

                         
                        int index66_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA66_7 = input.LA(1);

                         
                        int index66_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA66_8 = input.LA(1);

                         
                        int index66_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA66_9 = input.LA(1);

                         
                        int index66_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA66_10 = input.LA(1);

                         
                        int index66_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA66_11 = input.LA(1);

                         
                        int index66_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA66_12 = input.LA(1);

                         
                        int index66_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA66_13 = input.LA(1);

                         
                        int index66_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA66_14 = input.LA(1);

                         
                        int index66_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA66_15 = input.LA(1);

                         
                        int index66_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA66_16 = input.LA(1);

                         
                        int index66_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA66_17 = input.LA(1);

                         
                        int index66_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA66_18 = input.LA(1);

                         
                        int index66_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA66_19 = input.LA(1);

                         
                        int index66_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA66_20 = input.LA(1);

                         
                        int index66_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA66_21 = input.LA(1);

                         
                        int index66_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA66_22 = input.LA(1);

                         
                        int index66_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA66_23 = input.LA(1);

                         
                        int index66_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA66_24 = input.LA(1);

                         
                        int index66_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_24);
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
    static final String DFA75_eotS =
        "\77\uffff";
    static final String DFA75_eofS =
        "\1\2\76\uffff";
    static final String DFA75_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA75_maxS =
        "\1\112\1\0\75\uffff";
    static final String DFA75_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA75_transitionS = {
            "\3\2\7\uffff\4\2\1\uffff\7\2\1\uffff\11\2\1\1\14\2\1\uffff\15"+
            "\2\1\uffff\13\2",
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
            return "4631:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
                        if ( (synpred26_InternalGraphViewMapping()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index75_1);
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
 

    public static final BitSet FOLLOW_ruleDiagramMapping_in_entryRuleDiagramMapping75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramMapping85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDiagramMapping131 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_11_in_ruleDiagramMapping144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDiagramMapping165 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDiagramMapping177 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleDiagramMapping198 = new BitSet(new long[]{0x0000000000610002L});
    public static final BitSet FOLLOW_ruleAbstractExpressionMapping_in_ruleDiagramMapping219 = new BitSet(new long[]{0x0000000000610002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard419 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildcard438 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildcard451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractExpressionMapping_in_entryRuleAbstractExpressionMapping493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractExpressionMapping503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeMapping_in_ruleAbstractExpressionMapping550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelMapping_in_ruleAbstractExpressionMapping577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeMapping_in_ruleAbstractExpressionMapping604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeMapping_in_entryRuleNodeMapping639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeMapping649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNodeMapping686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeMapping703 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNodeMapping720 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_18_in_ruleNodeMapping738 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleNodeMapping773 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeMapping785 = new BitSet(new long[]{0x0000000000710000L});
    public static final BitSet FOLLOW_ruleAbstractExpressionMapping_in_ruleNodeMapping806 = new BitSet(new long[]{0x0000000000710000L});
    public static final BitSet FOLLOW_20_in_ruleNodeMapping819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelMapping_in_entryRuleLabelMapping855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelMapping865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleLabelMapping902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabelMapping919 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLabelMapping936 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_18_in_ruleLabelMapping954 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleLabelMapping989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeMapping_in_entryRuleEdgeMapping1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeMapping1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEdgeMapping1072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEdgeMapping1089 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEdgeMapping1106 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_18_in_ruleEdgeMapping1124 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleEdgeMapping1159 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEdgeMapping1171 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1192 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEdgeMapping1205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1226 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEdgeMapping1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeEndMapping_in_entryRuleEdgeEndMapping1274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeEndMapping1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEdgeEndMapping1329 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEdgeEndMapping1341 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleEdgeEndMapping1362 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEdgeEndMapping1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1568 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1584 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1634 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1687 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpSingleAssign1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpMultiAssign1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1982 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2035 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2058 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOr2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2241 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2294 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2317 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpAnd2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2500 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2553 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2576 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpEquality2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpEquality2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2780 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_32_in_ruleXRelationalExpression2816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2841 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2902 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2925 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3168 = new BitSet(new long[]{0x0000002000800002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3221 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3244 = new BitSet(new long[]{0x0000002000800002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpOther3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3448 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3501 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3524 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpAdd3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpAdd3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3728 = new BitSet(new long[]{0x0000070000008002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3781 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3804 = new BitSet(new long[]{0x0000070000008002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpMulti3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4057 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpUnary4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4327 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleXCastedExpression4362 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4385 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4480 = new BitSet(new long[]{0x0000600000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall4529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4552 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4568 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4590 = new BitSet(new long[]{0x0000600000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall4676 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4700 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4737 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall4766 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4787 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4800 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4821 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall4835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4860 = new BitSet(new long[]{0x0000600001004002L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall4894 = new BitSet(new long[]{0x462B08D0030E0070L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4969 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4997 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall5010 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5031 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall5048 = new BitSet(new long[]{0x0000600000004002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5788 = new BitSet(new long[]{0x0002000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5810 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5823 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5844 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXClosure5860 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5881 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6037 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXShortClosure6050 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6071 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXShortClosure6087 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleXParenthesizedExpression6193 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6215 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXParenthesizedExpression6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression6318 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXIfExpression6330 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6351 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXIfExpression6363 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6384 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXIfExpression6405 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6521 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6543 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6555 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6578 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXSwitchExpression6590 = new BitSet(new long[]{0x0140000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6611 = new BitSet(new long[]{0x01C0000001100010L,0x0000000000000400L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6625 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6637 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6658 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXSwitchExpression6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6764 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart6778 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6799 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXCasePart6813 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleXForLoopExpression6926 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXForLoopExpression6938 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6959 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXForLoopExpression6971 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6992 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXForLoopExpression7004 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXWhileExpression7117 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXWhileExpression7129 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7150 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXWhileExpression7162 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression7275 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7296 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXDoWhileExpression7308 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXDoWhileExpression7320 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7341 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXDoWhileExpression7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXBlockExpression7445 = new BitSet(new long[]{0x762908D0011E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7467 = new BitSet(new long[]{0x7E2908D0011E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_59_in_ruleXBlockExpression7480 = new BitSet(new long[]{0x762908D0011E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_20_in_ruleXBlockExpression7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration7714 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration7745 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7814 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7843 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleXVariableDeclaration7857 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8097 = new BitSet(new long[]{0x4000001000000010L});
    public static final BitSet FOLLOW_36_in_ruleXFeatureCall8111 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8132 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8145 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8166 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_35_in_ruleXFeatureCall8180 = new BitSet(new long[]{0x4000001000000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8205 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall8239 = new BitSet(new long[]{0x462B08D0030E0070L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8314 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8342 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8355 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8376 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall8393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleIdOrSuper8514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8613 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleStaticQualifier8631 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXConstructorCall8728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8751 = new BitSet(new long[]{0x0000001001000000L});
    public static final BitSet FOLLOW_36_in_ruleXConstructorCall8764 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8785 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall8798 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8819 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_35_in_ruleXConstructorCall8833 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall8847 = new BitSet(new long[]{0x462B08D0030E0070L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8909 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8937 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall8950 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8971 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall8988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral9081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXBooleanLiteral9105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXNullLiteral9211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTypeLiteral9507 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXTypeLiteral9519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9542 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXTypeLiteral9554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXThrowExpression9646 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXReturnExpression9759 = new BitSet(new long[]{0x462908D0010E0072L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9883 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9934 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression9956 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression10000 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXCatchClause10114 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXCatchClause10127 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause10148 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXCatchClause10160 = new BitSet(new long[]{0x462908D0010E0070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10276 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName10304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10327 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleXFunctionTypeRef10541 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10562 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_47_in_ruleXFunctionTypeRef10575 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10596 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_25_in_ruleXFunctionTypeRef10610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleXFunctionTypeRef10624 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10739 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleJvmParameterizedTypeReference10760 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10782 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_47_in_ruleJvmParameterizedTypeReference10795 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10816 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_35_in_ruleJvmParameterizedTypeReference10830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmWildcardTypeReference11043 = new BitSet(new long[]{0x4000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBound11177 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBoundAnded11281 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleJvmLowerBound11385 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewMapping1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewMapping2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewMapping2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewMapping2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred5_InternalGraphViewMapping2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewMapping2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewMapping3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewMapping3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewMapping3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred10_InternalGraphViewMapping4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred11_InternalGraphViewMapping4497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalGraphViewMapping4506 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewMapping4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred12_InternalGraphViewMapping4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred12_InternalGraphViewMapping4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred12_InternalGraphViewMapping4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred13_InternalGraphViewMapping4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping4928 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_synpred14_InternalGraphViewMapping4935 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping4942 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_synpred14_InternalGraphViewMapping4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred16_InternalGraphViewMapping6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewMapping7763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalGraphViewMapping7772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred18_InternalGraphViewMapping8221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8273 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_synpred19_InternalGraphViewMapping8280 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8287 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_synpred19_InternalGraphViewMapping8297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping8868 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_synpred20_InternalGraphViewMapping8875 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping8882 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_synpred20_InternalGraphViewMapping8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewMapping9773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred22_InternalGraphViewMapping9918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred23_InternalGraphViewMapping9948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred25_InternalGraphViewMapping10295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred26_InternalGraphViewMapping10752 = new BitSet(new long[]{0x0000000000000002L});

}