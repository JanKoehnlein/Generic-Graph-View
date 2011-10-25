package org.eclipse.xtext.graphview.style.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.graphview.style.services.GraphViewStyleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGraphViewStyleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COLOR", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stylesheet'", "'for'", "'import'", "'.'", "'*'", "'style'", "','", "'as'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'?.'", "'*.'", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=7;
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
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int RULE_COLOR=4;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
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
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
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
    public static final int RULE_WS=10;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalGraphViewStyleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphViewStyleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphViewStyleParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g"; }



     	private GraphViewStyleGrammarAccess grammarAccess;
     	
        public InternalGraphViewStyleParser(TokenStream input, GraphViewStyleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StyleSheet";	
       	}
       	
       	@Override
       	protected GraphViewStyleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStyleSheet"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:67:1: entryRuleStyleSheet returns [EObject current=null] : iv_ruleStyleSheet= ruleStyleSheet EOF ;
    public final EObject entryRuleStyleSheet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleSheet = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:68:2: (iv_ruleStyleSheet= ruleStyleSheet EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:69:2: iv_ruleStyleSheet= ruleStyleSheet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStyleSheetRule()); 
            }
            pushFollow(FOLLOW_ruleStyleSheet_in_entryRuleStyleSheet75);
            iv_ruleStyleSheet=ruleStyleSheet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStyleSheet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyleSheet85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyleSheet"


    // $ANTLR start "ruleStyleSheet"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:76:1: ruleStyleSheet returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'stylesheet' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) ( (lv_styles_5_0= ruleStyle ) )* ) ;
    public final EObject ruleStyleSheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_styles_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'stylesheet' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) ( (lv_styles_5_0= ruleStyle ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'stylesheet' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) ( (lv_styles_5_0= ruleStyle ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'stylesheet' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) ( (lv_styles_5_0= ruleStyle ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:80:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'stylesheet' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) ( (lv_styles_5_0= ruleStyle ) )*
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStyleSheetAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleStyleSheet131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStyleSheetRule());
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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleStyleSheet144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStyleSheetAccess().getStylesheetKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:102:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:103:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:103:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:104:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStyleSheetAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStyleSheet165);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStyleSheetRule());
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStyleSheet177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStyleSheetAccess().getForKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:124:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:125:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:125:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:126:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getStyleSheetRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStyleSheetAccess().getDiagramMappingDiagramMappingCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStyleSheet200);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:139:2: ( (lv_styles_5_0= ruleStyle ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:140:1: (lv_styles_5_0= ruleStyle )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:140:1: (lv_styles_5_0= ruleStyle )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:141:3: lv_styles_5_0= ruleStyle
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStyleSheetAccess().getStylesStyleParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStyle_in_ruleStyleSheet221);
            	    lv_styles_5_0=ruleStyle();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStyleSheetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"styles",
            	              		lv_styles_5_0, 
            	              		"Style");
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
    // $ANTLR end "ruleStyleSheet"


    // $ANTLR start "entryRuleImport"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:165:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:166:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:167:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport258);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport268); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:174:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:177:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:178:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:178:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:178:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:182:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:183:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:183:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:184:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport326);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:208:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:209:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:210:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard363);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard374); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:217:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:220:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:221:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:221:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:222:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard421);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:232:1: (kw= '.' kw= '*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:233:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildcard440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildcard453); if (state.failed) return current;
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


    // $ANTLR start "entryRuleStyle"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:252:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:253:2: (iv_ruleStyle= ruleStyle EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:254:2: iv_ruleStyle= ruleStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStyleRule()); 
            }
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle495);
            iv_ruleStyle=ruleStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle505); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:261:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )? ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_javaClass_5_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:264:28: ( (otherlv_0= 'style' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:265:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:265:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:265:3: otherlv_0= 'style' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleStyle542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:269:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:270:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:270:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:271:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getStyleRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStyleAccess().getMappingsAbstractMappingCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStyle565);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:284:2: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:284:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleStyle578); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getStyleAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:288:1: ( ( ruleQualifiedName ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:289:1: ( ruleQualifiedName )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:289:1: ( ruleQualifiedName )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:290:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getStyleRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStyleAccess().getMappingsAbstractMappingCrossReference_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleStyle601);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:303:4: (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:303:6: otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleStyle616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getStyleAccess().getAsKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:307:1: ( (lv_javaClass_5_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:308:1: (lv_javaClass_5_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:308:1: (lv_javaClass_5_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:309:3: lv_javaClass_5_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStyleAccess().getJavaClassJvmTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleStyle637);
                    lv_javaClass_5_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"javaClass",
                              		lv_javaClass_5_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:325:4: ( (lv_expression_6_0= ruleXBlockExpression ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==51) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:326:1: (lv_expression_6_0= ruleXBlockExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:326:1: (lv_expression_6_0= ruleXBlockExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:327:3: lv_expression_6_0= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStyleAccess().getExpressionXBlockExpressionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleStyle660);
                    lv_expression_6_0=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStyleRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_6_0, 
                              		"XBlockExpression");
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
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:351:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:352:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:353:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral697);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral707); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:360:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;

        EObject this_XColorLiteral_6 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:363:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:364:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:364:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt7=1;
                }
                break;
            case 62:
            case 63:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
                {
                alt7=3;
                }
                break;
            case 64:
                {
                alt7=4;
                }
                break;
            case RULE_STRING:
                {
                alt7=5;
                }
                break;
            case 65:
                {
                alt7=6;
                }
                break;
            case RULE_COLOR:
                {
                alt7=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:365:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral754);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:375:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral781);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:385:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral808);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:395:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral835);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:405:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral862);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:415:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral889);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:425:5: this_XColorLiteral_6= ruleXColorLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXColorLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXColorLiteral_in_ruleXLiteral916);
                    this_XColorLiteral_6=ruleXColorLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XColorLiteral_6; 
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


    // $ANTLR start "entryRuleXColorLiteral"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:441:1: entryRuleXColorLiteral returns [EObject current=null] : iv_ruleXColorLiteral= ruleXColorLiteral EOF ;
    public final EObject entryRuleXColorLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXColorLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:442:2: (iv_ruleXColorLiteral= ruleXColorLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:443:2: iv_ruleXColorLiteral= ruleXColorLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXColorLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXColorLiteral_in_entryRuleXColorLiteral951);
            iv_ruleXColorLiteral=ruleXColorLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXColorLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXColorLiteral961); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXColorLiteral"


    // $ANTLR start "ruleXColorLiteral"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:450:1: ruleXColorLiteral returns [EObject current=null] : ( (lv_color_0_0= RULE_COLOR ) ) ;
    public final EObject ruleXColorLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_color_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:453:28: ( ( (lv_color_0_0= RULE_COLOR ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:454:1: ( (lv_color_0_0= RULE_COLOR ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:454:1: ( (lv_color_0_0= RULE_COLOR ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:455:1: (lv_color_0_0= RULE_COLOR )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:455:1: (lv_color_0_0= RULE_COLOR )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:456:3: lv_color_0_0= RULE_COLOR
            {
            lv_color_0_0=(Token)match(input,RULE_COLOR,FOLLOW_RULE_COLOR_in_ruleXColorLiteral1002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_color_0_0, grammarAccess.getXColorLiteralAccess().getColorColorTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXColorLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"color",
                      		lv_color_0_0, 
                      		"Color");
              	    
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
    // $ANTLR end "ruleXColorLiteral"


    // $ANTLR start "entryRuleXExpression"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:480:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:481:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:482:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1042);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1052); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:489:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:492:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:494:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1098);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:510:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:511:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:512:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1132);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1142); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:519:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:522:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:523:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:523:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=RULE_COLOR && LA9_1<=RULE_ID)||LA9_1==13||(LA9_1>=15 && LA9_1<=16)||(LA9_1>=18 && LA9_1<=19)||(LA9_1>=21 && LA9_1<=43)||(LA9_1>=45 && LA9_1<=71)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==20) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA9_0>=RULE_COLOR && LA9_0<=RULE_STRING)||LA9_0==13||LA9_0==30||(LA9_0>=33 && LA9_0<=34)||LA9_0==38||LA9_0==41||LA9_0==43||LA9_0==47||LA9_0==49||LA9_0==51||(LA9_0>=55 && LA9_0<=56)||LA9_0==59||(LA9_0>=61 && LA9_0<=68)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:523:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:523:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:523:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:523:3: ()
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:524:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:529:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:530:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:530:1: ( ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:531:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1200);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1216);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:552:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:553:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:553:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:554:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1236);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:571:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:571:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:572:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1266);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:580:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==21) ) {
                        int LA8_1 = input.LA(2);

                        if ( (synpred1_InternalGraphViewStyle()) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:580:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:580:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:580:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:585:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:585:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:585:7: ()
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:586:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:591:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:592:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:592:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:593:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1319);
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

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:606:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:607:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:607:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:608:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1342);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:632:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:633:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:634:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1382);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1393); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:641:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:644:28: (kw= '=' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:646:2: kw= '='
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpSingleAssign1430); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:659:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:660:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:661:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1470);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1481); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:668:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:671:28: (kw= '+=' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:673:2: kw= '+='
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpMultiAssign1518); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:686:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:687:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:688:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1557);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1567); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:695:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:698:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:699:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:699:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:700:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1614);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:708:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred2_InternalGraphViewStyle()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:708:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:708:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:708:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:713:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:713:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:713:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:714:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:719:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:720:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:720:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:721:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1667);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:734:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:735:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:735:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:736:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1690);
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
            	    break loop10;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:760:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:761:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:762:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1729);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1740); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:769:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:772:28: (kw= '||' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:774:2: kw= '||'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpOr1777); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:787:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:788:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:789:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1816);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1826); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:796:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:799:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:800:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:800:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:801:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1873);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:809:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred3_InternalGraphViewStyle()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:809:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:809:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:809:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:814:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:814:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:814:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:815:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:820:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:821:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:821:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:822:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1926);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:835:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:836:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:836:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:837:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1949);
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
            	    break loop11;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:861:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:862:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:863:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1988);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1999); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:870:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:873:28: (kw= '&&' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:875:2: kw= '&&'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpAnd2036); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:888:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:889:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:890:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2075);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2085); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:897:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:900:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:901:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:901:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:902:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2132);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:910:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred4_InternalGraphViewStyle()) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==25) ) {
                    int LA12_3 = input.LA(2);

                    if ( (synpred4_InternalGraphViewStyle()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:910:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:910:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:910:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:915:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:915:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:915:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:916:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:921:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:922:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:922:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:923:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2185);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:936:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:937:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:937:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:938:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2208);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:962:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:963:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:964:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2247);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2258); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:971:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:974:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:975:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:975:1: (kw= '==' | kw= '!=' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:976:2: kw= '=='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpEquality2296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:983:2: kw= '!='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpEquality2315); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:996:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:997:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:998:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2355);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2365); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1008:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1009:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1009:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1010:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2412);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop14:
            do {
                int alt14=3;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred5_InternalGraphViewStyle()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA14_5 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA14_6 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt14=2;
                    }


                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1020:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1020:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1020:6: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1021:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXRelationalExpression2448); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1030:3: ( ( ruleQualifiedName ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1031:1: ( ruleQualifiedName )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1031:1: ( ruleQualifiedName )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1032:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2473);
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1046:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1046:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1046:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1046:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1046:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1051:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1051:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1051:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1052:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1057:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1058:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1058:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1059:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2534);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1072:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1073:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1073:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1074:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2557);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1098:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1099:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1100:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2597);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2608); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1107:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1110:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1111:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1111:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt15=1;
                }
                break;
            case 28:
                {
                alt15=2;
                }
                break;
            case 29:
                {
                alt15=3;
                }
                break;
            case 30:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1112:2: kw= '>='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2646); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1119:2: kw= '<='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1126:2: kw= '>'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1133:2: kw= '<'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare2703); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1146:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1147:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1148:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2743);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2753); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1155:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1158:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1159:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1159:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1160:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2800);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1168:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred7_InternalGraphViewStyle()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==32) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred7_InternalGraphViewStyle()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1168:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1168:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1168:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1173:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1173:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1173:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1174:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1179:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1180:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1180:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1181:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2853);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1194:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1195:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1195:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1196:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2876);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1220:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1221:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1222:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2915);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2926); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1229:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1232:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1233:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1233:1: (kw= '->' | kw= '..' )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1234:2: kw= '->'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1241:2: kw= '..'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2983); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1254:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1255:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1256:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3023);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3033); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1263:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1266:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1267:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1267:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1268:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3080);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1276:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred8_InternalGraphViewStyle()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==34) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred8_InternalGraphViewStyle()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1276:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1276:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1276:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1281:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1281:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1281:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1282:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1287:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1288:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1288:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1289:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3133);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1302:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1303:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1303:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1304:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3156);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1328:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1329:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1330:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3195);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3206); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1337:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1340:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1341:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1341:1: (kw= '+' | kw= '-' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1342:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAdd3244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1349:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd3263); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1362:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1363:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1364:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3303);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3313); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1371:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1374:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1375:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1375:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1376:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3360);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1384:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA20_2 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA20_5 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt20=1;
                    }


                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1384:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1384:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1384:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1389:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1389:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1389:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1390:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1395:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1396:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1396:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1397:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3413);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1410:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1411:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1411:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1412:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3436);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1436:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1437:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1438:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3475);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3486); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1445:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1448:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1449:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1449:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt21=1;
                }
                break;
            case 35:
                {
                alt21=2;
                }
                break;
            case 36:
                {
                alt21=3;
                }
                break;
            case 37:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1450:2: kw= '*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleOpMulti3524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1457:2: kw= '**'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1464:2: kw= '/'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1471:2: kw= '%'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3581); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1484:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1485:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1486:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3621);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3631); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1493:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1496:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1497:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1497:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=33 && LA22_0<=34)||LA22_0==38) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_COLOR && LA22_0<=RULE_ID)||LA22_0==13||LA22_0==30||LA22_0==41||LA22_0==43||LA22_0==47||LA22_0==49||LA22_0==51||(LA22_0>=55 && LA22_0<=56)||LA22_0==59||(LA22_0>=61 && LA22_0<=68)) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1497:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1497:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1497:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1497:3: ()
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1498:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1503:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1504:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1504:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1505:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3689);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1518:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1519:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1519:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1520:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3710);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1538:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3739);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1554:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1555:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1556:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3775);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3786); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1563:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1566:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1567:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1567:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt23=1;
                }
                break;
            case 34:
                {
                alt23=2;
                }
                break;
            case 33:
                {
                alt23=3;
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1568:2: kw= '!'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpUnary3824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1575:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary3843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1582:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary3862); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1595:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1596:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1597:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3902);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3912); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1604:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1607:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1608:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1608:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1609:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3959);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1617:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred10_InternalGraphViewStyle()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1617:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1617:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1617:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1619:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1619:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1619:6: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1620:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXCastedExpression3994); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1629:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1630:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1630:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1631:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4017);
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1655:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1656:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1657:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4055);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4065); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1667:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1668:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1668:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1669:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4112);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1677:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop32:
            do {
                int alt32=3;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred11_InternalGraphViewStyle()) ) {
                        alt32=1;
                    }
                    else if ( (synpred12_InternalGraphViewStyle()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred12_InternalGraphViewStyle()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (synpred12_InternalGraphViewStyle()) ) {
                        alt32=2;
                    }


                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1677:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1677:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1677:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1677:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1677:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1683:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1683:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1683:26: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1684:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXMemberFeatureCall4161); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1693:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1694:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1694:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1695:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4184);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4200);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1716:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1717:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1717:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1718:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4222);
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1735:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1735:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1735:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1735:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1735:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1751:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1751:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1751:8: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1752:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1757:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case 15:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 40:
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
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1757:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleXMemberFeatureCall4308); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1762:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1762:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1763:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1763:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1764:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4332); if (state.failed) return current;
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
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1778:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1778:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1779:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1779:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1780:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4369); if (state.failed) return current;
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1793:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==30) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1793:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleXMemberFeatureCall4398); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1797:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1798:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1798:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1799:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4419);
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

            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1815:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop26:
            	            do {
            	                int alt26=2;
            	                int LA26_0 = input.LA(1);

            	                if ( (LA26_0==18) ) {
            	                    alt26=1;
            	                }


            	                switch (alt26) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1815:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleXMemberFeatureCall4432); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1819:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1820:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1820:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1821:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4453);
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
            	            	    break loop26;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall4467); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1841:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1842:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1842:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1843:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4492);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1856:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1856:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1856:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1856:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1863:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1864:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4526); if (state.failed) return current;
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

            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1877:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt29=3;
            	            alt29 = dfa29.predict(input);
            	            switch (alt29) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1877:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1877:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1877:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1894:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1895:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4611);
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
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1912:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1912:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1912:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1912:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1913:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1913:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1914:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4639);
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

            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1930:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop28:
            	                    do {
            	                        int alt28=2;
            	                        int LA28_0 = input.LA(1);

            	                        if ( (LA28_0==18) ) {
            	                            alt28=1;
            	                        }


            	                        switch (alt28) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1930:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleXMemberFeatureCall4652); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1934:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1935:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1935:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1936:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4673);
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
            	                    	    break loop28;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4690); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1956:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt31=2;
            	    alt31 = dfa31.predict(input);
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1956:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1961:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1962:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4723);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1986:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1987:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1988:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4763);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4773); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1995:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1998:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1999:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1999:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt33=13;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt33=1;
                }
                break;
            case 51:
                {
                alt33=2;
                }
                break;
            case 49:
                {
                alt33=3;
                }
                break;
            case RULE_ID:
            case 30:
            case 59:
                {
                alt33=4;
                }
                break;
            case RULE_COLOR:
            case RULE_INT:
            case RULE_STRING:
            case 43:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt33=5;
                }
                break;
            case 47:
                {
                alt33=6;
                }
                break;
            case 13:
                {
                alt33=7;
                }
                break;
            case 55:
                {
                alt33=8;
                }
                break;
            case 56:
                {
                alt33=9;
                }
                break;
            case 66:
                {
                alt33=10;
                }
                break;
            case 67:
                {
                alt33=11;
                }
                break;
            case 68:
                {
                alt33=12;
                }
                break;
            case 41:
                {
                alt33=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2000:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4820);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2010:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4847);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2020:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4874);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2030:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4901);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2040:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4928);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2050:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4955);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2060:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4982);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2070:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5009);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2080:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5036);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2090:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5063);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2100:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5090);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2110:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5117);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2120:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5144);
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


    // $ANTLR start "entryRuleXClosure"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2136:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2137:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2138:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5179);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5189); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2145:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2148:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2149:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2149:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2149:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2149:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2150:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2159:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2159:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2174:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2174:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2174:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID||LA35_0==41||LA35_0==71) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2174:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2174:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2175:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2175:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2176:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5306);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2192:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==18) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2192:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleXClosure5319); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2196:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2197:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2197:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2198:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5340);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2214:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2215:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2215:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2216:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2229:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2230:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2230:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2231:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5399);
            lv_expression_6_0=ruleXExpressionInClosure();

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
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
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


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2259:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2260:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2261:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5447);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5457); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2268:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2271:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2272:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2272:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2272:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2272:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2273:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2278:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_COLOR && LA38_0<=RULE_ID)||LA38_0==13||LA38_0==30||(LA38_0>=33 && LA38_0<=34)||LA38_0==38||LA38_0==41||LA38_0==43||LA38_0==47||LA38_0==49||LA38_0==51||(LA38_0>=55 && LA38_0<=59)||(LA38_0>=61 && LA38_0<=68)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2278:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2278:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2279:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2279:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2280:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5513);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2296:2: (otherlv_2= ';' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==46) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2296:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXExpressionInClosure5526); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2308:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2309:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2310:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5566);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5576); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2317:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2320:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2321:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2321:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2321:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2321:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2321:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2337:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2337:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2337:7: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2338:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2343:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==41||LA40_0==71) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2343:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2343:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2344:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2344:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2345:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5684);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2361:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==18) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2361:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXShortClosure5697); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2365:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2366:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2366:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2367:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5718);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
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
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2383:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2384:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2384:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2385:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,44,FOLLOW_44_in_ruleXShortClosure5740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2398:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2399:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2399:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2400:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5776);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2424:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2425:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2426:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5812);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5822); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2433:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2436:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2437:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2437:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2437:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleXParenthesizedExpression5859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5881);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXParenthesizedExpression5892); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2462:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2463:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2464:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5928);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5938); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2471:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2474:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2475:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2475:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2475:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2475:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2476:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression5984); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXIfExpression5996); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2489:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2490:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2490:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2491:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6017);
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

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXIfExpression6029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2511:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2512:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2512:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2513:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6050);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2529:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred18_InternalGraphViewStyle()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2529:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2529:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2529:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression6071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2534:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2535:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2535:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2536:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6093);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2560:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2561:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2562:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6131);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6141); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2569:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2572:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2573:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2573:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2573:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2573:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2574:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2583:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==50) && (synpred19_InternalGraphViewStyle())) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2583:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2588:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2588:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2588:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2589:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2589:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2590:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6228);
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

                    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2610:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2611:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2611:1: (lv_switch_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2612:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6264);
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

            otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2632:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==41||LA43_0==50||LA43_0==54||LA43_0==71) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2633:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2633:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2634:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6297);
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
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2650:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==52) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2650:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6311); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2658:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2659:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2659:1: (lv_default_9_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2660:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6344);
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

            otherlv_10=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6358); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2688:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2689:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2690:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6394);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6404); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2697:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2700:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2701:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2701:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2701:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2701:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==41||LA45_0==71) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2702:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2702:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2703:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6450);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2719:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==54) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2719:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXCasePart6464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2723:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2724:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2724:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2725:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6485);
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

            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleXCasePart6499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2745:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2746:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2746:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2747:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6520);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2771:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2772:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2773:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6556);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6566); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2780:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2783:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2784:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2784:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2784:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2784:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2785:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleXForLoopExpression6612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXForLoopExpression6624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2798:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2799:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2799:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2800:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6645);
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

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXForLoopExpression6657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2820:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2821:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2821:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2822:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6678);
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

            otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleXForLoopExpression6690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2842:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2843:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2843:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2844:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6711);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2868:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2869:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2870:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6747);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6757); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2877:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2880:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2881:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2881:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2881:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2881:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2882:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXWhileExpression6803); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXWhileExpression6815); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2895:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2896:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2896:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2897:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6836);
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

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXWhileExpression6848); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2917:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2918:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2918:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2919:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6869);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2943:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2944:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2945:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6905);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6915); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2952:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2955:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2956:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2956:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2956:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2956:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2957:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXDoWhileExpression6961); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2966:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2967:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2967:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2968:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6982);
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

            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXDoWhileExpression6994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXDoWhileExpression7006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2992:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2993:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2993:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2994:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7027);
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

            otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleXDoWhileExpression7039); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3022:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3023:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3024:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7075);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7085); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3031:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3034:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3035:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3035:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3035:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3035:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3036:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXBlockExpression7131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3045:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_COLOR && LA48_0<=RULE_ID)||LA48_0==13||LA48_0==30||(LA48_0>=33 && LA48_0<=34)||LA48_0==38||LA48_0==41||LA48_0==43||LA48_0==47||LA48_0==49||LA48_0==51||(LA48_0>=55 && LA48_0<=59)||(LA48_0>=61 && LA48_0<=68)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3045:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3045:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3046:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3046:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3047:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7153);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3063:2: (otherlv_3= ';' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==46) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3063:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleXBlockExpression7166); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression7182); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3079:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3080:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3081:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7218);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7228); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3088:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3091:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3092:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3092:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=57 && LA49_0<=58)) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=RULE_COLOR && LA49_0<=RULE_ID)||LA49_0==13||LA49_0==30||(LA49_0>=33 && LA49_0<=34)||LA49_0==38||LA49_0==41||LA49_0==43||LA49_0==47||LA49_0==49||LA49_0==51||(LA49_0>=55 && LA49_0<=56)||LA49_0==59||(LA49_0>=61 && LA49_0<=68)) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3093:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7275);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3103:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7302);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3119:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3120:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3121:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7337);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7347); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3128:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3131:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3132:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3132:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3132:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3132:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3133:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3138:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==57) ) {
                alt50=1;
            }
            else if ( (LA50_0==58) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3138:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3138:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3139:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3139:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3140:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,57,FOLLOW_57_in_ruleXVariableDeclaration7400); if (state.failed) return current;
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3154:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleXVariableDeclaration7431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3158:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred20_InternalGraphViewStyle()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==41) && (synpred20_InternalGraphViewStyle())) {
                alt51=1;
            }
            else if ( (LA51_0==71) && (synpred20_InternalGraphViewStyle())) {
                alt51=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3158:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3158:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3158:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3166:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3166:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3166:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3167:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3167:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3168:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7479);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3184:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3185:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3185:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3186:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7500);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3203:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3203:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3204:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3204:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3205:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7529);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3221:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==20) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3221:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleXVariableDeclaration7543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3225:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3226:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3226:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3227:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7564);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3251:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3252:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3253:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7602);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7612); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3260:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3263:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3264:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3264:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3264:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3264:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==RULE_ID||LA53_1==15||LA53_1==30||LA53_1==43) ) {
                    alt53=1;
                }
            }
            else if ( (LA53_0==41||LA53_0==71) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3265:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3265:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3266:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7658);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3282:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3283:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3283:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3284:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7680);
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


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3308:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3309:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3310:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7716);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7726); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3317:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3320:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3321:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3321:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3321:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3321:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3322:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3322:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3323:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7772);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3339:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3340:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3340:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3341:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7793);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
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
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3365:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3366:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3367:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7829);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7839); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3374:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3377:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3378:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3378:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3378:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3378:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3379:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3384:2: ( ( ruleStaticQualifier ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==60) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3385:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3385:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3386:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7896);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3399:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==30) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3399:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleXFeatureCall7910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3403:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3404:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3404:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3405:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7931);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3421:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==18) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3421:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXFeatureCall7944); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3425:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3426:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3426:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3427:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7965);
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleXFeatureCall7979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3447:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3448:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3448:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3449:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8004);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3462:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3462:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3462:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3462:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3469:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3470:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall8038); if (state.failed) return current;
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3483:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt58=3;
                    alt58 = dfa58.predict(input);
                    switch (alt58) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3483:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3483:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3483:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3500:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3501:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8123);
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
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3518:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3518:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3518:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3518:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3519:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3519:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3520:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8151);
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

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3536:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==18) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3536:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleXFeatureCall8164); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3540:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3541:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3541:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3542:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8185);
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
                            	    break loop57;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall8202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3562:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3562:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3567:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3568:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8235);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3592:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3593:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3594:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8273);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8284); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3601:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3604:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3605:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3605:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==59) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3606:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8331);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3618:2: kw= 'super'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleIdOrSuper8355); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3631:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3632:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3633:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8396);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8407); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3640:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3643:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3644:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3644:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    int LA62_2 = input.LA(2);

                    if ( (LA62_2==60) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3645:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8454);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleStaticQualifier8472); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3669:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3670:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3671:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8513);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8523); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3678:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3681:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3682:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3682:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3682:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3682:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3683:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXConstructorCall8569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3692:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3693:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3693:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3694:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8592);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3707:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==30) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3707:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleXConstructorCall8605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3711:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3712:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3712:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3713:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8626);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3729:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==18) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3729:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleXConstructorCall8639); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3733:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3734:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3734:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3735:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8660);
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

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleXConstructorCall8674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt66=3;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3776:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3777:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8760);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3794:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3794:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3794:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3794:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3795:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3795:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3796:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8788);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3812:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==18) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3812:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleXConstructorCall8801); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3816:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3817:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3817:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3818:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8822);
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

            otherlv_13=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall8839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3838:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3838:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3843:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3844:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8870);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3868:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3869:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3870:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8907);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8917); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3877:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3880:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3881:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3881:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3881:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3881:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3882:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3887:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==62) ) {
                alt68=1;
            }
            else if ( (LA68_0==63) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3887:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXBooleanLiteral8964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3892:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3892:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3893:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3893:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3894:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,63,FOLLOW_63_in_ruleXBooleanLiteral8988); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3915:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3916:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3917:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9038);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9048); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3924:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3927:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3928:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3928:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3928:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3928:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3929:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXNullLiteral9094); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3946:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3947:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3948:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9130);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9140); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3955:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3958:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3959:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3959:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3959:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3959:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3960:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3965:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3966:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3966:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3967:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9191); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3991:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3992:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3993:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9232);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9242); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4000:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4003:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4004:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4004:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4004:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4004:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4005:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4010:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4011:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4011:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4012:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9293); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4036:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4037:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4038:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9334);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9344); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4045:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4048:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4049:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4049:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4049:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4049:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4050:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXTypeLiteral9390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXTypeLiteral9402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4063:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4064:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4064:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4065:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9425);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXTypeLiteral9437); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4090:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4091:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4092:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9473);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9483); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4099:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4102:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4103:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4103:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4103:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4103:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4104:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXThrowExpression9529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4113:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4114:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4114:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4115:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9550);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4139:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4140:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4141:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9586);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9596); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4148:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4151:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4152:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4152:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4152:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4152:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4153:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXReturnExpression9642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4162:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4162:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4167:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4168:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9673);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4192:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4193:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4194:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9710);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9720); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4201:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4204:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4205:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4205:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4205:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4205:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4206:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTryCatchFinallyExpression9766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4215:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4216:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4216:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4217:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9787);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==70) ) {
                alt72=1;
            }
            else if ( (LA72_0==69) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt70=0;
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==70) ) {
                            int LA70_2 = input.LA(2);

                            if ( (synpred27_InternalGraphViewStyle()) ) {
                                alt70=1;
                            }


                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4235:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4236:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9817);
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
                    	    if ( cnt70 >= 1 ) break loop70;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(70, input);
                                throw eee;
                        }
                        cnt70++;
                    } while (true);

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4252:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==69) ) {
                        int LA71_1 = input.LA(2);

                        if ( (synpred28_InternalGraphViewStyle()) ) {
                            alt71=1;
                        }
                    }
                    switch (alt71) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4252:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4252:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4252:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9839); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4257:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4258:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4258:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4259:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9861);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4276:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4276:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4276:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4280:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4281:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4281:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4282:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9904);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4306:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4307:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4308:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9942);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9952); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4315:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4318:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4319:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4319:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4319:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4319:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4319:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleXCatchClause9997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleXCatchClause10010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4328:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4329:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4329:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4330:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10031);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

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
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXCatchClause10043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4350:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4351:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4351:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4352:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10064);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4376:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4377:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4378:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10101);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10112); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4385:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4388:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4389:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4389:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4390:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10159);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4400:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==15) ) {
                    int LA73_2 = input.LA(2);

                    if ( (LA73_2==RULE_ID) ) {
                        int LA73_3 = input.LA(3);

                        if ( (synpred30_InternalGraphViewStyle()) ) {
                            alt73=1;
                        }


                    }


                }


                switch (alt73) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4400:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4400:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4400:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName10187); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10210);
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
            	    break loop73;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4427:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4428:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4429:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10257);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10267); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4436:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4439:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4440:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4440:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            else if ( (LA75_0==41||LA75_0==71) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4440:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4440:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4441:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10315);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4449:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==43) ) {
                            int LA74_2 = input.LA(2);

                            if ( (LA74_2==45) ) {
                                int LA74_3 = input.LA(3);

                                if ( (synpred31_InternalGraphViewStyle()) ) {
                                    alt74=1;
                                }


                            }


                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4449:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4452:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4452:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4452:6: ()
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4453:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleJvmTypeReference10353); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleJvmTypeReference10365); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4468:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10397);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4484:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4485:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4486:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10432);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10442); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4493:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4496:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4497:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4497:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4497:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4497:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==41) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4497:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef10480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4501:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4502:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4502:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4503:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10501);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4519:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==18) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4519:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXFunctionTypeRef10514); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4523:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4524:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4524:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4525:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10535);
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
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXFunctionTypeRef10549); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleXFunctionTypeRef10563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4549:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4550:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4550:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4551:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10584);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4575:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4576:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4577:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10620);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10630); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4584:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4587:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4588:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4588:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4588:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4588:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4589:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4589:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4590:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10678);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4603:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4603:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4603:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4603:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleJvmParameterizedTypeReference10699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4608:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4609:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4609:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4610:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10721);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4626:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==18) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4626:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleJvmParameterizedTypeReference10734); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4630:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4631:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4631:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4632:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10755);
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
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleJvmParameterizedTypeReference10769); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4660:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4661:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4662:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10807);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10817); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4669:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4672:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4673:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4673:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID||LA80_0==41||LA80_0==71) ) {
                alt80=1;
            }
            else if ( (LA80_0==72) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4674:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10864);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4684:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10891);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4700:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4701:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4702:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10926);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10936); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4709:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4712:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4713:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4713:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4713:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4713:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4714:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleJvmWildcardTypeReference10982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4723:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt81=3;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==73) ) {
                alt81=1;
            }
            else if ( (LA81_0==59) ) {
                alt81=2;
            }
            switch (alt81) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4723:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4723:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4724:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4724:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4725:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11004);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4742:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4742:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4743:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4743:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4744:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11031);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4768:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4769:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4770:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11069);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11079); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4777:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4780:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4781:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4781:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4781:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleJvmUpperBound11116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4785:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4786:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4786:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4787:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11137);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4811:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4812:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4813:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11173);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11183); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4820:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4823:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4824:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4824:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4824:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleJvmUpperBoundAnded11220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4828:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4829:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4829:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4830:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11241);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4854:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4855:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4856:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11277);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11287); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4863:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4866:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4867:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4867:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4867:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleJvmLowerBound11324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4871:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4872:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4872:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4873:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11345);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4899:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4900:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4901:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11384);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11395); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4908:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4911:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4912:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11434); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalGraphViewStyle
    public final void synpred1_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:580:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:580:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:580:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:580:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:580:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:581:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:581:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:582:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:582:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:583:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewStyle1287);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalGraphViewStyle

    // $ANTLR start synpred2_InternalGraphViewStyle
    public final void synpred2_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:708:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:708:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:708:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:708:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:708:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:709:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:709:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:710:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:710:1: ( ruleOpOr )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:711:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewStyle1635);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalGraphViewStyle

    // $ANTLR start synpred3_InternalGraphViewStyle
    public final void synpred3_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:809:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:809:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:809:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:809:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:809:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:810:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:810:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:811:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:811:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:812:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewStyle1894);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalGraphViewStyle

    // $ANTLR start synpred4_InternalGraphViewStyle
    public final void synpred4_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:910:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:910:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:910:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:910:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:910:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:911:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:911:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:912:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:912:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:913:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewStyle2153);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalGraphViewStyle

    // $ANTLR start synpred5_InternalGraphViewStyle
    public final void synpred5_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1019:1: 
        {
        }

        match(input,26,FOLLOW_26_in_synpred5_InternalGraphViewStyle2429); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGraphViewStyle

    // $ANTLR start synpred6_InternalGraphViewStyle
    public final void synpred6_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1046:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1046:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1046:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1046:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1046:10: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1047:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1047:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1048:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1048:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1049:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewStyle2502);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalGraphViewStyle

    // $ANTLR start synpred7_InternalGraphViewStyle
    public final void synpred7_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1168:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1168:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1168:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1168:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1168:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1169:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1169:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1170:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1170:1: ( ruleOpOther )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1171:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewStyle2821);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalGraphViewStyle

    // $ANTLR start synpred8_InternalGraphViewStyle
    public final void synpred8_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1276:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1276:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1276:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1276:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1276:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1277:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1277:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1278:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1278:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1279:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewStyle3101);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalGraphViewStyle

    // $ANTLR start synpred9_InternalGraphViewStyle
    public final void synpred9_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1384:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1384:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1384:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1384:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1384:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1385:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1385:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1386:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1386:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1387:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewStyle3381);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalGraphViewStyle

    // $ANTLR start synpred10_InternalGraphViewStyle
    public final void synpred10_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1617:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1617:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1617:4: ( () 'as' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1617:5: () 'as'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1617:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1618:1: 
        {
        }

        match(input,19,FOLLOW_19_in_synpred10_InternalGraphViewStyle3975); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalGraphViewStyle

    // $ANTLR start synpred11_InternalGraphViewStyle
    public final void synpred11_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1677:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1677:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1677:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1677:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1677:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1678:1: 
        {
        }

        match(input,15,FOLLOW_15_in_synpred11_InternalGraphViewStyle4129); if (state.failed) return ;
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1679:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1681:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalGraphViewStyle4138);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewStyle4144);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalGraphViewStyle

    // $ANTLR start synpred12_InternalGraphViewStyle
    public final void synpred12_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1735:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1735:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1735:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1735:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1735:10: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1736:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1736:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt82=3;
        switch ( input.LA(1) ) {
        case 15:
            {
            alt82=1;
            }
            break;
        case 39:
            {
            alt82=2;
            }
            break;
        case 40:
            {
            alt82=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 82, 0, input);

            throw nvae;
        }

        switch (alt82) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1736:4: '.'
                {
                match(input,15,FOLLOW_15_in_synpred12_InternalGraphViewStyle4247); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1739:1: ( '?.' )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1739:1: ( '?.' )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1740:2: '?.'
                {
                match(input,39,FOLLOW_39_in_synpred12_InternalGraphViewStyle4261); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1745:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1745:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1746:1: ( '*.' )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1746:1: ( '*.' )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1747:2: '*.'
                {
                match(input,40,FOLLOW_40_in_synpred12_InternalGraphViewStyle4281); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalGraphViewStyle

    // $ANTLR start synpred13_InternalGraphViewStyle
    public final void synpred13_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1856:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1857:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1857:1: ( '(' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1858:2: '('
        {
        match(input,41,FOLLOW_41_in_synpred13_InternalGraphViewStyle4508); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGraphViewStyle

    // $ANTLR start synpred14_InternalGraphViewStyle
    public final void synpred14_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1877:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1877:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1877:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1877:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1877:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1878:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1878:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==RULE_ID||LA84_0==41||LA84_0==71) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1878:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1878:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1879:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1879:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1880:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4560);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1882:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop83:
                do {
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==18) ) {
                        alt83=1;
                    }


                    switch (alt83) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1882:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,18,FOLLOW_18_in_synpred14_InternalGraphViewStyle4567); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1883:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1884:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1884:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1885:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4574);
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

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1887:6: ( ( '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1888:1: ( '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1888:1: ( '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1889:2: '|'
        {
        match(input,44,FOLLOW_44_in_synpred14_InternalGraphViewStyle4588); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalGraphViewStyle

    // $ANTLR start synpred15_InternalGraphViewStyle
    public final void synpred15_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1956:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1957:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1957:1: ( ruleXClosure )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1958:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalGraphViewStyle4706);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalGraphViewStyle

    // $ANTLR start synpred16_InternalGraphViewStyle
    public final void synpred16_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2159:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2159:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2159:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2159:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2159:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( (LA86_0==RULE_ID||LA86_0==41||LA86_0==71) ) {
            alt86=1;
        }
        switch (alt86) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2159:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2159:5: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2160:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2160:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2161:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGraphViewStyle5252);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2163:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop85:
                do {
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==18) ) {
                        alt85=1;
                    }


                    switch (alt85) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2163:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,18,FOLLOW_18_in_synpred16_InternalGraphViewStyle5259); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2164:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2165:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2165:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2166:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGraphViewStyle5266);
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

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2168:6: ( ( '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2169:1: ( '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2169:1: ( '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2170:2: '|'
        {
        match(input,44,FOLLOW_44_in_synpred16_InternalGraphViewStyle5280); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalGraphViewStyle

    // $ANTLR start synpred18_InternalGraphViewStyle
    public final void synpred18_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2529:4: ( 'else' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2529:6: 'else'
        {
        match(input,48,FOLLOW_48_in_synpred18_InternalGraphViewStyle6063); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalGraphViewStyle

    // $ANTLR start synpred19_InternalGraphViewStyle
    public final void synpred19_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2583:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2583:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2583:3: ( ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2583:4: ( ( ruleValidID ) ) ':'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2583:4: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2584:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2584:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2585:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalGraphViewStyle6203);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,50,FOLLOW_50_in_synpred19_InternalGraphViewStyle6209); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalGraphViewStyle

    // $ANTLR start synpred20_InternalGraphViewStyle
    public final void synpred20_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3158:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3158:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3158:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3158:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3158:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3159:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3159:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3160:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalGraphViewStyle7449);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3162:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3163:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3163:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3164:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalGraphViewStyle7458);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalGraphViewStyle

    // $ANTLR start synpred21_InternalGraphViewStyle
    public final void synpred21_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3462:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3463:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3463:1: ( '(' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3464:2: '('
        {
        match(input,41,FOLLOW_41_in_synpred21_InternalGraphViewStyle8020); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalGraphViewStyle

    // $ANTLR start synpred22_InternalGraphViewStyle
    public final void synpred22_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3483:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3483:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3483:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3483:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3483:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3484:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3484:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==41||LA90_0==71) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3484:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3484:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3485:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3485:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3486:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalGraphViewStyle8072);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3488:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==18) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3488:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,18,FOLLOW_18_in_synpred22_InternalGraphViewStyle8079); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3489:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3490:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3490:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3491:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalGraphViewStyle8086);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop89;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3493:6: ( ( '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3494:1: ( '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3494:1: ( '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3495:2: '|'
        {
        match(input,44,FOLLOW_44_in_synpred22_InternalGraphViewStyle8100); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalGraphViewStyle

    // $ANTLR start synpred23_InternalGraphViewStyle
    public final void synpred23_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3562:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3563:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3563:1: ( ruleXClosure )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3564:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalGraphViewStyle8218);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalGraphViewStyle

    // $ANTLR start synpred24_InternalGraphViewStyle
    public final void synpred24_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3760:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3760:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt92=2;
        int LA92_0 = input.LA(1);

        if ( (LA92_0==RULE_ID||LA92_0==41||LA92_0==71) ) {
            alt92=1;
        }
        switch (alt92) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3760:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3760:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3761:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3761:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3762:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalGraphViewStyle8709);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3764:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop91:
                do {
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==18) ) {
                        alt91=1;
                    }


                    switch (alt91) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3764:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,18,FOLLOW_18_in_synpred24_InternalGraphViewStyle8716); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3765:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3766:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3766:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3767:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalGraphViewStyle8723);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop91;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3769:6: ( ( '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3770:1: ( '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3770:1: ( '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3771:2: '|'
        {
        match(input,44,FOLLOW_44_in_synpred24_InternalGraphViewStyle8737); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalGraphViewStyle

    // $ANTLR start synpred25_InternalGraphViewStyle
    public final void synpred25_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3838:2: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3839:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3839:1: ( ruleXClosure )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3840:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalGraphViewStyle8853);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalGraphViewStyle

    // $ANTLR start synpred26_InternalGraphViewStyle
    public final void synpred26_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4162:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4163:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4163:1: ( ruleXExpression )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4164:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalGraphViewStyle9656);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalGraphViewStyle

    // $ANTLR start synpred27_InternalGraphViewStyle
    public final void synpred27_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:5: ( 'catch' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:7: 'catch'
        {
        match(input,70,FOLLOW_70_in_synpred27_InternalGraphViewStyle9801); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalGraphViewStyle

    // $ANTLR start synpred28_InternalGraphViewStyle
    public final void synpred28_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4252:5: ( 'finally' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4252:7: 'finally'
        {
        match(input,69,FOLLOW_69_in_synpred28_InternalGraphViewStyle9831); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalGraphViewStyle

    // $ANTLR start synpred30_InternalGraphViewStyle
    public final void synpred30_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4400:3: ( '.' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4401:2: '.'
        {
        match(input,15,FOLLOW_15_in_synpred30_InternalGraphViewStyle10178); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalGraphViewStyle

    // $ANTLR start synpred31_InternalGraphViewStyle
    public final void synpred31_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4449:2: ( ( () '[' ']' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4449:3: ( () '[' ']' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4449:3: ( () '[' ']' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4449:4: () '[' ']'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4449:4: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4450:1: 
        {
        }

        match(input,43,FOLLOW_43_in_synpred31_InternalGraphViewStyle10330); if (state.failed) return ;
        match(input,45,FOLLOW_45_in_synpred31_InternalGraphViewStyle10334); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalGraphViewStyle

    // $ANTLR start synpred32_InternalGraphViewStyle
    public final void synpred32_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4603:4: ( '<' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4603:6: '<'
        {
        match(input,30,FOLLOW_30_in_synpred32_InternalGraphViewStyle10691); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalGraphViewStyle

    // Delegated rules

    public final boolean synpred21_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalGraphViewStyle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA79 dfa79 = new DFA79(this);
    static final String DFA30_eotS =
        "\75\uffff";
    static final String DFA30_eofS =
        "\1\2\74\uffff";
    static final String DFA30_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA30_maxS =
        "\1\107\1\0\73\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA30_transitionS = {
            "\4\2\5\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\24\2\1\1\2"+
            "\2\1\uffff\17\2\1\uffff\13\2",
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
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1856:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\35\uffff";
    static final String DFA29_eofS =
        "\35\uffff";
    static final String DFA29_minS =
        "\1\4\2\0\32\uffff";
    static final String DFA29_maxS =
        "\1\107\2\0\32\uffff";
    static final String DFA29_acceptS =
        "\3\uffff\2\1\1\2\26\uffff\1\3";
    static final String DFA29_specialS =
        "\1\0\1\1\1\2\32\uffff}>";
    static final String[] DFA29_transitionS = {
            "\3\5\1\1\5\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\2"+
            "\uffff\1\2\1\34\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\2\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1877:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_0==RULE_ID) ) {s = 1;}

                        else if ( (LA29_0==41) ) {s = 2;}

                        else if ( (LA29_0==71) && (synpred14_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA29_0==44) && (synpred14_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA29_0>=RULE_COLOR && LA29_0<=RULE_STRING)||LA29_0==13||LA29_0==30||(LA29_0>=33 && LA29_0<=34)||LA29_0==38||LA29_0==43||LA29_0==47||LA29_0==49||LA29_0==51||(LA29_0>=55 && LA29_0<=56)||LA29_0==59||(LA29_0>=61 && LA29_0<=68)) ) {s = 5;}

                        else if ( (LA29_0==42) ) {s = 28;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\75\uffff";
    static final String DFA31_eofS =
        "\1\2\74\uffff";
    static final String DFA31_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA31_maxS =
        "\1\107\1\0\73\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA31_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA31_transitionS = {
            "\4\2\5\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\26\2\1\1\1"+
            "\uffff\17\2\1\uffff\13\2",
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
            return "1956:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_1);
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
    static final String DFA36_eotS =
        "\37\uffff";
    static final String DFA36_eofS =
        "\37\uffff";
    static final String DFA36_minS =
        "\1\4\2\0\34\uffff";
    static final String DFA36_maxS =
        "\1\107\2\0\34\uffff";
    static final String DFA36_acceptS =
        "\3\uffff\2\1\1\2\31\uffff";
    static final String DFA36_specialS =
        "\1\0\1\1\1\2\34\uffff}>";
    static final String[] DFA36_transitionS = {
            "\3\5\1\1\5\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\2"+
            "\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\5\5\1\uffff\10\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2159:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_0 = input.LA(1);

                         
                        int index36_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA36_0==RULE_ID) ) {s = 1;}

                        else if ( (LA36_0==41) ) {s = 2;}

                        else if ( (LA36_0==71) && (synpred16_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA36_0==44) && (synpred16_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA36_0>=RULE_COLOR && LA36_0<=RULE_STRING)||LA36_0==13||LA36_0==30||(LA36_0>=33 && LA36_0<=34)||LA36_0==38||LA36_0==43||LA36_0==45||LA36_0==47||LA36_0==49||LA36_0==51||(LA36_0>=55 && LA36_0<=59)||(LA36_0>=61 && LA36_0<=68)) ) {s = 5;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\75\uffff";
    static final String DFA59_eofS =
        "\1\2\74\uffff";
    static final String DFA59_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA59_maxS =
        "\1\107\1\0\73\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA59_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA59_transitionS = {
            "\4\2\5\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\24\2\1\1\2"+
            "\2\1\uffff\17\2\1\uffff\13\2",
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
            return "3462:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index59_1);
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
    static final String DFA58_eotS =
        "\35\uffff";
    static final String DFA58_eofS =
        "\35\uffff";
    static final String DFA58_minS =
        "\1\4\2\0\32\uffff";
    static final String DFA58_maxS =
        "\1\107\2\0\32\uffff";
    static final String DFA58_acceptS =
        "\3\uffff\2\1\1\2\26\uffff\1\3";
    static final String DFA58_specialS =
        "\1\0\1\1\1\2\32\uffff}>";
    static final String[] DFA58_transitionS = {
            "\3\5\1\1\5\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\2"+
            "\uffff\1\2\1\34\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\2\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "3483:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_0 = input.LA(1);

                         
                        int index58_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA58_0==RULE_ID) ) {s = 1;}

                        else if ( (LA58_0==41) ) {s = 2;}

                        else if ( (LA58_0==71) && (synpred22_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA58_0==44) && (synpred22_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA58_0>=RULE_COLOR && LA58_0<=RULE_STRING)||LA58_0==13||LA58_0==30||(LA58_0>=33 && LA58_0<=34)||LA58_0==38||LA58_0==43||LA58_0==47||LA58_0==49||LA58_0==51||(LA58_0>=55 && LA58_0<=56)||LA58_0==59||(LA58_0>=61 && LA58_0<=68)) ) {s = 5;}

                        else if ( (LA58_0==42) ) {s = 28;}

                         
                        input.seek(index58_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index58_2);
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
    static final String DFA60_eotS =
        "\75\uffff";
    static final String DFA60_eofS =
        "\1\2\74\uffff";
    static final String DFA60_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA60_maxS =
        "\1\107\1\0\73\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA60_transitionS = {
            "\4\2\5\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\26\2\1\1\1"+
            "\uffff\17\2\1\uffff\13\2",
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
            return "3562:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred23_InternalGraphViewStyle()) ) {s = 60;}

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
    static final String DFA66_eotS =
        "\35\uffff";
    static final String DFA66_eofS =
        "\35\uffff";
    static final String DFA66_minS =
        "\1\4\2\0\32\uffff";
    static final String DFA66_maxS =
        "\1\107\2\0\32\uffff";
    static final String DFA66_acceptS =
        "\3\uffff\2\1\1\2\26\uffff\1\3";
    static final String DFA66_specialS =
        "\1\0\1\1\1\2\32\uffff}>";
    static final String[] DFA66_transitionS = {
            "\3\5\1\1\5\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\2"+
            "\uffff\1\2\1\34\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\2\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "3759:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA66_0==41) ) {s = 2;}

                        else if ( (LA66_0==71) && (synpred24_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA66_0==44) && (synpred24_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA66_0>=RULE_COLOR && LA66_0<=RULE_STRING)||LA66_0==13||LA66_0==30||(LA66_0>=33 && LA66_0<=34)||LA66_0==38||LA66_0==43||LA66_0==47||LA66_0==49||LA66_0==51||(LA66_0>=55 && LA66_0<=56)||LA66_0==59||(LA66_0>=61 && LA66_0<=68)) ) {s = 5;}

                        else if ( (LA66_0==42) ) {s = 28;}

                         
                        input.seek(index66_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalGraphViewStyle()) ) {s = 4;}

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
    static final String DFA67_eotS =
        "\75\uffff";
    static final String DFA67_eofS =
        "\1\2\74\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA67_maxS =
        "\1\107\1\0\73\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA67_transitionS = {
            "\4\2\5\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\26\2\1\1\1"+
            "\uffff\17\2\1\uffff\13\2",
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
            return "3838:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred25_InternalGraphViewStyle()) ) {s = 60;}

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
    static final String DFA69_eotS =
        "\75\uffff";
    static final String DFA69_eofS =
        "\1\32\74\uffff";
    static final String DFA69_minS =
        "\1\4\31\0\43\uffff";
    static final String DFA69_maxS =
        "\1\107\31\0\43\uffff";
    static final String DFA69_acceptS =
        "\32\uffff\1\2\41\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\43"+
        "\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\21\1\15\1\17\1\1\5\uffff\1\23\1\uffff\2\32\1\uffff\2\32\1"+
            "\uffff\11\32\1\10\2\32\1\4\1\3\3\32\1\2\2\32\1\31\1\32\1\12"+
            "\1\uffff\2\32\1\22\1\32\1\7\1\32\1\6\3\32\1\24\1\25\2\32\1\11"+
            "\1\uffff\1\5\1\13\1\14\1\16\1\20\1\26\1\27\1\30\3\32",
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
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "4162:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_3 = input.LA(1);

                         
                        int index69_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA69_4 = input.LA(1);

                         
                        int index69_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA69_5 = input.LA(1);

                         
                        int index69_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA69_6 = input.LA(1);

                         
                        int index69_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA69_7 = input.LA(1);

                         
                        int index69_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA69_8 = input.LA(1);

                         
                        int index69_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA69_9 = input.LA(1);

                         
                        int index69_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA69_10 = input.LA(1);

                         
                        int index69_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA69_11 = input.LA(1);

                         
                        int index69_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA69_12 = input.LA(1);

                         
                        int index69_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA69_13 = input.LA(1);

                         
                        int index69_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA69_14 = input.LA(1);

                         
                        int index69_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA69_15 = input.LA(1);

                         
                        int index69_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA69_16 = input.LA(1);

                         
                        int index69_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA69_17 = input.LA(1);

                         
                        int index69_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA69_18 = input.LA(1);

                         
                        int index69_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA69_19 = input.LA(1);

                         
                        int index69_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA69_20 = input.LA(1);

                         
                        int index69_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA69_21 = input.LA(1);

                         
                        int index69_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA69_22 = input.LA(1);

                         
                        int index69_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA69_23 = input.LA(1);

                         
                        int index69_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA69_24 = input.LA(1);

                         
                        int index69_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA69_25 = input.LA(1);

                         
                        int index69_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index69_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\76\uffff";
    static final String DFA79_eofS =
        "\1\2\75\uffff";
    static final String DFA79_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA79_maxS =
        "\1\107\1\0\74\uffff";
    static final String DFA79_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA79_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA79_transitionS = {
            "\4\2\5\uffff\1\2\1\uffff\5\2\1\uffff\11\2\1\1\15\2\1\uffff\17"+
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
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "4603:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalGraphViewStyle()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleStyleSheet_in_entryRuleStyleSheet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyleSheet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleStyleSheet131 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleStyleSheet144 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyleSheet165 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStyleSheet177 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyleSheet200 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleStyleSheet221 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport305 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard421 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildcard440 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildcard453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStyle542 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyle565 = new BitSet(new long[]{0x00080000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleStyle578 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyle601 = new BitSet(new long[]{0x00080000000C0002L});
    public static final BitSet FOLLOW_19_in_ruleStyle616 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleStyle637 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleStyle660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXColorLiteral_in_ruleXLiteral916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXColorLiteral_in_entryRuleXColorLiteral951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXColorLiteral961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLOR_in_ruleXColorLiteral1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1200 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1216 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1266 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1319 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpSingleAssign1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpMultiAssign1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1614 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1667 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1690 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpOr1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1873 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1926 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1949 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpAnd2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2132 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2185 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2208 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpEquality2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpEquality2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2412 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_26_in_ruleXRelationalExpression2448 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2473 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2534 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2557 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2800 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2853 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2876 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3080 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3133 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3156 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAdd3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3360 = new BitSet(new long[]{0x0000003800010002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3413 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3436 = new BitSet(new long[]{0x0000003800010002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpMulti3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3689 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpUnary3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3959 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXCastedExpression3994 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4017 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4112 = new BitSet(new long[]{0x0000018000008002L});
    public static final BitSet FOLLOW_15_in_ruleXMemberFeatureCall4161 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4184 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4200 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4222 = new BitSet(new long[]{0x0000018000008002L});
    public static final BitSet FOLLOW_15_in_ruleXMemberFeatureCall4308 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4332 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4369 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_30_in_ruleXMemberFeatureCall4398 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4419 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_18_in_ruleXMemberFeatureCall4432 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4453 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall4467 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4492 = new BitSet(new long[]{0x00000B8000008002L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4526 = new BitSet(new long[]{0xE98A9E46400020F0L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4611 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4639 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_18_in_ruleXMemberFeatureCall4652 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4673 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4690 = new BitSet(new long[]{0x0000098000008002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4723 = new BitSet(new long[]{0x0000018000008002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5235 = new BitSet(new long[]{0xEF8ABA46400020F0L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5306 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_18_in_ruleXClosure5319 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5340 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5362 = new BitSet(new long[]{0xEF8AAA46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5399 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5513 = new BitSet(new long[]{0xEF8ACA46400020F2L,0x000000000000001FL});
    public static final BitSet FOLLOW_46_in_ruleXExpressionInClosure5526 = new BitSet(new long[]{0xEF8A8A46400020F2L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5684 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_18_in_ruleXShortClosure5697 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5718 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_44_in_ruleXShortClosure5740 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXParenthesizedExpression5859 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5881 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXParenthesizedExpression5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression5984 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIfExpression5996 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6017 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXIfExpression6029 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6050 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression6071 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6187 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6228 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6240 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6264 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6276 = new BitSet(new long[]{0x0044020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6297 = new BitSet(new long[]{0x0074020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6311 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6323 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6344 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6450 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXCasePart6464 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6485 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXCasePart6499 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXForLoopExpression6612 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXForLoopExpression6624 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6645 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXForLoopExpression6657 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6678 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXForLoopExpression6690 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXWhileExpression6803 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXWhileExpression6815 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6836 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXWhileExpression6848 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXDoWhileExpression6961 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6982 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXDoWhileExpression6994 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXDoWhileExpression7006 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7027 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXDoWhileExpression7039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXBlockExpression7131 = new BitSet(new long[]{0xEFAA8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7153 = new BitSet(new long[]{0xEFAACA46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_46_in_ruleXBlockExpression7166 = new BitSet(new long[]{0xEFAA8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression7182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXVariableDeclaration7400 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_58_in_ruleXVariableDeclaration7431 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7479 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7500 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7529 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleXVariableDeclaration7543 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7658 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7772 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7896 = new BitSet(new long[]{0x0800000040000080L});
    public static final BitSet FOLLOW_30_in_ruleXFeatureCall7910 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7931 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_18_in_ruleXFeatureCall7944 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7965 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall7979 = new BitSet(new long[]{0x0800000040000080L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8004 = new BitSet(new long[]{0x00000A0000000002L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall8038 = new BitSet(new long[]{0xE98A9E46400020F0L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8123 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8151 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_18_in_ruleXFeatureCall8164 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8185 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall8202 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleIdOrSuper8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8454 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleStaticQualifier8472 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXConstructorCall8569 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8592 = new BitSet(new long[]{0x0000020040000000L});
    public static final BitSet FOLLOW_30_in_ruleXConstructorCall8605 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8626 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_18_in_ruleXConstructorCall8639 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8660 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_29_in_ruleXConstructorCall8674 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8688 = new BitSet(new long[]{0xE98A9E46400020F0L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8760 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8788 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_18_in_ruleXConstructorCall8801 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8822 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall8839 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXBooleanLiteral8964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXBooleanLiteral8988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXNullLiteral9094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXTypeLiteral9390 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXTypeLiteral9402 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9425 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXTypeLiteral9437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXThrowExpression9529 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXReturnExpression9642 = new BitSet(new long[]{0xE98A8A46400020F2L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTryCatchFinallyExpression9766 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9817 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9839 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9883 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXCatchClause9997 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXCatchClause10010 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10031 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXCatchClause10043 = new BitSet(new long[]{0xE98A8A46400020F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10159 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName10187 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10210 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10315 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleJvmTypeReference10353 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleJvmTypeReference10365 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef10480 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10501 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_18_in_ruleXFunctionTypeRef10514 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10535 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_42_in_ruleXFunctionTypeRef10549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleXFunctionTypeRef10563 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10678 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleJvmParameterizedTypeReference10699 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10721 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_18_in_ruleJvmParameterizedTypeReference10734 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10755 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_29_in_ruleJvmParameterizedTypeReference10769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleJvmWildcardTypeReference10982 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmUpperBound11116 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmUpperBoundAnded11220 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleJvmLowerBound11324 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewStyle1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewStyle1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewStyle1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewStyle2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred5_InternalGraphViewStyle2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewStyle2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewStyle2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewStyle3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewStyle3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred10_InternalGraphViewStyle3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred11_InternalGraphViewStyle4129 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalGraphViewStyle4138 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewStyle4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred12_InternalGraphViewStyle4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred12_InternalGraphViewStyle4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred12_InternalGraphViewStyle4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred13_InternalGraphViewStyle4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4560 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_18_in_synpred14_InternalGraphViewStyle4567 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4574 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_44_in_synpred14_InternalGraphViewStyle4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalGraphViewStyle4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGraphViewStyle5252 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_18_in_synpred16_InternalGraphViewStyle5259 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGraphViewStyle5266 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_44_in_synpred16_InternalGraphViewStyle5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred18_InternalGraphViewStyle6063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalGraphViewStyle6203 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred19_InternalGraphViewStyle6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalGraphViewStyle7449 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalGraphViewStyle7458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred21_InternalGraphViewStyle8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalGraphViewStyle8072 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_18_in_synpred22_InternalGraphViewStyle8079 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalGraphViewStyle8086 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_44_in_synpred22_InternalGraphViewStyle8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalGraphViewStyle8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalGraphViewStyle8709 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_18_in_synpred24_InternalGraphViewStyle8716 = new BitSet(new long[]{0x0000020000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalGraphViewStyle8723 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_44_in_synpred24_InternalGraphViewStyle8737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalGraphViewStyle8853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalGraphViewStyle9656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred27_InternalGraphViewStyle9801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred28_InternalGraphViewStyle9831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred30_InternalGraphViewStyle10178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred31_InternalGraphViewStyle10330 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_synpred31_InternalGraphViewStyle10334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred32_InternalGraphViewStyle10691 = new BitSet(new long[]{0x0000000000000002L});

}