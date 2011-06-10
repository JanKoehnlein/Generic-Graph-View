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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stylesheet'", "'import'", "'.'", "'*'", "'{'", "'}'", "':'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:76:1: ruleStyleSheet returns [EObject current=null] : (otherlv_0= 'stylesheet' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_styles_3_0= ruleStyle ) )* ) ;
    public final EObject ruleStyleSheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_styles_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:79:28: ( (otherlv_0= 'stylesheet' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_styles_3_0= ruleStyle ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:80:1: (otherlv_0= 'stylesheet' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_styles_3_0= ruleStyle ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:80:1: (otherlv_0= 'stylesheet' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_styles_3_0= ruleStyle ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:80:3: otherlv_0= 'stylesheet' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_styles_3_0= ruleStyle ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStyleSheet122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStyleSheetAccess().getStylesheetKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:86:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStyleSheetAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStyleSheet143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStyleSheetRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:102:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStyleSheetAccess().getImportsImportParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleStyleSheet164);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStyleSheetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:120:3: ( (lv_styles_3_0= ruleStyle ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:121:1: (lv_styles_3_0= ruleStyle )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:121:1: (lv_styles_3_0= ruleStyle )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:122:3: lv_styles_3_0= ruleStyle
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStyleSheetAccess().getStylesStyleParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStyle_in_ruleStyleSheet186);
            	    lv_styles_3_0=ruleStyle();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStyleSheetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"styles",
            	              		lv_styles_3_0, 
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:146:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:147:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:148:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport223);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport233); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:155:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:158:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:159:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:159:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:159:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:163:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:164:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:164:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:165:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport291);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:189:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:190:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:191:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard328);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard339); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:198:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:201:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:202:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:202:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:203:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard386);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:213:1: (kw= '.' kw= '*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:214:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildcard405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildcard418); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:233:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:234:2: (iv_ruleStyle= ruleStyle EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:235:2: iv_ruleStyle= ruleStyle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStyleRule()); 
            }
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle460);
            iv_ruleStyle=ruleStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStyle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle470); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:242:1: ruleStyle returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_javaClass_1_0= ruleJvmTypeReference ) ) otherlv_2= '{' ( (lv_settings_3_0= ruleSetting ) )* otherlv_4= '}' ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_javaClass_1_0 = null;

        EObject lv_settings_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:245:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_javaClass_1_0= ruleJvmTypeReference ) ) otherlv_2= '{' ( (lv_settings_3_0= ruleSetting ) )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:246:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_javaClass_1_0= ruleJvmTypeReference ) ) otherlv_2= '{' ( (lv_settings_3_0= ruleSetting ) )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:246:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_javaClass_1_0= ruleJvmTypeReference ) ) otherlv_2= '{' ( (lv_settings_3_0= ruleSetting ) )* otherlv_4= '}' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:246:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_javaClass_1_0= ruleJvmTypeReference ) ) otherlv_2= '{' ( (lv_settings_3_0= ruleSetting ) )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:246:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:247:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:247:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:248:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStyle512); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getStyleAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStyleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:264:2: ( (lv_javaClass_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:265:1: (lv_javaClass_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:265:1: (lv_javaClass_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:266:3: lv_javaClass_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStyleAccess().getJavaClassJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleStyle538);
            lv_javaClass_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStyleRule());
              	        }
                     		set(
                     			current, 
                     			"javaClass",
                      		lv_javaClass_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleStyle550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStyleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:286:1: ( (lv_settings_3_0= ruleSetting ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:287:1: (lv_settings_3_0= ruleSetting )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:287:1: (lv_settings_3_0= ruleSetting )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:288:3: lv_settings_3_0= ruleSetting
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStyleAccess().getSettingsSettingParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSetting_in_ruleStyle571);
            	    lv_settings_3_0=ruleSetting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStyleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"settings",
            	              		lv_settings_3_0, 
            	              		"Setting");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleStyle584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStyleAccess().getRightCurlyBracketKeyword_4());
                  
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


    // $ANTLR start "entryRuleSetting"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:316:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:317:2: (iv_ruleSetting= ruleSetting EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:318:2: iv_ruleSetting= ruleSetting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSettingRule()); 
            }
            pushFollow(FOLLOW_ruleSetting_in_entryRuleSetting620);
            iv_ruleSetting=ruleSetting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetting; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetting630); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetting"


    // $ANTLR start "ruleSetting"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:325:1: ruleSetting returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:328:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:329:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:329:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:329:2: ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:329:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:330:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:330:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:331:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSettingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSettingAccess().getFeatureJvmIdentifiableElementCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSetting678);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSetting690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSettingAccess().getColonKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:348:1: ( (lv_value_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:349:1: (lv_value_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:349:1: (lv_value_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:350:3: lv_value_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSettingAccess().getValueXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleSetting711);
            lv_value_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSettingRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
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
    // $ANTLR end "ruleSetting"


    // $ANTLR start "entryRuleXExpression"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:374:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:375:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:376:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression747);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression757); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:383:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:386:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:388:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression803);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:404:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:405:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:406:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment837);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment847); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:413:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:416:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:417:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:417:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||(LA6_1>=RULE_ID && LA6_1<=RULE_STRING)||(LA6_1>=13 && LA6_1<=17)||(LA6_1>=19 && LA6_1<=43)||(LA6_1>=45 && LA6_1<=69)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==18) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)||LA6_0==15||LA6_0==28||(LA6_0>=31 && LA6_0<=32)||LA6_0==36||LA6_0==41||LA6_0==43||LA6_0==46||LA6_0==48||(LA6_0>=51 && LA6_0<=53)||LA6_0==57||(LA6_0>=59 && LA6_0<=66)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:417:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:417:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:417:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:417:3: ()
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:418:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:423:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:424:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:424:1: ( ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:425:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment905);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment921);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:446:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:447:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:447:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:448:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment941);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:465:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:465:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:466:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment971);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:474:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==19) ) {
                        int LA5_1 = input.LA(2);

                        if ( (synpred1_InternalGraphViewStyle()) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:474:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:474:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:474:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:479:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:479:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:479:7: ()
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:480:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:485:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:486:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:486:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:487:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1024);
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

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:500:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:501:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:501:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:502:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1047);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:526:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:527:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:528:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1087);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1098); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:535:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:538:28: (kw= '=' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:540:2: kw= '='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpSingleAssign1135); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:553:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:554:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:555:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1175);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1186); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:562:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:565:28: (kw= '+=' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:567:2: kw= '+='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpMultiAssign1223); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:580:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:581:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:582:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1262);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1272); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:589:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:592:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:593:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:593:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:594:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1319);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:602:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred2_InternalGraphViewStyle()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:602:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:602:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:602:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:607:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:607:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:607:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:608:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:613:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:614:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:614:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:615:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1372);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:628:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:629:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:629:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:630:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1395);
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
            	    break loop7;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:654:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:655:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:656:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1434);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1445); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:663:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:666:28: (kw= '||' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:668:2: kw= '||'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpOr1482); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:681:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:682:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:683:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1521);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1531); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:690:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:693:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:694:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:694:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:695:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1578);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:703:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred3_InternalGraphViewStyle()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:703:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:703:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:703:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:708:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:708:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:708:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:709:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:714:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:715:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:715:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:716:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1631);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:729:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:730:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:730:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:731:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1654);
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
            	    break loop8;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:755:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:756:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:757:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1693);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1704); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:764:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:767:28: (kw= '&&' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:769:2: kw= '&&'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpAnd1741); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:782:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:783:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:784:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1780);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1790); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:791:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:794:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:795:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:795:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:796:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1837);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:804:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred4_InternalGraphViewStyle()) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==23) ) {
                    int LA9_3 = input.LA(2);

                    if ( (synpred4_InternalGraphViewStyle()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:804:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:804:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:804:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:809:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:809:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:809:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:810:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:815:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:816:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:816:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:817:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1890);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:830:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:831:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:831:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:832:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1913);
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
            	    break loop9;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:856:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:857:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:858:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1952);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1963); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:865:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:868:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:869:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:869:1: (kw= '==' | kw= '!=' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:870:2: kw= '=='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality2001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:877:2: kw= '!='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality2020); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:890:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:891:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:892:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2060);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2070); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:899:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:902:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:903:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:903:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:904:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2117);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:912:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop11:
            do {
                int alt11=3;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (synpred5_InternalGraphViewStyle()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA11_3 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA11_4 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA11_5 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA11_6 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt11=2;
                    }


                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:912:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:912:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:912:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:912:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:912:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:914:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:914:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:914:6: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:915:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXRelationalExpression2153); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:924:3: ( ( ruleQualifiedName ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:925:1: ( ruleQualifiedName )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:925:1: ( ruleQualifiedName )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:926:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2178);
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:940:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:940:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:940:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:940:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:940:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:945:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:945:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:945:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:946:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:951:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:952:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:952:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:953:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2239);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:966:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:967:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:967:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:968:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2262);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:992:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:993:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:994:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2302);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2313); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1001:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1004:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1006:2: kw= '>='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2351); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1013:2: kw= '<='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1020:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1027:2: kw= '<'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2408); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1040:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1041:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1042:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2448);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2458); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1049:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1052:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1053:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1053:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1054:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2505);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1062:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred7_InternalGraphViewStyle()) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==30) ) {
                    int LA13_3 = input.LA(2);

                    if ( (synpred7_InternalGraphViewStyle()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1062:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1062:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1062:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1067:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1067:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1067:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1068:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1073:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1074:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1074:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1075:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2558);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1088:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1089:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1089:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1090:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2581);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1114:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1115:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1116:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2620);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2631); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1123:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1126:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1127:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1127:1: (kw= '->' | kw= '..' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==30) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1128:2: kw= '->'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1135:2: kw= '..'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2688); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1148:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1149:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1150:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2728);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2738); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1157:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1160:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1161:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1161:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1162:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2785);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1170:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred8_InternalGraphViewStyle()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==32) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred8_InternalGraphViewStyle()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1170:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1170:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1170:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1175:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1175:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1175:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1176:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1181:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1182:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1182:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1183:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2838);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1196:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1197:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1197:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1198:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2861);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1222:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1223:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1224:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2900);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2911); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1231:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1234:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1235:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1235:1: (kw= '+' | kw= '-' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( (LA16_0==32) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1236:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpAdd2949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1243:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd2968); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1256:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1257:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1258:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3008);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3018); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1265:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1268:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1269:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1269:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1270:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3065);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1278:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt17=1;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1278:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1278:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1278:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1283:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1283:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1283:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1284:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1289:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1290:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1290:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1291:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3118);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1304:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1305:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1305:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1306:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3141);
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
            	    break loop17;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1330:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1331:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1332:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3180);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3191); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1339:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1342:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1343:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1343:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt18=1;
                }
                break;
            case 33:
                {
                alt18=2;
                }
                break;
            case 34:
                {
                alt18=3;
                }
                break;
            case 35:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1344:2: kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleOpMulti3229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1351:2: kw= '**'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMulti3248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1358:2: kw= '/'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1365:2: kw= '%'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3286); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1378:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1379:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1380:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3326);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3336); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1387:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1390:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1391:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1391:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=31 && LA19_0<=32)||LA19_0==36) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||LA19_0==15||LA19_0==28||LA19_0==41||LA19_0==43||LA19_0==46||LA19_0==48||(LA19_0>=51 && LA19_0<=53)||LA19_0==57||(LA19_0>=59 && LA19_0<=66)) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1391:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1391:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1391:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1391:3: ()
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1392:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1397:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1398:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1398:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1399:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3394);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1412:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1413:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1413:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1414:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3415);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1432:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3444);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1448:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1449:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1450:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3480);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3491); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1457:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1460:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1461:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1461:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt20=1;
                }
                break;
            case 32:
                {
                alt20=2;
                }
                break;
            case 31:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1462:2: kw= '!'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpUnary3529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1469:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary3548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1476:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpUnary3567); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1489:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1490:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1491:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3607);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3617); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1498:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1501:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1502:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1502:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1503:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3664);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1511:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred10_InternalGraphViewStyle()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1511:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1511:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1511:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1513:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1513:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1513:6: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1514:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXCastedExpression3699); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1523:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1524:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1524:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1525:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3722);
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1549:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1550:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1551:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3760);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3770); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1558:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1561:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1562:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1562:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1563:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3817);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1571:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop28:
            do {
                int alt28=3;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred11_InternalGraphViewStyle()) ) {
                        alt28=1;
                    }
                    else if ( (synpred12_InternalGraphViewStyle()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred12_InternalGraphViewStyle()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA28_4 = input.LA(2);

                    if ( (synpred12_InternalGraphViewStyle()) ) {
                        alt28=2;
                    }


                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1571:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1571:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1571:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1571:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1571:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1577:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1577:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1577:26: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1578:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXMemberFeatureCall3866); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1587:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1588:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1588:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1589:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3889);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3905);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1610:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1611:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1611:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1612:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3927);
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1629:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1629:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1629:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1629:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1629:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1645:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1645:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1645:8: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1646:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1651:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case 13:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1651:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleXMemberFeatureCall4013); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1656:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1656:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1657:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1657:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1658:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall4037); if (state.failed) return current;
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
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1672:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1672:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1673:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1673:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1674:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4074); if (state.failed) return current;
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1687:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==28) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1687:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4103); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1691:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1692:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1692:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1693:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4124);
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

            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1709:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==40) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1709:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4137); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1713:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1714:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1714:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1715:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4158);
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
            	            	    break loop23;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4172); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1735:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1736:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1736:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1737:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4197);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1750:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt27=2;
            	    alt27 = dfa27.predict(input);
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1750:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1750:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1750:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1757:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1758:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4231); if (state.failed) return current;
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

            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1771:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt26=3;
            	            alt26 = dfa26.predict(input);
            	            switch (alt26) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1771:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1771:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1771:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1783:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1784:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4306);
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
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1801:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1801:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1801:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1801:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1802:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1802:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1803:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4334);
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

            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1819:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop25:
            	                    do {
            	                        int alt25=2;
            	                        int LA25_0 = input.LA(1);

            	                        if ( (LA25_0==40) ) {
            	                            alt25=1;
            	                        }


            	                        switch (alt25) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1819:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4347); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1823:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1824:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1824:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1825:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4368);
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
            	                    	    break loop25;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4385); if (state.failed) return current;
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1853:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1854:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1855:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4426);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4436); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1862:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1865:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1866:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1866:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt29=13;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt29=1;
                }
                break;
            case 15:
                {
                alt29=2;
                }
                break;
            case 48:
                {
                alt29=3;
                }
                break;
            case RULE_ID:
            case 28:
            case 57:
                {
                alt29=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 43:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt29=5;
                }
                break;
            case 46:
                {
                alt29=6;
                }
                break;
            case 51:
                {
                alt29=7;
                }
                break;
            case 52:
                {
                alt29=8;
                }
                break;
            case 53:
                {
                alt29=9;
                }
                break;
            case 64:
                {
                alt29=10;
                }
                break;
            case 65:
                {
                alt29=11;
                }
                break;
            case 66:
                {
                alt29=12;
                }
                break;
            case 41:
                {
                alt29=13;
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1867:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4483);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1877:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4510);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1887:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4537);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1897:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4564);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1907:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4591);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1917:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4618);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1927:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4645);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1937:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4672);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1947:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4699);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1957:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4726);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1967:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4753);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1977:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4780);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1987:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4807);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2003:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2004:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2005:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4842);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4852); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2012:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2015:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2016:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2016:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt30=1;
                }
                break;
            case 60:
            case 61:
                {
                alt30=2;
                }
                break;
            case RULE_INT:
                {
                alt30=3;
                }
                break;
            case 62:
                {
                alt30=4;
                }
                break;
            case RULE_STRING:
                {
                alt30=5;
                }
                break;
            case 63:
                {
                alt30=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2017:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4899);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2027:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4926);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2037:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral4953);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2047:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4980);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2057:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5007);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2067:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5034);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2083:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2084:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2085:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5069);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5079); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2092:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2095:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2096:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2096:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2096:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2096:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2097:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2106:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==41||LA32_0==69) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2106:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2106:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2107:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2107:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2108:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5147);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2124:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==40) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2124:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleXClosure5160); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2128:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2129:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2129:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2130:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5181);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5197); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2150:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2151:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2151:1: (lv_expression_6_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2152:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5218);
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

            otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5230); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2180:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2181:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2182:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5266);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5276); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2189:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2192:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2193:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2193:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2193:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2193:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2193:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2204:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2204:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2204:6: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2205:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2210:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==41||LA34_0==69) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2210:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2210:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2211:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2211:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2212:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5374);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2228:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==40) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2228:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXShortClosure5387); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2232:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2233:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2233:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2234:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5408);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXShortClosure5424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2254:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2255:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2255:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2256:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5447);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2280:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2281:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2282:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5483);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5493); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2289:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2292:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2293:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2293:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2293:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleXParenthesizedExpression5530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5552);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXParenthesizedExpression5563); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2318:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2319:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2320:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5599);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5609); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2327:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2330:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2331:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2331:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2331:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2331:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2332:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression5655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXIfExpression5667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2345:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2346:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2346:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2347:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5688);
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

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXIfExpression5700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2367:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2368:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2368:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2369:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5721);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2385:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                int LA35_1 = input.LA(2);

                if ( (synpred16_InternalGraphViewStyle()) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2385:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2385:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2385:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression5742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2390:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2391:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2391:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2392:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5764);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2416:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2417:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2418:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5802);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5812); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2425:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2428:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2429:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2429:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2429:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2429:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2430:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression5858); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2439:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==17) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2439:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2439:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2440:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2440:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2441:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression5880);
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

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression5892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2461:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2462:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2462:1: (lv_switch_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2463:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression5915);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleXSwitchExpression5927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2483:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||LA37_0==17||LA37_0==41||LA37_0==50||LA37_0==69) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2484:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2484:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2485:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5948);
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
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2501:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2501:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression5962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression5974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2509:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2510:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2510:1: (lv_default_9_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2511:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression5995);
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

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression6009); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2539:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2540:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2541:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6045);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6055); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2548:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2551:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2552:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2552:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2552:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2552:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==41||LA39_0==69) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2553:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2553:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2554:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6101);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2570:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2570:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXCasePart6115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2574:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2575:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2575:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2576:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6136);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXCasePart6150); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2596:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2597:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2597:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2598:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6171);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2622:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2623:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2624:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6207);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6217); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2631:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2634:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2635:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2635:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2635:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2635:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2636:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXForLoopExpression6263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXForLoopExpression6275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2649:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2650:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2650:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2651:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6296);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXForLoopExpression6308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2671:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2672:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2672:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2673:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6329);
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

            otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleXForLoopExpression6341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2693:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2694:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2694:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2695:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6362);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2719:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2720:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2721:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6398);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6408); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2728:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2731:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2732:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2732:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2732:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2732:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2733:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXWhileExpression6454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXWhileExpression6466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2746:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2747:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2747:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2748:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6487);
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

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXWhileExpression6499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2768:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2769:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2769:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2770:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6520);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2794:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2795:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2796:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6556);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6566); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2803:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2806:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2807:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2807:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2807:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2807:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2808:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXDoWhileExpression6612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2817:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2818:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2818:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2819:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6633);
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

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXDoWhileExpression6645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXDoWhileExpression6657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2843:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2844:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2844:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2845:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6678);
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

            otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleXDoWhileExpression6690); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2873:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2874:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2875:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6726);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6736); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2882:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2885:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2886:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2886:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2886:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2886:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2887:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleXBlockExpression6782); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2896:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_STRING)||LA42_0==15||LA42_0==28||(LA42_0>=31 && LA42_0<=32)||LA42_0==36||LA42_0==41||LA42_0==43||LA42_0==46||LA42_0==48||(LA42_0>=51 && LA42_0<=53)||(LA42_0>=55 && LA42_0<=57)||(LA42_0>=59 && LA42_0<=66)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2896:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2896:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2897:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2897:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2898:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6804);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2914:2: (otherlv_3= ';' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==54) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2914:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXBlockExpression6817); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression6833); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2930:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2931:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2932:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6869);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6879); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2939:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2942:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2943:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2943:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=55 && LA43_0<=56)) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_STRING)||LA43_0==15||LA43_0==28||(LA43_0>=31 && LA43_0<=32)||LA43_0==36||LA43_0==41||LA43_0==43||LA43_0==46||LA43_0==48||(LA43_0>=51 && LA43_0<=53)||LA43_0==57||(LA43_0>=59 && LA43_0<=66)) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2944:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6926);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2954:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6953);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2970:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2971:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2972:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration6988);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration6998); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2979:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2982:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2983:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2983:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2983:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2983:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2984:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2989:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            else if ( (LA44_0==56) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2989:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2989:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2990:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2990:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2991:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,55,FOLLOW_55_in_ruleXVariableDeclaration7051); if (state.failed) return current;
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3005:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleXVariableDeclaration7082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3009:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred17_InternalGraphViewStyle()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA45_0==41) && (synpred17_InternalGraphViewStyle())) {
                alt45=1;
            }
            else if ( (LA45_0==69) && (synpred17_InternalGraphViewStyle())) {
                alt45=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3009:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3009:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3009:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3017:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3017:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3017:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3018:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3018:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3019:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7130);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3035:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3036:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3036:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3037:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7151);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3054:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3054:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3055:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3055:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3056:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7180);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3072:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==18) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3072:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXVariableDeclaration7194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3076:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3077:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3077:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3078:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7215);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3102:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3103:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3104:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7253);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7263); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3111:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3114:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3115:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3115:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3115:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3115:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RULE_ID||LA47_1==13||LA47_1==28) ) {
                    alt47=1;
                }
            }
            else if ( (LA47_0==41||LA47_0==69) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3116:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3116:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3117:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7309);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3133:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3134:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3134:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3135:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7331);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3159:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3160:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3161:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7367);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7377); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3168:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3171:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3172:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3172:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3172:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3172:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3173:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3178:2: ( ( ruleStaticQualifier ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==58) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3179:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3179:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3180:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7434);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3193:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==28) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3193:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall7448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3197:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3198:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3198:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3199:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7469);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3215:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==40) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3215:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall7482); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3219:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3220:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3220:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3221:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7503);
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
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall7517); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3241:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3242:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3242:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3243:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7542);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3256:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3256:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3256:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3256:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3263:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3264:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7576); if (state.failed) return current;
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3277:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt52=3;
                    alt52 = dfa52.predict(input);
                    switch (alt52) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3277:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3277:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3277:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3289:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3290:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7651);
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
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3307:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3307:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3307:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3307:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3308:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3308:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3309:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7679);
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

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3325:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==40) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3325:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall7692); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3329:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3330:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3330:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3331:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7713);
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
                            	    break loop51;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall7730); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3359:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3360:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3361:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7769);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper7780); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3368:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3371:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3372:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3372:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            else if ( (LA54_0==57) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3373:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper7827);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3385:2: kw= 'super'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleIdOrSuper7851); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3398:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3399:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3400:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7892);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier7903); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3407:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3410:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3411:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3411:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    int LA55_2 = input.LA(2);

                    if ( (LA55_2==58) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3412:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier7950);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,58,FOLLOW_58_in_ruleStaticQualifier7968); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3436:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3437:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3438:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8009);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8019); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3445:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3448:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3449:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3449:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3449:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3449:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3450:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXConstructorCall8065); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3459:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3460:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3460:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3461:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8088);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3474:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==28) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3474:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3478:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3479:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3479:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3480:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8122);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3496:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==40) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3496:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleXConstructorCall8135); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3500:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3501:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3501:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3502:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8156);
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
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8184); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3526:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt59=3;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3526:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3526:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3526:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3538:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3539:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8246);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3556:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3556:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3556:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3556:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3557:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3557:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3558:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8274);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3574:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==40) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3574:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,40,FOLLOW_40_in_ruleXConstructorCall8287); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3578:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3579:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3579:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3580:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8308);
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
                    	    break loop58;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall8325); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3608:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3609:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3610:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8361);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8371); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3617:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3620:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3621:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3621:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3621:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3621:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3622:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3627:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==60) ) {
                alt60=1;
            }
            else if ( (LA60_0==61) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3627:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXBooleanLiteral8418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3632:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3632:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3633:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3633:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3634:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,61,FOLLOW_61_in_ruleXBooleanLiteral8442); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3655:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3656:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3657:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8492);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8502); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3664:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3667:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3668:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3668:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3668:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3668:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3669:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXNullLiteral8548); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3686:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3687:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3688:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8584);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8594); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3695:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3698:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3699:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3699:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3699:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3699:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3700:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3705:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3706:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3706:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3707:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8645); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3731:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3732:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3733:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8686);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8696); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3740:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3743:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3744:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3744:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3744:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3744:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3745:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3750:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3751:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3751:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3752:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral8747); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3776:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3777:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3778:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8788);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral8798); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3785:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3788:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3789:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3789:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3789:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3789:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3790:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXTypeLiteral8844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXTypeLiteral8856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3803:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3804:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3804:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3805:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8879);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXTypeLiteral8891); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3830:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3831:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3832:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8927);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression8937); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3839:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3842:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3843:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3843:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3843:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3843:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3844:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXThrowExpression8983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3853:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3854:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3854:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3855:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9004);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3879:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3880:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3881:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9040);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9050); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3888:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3891:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3892:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3892:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3892:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3892:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3893:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXReturnExpression9096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3902:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3902:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3907:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3908:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9127);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3932:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3933:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3934:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9164);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9174); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3941:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3944:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3945:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3945:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3945:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3945:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3946:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXTryCatchFinallyExpression9220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3955:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3956:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3956:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3957:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9241);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3973:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==68) ) {
                alt64=1;
            }
            else if ( (LA64_0==67) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3973:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3973:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3973:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3973:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==68) ) {
                            int LA62_2 = input.LA(2);

                            if ( (synpred22_InternalGraphViewStyle()) ) {
                                alt62=1;
                            }


                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3973:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3975:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3976:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9271);
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
                    	    if ( cnt62 >= 1 ) break loop62;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3992:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==67) ) {
                        int LA63_1 = input.LA(2);

                        if ( (synpred23_InternalGraphViewStyle()) ) {
                            alt63=1;
                        }
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3992:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3992:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3992:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,67,FOLLOW_67_in_ruleXTryCatchFinallyExpression9293); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3997:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3998:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3998:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3999:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9315);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4016:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4016:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4016:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleXTryCatchFinallyExpression9337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4020:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4021:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4021:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4022:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9358);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4046:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4047:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4048:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9396);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9406); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4055:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4058:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4059:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4059:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4059:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4059:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4059:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleXCatchClause9451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleXCatchClause9464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4068:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4069:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4069:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4070:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9485);
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

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXCatchClause9497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4090:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4091:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4091:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4092:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9518);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4116:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4117:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4118:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9555);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9566); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4125:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4128:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4129:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4129:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4130:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9613);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4140:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==13) ) {
                    int LA65_2 = input.LA(2);

                    if ( (LA65_2==RULE_ID) ) {
                        int LA65_3 = input.LA(3);

                        if ( (synpred25_InternalGraphViewStyle()) ) {
                            alt65=1;
                        }


                    }


                }


                switch (alt65) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4140:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4140:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4140:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedName9641); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9664);
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
            	    break loop65;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4167:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4168:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4169:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9711);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9721); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4176:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4179:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4180:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4180:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            else if ( (LA66_0==41||LA66_0==69) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4181:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9768);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4191:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9795);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4207:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4208:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4209:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9830);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef9840); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4216:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4219:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4220:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4220:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4220:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4220:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==41) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4220:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef9878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4224:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4225:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4225:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4226:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9899);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4242:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==40) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4242:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXFunctionTypeRef9912); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4246:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4247:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4247:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4248:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9933);
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
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXFunctionTypeRef9947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,69,FOLLOW_69_in_ruleXFunctionTypeRef9961); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4272:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4273:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4273:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4274:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9982);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4298:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4299:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4300:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10018);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10028); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4307:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4310:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4311:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4311:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4311:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4311:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4312:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4312:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4313:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10076);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4326:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4326:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4326:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4326:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference10097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4331:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4332:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4332:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4333:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10119);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4349:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==40) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4349:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleJvmParameterizedTypeReference10132); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4353:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4354:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4354:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4355:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10153);
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
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference10167); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4383:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4384:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4385:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10205);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10215); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4392:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4395:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4396:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4396:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID||LA71_0==41||LA71_0==69) ) {
                alt71=1;
            }
            else if ( (LA71_0==70) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4397:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10262);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4407:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10289);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4423:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4424:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4425:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10324);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10334); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4432:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4435:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4436:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4436:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4436:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4436:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4437:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleJvmWildcardTypeReference10380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4446:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==71) ) {
                alt72=1;
            }
            else if ( (LA72_0==57) ) {
                alt72=2;
            }
            switch (alt72) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4446:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4446:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4447:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4447:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4448:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10402);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4465:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4465:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4466:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4466:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4467:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10429);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4491:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4492:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4493:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10467);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound10477); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4500:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4503:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4504:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4504:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4504:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleJvmUpperBound10514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4508:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4509:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4509:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4510:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10535);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4534:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4535:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4536:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10571);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10581); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4543:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4546:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4547:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4547:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4547:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleJvmUpperBoundAnded10618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4551:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4552:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4552:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4553:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10639);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4577:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4578:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4579:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10675);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound10685); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4586:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4589:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4590:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4590:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4590:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleJvmLowerBound10722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4594:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4595:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4595:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4596:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10743);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4622:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4623:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4624:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID10782);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID10793); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4631:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4634:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4635:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID10832); if (state.failed) return current;
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:474:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:474:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:474:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:474:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:474:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:475:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:475:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:476:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:476:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:477:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewStyle992);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:602:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:602:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:602:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:602:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:602:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:603:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:603:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:604:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:604:1: ( ruleOpOr )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:605:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewStyle1340);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:703:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:703:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:703:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:703:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:703:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:704:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:704:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:705:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:705:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:706:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewStyle1599);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:804:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:804:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:804:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:804:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:804:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:805:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:805:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:806:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:806:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:807:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewStyle1858);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:912:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:912:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:912:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:912:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:912:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:913:1: 
        {
        }

        match(input,24,FOLLOW_24_in_synpred5_InternalGraphViewStyle2134); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGraphViewStyle

    // $ANTLR start synpred6_InternalGraphViewStyle
    public final void synpred6_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:940:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:940:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:940:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:940:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:940:10: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:941:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:941:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:942:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:942:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:943:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewStyle2207);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1062:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1062:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1062:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1062:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1062:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1063:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1063:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1064:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1064:1: ( ruleOpOther )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1065:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewStyle2526);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1170:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1170:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1170:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1170:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1170:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1171:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1171:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1172:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1172:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1173:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewStyle2806);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1278:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1278:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1278:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1278:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1278:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1279:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1279:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1280:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1280:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1281:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewStyle3086);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1511:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1511:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1511:4: ( () 'as' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1511:5: () 'as'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1511:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1512:1: 
        {
        }

        match(input,37,FOLLOW_37_in_synpred10_InternalGraphViewStyle3680); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalGraphViewStyle

    // $ANTLR start synpred11_InternalGraphViewStyle
    public final void synpred11_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1571:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1571:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1571:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1571:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1571:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1572:1: 
        {
        }

        match(input,13,FOLLOW_13_in_synpred11_InternalGraphViewStyle3834); if (state.failed) return ;
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1573:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1574:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1574:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1575:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalGraphViewStyle3843);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewStyle3849);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalGraphViewStyle

    // $ANTLR start synpred12_InternalGraphViewStyle
    public final void synpred12_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1629:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1629:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1629:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1629:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1629:10: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1630:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1630:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt73=3;
        switch ( input.LA(1) ) {
        case 13:
            {
            alt73=1;
            }
            break;
        case 38:
            {
            alt73=2;
            }
            break;
        case 39:
            {
            alt73=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 73, 0, input);

            throw nvae;
        }

        switch (alt73) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1630:4: '.'
                {
                match(input,13,FOLLOW_13_in_synpred12_InternalGraphViewStyle3952); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1632:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1632:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1633:1: ( '?.' )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1633:1: ( '?.' )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1634:2: '?.'
                {
                match(input,38,FOLLOW_38_in_synpred12_InternalGraphViewStyle3966); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1639:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1639:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1640:1: ( '*.' )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1640:1: ( '*.' )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1641:2: '*.'
                {
                match(input,39,FOLLOW_39_in_synpred12_InternalGraphViewStyle3986); if (state.failed) return ;

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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1750:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1751:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1751:1: ( '(' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1752:2: '('
        {
        match(input,41,FOLLOW_41_in_synpred13_InternalGraphViewStyle4213); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGraphViewStyle

    // $ANTLR start synpred14_InternalGraphViewStyle
    public final void synpred14_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1771:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1771:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1771:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1771:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1771:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1772:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1772:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt75=2;
        int LA75_0 = input.LA(1);

        if ( (LA75_0==RULE_ID||LA75_0==41||LA75_0==69) ) {
            alt75=1;
        }
        switch (alt75) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1772:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1772:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1773:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1773:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1774:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4265);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1776:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop74:
                do {
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==40) ) {
                        alt74=1;
                    }


                    switch (alt74) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1776:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,40,FOLLOW_40_in_synpred14_InternalGraphViewStyle4272); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1777:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1778:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1778:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1779:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4279);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop74;
                    }
                } while (true);


                }
                break;

        }

        match(input,44,FOLLOW_44_in_synpred14_InternalGraphViewStyle4289); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalGraphViewStyle

    // $ANTLR start synpred16_InternalGraphViewStyle
    public final void synpred16_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2385:4: ( 'else' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2385:6: 'else'
        {
        match(input,47,FOLLOW_47_in_synpred16_InternalGraphViewStyle5734); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalGraphViewStyle

    // $ANTLR start synpred17_InternalGraphViewStyle
    public final void synpred17_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3009:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3009:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3009:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3009:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3009:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3010:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3010:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3011:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewStyle7100);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3013:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3014:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3014:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3015:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalGraphViewStyle7109);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalGraphViewStyle

    // $ANTLR start synpred18_InternalGraphViewStyle
    public final void synpred18_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3256:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3257:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3257:1: ( '(' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3258:2: '('
        {
        match(input,41,FOLLOW_41_in_synpred18_InternalGraphViewStyle7558); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalGraphViewStyle

    // $ANTLR start synpred19_InternalGraphViewStyle
    public final void synpred19_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3277:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3277:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3277:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3277:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3277:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3278:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3278:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt79=2;
        int LA79_0 = input.LA(1);

        if ( (LA79_0==RULE_ID||LA79_0==41||LA79_0==69) ) {
            alt79=1;
        }
        switch (alt79) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3278:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3278:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3279:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3279:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3280:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewStyle7610);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3282:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop78:
                do {
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==40) ) {
                        alt78=1;
                    }


                    switch (alt78) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3282:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,40,FOLLOW_40_in_synpred19_InternalGraphViewStyle7617); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3283:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3284:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3284:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3285:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewStyle7624);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop78;
                    }
                } while (true);


                }
                break;

        }

        match(input,44,FOLLOW_44_in_synpred19_InternalGraphViewStyle7634); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalGraphViewStyle

    // $ANTLR start synpred20_InternalGraphViewStyle
    public final void synpred20_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3526:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3526:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3526:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3526:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3526:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3527:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3527:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==RULE_ID||LA81_0==41||LA81_0==69) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3527:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3527:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3528:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3528:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3529:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewStyle8205);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3531:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop80:
                do {
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==40) ) {
                        alt80=1;
                    }


                    switch (alt80) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3531:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,40,FOLLOW_40_in_synpred20_InternalGraphViewStyle8212); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3532:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3533:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3533:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3534:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewStyle8219);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop80;
                    }
                } while (true);


                }
                break;

        }

        match(input,44,FOLLOW_44_in_synpred20_InternalGraphViewStyle8229); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalGraphViewStyle

    // $ANTLR start synpred21_InternalGraphViewStyle
    public final void synpred21_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3902:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3903:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3903:1: ( ruleXExpression )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3904:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewStyle9110);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalGraphViewStyle

    // $ANTLR start synpred22_InternalGraphViewStyle
    public final void synpred22_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3973:5: ( 'catch' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3973:7: 'catch'
        {
        match(input,68,FOLLOW_68_in_synpred22_InternalGraphViewStyle9255); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalGraphViewStyle

    // $ANTLR start synpred23_InternalGraphViewStyle
    public final void synpred23_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3992:5: ( 'finally' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3992:7: 'finally'
        {
        match(input,67,FOLLOW_67_in_synpred23_InternalGraphViewStyle9285); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalGraphViewStyle

    // $ANTLR start synpred25_InternalGraphViewStyle
    public final void synpred25_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4140:3: ( '.' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4141:2: '.'
        {
        match(input,13,FOLLOW_13_in_synpred25_InternalGraphViewStyle9632); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalGraphViewStyle

    // $ANTLR start synpred26_InternalGraphViewStyle
    public final void synpred26_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4326:4: ( '<' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4326:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred26_InternalGraphViewStyle10089); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalGraphViewStyle

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
    public final boolean synpred17_InternalGraphViewStyle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalGraphViewStyle_fragment(); // can never throw exception
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


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA70 dfa70 = new DFA70(this);
    static final String DFA27_eotS =
        "\74\uffff";
    static final String DFA27_eofS =
        "\1\2\73\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA27_maxS =
        "\1\105\1\0\72\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA27_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA27_transitionS = {
            "\3\2\6\uffff\5\2\1\uffff\26\2\1\1\2\2\1\uffff\15\2\1\uffff\13"+
            "\2",
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
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1750:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\34\uffff";
    static final String DFA26_eofS =
        "\34\uffff";
    static final String DFA26_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA26_maxS =
        "\1\105\2\0\31\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA26_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\2\5\10\uffff\1\5\14\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\2\uffff\3\5"+
            "\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1771:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0==RULE_ID) ) {s = 1;}

                        else if ( (LA26_0==41) ) {s = 2;}

                        else if ( (LA26_0==69) && (synpred14_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA26_0==44) && (synpred14_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA26_0>=RULE_INT && LA26_0<=RULE_STRING)||LA26_0==15||LA26_0==28||(LA26_0>=31 && LA26_0<=32)||LA26_0==36||LA26_0==43||LA26_0==46||LA26_0==48||(LA26_0>=51 && LA26_0<=53)||LA26_0==57||(LA26_0>=59 && LA26_0<=66)) ) {s = 5;}

                        else if ( (LA26_0==42) ) {s = 27;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\74\uffff";
    static final String DFA53_eofS =
        "\1\2\73\uffff";
    static final String DFA53_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA53_maxS =
        "\1\105\1\0\72\uffff";
    static final String DFA53_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA53_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA53_transitionS = {
            "\3\2\6\uffff\5\2\1\uffff\26\2\1\1\2\2\1\uffff\15\2\1\uffff\13"+
            "\2",
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
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "3256:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index53_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\34\uffff";
    static final String DFA52_eofS =
        "\34\uffff";
    static final String DFA52_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA52_maxS =
        "\1\105\2\0\31\uffff";
    static final String DFA52_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA52_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\1\2\5\10\uffff\1\5\14\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\2\uffff\3\5"+
            "\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "3277:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_0 = input.LA(1);

                         
                        int index52_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA52_0==RULE_ID) ) {s = 1;}

                        else if ( (LA52_0==41) ) {s = 2;}

                        else if ( (LA52_0==69) && (synpred19_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA52_0==44) && (synpred19_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA52_0>=RULE_INT && LA52_0<=RULE_STRING)||LA52_0==15||LA52_0==28||(LA52_0>=31 && LA52_0<=32)||LA52_0==36||LA52_0==43||LA52_0==46||LA52_0==48||(LA52_0>=51 && LA52_0<=53)||LA52_0==57||(LA52_0>=59 && LA52_0<=66)) ) {s = 5;}

                        else if ( (LA52_0==42) ) {s = 27;}

                         
                        input.seek(index52_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_1 = input.LA(1);

                         
                        int index52_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index52_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA52_2 = input.LA(1);

                         
                        int index52_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index52_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
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
        "\1\105\2\0\31\uffff";
    static final String DFA59_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA59_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\1\2\5\10\uffff\1\5\14\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\2\uffff\3\5"+
            "\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "3526:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA59_0==41) ) {s = 2;}

                        else if ( (LA59_0==69) && (synpred20_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA59_0==44) && (synpred20_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA59_0>=RULE_INT && LA59_0<=RULE_STRING)||LA59_0==15||LA59_0==28||(LA59_0>=31 && LA59_0<=32)||LA59_0==36||LA59_0==43||LA59_0==46||LA59_0==48||(LA59_0>=51 && LA59_0<=53)||LA59_0==57||(LA59_0>=59 && LA59_0<=66)) ) {s = 5;}

                        else if ( (LA59_0==42) ) {s = 27;}

                         
                        input.seek(index59_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGraphViewStyle()) ) {s = 4;}

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
    static final String DFA61_eotS =
        "\74\uffff";
    static final String DFA61_eofS =
        "\1\31\73\uffff";
    static final String DFA61_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA61_maxS =
        "\1\105\30\0\43\uffff";
    static final String DFA61_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA61_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\1\1\15\1\17\6\uffff\2\31\1\6\2\31\1\uffff\11\31\1\10\2\31"+
            "\1\4\1\3\3\31\1\2\4\31\1\30\1\31\1\12\1\uffff\1\31\1\21\1\31"+
            "\1\7\2\31\1\22\1\23\1\24\3\31\1\11\1\uffff\1\5\1\13\1\14\1\16"+
            "\1\20\1\25\1\26\1\27\3\31",
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

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "3902:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_3 = input.LA(1);

                         
                        int index61_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA61_4 = input.LA(1);

                         
                        int index61_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA61_5 = input.LA(1);

                         
                        int index61_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA61_6 = input.LA(1);

                         
                        int index61_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA61_7 = input.LA(1);

                         
                        int index61_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA61_8 = input.LA(1);

                         
                        int index61_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA61_9 = input.LA(1);

                         
                        int index61_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA61_10 = input.LA(1);

                         
                        int index61_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA61_11 = input.LA(1);

                         
                        int index61_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA61_12 = input.LA(1);

                         
                        int index61_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA61_13 = input.LA(1);

                         
                        int index61_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA61_14 = input.LA(1);

                         
                        int index61_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA61_15 = input.LA(1);

                         
                        int index61_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA61_16 = input.LA(1);

                         
                        int index61_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA61_17 = input.LA(1);

                         
                        int index61_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA61_18 = input.LA(1);

                         
                        int index61_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA61_19 = input.LA(1);

                         
                        int index61_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA61_20 = input.LA(1);

                         
                        int index61_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA61_21 = input.LA(1);

                         
                        int index61_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA61_22 = input.LA(1);

                         
                        int index61_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA61_23 = input.LA(1);

                         
                        int index61_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA61_24 = input.LA(1);

                         
                        int index61_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index61_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\74\uffff";
    static final String DFA70_eofS =
        "\1\2\73\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA70_maxS =
        "\1\105\1\0\72\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA70_transitionS = {
            "\3\2\6\uffff\5\2\1\uffff\11\2\1\1\17\2\1\uffff\15\2\1\uffff"+
            "\13\2",
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
            return "4326:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index70_1);
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
 

    public static final BitSet FOLLOW_ruleStyleSheet_in_entryRuleStyleSheet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyleSheet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStyleSheet122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyleSheet143 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleImport_in_ruleStyleSheet164 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleStyleSheet186 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard386 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildcard405 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildcard418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStyle512 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleStyle538 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStyle550 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleSetting_in_ruleStyle571 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleStyle584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetting_in_entryRuleSetting620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetting630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSetting678 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSetting690 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleSetting711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment905 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment921 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment971 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1024 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpSingleAssign1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpMultiAssign1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1319 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1372 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1395 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpOr1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1578 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1631 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1654 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpAnd1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1837 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1890 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1913 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2117 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_24_in_ruleXRelationalExpression2153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2178 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2239 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2262 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2505 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2558 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2581 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2785 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2838 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2861 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpAdd2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3065 = new BitSet(new long[]{0x0000000E00004002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3118 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3141 = new BitSet(new long[]{0x0000000E00004002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpMulti3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMulti3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3394 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpUnary3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpUnary3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3664 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleXCastedExpression3699 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3722 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3817 = new BitSet(new long[]{0x000000C000002002L});
    public static final BitSet FOLLOW_13_in_ruleXMemberFeatureCall3866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3889 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3905 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3927 = new BitSet(new long[]{0x000000C000002002L});
    public static final BitSet FOLLOW_13_in_ruleXMemberFeatureCall4013 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall4037 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4074 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4103 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4124 = new BitSet(new long[]{0x0000010008000000L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4137 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4158 = new BitSet(new long[]{0x0000010008000000L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4197 = new BitSet(new long[]{0x000002C000002002L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4231 = new BitSet(new long[]{0xFA395E1190008070L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4306 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4334 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4347 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4368 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4385 = new BitSet(new long[]{0x000000C000002002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5125 = new BitSet(new long[]{0x0000120000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5147 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_40_in_ruleXClosure5160 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5181 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5197 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5218 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5374 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_40_in_ruleXShortClosure5387 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5408 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_44_in_ruleXShortClosure5424 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXParenthesizedExpression5530 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5552 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXParenthesizedExpression5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression5655 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIfExpression5667 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5688 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXIfExpression5700 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5721 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression5742 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression5858 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression5880 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression5892 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression5915 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSwitchExpression5927 = new BitSet(new long[]{0x0004020000020010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5948 = new BitSet(new long[]{0x0006020000030010L,0x0000000000000020L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression5962 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression5974 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression5995 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6101 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_50_in_ruleXCasePart6115 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6136 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXCasePart6150 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXForLoopExpression6263 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXForLoopExpression6275 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6296 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXForLoopExpression6308 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6329 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXForLoopExpression6341 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXWhileExpression6454 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXWhileExpression6466 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6487 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXWhileExpression6499 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXDoWhileExpression6612 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6633 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXDoWhileExpression6645 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXDoWhileExpression6657 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6678 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXDoWhileExpression6690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXBlockExpression6782 = new BitSet(new long[]{0xFBB94A1190018070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6804 = new BitSet(new long[]{0xFBF94A1190018070L,0x0000000000000007L});
    public static final BitSet FOLLOW_54_in_ruleXBlockExpression6817 = new BitSet(new long[]{0xFBB94A1190018070L,0x0000000000000007L});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression6833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration6988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXVariableDeclaration7051 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_56_in_ruleXVariableDeclaration7082 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7151 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7180 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXVariableDeclaration7194 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7434 = new BitSet(new long[]{0x0200000010000010L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall7448 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7469 = new BitSet(new long[]{0x0000010008000000L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall7482 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7503 = new BitSet(new long[]{0x0000010008000000L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall7517 = new BitSet(new long[]{0x0200000010000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7542 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7576 = new BitSet(new long[]{0xFA395E1190008070L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7651 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7679 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall7692 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7713 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall7730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper7780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper7827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleIdOrSuper7851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier7950 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleStaticQualifier7968 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXConstructorCall8065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8088 = new BitSet(new long[]{0x0000020010000000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8101 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8122 = new BitSet(new long[]{0x0000010008000000L});
    public static final BitSet FOLLOW_40_in_ruleXConstructorCall8135 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8156 = new BitSet(new long[]{0x0000010008000000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8170 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8184 = new BitSet(new long[]{0xFA395E1190008070L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8246 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8274 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_40_in_ruleXConstructorCall8287 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8308 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall8325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXBooleanLiteral8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXBooleanLiteral8442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXNullLiteral8548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral8747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral8798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXTypeLiteral8844 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXTypeLiteral8856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8879 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXTypeLiteral8891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression8937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXThrowExpression8983 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXReturnExpression9096 = new BitSet(new long[]{0xFA394A1190008072L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXTryCatchFinallyExpression9220 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleXTryCatchFinallyExpression9293 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTryCatchFinallyExpression9337 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXCatchClause9451 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXCatchClause9464 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9485 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXCatchClause9497 = new BitSet(new long[]{0xFA394A1190008070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9613 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName9641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9664 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef9840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef9878 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9899 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_40_in_ruleXFunctionTypeRef9912 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9933 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_42_in_ruleXFunctionTypeRef9947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleXFunctionTypeRef9961 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10076 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference10097 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10119 = new BitSet(new long[]{0x0000010008000000L});
    public static final BitSet FOLLOW_40_in_ruleJvmParameterizedTypeReference10132 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10153 = new BitSet(new long[]{0x0000010008000000L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference10167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleJvmWildcardTypeReference10380 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleJvmUpperBound10514 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleJvmUpperBoundAnded10618 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound10685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleJvmLowerBound10722 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID10782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID10793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID10832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewStyle992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewStyle1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewStyle1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewStyle1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred5_InternalGraphViewStyle2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewStyle2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewStyle2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewStyle2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewStyle3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred10_InternalGraphViewStyle3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred11_InternalGraphViewStyle3834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalGraphViewStyle3843 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewStyle3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred12_InternalGraphViewStyle3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred12_InternalGraphViewStyle3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred12_InternalGraphViewStyle3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred13_InternalGraphViewStyle4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4265 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_40_in_synpred14_InternalGraphViewStyle4272 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4279 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_44_in_synpred14_InternalGraphViewStyle4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred16_InternalGraphViewStyle5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewStyle7100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalGraphViewStyle7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred18_InternalGraphViewStyle7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewStyle7610 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_40_in_synpred19_InternalGraphViewStyle7617 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewStyle7624 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_44_in_synpred19_InternalGraphViewStyle7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewStyle8205 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_40_in_synpred20_InternalGraphViewStyle8212 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewStyle8219 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_44_in_synpred20_InternalGraphViewStyle8229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewStyle9110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_synpred22_InternalGraphViewStyle9255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_synpred23_InternalGraphViewStyle9285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred25_InternalGraphViewStyle9632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred26_InternalGraphViewStyle10089 = new BitSet(new long[]{0x0000000000000002L});

}