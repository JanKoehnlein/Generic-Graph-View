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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COLOR", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stylesheet'", "'for'", "'import'", "'.'", "'*'", "'style'", "','", "'as'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'?.'", "'*.'", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=9;
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
    public static final int RULE_ANY_OTHER=13;
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
    public static final int RULE_HEX=6;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=8;
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
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
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
    public static final int RULE_WS=12;
    public static final int T__76=76;
    public static final int T__75=75;
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

                if ( (LA1_0==16) ) {
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleStyleSheet144); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleStyleSheet177); if (state.failed) return current;
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

                if ( (LA2_0==19) ) {
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
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleImport305); if (state.failed) return current;
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

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:233:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNameWithWildcard440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedNameWithWildcard453); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleStyle542); if (state.failed) return current;
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

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:284:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleStyle578); if (state.failed) return current;
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

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:303:6: otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleStyle616); if (state.failed) return current;
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

            if ( (LA6_0==53) ) {
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:360:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;

        EObject this_XColorLiteral_6 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:363:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:364:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:364:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt7=1;
                }
                break;
            case 64:
            case 65:
                {
                alt7=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt7=3;
                }
                break;
            case 66:
                {
                alt7=4;
                }
                break;
            case RULE_STRING:
                {
                alt7=5;
                }
                break;
            case 67:
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:385:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral808);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
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

                if ( (LA9_1==EOF||(LA9_1>=RULE_COLOR && LA9_1<=RULE_ID)||LA9_1==15||(LA9_1>=17 && LA9_1<=18)||(LA9_1>=20 && LA9_1<=21)||(LA9_1>=23 && LA9_1<=45)||(LA9_1>=47 && LA9_1<=73)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==22) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA9_0>=RULE_COLOR && LA9_0<=RULE_DECIMAL)||LA9_0==15||LA9_0==32||(LA9_0>=35 && LA9_0<=36)||LA9_0==40||LA9_0==43||LA9_0==45||LA9_0==49||LA9_0==51||LA9_0==53||(LA9_0>=57 && LA9_0<=58)||LA9_0==61||(LA9_0>=63 && LA9_0<=70)) ) {
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

                    if ( (LA8_0==23) ) {
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
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpSingleAssign1430); if (state.failed) return current;
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
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpMultiAssign1518); if (state.failed) return current;
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

                if ( (LA10_0==24) ) {
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
            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOr1777); if (state.failed) return current;
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

                if ( (LA11_0==25) ) {
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
            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpAnd2036); if (state.failed) return current;
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

                if ( (LA12_0==26) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred4_InternalGraphViewStyle()) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==27) ) {
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

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
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
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpEquality2296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:983:2: kw= '!='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpEquality2315); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1008:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1009:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1009:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1010:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop14:
            do {
                int alt14=3;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred5_InternalGraphViewStyle()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA14_5 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 32:
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
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

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXRelationalExpression2448); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1030:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1031:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1031:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1032:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2471);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
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


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1049:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1049:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1049:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1049:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1049:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1054:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1054:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1054:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1055:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1060:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1061:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1061:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1062:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2532);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1075:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1076:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1076:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1077:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2555);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1101:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1102:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1103:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2595);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2606); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1110:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1113:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1114:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1114:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 32:
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1115:2: kw= '>='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1122:2: kw= '<='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare2663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1129:2: kw= '>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpCompare2682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1136:2: kw= '<'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpCompare2701); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1149:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1150:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1151:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2741);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2751); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1158:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1161:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1162:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1162:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1163:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2798);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1171:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred7_InternalGraphViewStyle()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==34) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred7_InternalGraphViewStyle()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1171:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1171:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1171:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1176:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1176:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1176:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1177:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1182:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1183:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1183:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1184:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2851);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1197:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1198:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1198:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1199:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2874);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1223:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1224:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1225:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2913);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2924); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1232:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1235:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1236:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1236:1: (kw= '->' | kw= '..' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            else if ( (LA17_0==34) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1237:2: kw= '->'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1244:2: kw= '..'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther2981); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1257:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1258:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1259:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3021);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3031); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1266:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1269:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1270:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1270:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1271:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3078);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1279:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred8_InternalGraphViewStyle()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==36) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred8_InternalGraphViewStyle()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1279:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1279:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1279:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1284:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1284:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1284:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1285:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1290:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1291:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1291:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1292:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3131);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1305:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1306:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1306:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1307:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3154);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1331:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1332:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1333:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3193);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3204); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1340:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1343:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1344:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1344:1: (kw= '+' | kw= '-' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1345:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd3242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1352:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpAdd3261); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1365:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1366:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1367:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3301);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3311); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1374:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1377:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1378:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1378:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1379:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3358);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1387:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    int LA20_2 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 39:
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1387:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1387:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1387:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1392:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1392:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1392:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1393:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1398:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1399:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1399:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1400:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3411);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1413:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1414:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1414:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1415:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3434);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1439:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1440:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1441:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3473);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3484); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1448:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1451:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1452:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1452:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt21=1;
                }
                break;
            case 37:
                {
                alt21=2;
                }
                break;
            case 38:
                {
                alt21=3;
                }
                break;
            case 39:
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1453:2: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleOpMulti3522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1460:2: kw= '**'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1467:2: kw= '/'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1474:2: kw= '%'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3579); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1487:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1488:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1489:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3619);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3629); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1496:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1499:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1500:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1500:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=35 && LA22_0<=36)||LA22_0==40) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_COLOR && LA22_0<=RULE_ID)||LA22_0==15||LA22_0==32||LA22_0==43||LA22_0==45||LA22_0==49||LA22_0==51||LA22_0==53||(LA22_0>=57 && LA22_0<=58)||LA22_0==61||(LA22_0>=63 && LA22_0<=70)) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1500:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1500:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1500:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1500:3: ()
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1501:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1506:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1507:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1507:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1508:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3687);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1521:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1522:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1522:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1523:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3708);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1541:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3737);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1557:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1558:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1559:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3773);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3784); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1566:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1569:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1570:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1570:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 35:
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1571:2: kw= '!'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary3822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1578:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpUnary3841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1585:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary3860); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1598:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1599:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1600:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3900);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3910); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1607:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1610:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1611:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1611:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1612:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3957);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1620:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred10_InternalGraphViewStyle()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1620:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1620:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1620:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1622:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1622:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1622:6: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1623:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXCastedExpression3992); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1632:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1633:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1633:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1634:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4015);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1658:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1659:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1660:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4053);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4063); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1667:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1670:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1671:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1671:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1672:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4110);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop32:
            do {
                int alt32=3;
                switch ( input.LA(1) ) {
                case 17:
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
                case 41:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred12_InternalGraphViewStyle()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case 42:
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1686:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1686:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1686:26: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1687:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall4159); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1696:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1697:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1697:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1698:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4182);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4198);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1719:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1720:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1720:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1721:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4220);
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1754:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1754:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1754:8: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1755:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1760:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt25=3;
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
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1760:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall4306); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1765:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1765:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1766:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1766:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1767:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4330); if (state.failed) return current;
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
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1781:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1781:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1782:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1782:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1783:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4367); if (state.failed) return current;
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1796:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==32) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1796:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleXMemberFeatureCall4396); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1800:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1801:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1801:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1802:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4417);
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

            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1818:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop26:
            	            do {
            	                int alt26=2;
            	                int LA26_0 = input.LA(1);

            	                if ( (LA26_0==20) ) {
            	                    alt26=1;
            	                }


            	                switch (alt26) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1818:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleXMemberFeatureCall4430); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1822:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1823:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1823:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1824:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4451);
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

            	            otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleXMemberFeatureCall4465); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1844:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1845:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1845:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1846:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4490);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1859:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1859:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1859:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1859:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1866:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1867:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4524); if (state.failed) return current;
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

            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1880:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt29=3;
            	            alt29 = dfa29.predict(input);
            	            switch (alt29) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1880:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1880:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1880:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1897:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1898:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4609);
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
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1915:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1915:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1915:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1915:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1916:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1916:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1917:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4637);
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

            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1933:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop28:
            	                    do {
            	                        int alt28=2;
            	                        int LA28_0 = input.LA(1);

            	                        if ( (LA28_0==20) ) {
            	                            alt28=1;
            	                        }


            	                        switch (alt28) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1933:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleXMemberFeatureCall4650); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1937:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1938:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1938:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1939:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4671);
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

            	            otherlv_21=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4688); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1959:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt31=2;
            	    alt31 = dfa31.predict(input);
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1959:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1964:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1965:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4721);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1989:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1990:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1991:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4761);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4771); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1998:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2001:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2002:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2002:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt33=13;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt33=1;
                }
                break;
            case 53:
                {
                alt33=2;
                }
                break;
            case 51:
                {
                alt33=3;
                }
                break;
            case RULE_ID:
            case 32:
            case 61:
                {
                alt33=4;
                }
                break;
            case RULE_COLOR:
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 45:
            case 64:
            case 65:
            case 66:
            case 67:
                {
                alt33=5;
                }
                break;
            case 49:
                {
                alt33=6;
                }
                break;
            case 15:
                {
                alt33=7;
                }
                break;
            case 57:
                {
                alt33=8;
                }
                break;
            case 58:
                {
                alt33=9;
                }
                break;
            case 68:
                {
                alt33=10;
                }
                break;
            case 69:
                {
                alt33=11;
                }
                break;
            case 70:
                {
                alt33=12;
                }
                break;
            case 43:
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2003:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4818);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2013:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4845);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2023:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4872);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2033:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4899);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2043:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4926);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2053:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4953);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2063:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4980);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2073:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5007);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2083:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5034);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2093:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5061);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2103:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5088);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2113:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5115);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2123:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5142);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2139:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2140:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2141:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5177);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5187); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2148:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2151:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2152:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2152:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2152:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2152:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2153:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2162:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2162:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2177:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2177:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2177:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID||LA35_0==43||LA35_0==73) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2177:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2177:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2178:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2178:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2179:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5304);
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

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2195:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==20) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2195:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleXClosure5317); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2199:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2200:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2200:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2201:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5338);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2217:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2218:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2218:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2219:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5360); if (state.failed) return current;
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2232:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2233:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2233:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2234:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5397);
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

            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5409); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2262:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2263:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2264:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5445);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5455); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2271:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2274:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2275:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2275:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2275:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2275:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2276:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2281:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_COLOR && LA38_0<=RULE_ID)||LA38_0==15||LA38_0==32||(LA38_0>=35 && LA38_0<=36)||LA38_0==40||LA38_0==43||LA38_0==45||LA38_0==49||LA38_0==51||LA38_0==53||(LA38_0>=57 && LA38_0<=61)||(LA38_0>=63 && LA38_0<=70)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2281:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2281:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2282:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2282:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2283:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5511);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2299:2: (otherlv_2= ';' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==48) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2299:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXExpressionInClosure5524); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2311:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2312:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2313:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5564);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5574); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2320:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2323:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2324:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2324:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2324:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2324:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2324:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2340:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2340:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2340:7: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2341:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2346:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==43||LA40_0==73) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2346:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2346:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2347:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2347:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2348:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5682);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2364:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==20) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2364:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXShortClosure5695); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2368:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2369:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2369:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2370:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5716);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2386:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2387:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2387:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2388:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,46,FOLLOW_46_in_ruleXShortClosure5738); if (state.failed) return current;
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2401:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2402:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2402:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2403:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5774);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2427:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2428:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2429:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5810);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5820); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2436:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2439:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2440:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2440:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2440:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleXParenthesizedExpression5857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5879);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXParenthesizedExpression5890); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2465:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2466:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2467:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5926);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5936); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2474:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2477:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2478:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2478:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2478:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2478:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2479:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression5982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXIfExpression5994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2492:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2493:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2493:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2494:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6015);
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

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression6027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2514:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2515:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2515:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2516:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6048);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2532:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred18_InternalGraphViewStyle()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2532:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2532:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2532:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression6069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2537:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2538:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2538:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2539:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6091);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2563:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2564:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2565:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6129);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6139); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2572:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2575:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2576:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2576:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2576:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2576:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2577:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2586:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==52) && (synpred19_InternalGraphViewStyle())) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2586:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2591:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2591:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2591:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2592:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2592:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2593:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6226);
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

                    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2613:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2614:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2614:1: (lv_switch_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2615:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6262);
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

            otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2635:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==43||LA43_0==52||LA43_0==56||LA43_0==73) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2636:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2636:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2637:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6295);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2653:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2653:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2661:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2662:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2662:1: (lv_default_9_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2663:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6342);
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

            otherlv_10=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6356); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2691:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2692:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2693:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6392);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6402); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2700:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2703:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2704:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2704:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2704:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2704:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==43||LA45_0==73) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2705:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2705:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2706:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6448);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2722:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==56) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2722:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart6462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2726:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2727:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2727:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2728:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6483);
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

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2748:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2749:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2749:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2750:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6518);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2774:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2775:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2776:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6554);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6564); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2783:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2786:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2787:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2787:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2787:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2787:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2788:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleXForLoopExpression6610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXForLoopExpression6622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2801:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2802:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2802:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2803:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6643);
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

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXForLoopExpression6655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2823:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2824:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2824:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2825:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6676);
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

            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleXForLoopExpression6688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2845:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2846:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2846:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2847:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6709);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2871:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2872:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2873:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6745);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6755); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2880:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2883:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2884:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2884:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2884:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2884:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2885:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXWhileExpression6801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXWhileExpression6813); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2898:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2899:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2899:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2900:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6834);
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

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXWhileExpression6846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2920:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2921:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2921:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2922:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6867);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2946:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2947:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2948:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6903);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6913); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2955:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2958:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2959:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2959:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2959:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2959:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2960:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression6959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2969:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2970:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2970:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2971:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6980);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXDoWhileExpression6992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXDoWhileExpression7004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2995:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2996:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2996:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2997:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7025);
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

            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleXDoWhileExpression7037); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3025:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3026:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3027:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7073);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7083); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3034:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3037:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3038:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3038:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3038:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3038:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3039:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression7129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3048:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_COLOR && LA48_0<=RULE_ID)||LA48_0==15||LA48_0==32||(LA48_0>=35 && LA48_0<=36)||LA48_0==40||LA48_0==43||LA48_0==45||LA48_0==49||LA48_0==51||LA48_0==53||(LA48_0>=57 && LA48_0<=61)||(LA48_0>=63 && LA48_0<=70)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3048:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3048:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3049:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3049:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3050:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7151);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3066:2: (otherlv_3= ';' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==48) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3066:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXBlockExpression7164); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXBlockExpression7180); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3082:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3083:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3084:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7216);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7226); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3091:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3094:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3095:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3095:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=59 && LA49_0<=60)) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=RULE_COLOR && LA49_0<=RULE_ID)||LA49_0==15||LA49_0==32||(LA49_0>=35 && LA49_0<=36)||LA49_0==40||LA49_0==43||LA49_0==45||LA49_0==49||LA49_0==51||LA49_0==53||(LA49_0>=57 && LA49_0<=58)||LA49_0==61||(LA49_0>=63 && LA49_0<=70)) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3096:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7273);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3106:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7300);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3122:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3123:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3124:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7335);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7345); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3131:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3134:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3135:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3135:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3135:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3135:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3136:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3141:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==59) ) {
                alt50=1;
            }
            else if ( (LA50_0==60) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3141:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3141:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3142:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3142:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3143:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,59,FOLLOW_59_in_ruleXVariableDeclaration7398); if (state.failed) return current;
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3157:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration7429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3161:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
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
            else if ( (LA51_0==43) && (synpred20_InternalGraphViewStyle())) {
                alt51=1;
            }
            else if ( (LA51_0==73) && (synpred20_InternalGraphViewStyle())) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3161:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3161:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3161:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3169:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3169:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3169:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3170:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3170:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3171:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7477);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3187:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3188:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3188:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3189:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7498);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3206:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3206:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3207:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3207:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3208:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7527);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3224:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==22) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3224:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleXVariableDeclaration7541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3228:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3229:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3229:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3230:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7562);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3254:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3255:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3256:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7600);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7610); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3263:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3266:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3267:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3267:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3267:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3267:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==RULE_ID||LA53_1==17||LA53_1==32||LA53_1==45) ) {
                    alt53=1;
                }
            }
            else if ( (LA53_0==43||LA53_0==73) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3268:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3268:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3269:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7656);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3285:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3286:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3286:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3287:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7678);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3311:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3312:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3313:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7714);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7724); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3320:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3323:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3324:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3324:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3324:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3324:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3325:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3325:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3326:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7770);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3342:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3343:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3343:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3344:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7791);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3368:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3369:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3370:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7827);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7837); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3377:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3380:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3381:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3381:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3381:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3381:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3382:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3387:2: ( ( ruleStaticQualifier ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==62) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3388:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3388:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3389:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7894);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3402:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==32) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3402:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXFeatureCall7908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3406:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3407:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3407:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3408:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7929);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3424:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==20) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3424:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXFeatureCall7942); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3428:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3429:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3429:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3430:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7963);
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

                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXFeatureCall7977); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3450:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3451:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3451:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3452:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8002);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3465:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3465:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3465:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3465:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3472:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3473:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall8036); if (state.failed) return current;
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3486:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt58=3;
                    alt58 = dfa58.predict(input);
                    switch (alt58) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3486:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3486:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3486:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3503:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3504:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8121);
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
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3521:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3521:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3521:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3521:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3522:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3522:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3523:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8149);
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

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3539:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==20) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3539:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleXFeatureCall8162); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3543:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3544:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3544:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3545:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8183);
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

                    otherlv_13=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall8200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3565:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3565:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3570:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3571:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8233);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3595:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3596:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3597:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8271);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8282); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3604:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3607:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3608:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3608:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==61) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3609:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8329);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3621:2: kw= 'super'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleIdOrSuper8353); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3634:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3635:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3636:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8394);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8405); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3643:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3646:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3647:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3647:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    int LA62_2 = input.LA(2);

                    if ( (LA62_2==62) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3648:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8452);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,62,FOLLOW_62_in_ruleStaticQualifier8470); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3672:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3673:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3674:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8511);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8521); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3681:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3684:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3685:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3685:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3685:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3685:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3686:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXConstructorCall8567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3695:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3696:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3696:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3697:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8590);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3710:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3710:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3710:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3710:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleXConstructorCall8611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3715:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3716:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3716:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3717:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8633);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3733:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==20) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3733:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleXConstructorCall8646); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3737:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3738:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3738:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3739:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8667);
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

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleXConstructorCall8681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3764:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt66=3;
                    alt66 = dfa66.predict(input);
                    switch (alt66) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3764:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3764:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3764:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3781:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3782:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8777);
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
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3799:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3799:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3799:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3799:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3800:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3800:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3801:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8805);
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

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3817:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==20) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3817:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleXConstructorCall8818); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3821:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3822:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3822:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3823:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8839);
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

                    otherlv_13=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall8856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3843:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3843:4: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3848:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3849:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8889);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3873:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3874:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3875:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8926);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8936); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3882:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3885:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3886:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3886:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3886:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3886:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3887:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3892:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==64) ) {
                alt69=1;
            }
            else if ( (LA69_0==65) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3892:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXBooleanLiteral8983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3897:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3897:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3898:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3898:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3899:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral9007); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3920:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3921:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3922:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9057);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9067); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3929:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3932:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3933:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3933:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3933:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3933:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3934:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXNullLiteral9113); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3951:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3952:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3953:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9149);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9159); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3960:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3963:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3964:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3964:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3964:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3964:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3965:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3970:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3971:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3971:1: (lv_value_1_0= ruleNumber )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3972:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9214);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
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
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3996:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3997:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3998:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9250);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9260); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4005:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4008:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4009:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4009:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4009:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4009:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4010:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4015:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4016:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4016:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4017:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9311); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4041:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4042:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4043:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9352);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9362); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4050:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4053:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4054:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4054:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4054:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4054:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4055:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXTypeLiteral9408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXTypeLiteral9420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4068:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4069:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4069:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4070:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9443);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXTypeLiteral9455); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4095:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4096:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4097:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9491);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9501); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4104:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4107:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4108:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4108:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4108:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4108:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4109:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXThrowExpression9547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4118:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4119:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4119:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4120:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9568);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4144:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4145:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4146:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9604);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9614); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4153:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4156:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4157:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4157:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4157:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4157:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4158:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXReturnExpression9660); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4167:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4167:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4172:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4173:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9691);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4197:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4198:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4199:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9728);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9738); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4206:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4209:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4210:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4210:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4210:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4210:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4211:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTryCatchFinallyExpression9784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4220:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4221:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4221:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4222:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9805);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4238:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==72) ) {
                alt73=1;
            }
            else if ( (LA73_0==71) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4238:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4238:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4238:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4238:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==72) ) {
                            int LA71_2 = input.LA(2);

                            if ( (synpred29_InternalGraphViewStyle()) ) {
                                alt71=1;
                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4238:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4240:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4241:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9835);
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
                    	    if ( cnt71 >= 1 ) break loop71;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
                    } while (true);

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4257:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==71) ) {
                        int LA72_1 = input.LA(2);

                        if ( (synpred30_InternalGraphViewStyle()) ) {
                            alt72=1;
                        }
                    }
                    switch (alt72) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4257:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4257:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4257:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9857); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4262:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4263:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4263:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4264:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9879);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4281:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4281:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4281:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4285:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4286:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4286:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4287:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9922);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4311:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4312:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4313:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9960);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9970); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4320:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4323:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4324:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4324:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4324:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4324:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4324:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleXCatchClause10015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleXCatchClause10028); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4333:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4334:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4334:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4335:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10049);
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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleXCatchClause10061); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4355:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4356:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4356:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4357:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10082);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4381:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4382:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4383:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10119);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10130); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4390:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4393:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4394:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4394:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4395:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10177);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4405:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==17) ) {
                    int LA74_2 = input.LA(2);

                    if ( (LA74_2==RULE_ID) ) {
                        int LA74_3 = input.LA(3);

                        if ( (synpred32_InternalGraphViewStyle()) ) {
                            alt74=1;
                        }


                    }


                }


                switch (alt74) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4405:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4405:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4405:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedName10205); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10228);
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
            	    break loop74;
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


    // $ANTLR start "entryRuleNumber"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4432:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4436:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4437:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10282);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10293); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4447:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4451:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4452:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4452:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_HEX) ) {
                alt78=1;
            }
            else if ( ((LA78_0>=RULE_INT && LA78_0<=RULE_DECIMAL)) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4452:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4460:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4460:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4460:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4460:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RULE_INT) ) {
                        alt75=1;
                    }
                    else if ( (LA75_0==RULE_DECIMAL) ) {
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
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4460:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10365); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4468:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10391); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4475:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==17) ) {
                        int LA77_1 = input.LA(2);

                        if ( ((LA77_1>=RULE_INT && LA77_1<=RULE_DECIMAL)) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4476:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,17,FOLLOW_17_in_ruleNumber10411); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4481:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==RULE_INT) ) {
                                alt76=1;
                            }
                            else if ( (LA76_0==RULE_DECIMAL) ) {
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
                                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4481:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10427); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4489:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10453); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4507:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4508:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4509:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10506);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10516); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4516:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4519:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4520:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4520:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID) ) {
                alt80=1;
            }
            else if ( (LA80_0==43||LA80_0==73) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4520:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4520:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4521:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10564);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4529:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==45) ) {
                            int LA79_2 = input.LA(2);

                            if ( (LA79_2==47) ) {
                                int LA79_3 = input.LA(3);

                                if ( (synpred33_InternalGraphViewStyle()) ) {
                                    alt79=1;
                                }


                            }


                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4529:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4532:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4532:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4532:6: ()
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4533:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleJvmTypeReference10602); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleJvmTypeReference10614); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4548:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10646);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4564:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4565:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4566:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10681);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10691); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4573:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4576:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4577:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4577:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4577:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4577:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==43) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4577:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef10729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4581:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==RULE_ID||LA82_0==43||LA82_0==73) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4581:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4581:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4582:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4582:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4583:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10751);
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

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4599:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop81:
                            do {
                                int alt81=2;
                                int LA81_0 = input.LA(1);

                                if ( (LA81_0==20) ) {
                                    alt81=1;
                                }


                                switch (alt81) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4599:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXFunctionTypeRef10764); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4603:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4604:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4604:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4605:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10785);
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


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef10801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,73,FOLLOW_73_in_ruleXFunctionTypeRef10815); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4629:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4630:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4630:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4631:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10836);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4655:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4656:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4657:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10872);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10882); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4664:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4667:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4668:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4668:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4668:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4668:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4669:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4669:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4670:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10930);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4683:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4683:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4683:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4683:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleJvmParameterizedTypeReference10951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4688:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4689:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4689:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4690:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10973);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4706:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==20) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4706:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleJvmParameterizedTypeReference10986); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4710:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4711:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4711:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4712:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11007);
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
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleJvmParameterizedTypeReference11021); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4740:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4741:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4742:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11059);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11069); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4749:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4752:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4753:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4753:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID||LA86_0==43||LA86_0==73) ) {
                alt86=1;
            }
            else if ( (LA86_0==74) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4754:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11116);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4764:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11143);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4780:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4781:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4782:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11178);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11188); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4789:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4792:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4793:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4793:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4793:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4793:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4794:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleJvmWildcardTypeReference11234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4803:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==75) ) {
                alt87=1;
            }
            else if ( (LA87_0==61) ) {
                alt87=2;
            }
            switch (alt87) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4803:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4803:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4804:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4804:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4805:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11256);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4822:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4822:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4823:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4823:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4824:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11283);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4848:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4849:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4850:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11321);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11331); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4857:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4860:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4861:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4861:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4861:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleJvmUpperBound11368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4865:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4866:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4866:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4867:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11389);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4891:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4892:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4893:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11425);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11435); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4900:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4903:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4904:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4904:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4904:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBoundAnded11472); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4908:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4909:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4909:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4910:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11493);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4934:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4935:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4936:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11529);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11539); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4943:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4946:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4947:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4947:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4947:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleJvmLowerBound11576); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4951:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4952:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4952:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4953:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11597);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4979:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4980:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4981:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11636);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11647); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4988:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4991:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4992:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11686); if (state.failed) return current;
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

        match(input,28,FOLLOW_28_in_synpred5_InternalGraphViewStyle2429); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGraphViewStyle

    // $ANTLR start synpred6_InternalGraphViewStyle
    public final void synpred6_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1049:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1049:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1049:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1049:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1049:10: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1050:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1050:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1051:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1051:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1052:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewStyle2500);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1171:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1171:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1171:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1171:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1171:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1172:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1172:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1173:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1173:1: ( ruleOpOther )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1174:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewStyle2819);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1279:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1279:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1279:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1279:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1279:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1280:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1280:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1281:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1281:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1282:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewStyle3099);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1387:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1387:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1387:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1387:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1387:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1388:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1388:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1389:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1389:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1390:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewStyle3379);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1620:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1620:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1620:4: ( () 'as' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1620:5: () 'as'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1620:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1621:1: 
        {
        }

        match(input,21,FOLLOW_21_in_synpred10_InternalGraphViewStyle3973); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalGraphViewStyle

    // $ANTLR start synpred11_InternalGraphViewStyle
    public final void synpred11_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1681:1: 
        {
        }

        match(input,17,FOLLOW_17_in_synpred11_InternalGraphViewStyle4127); if (state.failed) return ;
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1682:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1683:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1683:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1684:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalGraphViewStyle4136);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewStyle4142);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalGraphViewStyle

    // $ANTLR start synpred12_InternalGraphViewStyle
    public final void synpred12_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:10: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1739:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1739:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt88=3;
        switch ( input.LA(1) ) {
        case 17:
            {
            alt88=1;
            }
            break;
        case 41:
            {
            alt88=2;
            }
            break;
        case 42:
            {
            alt88=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 88, 0, input);

            throw nvae;
        }

        switch (alt88) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1739:4: '.'
                {
                match(input,17,FOLLOW_17_in_synpred12_InternalGraphViewStyle4245); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1741:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1741:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1742:1: ( '?.' )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1742:1: ( '?.' )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1743:2: '?.'
                {
                match(input,41,FOLLOW_41_in_synpred12_InternalGraphViewStyle4259); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1748:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1748:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1749:1: ( '*.' )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1749:1: ( '*.' )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1750:2: '*.'
                {
                match(input,42,FOLLOW_42_in_synpred12_InternalGraphViewStyle4279); if (state.failed) return ;

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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1859:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1860:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1860:1: ( '(' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1861:2: '('
        {
        match(input,43,FOLLOW_43_in_synpred13_InternalGraphViewStyle4506); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGraphViewStyle

    // $ANTLR start synpred14_InternalGraphViewStyle
    public final void synpred14_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1880:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1880:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1880:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1880:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1880:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1881:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1881:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==43||LA90_0==73) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1881:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1881:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1882:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1882:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1883:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4558);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1885:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==20) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1885:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred14_InternalGraphViewStyle4565); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1886:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1887:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1887:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1888:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4572);
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

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1890:6: ( ( '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1891:1: ( '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1891:1: ( '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1892:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred14_InternalGraphViewStyle4586); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalGraphViewStyle

    // $ANTLR start synpred15_InternalGraphViewStyle
    public final void synpred15_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1959:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1960:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1960:1: ( ruleXClosure )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1961:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalGraphViewStyle4704);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalGraphViewStyle

    // $ANTLR start synpred16_InternalGraphViewStyle
    public final void synpred16_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2162:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2162:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2162:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2162:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2162:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt92=2;
        int LA92_0 = input.LA(1);

        if ( (LA92_0==RULE_ID||LA92_0==43||LA92_0==73) ) {
            alt92=1;
        }
        switch (alt92) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2162:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2162:5: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2163:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2163:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2164:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGraphViewStyle5250);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2166:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop91:
                do {
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==20) ) {
                        alt91=1;
                    }


                    switch (alt91) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2166:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred16_InternalGraphViewStyle5257); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2167:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2168:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2168:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2169:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGraphViewStyle5264);
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

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2171:6: ( ( '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2172:1: ( '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2172:1: ( '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2173:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred16_InternalGraphViewStyle5278); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalGraphViewStyle

    // $ANTLR start synpred18_InternalGraphViewStyle
    public final void synpred18_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2532:4: ( 'else' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2532:6: 'else'
        {
        match(input,50,FOLLOW_50_in_synpred18_InternalGraphViewStyle6061); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalGraphViewStyle

    // $ANTLR start synpred19_InternalGraphViewStyle
    public final void synpred19_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2586:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2586:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2586:3: ( ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2586:4: ( ( ruleValidID ) ) ':'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2586:4: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2587:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2587:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2588:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalGraphViewStyle6201);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,52,FOLLOW_52_in_synpred19_InternalGraphViewStyle6207); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalGraphViewStyle

    // $ANTLR start synpred20_InternalGraphViewStyle
    public final void synpred20_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3161:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3161:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3161:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3161:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3161:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3162:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3162:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3163:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalGraphViewStyle7447);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3165:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3166:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3166:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3167:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalGraphViewStyle7456);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3465:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3466:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3466:1: ( '(' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3467:2: '('
        {
        match(input,43,FOLLOW_43_in_synpred21_InternalGraphViewStyle8018); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalGraphViewStyle

    // $ANTLR start synpred22_InternalGraphViewStyle
    public final void synpred22_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3486:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3486:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3486:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3486:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3486:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3487:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3487:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==43||LA96_0==73) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3487:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3487:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3488:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3488:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3489:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalGraphViewStyle8070);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3491:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==20) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3491:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred22_InternalGraphViewStyle8077); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3492:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3493:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3493:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3494:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalGraphViewStyle8084);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3496:6: ( ( '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3497:1: ( '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3497:1: ( '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3498:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred22_InternalGraphViewStyle8098); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalGraphViewStyle

    // $ANTLR start synpred23_InternalGraphViewStyle
    public final void synpred23_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3565:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3566:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3566:1: ( ruleXClosure )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3567:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalGraphViewStyle8216);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalGraphViewStyle

    // $ANTLR start synpred24_InternalGraphViewStyle
    public final void synpred24_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3710:4: ( '<' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3710:6: '<'
        {
        match(input,32,FOLLOW_32_in_synpred24_InternalGraphViewStyle8603); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalGraphViewStyle

    // $ANTLR start synpred25_InternalGraphViewStyle
    public final void synpred25_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:5: ( '(' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:7: '('
        {
        match(input,43,FOLLOW_43_in_synpred25_InternalGraphViewStyle8696); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalGraphViewStyle

    // $ANTLR start synpred26_InternalGraphViewStyle
    public final void synpred26_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3764:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3764:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3764:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3764:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3764:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3765:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3765:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==43||LA98_0==73) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3765:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3765:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3766:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3766:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3767:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred26_InternalGraphViewStyle8726);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3769:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==20) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3769:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred26_InternalGraphViewStyle8733); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3770:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3771:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3771:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3772:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred26_InternalGraphViewStyle8740);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop97;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3774:6: ( ( '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3775:1: ( '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3775:1: ( '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3776:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred26_InternalGraphViewStyle8754); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred26_InternalGraphViewStyle

    // $ANTLR start synpred27_InternalGraphViewStyle
    public final void synpred27_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3843:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3844:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3844:1: ( ruleXClosure )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3845:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred27_InternalGraphViewStyle8872);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred27_InternalGraphViewStyle

    // $ANTLR start synpred28_InternalGraphViewStyle
    public final void synpred28_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4167:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4168:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4168:1: ( ruleXExpression )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4169:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred28_InternalGraphViewStyle9674);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalGraphViewStyle

    // $ANTLR start synpred29_InternalGraphViewStyle
    public final void synpred29_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4238:5: ( 'catch' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4238:7: 'catch'
        {
        match(input,72,FOLLOW_72_in_synpred29_InternalGraphViewStyle9819); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalGraphViewStyle

    // $ANTLR start synpred30_InternalGraphViewStyle
    public final void synpred30_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4257:5: ( 'finally' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4257:7: 'finally'
        {
        match(input,71,FOLLOW_71_in_synpred30_InternalGraphViewStyle9849); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalGraphViewStyle

    // $ANTLR start synpred32_InternalGraphViewStyle
    public final void synpred32_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4405:3: ( '.' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4406:2: '.'
        {
        match(input,17,FOLLOW_17_in_synpred32_InternalGraphViewStyle10196); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalGraphViewStyle

    // $ANTLR start synpred33_InternalGraphViewStyle
    public final void synpred33_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4529:2: ( ( () '[' ']' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4529:3: ( () '[' ']' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4529:3: ( () '[' ']' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4529:4: () '[' ']'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4529:4: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4530:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred33_InternalGraphViewStyle10579); if (state.failed) return ;
        match(input,47,FOLLOW_47_in_synpred33_InternalGraphViewStyle10583); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalGraphViewStyle

    // $ANTLR start synpred34_InternalGraphViewStyle
    public final void synpred34_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4683:4: ( '<' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4683:6: '<'
        {
        match(input,32,FOLLOW_32_in_synpred34_InternalGraphViewStyle10943); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalGraphViewStyle

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
    public final boolean synpred34_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalGraphViewStyle_fragment(); // can never throw exception
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
    public final boolean synpred29_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalGraphViewStyle_fragment(); // can never throw exception
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
    public final boolean synpred33_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalGraphViewStyle_fragment(); // can never throw exception
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
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA85 dfa85 = new DFA85(this);
    static final String DFA30_eotS =
        "\77\uffff";
    static final String DFA30_eofS =
        "\1\2\76\uffff";
    static final String DFA30_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA30_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA30_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\24\2\1\1\2"+
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
            return "1859:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred13_InternalGraphViewStyle()) ) {s = 62;}

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
        "\37\uffff";
    static final String DFA29_eofS =
        "\37\uffff";
    static final String DFA29_minS =
        "\1\4\2\0\34\uffff";
    static final String DFA29_maxS =
        "\1\111\2\0\34\uffff";
    static final String DFA29_acceptS =
        "\3\uffff\2\1\1\2\30\uffff\1\3";
    static final String DFA29_specialS =
        "\1\0\1\1\1\2\34\uffff}>";
    static final String[] DFA29_transitionS = {
            "\5\5\1\1\5\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\2"+
            "\uffff\1\2\1\36\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
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
            return "1880:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA29_0==43) ) {s = 2;}

                        else if ( (LA29_0==73) && (synpred14_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA29_0==46) && (synpred14_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA29_0>=RULE_COLOR && LA29_0<=RULE_DECIMAL)||LA29_0==15||LA29_0==32||(LA29_0>=35 && LA29_0<=36)||LA29_0==40||LA29_0==45||LA29_0==49||LA29_0==51||LA29_0==53||(LA29_0>=57 && LA29_0<=58)||LA29_0==61||(LA29_0>=63 && LA29_0<=70)) ) {s = 5;}

                        else if ( (LA29_0==44) ) {s = 30;}

                         
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
        "\77\uffff";
    static final String DFA31_eofS =
        "\1\2\76\uffff";
    static final String DFA31_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA31_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA31_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA31_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\26\2\1\1\1"+
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
            return "1959:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred15_InternalGraphViewStyle()) ) {s = 62;}

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
        "\41\uffff";
    static final String DFA36_eofS =
        "\41\uffff";
    static final String DFA36_minS =
        "\1\4\2\0\36\uffff";
    static final String DFA36_maxS =
        "\1\111\2\0\36\uffff";
    static final String DFA36_acceptS =
        "\3\uffff\2\1\1\2\33\uffff";
    static final String DFA36_specialS =
        "\1\0\1\1\1\2\36\uffff}>";
    static final String[] DFA36_transitionS = {
            "\5\5\1\1\5\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\2"+
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
            return "2162:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
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

                        else if ( (LA36_0==43) ) {s = 2;}

                        else if ( (LA36_0==73) && (synpred16_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA36_0==46) && (synpred16_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA36_0>=RULE_COLOR && LA36_0<=RULE_DECIMAL)||LA36_0==15||LA36_0==32||(LA36_0>=35 && LA36_0<=36)||LA36_0==40||LA36_0==45||LA36_0==47||LA36_0==49||LA36_0==51||LA36_0==53||(LA36_0>=57 && LA36_0<=61)||(LA36_0>=63 && LA36_0<=70)) ) {s = 5;}

                         
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
        "\77\uffff";
    static final String DFA59_eofS =
        "\1\2\76\uffff";
    static final String DFA59_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA59_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA59_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA59_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\24\2\1\1\2"+
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
            return "3465:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 62;}

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
        "\37\uffff";
    static final String DFA58_eofS =
        "\37\uffff";
    static final String DFA58_minS =
        "\1\4\2\0\34\uffff";
    static final String DFA58_maxS =
        "\1\111\2\0\34\uffff";
    static final String DFA58_acceptS =
        "\3\uffff\2\1\1\2\30\uffff\1\3";
    static final String DFA58_specialS =
        "\1\0\1\1\1\2\34\uffff}>";
    static final String[] DFA58_transitionS = {
            "\5\5\1\1\5\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\2"+
            "\uffff\1\2\1\36\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
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
            return "3486:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA58_0==43) ) {s = 2;}

                        else if ( (LA58_0==73) && (synpred22_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA58_0==46) && (synpred22_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA58_0>=RULE_COLOR && LA58_0<=RULE_DECIMAL)||LA58_0==15||LA58_0==32||(LA58_0>=35 && LA58_0<=36)||LA58_0==40||LA58_0==45||LA58_0==49||LA58_0==51||LA58_0==53||(LA58_0>=57 && LA58_0<=58)||LA58_0==61||(LA58_0>=63 && LA58_0<=70)) ) {s = 5;}

                        else if ( (LA58_0==44) ) {s = 30;}

                         
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
        "\77\uffff";
    static final String DFA60_eofS =
        "\1\2\76\uffff";
    static final String DFA60_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA60_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA60_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\26\2\1\1\1"+
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
            return "3565:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred23_InternalGraphViewStyle()) ) {s = 62;}

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
    static final String DFA64_eotS =
        "\77\uffff";
    static final String DFA64_eofS =
        "\1\2\76\uffff";
    static final String DFA64_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA64_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA64_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\11\2\1\1\15"+
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
            return "3710:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index64_1);
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
    static final String DFA67_eotS =
        "\77\uffff";
    static final String DFA67_eofS =
        "\1\2\76\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA67_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA67_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\24\2\1\1\2"+
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
            return "3759:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred25_InternalGraphViewStyle()) ) {s = 62;}

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
        "\37\uffff";
    static final String DFA66_eofS =
        "\37\uffff";
    static final String DFA66_minS =
        "\1\4\2\0\34\uffff";
    static final String DFA66_maxS =
        "\1\111\2\0\34\uffff";
    static final String DFA66_acceptS =
        "\3\uffff\2\1\1\2\30\uffff\1\3";
    static final String DFA66_specialS =
        "\1\0\1\1\1\2\34\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\5\1\1\5\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\2"+
            "\uffff\1\2\1\36\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
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
            return "3764:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA66_0==43) ) {s = 2;}

                        else if ( (LA66_0==73) && (synpred26_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA66_0==46) && (synpred26_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA66_0>=RULE_COLOR && LA66_0<=RULE_DECIMAL)||LA66_0==15||LA66_0==32||(LA66_0>=35 && LA66_0<=36)||LA66_0==40||LA66_0==45||LA66_0==49||LA66_0==51||LA66_0==53||(LA66_0>=57 && LA66_0<=58)||LA66_0==61||(LA66_0>=63 && LA66_0<=70)) ) {s = 5;}

                        else if ( (LA66_0==44) ) {s = 30;}

                         
                        input.seek(index66_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 4;}

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
        "\1\2\76\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA68_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA68_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\26\2\1\1\1"+
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
            return "3843:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred27_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
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
    static final String DFA70_eotS =
        "\77\uffff";
    static final String DFA70_eofS =
        "\1\34\76\uffff";
    static final String DFA70_minS =
        "\1\4\33\0\43\uffff";
    static final String DFA70_maxS =
        "\1\111\33\0\43\uffff";
    static final String DFA70_acceptS =
        "\34\uffff\1\2\41\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\43\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\23\1\21\1\15\1\16\1\17\1\1\5\uffff\1\25\1\uffff\2\34\1\uffff"+
            "\2\34\1\uffff\11\34\1\10\2\34\1\4\1\3\3\34\1\2\2\34\1\33\1\34"+
            "\1\12\1\uffff\2\34\1\24\1\34\1\7\1\34\1\6\3\34\1\26\1\27\2\34"+
            "\1\11\1\uffff\1\5\1\13\1\14\1\20\1\22\1\30\1\31\1\32\3\34",
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

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "4167:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_3 = input.LA(1);

                         
                        int index70_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA70_4 = input.LA(1);

                         
                        int index70_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA70_5 = input.LA(1);

                         
                        int index70_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA70_6 = input.LA(1);

                         
                        int index70_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA70_7 = input.LA(1);

                         
                        int index70_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA70_8 = input.LA(1);

                         
                        int index70_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA70_9 = input.LA(1);

                         
                        int index70_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA70_10 = input.LA(1);

                         
                        int index70_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA70_11 = input.LA(1);

                         
                        int index70_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA70_12 = input.LA(1);

                         
                        int index70_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA70_13 = input.LA(1);

                         
                        int index70_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA70_14 = input.LA(1);

                         
                        int index70_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA70_15 = input.LA(1);

                         
                        int index70_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA70_16 = input.LA(1);

                         
                        int index70_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA70_17 = input.LA(1);

                         
                        int index70_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA70_18 = input.LA(1);

                         
                        int index70_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA70_19 = input.LA(1);

                         
                        int index70_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA70_20 = input.LA(1);

                         
                        int index70_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA70_21 = input.LA(1);

                         
                        int index70_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA70_22 = input.LA(1);

                         
                        int index70_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA70_23 = input.LA(1);

                         
                        int index70_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA70_24 = input.LA(1);

                         
                        int index70_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA70_25 = input.LA(1);

                         
                        int index70_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA70_26 = input.LA(1);

                         
                        int index70_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA70_27 = input.LA(1);

                         
                        int index70_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGraphViewStyle()) ) {s = 62;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\100\uffff";
    static final String DFA85_eofS =
        "\1\2\77\uffff";
    static final String DFA85_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA85_maxS =
        "\1\111\1\0\76\uffff";
    static final String DFA85_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA85_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA85_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\5\2\1\uffff\11\2\1\1\15\2\1\uffff\17"+
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
            "",
            ""
    };

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "4683:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_1 = input.LA(1);

                         
                        int index85_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalGraphViewStyle()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index85_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleStyleSheet_in_entryRuleStyleSheet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyleSheet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleStyleSheet131 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleStyleSheet144 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyleSheet165 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStyleSheet177 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyleSheet200 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleStyleSheet221 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleImport305 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard421 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNameWithWildcard440 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedNameWithWildcard453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleStyle542 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyle565 = new BitSet(new long[]{0x0020000000300002L});
    public static final BitSet FOLLOW_20_in_ruleStyle578 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyle601 = new BitSet(new long[]{0x0020000000300002L});
    public static final BitSet FOLLOW_21_in_ruleStyle616 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleStyle637 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleStyle660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral808 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1200 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1216 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1266 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1319 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpSingleAssign1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpMultiAssign1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1614 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1667 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1690 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOr1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1873 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1926 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1949 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpAnd2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2132 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2185 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2208 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpEquality2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpEquality2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2412 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_28_in_ruleXRelationalExpression2448 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2471 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2532 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2555 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpCompare2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2798 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2851 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2874 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3078 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3131 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3154 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpAdd3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3358 = new BitSet(new long[]{0x000000E000040002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3411 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3434 = new BitSet(new long[]{0x000000E000040002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpMulti3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3687 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpUnary3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3957 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleXCastedExpression3992 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4015 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4110 = new BitSet(new long[]{0x0000060000020002L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall4159 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4182 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4198 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4220 = new BitSet(new long[]{0x0000060000020002L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall4306 = new BitSet(new long[]{0x0000000100000200L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4330 = new BitSet(new long[]{0x0000000100000200L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4367 = new BitSet(new long[]{0x0000000100000200L});
    public static final BitSet FOLLOW_32_in_ruleXMemberFeatureCall4396 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4417 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_20_in_ruleXMemberFeatureCall4430 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4451 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_31_in_ruleXMemberFeatureCall4465 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4490 = new BitSet(new long[]{0x00002E0000020002L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4524 = new BitSet(new long[]{0xA62A7919000083F0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4609 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4637 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleXMemberFeatureCall4650 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4671 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4688 = new BitSet(new long[]{0x0000260000020002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4721 = new BitSet(new long[]{0x0000060000020002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5233 = new BitSet(new long[]{0xBE2AE919000083F0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5304 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_20_in_ruleXClosure5317 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5338 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5360 = new BitSet(new long[]{0xBE2AA919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5397 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5511 = new BitSet(new long[]{0xBE2B2919000083F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_48_in_ruleXExpressionInClosure5524 = new BitSet(new long[]{0xBE2A2919000083F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5682 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_20_in_ruleXShortClosure5695 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5716 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_46_in_ruleXShortClosure5738 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXParenthesizedExpression5857 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5879 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXParenthesizedExpression5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression5982 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXIfExpression5994 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6015 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression6027 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6048 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression6069 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6185 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6226 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6238 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6262 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6274 = new BitSet(new long[]{0x0110080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6295 = new BitSet(new long[]{0x01D0080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6309 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6321 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6342 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6448 = new BitSet(new long[]{0x0110000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart6462 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6483 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6497 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXForLoopExpression6610 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXForLoopExpression6622 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6643 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXForLoopExpression6655 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6676 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXForLoopExpression6688 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXWhileExpression6801 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXWhileExpression6813 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6834 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXWhileExpression6846 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression6959 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6980 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXDoWhileExpression6992 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXDoWhileExpression7004 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7025 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXDoWhileExpression7037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression7129 = new BitSet(new long[]{0xBEAA2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7151 = new BitSet(new long[]{0xBEAB2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_48_in_ruleXBlockExpression7164 = new BitSet(new long[]{0xBEAA2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_55_in_ruleXBlockExpression7180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXVariableDeclaration7398 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration7429 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7477 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7498 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7527 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleXVariableDeclaration7541 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7656 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7770 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7894 = new BitSet(new long[]{0x2000000100000200L});
    public static final BitSet FOLLOW_32_in_ruleXFeatureCall7908 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7929 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_20_in_ruleXFeatureCall7942 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7963 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_31_in_ruleXFeatureCall7977 = new BitSet(new long[]{0x2000000100000200L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8002 = new BitSet(new long[]{0x0000280000000002L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall8036 = new BitSet(new long[]{0xA62A7919000083F0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8121 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8149 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleXFeatureCall8162 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8183 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall8200 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleIdOrSuper8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8452 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleStaticQualifier8470 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXConstructorCall8567 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8590 = new BitSet(new long[]{0x0000280100000002L});
    public static final BitSet FOLLOW_32_in_ruleXConstructorCall8611 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8633 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_20_in_ruleXConstructorCall8646 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8667 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_31_in_ruleXConstructorCall8681 = new BitSet(new long[]{0x0000280000000002L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8704 = new BitSet(new long[]{0xA62A7919000083F0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8777 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8805 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleXConstructorCall8818 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8839 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall8856 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXBooleanLiteral8983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXNullLiteral9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTypeLiteral9408 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXTypeLiteral9420 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9443 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXTypeLiteral9455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXThrowExpression9547 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXReturnExpression9660 = new BitSet(new long[]{0xA62A2919000083F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTryCatchFinallyExpression9784 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9835 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9857 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9901 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXCatchClause10015 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXCatchClause10028 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10049 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXCatchClause10061 = new BitSet(new long[]{0xA62A2919000083F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10177 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedName10205 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10228 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10365 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10391 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleNumber10411 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10564 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleJvmTypeReference10602 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleJvmTypeReference10614 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef10729 = new BitSet(new long[]{0x0000180000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10751 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleXFunctionTypeRef10764 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10785 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef10801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleXFunctionTypeRef10815 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10930 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleJvmParameterizedTypeReference10951 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10973 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_20_in_ruleJvmParameterizedTypeReference10986 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11007 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_31_in_ruleJvmParameterizedTypeReference11021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmWildcardTypeReference11234 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmUpperBound11368 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBoundAnded11472 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleJvmLowerBound11576 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewStyle1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewStyle1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewStyle1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewStyle2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred5_InternalGraphViewStyle2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewStyle2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewStyle2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewStyle3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewStyle3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred10_InternalGraphViewStyle3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred11_InternalGraphViewStyle4127 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalGraphViewStyle4136 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewStyle4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred12_InternalGraphViewStyle4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred12_InternalGraphViewStyle4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred12_InternalGraphViewStyle4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred13_InternalGraphViewStyle4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4558 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_20_in_synpred14_InternalGraphViewStyle4565 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4572 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_46_in_synpred14_InternalGraphViewStyle4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalGraphViewStyle4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGraphViewStyle5250 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_20_in_synpred16_InternalGraphViewStyle5257 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGraphViewStyle5264 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_46_in_synpred16_InternalGraphViewStyle5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred18_InternalGraphViewStyle6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalGraphViewStyle6201 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred19_InternalGraphViewStyle6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalGraphViewStyle7447 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalGraphViewStyle7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred21_InternalGraphViewStyle8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalGraphViewStyle8070 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_20_in_synpred22_InternalGraphViewStyle8077 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalGraphViewStyle8084 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_46_in_synpred22_InternalGraphViewStyle8098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalGraphViewStyle8216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred24_InternalGraphViewStyle8603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred25_InternalGraphViewStyle8696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred26_InternalGraphViewStyle8726 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_20_in_synpred26_InternalGraphViewStyle8733 = new BitSet(new long[]{0x0000080000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred26_InternalGraphViewStyle8740 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_46_in_synpred26_InternalGraphViewStyle8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred27_InternalGraphViewStyle8872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred28_InternalGraphViewStyle9674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred29_InternalGraphViewStyle9819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_synpred30_InternalGraphViewStyle9849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred32_InternalGraphViewStyle10196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred33_InternalGraphViewStyle10579 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_synpred33_InternalGraphViewStyle10583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred34_InternalGraphViewStyle10943 = new BitSet(new long[]{0x0000000000000002L});

}