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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COLOR", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stylesheet'", "'import'", "'.'", "'*'", "'style'", "','", "'as'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'?.'", "'*.'", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:76:1: ruleStyleSheet returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'stylesheet' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_styles_3_0= ruleStyle ) )* ) ;
    public final EObject ruleStyleSheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_styles_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'stylesheet' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_styles_3_0= ruleStyle ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'stylesheet' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_styles_3_0= ruleStyle ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'stylesheet' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_styles_3_0= ruleStyle ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:80:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'stylesheet' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_styles_3_0= ruleStyle ) )*
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:120:2: ( (lv_styles_3_0= ruleStyle ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
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
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport270); if (state.failed) return current;
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

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:214:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildcard405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildcard418); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:242:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )? ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_javaClass_5_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:245:28: ( (otherlv_0= 'style' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:246:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:246:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:246:3: otherlv_0= 'style' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleStyle507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:250:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:251:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:251:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:252:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getStyleRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStyleAccess().getMappingsAbstractMappingCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStyle530);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:265:2: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:265:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStyle543); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getStyleAccess().getCommaKeyword_2_0());
            	          
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
            	       
            	      	        newCompositeNode(grammarAccess.getStyleAccess().getMappingsAbstractMappingCrossReference_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleStyle566);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:284:4: (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:284:6: otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStyle581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getStyleAccess().getAsKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:288:1: ( (lv_javaClass_5_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:289:1: (lv_javaClass_5_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:289:1: (lv_javaClass_5_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:290:3: lv_javaClass_5_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStyleAccess().getJavaClassJvmTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleStyle602);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:306:4: ( (lv_expression_6_0= ruleXBlockExpression ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==49) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:307:1: (lv_expression_6_0= ruleXBlockExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:307:1: (lv_expression_6_0= ruleXBlockExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:308:3: lv_expression_6_0= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStyleAccess().getExpressionXBlockExpressionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleStyle625);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:332:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:333:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:334:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral662);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral672); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:341:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:344:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:345:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:345:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 42:
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:346:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral719);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:356:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral746);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:366:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral773);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:376:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral800);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:386:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral827);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:396:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral854);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:406:5: this_XColorLiteral_6= ruleXColorLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXColorLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXColorLiteral_in_ruleXLiteral881);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:422:1: entryRuleXColorLiteral returns [EObject current=null] : iv_ruleXColorLiteral= ruleXColorLiteral EOF ;
    public final EObject entryRuleXColorLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXColorLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:423:2: (iv_ruleXColorLiteral= ruleXColorLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:424:2: iv_ruleXColorLiteral= ruleXColorLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXColorLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXColorLiteral_in_entryRuleXColorLiteral916);
            iv_ruleXColorLiteral=ruleXColorLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXColorLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXColorLiteral926); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:431:1: ruleXColorLiteral returns [EObject current=null] : ( (lv_color_0_0= RULE_COLOR ) ) ;
    public final EObject ruleXColorLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_color_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:434:28: ( ( (lv_color_0_0= RULE_COLOR ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:435:1: ( (lv_color_0_0= RULE_COLOR ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:435:1: ( (lv_color_0_0= RULE_COLOR ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:436:1: (lv_color_0_0= RULE_COLOR )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:436:1: (lv_color_0_0= RULE_COLOR )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:437:3: lv_color_0_0= RULE_COLOR
            {
            lv_color_0_0=(Token)match(input,RULE_COLOR,FOLLOW_RULE_COLOR_in_ruleXColorLiteral967); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:461:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:462:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:463:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1007);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1017); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:470:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:473:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:475:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1063);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:491:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:492:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:493:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1097);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1107); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:500:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:503:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:504:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:504:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==19) ) {
                    alt9=1;
                }
                else if ( (LA9_1==EOF||(LA9_1>=RULE_COLOR && LA9_1<=RULE_ID)||(LA9_1>=14 && LA9_1<=15)||(LA9_1>=17 && LA9_1<=18)||(LA9_1>=20 && LA9_1<=42)||(LA9_1>=44 && LA9_1<=71)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA9_0>=RULE_COLOR && LA9_0<=RULE_STRING)||LA9_0==29||(LA9_0>=32 && LA9_0<=33)||LA9_0==37||LA9_0==40||LA9_0==42||LA9_0==45||LA9_0==47||LA9_0==49||(LA9_0>=53 && LA9_0<=55)||LA9_0==59||(LA9_0>=61 && LA9_0<=68)) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:504:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:504:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:504:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:504:3: ()
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:505:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:510:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:511:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:511:1: ( ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:512:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1165);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1181);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:533:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:534:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:534:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:535:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1201);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:552:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:552:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:553:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1231);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:561:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        int LA8_1 = input.LA(2);

                        if ( (synpred1_InternalGraphViewStyle()) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:561:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:561:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:561:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:566:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:566:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:566:7: ()
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:567:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:572:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:573:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:573:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:574:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1284);
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

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:587:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:588:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:588:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:589:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1307);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:613:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:614:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:615:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1347);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1358); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:622:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:625:28: (kw= '=' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:627:2: kw= '='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpSingleAssign1395); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:640:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:641:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:642:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1435);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1446); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:649:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:652:28: (kw= '+=' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:654:2: kw= '+='
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpMultiAssign1483); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:667:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:668:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:669:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1522);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1532); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:676:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:679:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:680:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:680:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:681:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1579);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:689:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred2_InternalGraphViewStyle()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:689:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:689:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:689:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:694:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:694:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:694:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:695:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:700:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:701:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:701:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:702:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1632);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:715:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:716:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:716:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:717:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1655);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:741:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:742:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:743:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1694);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1705); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:750:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:753:28: (kw= '||' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:755:2: kw= '||'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpOr1742); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:768:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:769:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:770:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1781);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1791); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:777:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:780:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:781:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:781:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:782:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1838);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:790:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred3_InternalGraphViewStyle()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:790:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:790:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:790:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:795:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:795:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:795:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:796:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:801:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:802:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:802:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:803:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1891);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:816:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:817:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:817:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:818:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1914);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:842:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:843:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:844:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1953);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1964); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:851:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:854:28: (kw= '&&' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:856:2: kw= '&&'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpAnd2001); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:869:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:870:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:871:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2040);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2050); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:878:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:881:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:882:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:882:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:883:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2097);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:891:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred4_InternalGraphViewStyle()) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==24) ) {
                    int LA12_3 = input.LA(2);

                    if ( (synpred4_InternalGraphViewStyle()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:891:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:891:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:891:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:896:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:896:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:896:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:897:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:902:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:903:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:903:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:904:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2150);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:917:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:918:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:918:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:919:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2173);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:943:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:944:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:945:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2212);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2223); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:952:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:955:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:956:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:956:1: (kw= '==' | kw= '!=' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            else if ( (LA13_0==24) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:957:2: kw= '=='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality2261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:964:2: kw= '!='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpEquality2280); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:977:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:978:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:979:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2320);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2330); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:986:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:989:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:990:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:990:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:991:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2377);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:999:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop14:
            do {
                int alt14=3;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred5_InternalGraphViewStyle()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA14_5 = input.LA(2);

                    if ( (synpred6_InternalGraphViewStyle()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 29:
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:999:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:999:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:999:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:999:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:999:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1001:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1001:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1001:6: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1002:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXRelationalExpression2413); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1011:3: ( ( ruleQualifiedName ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1012:1: ( ruleQualifiedName )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1012:1: ( ruleQualifiedName )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1013:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2438);
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1027:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1027:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1027:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1027:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1027:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1032:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1032:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1032:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1033:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1038:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1039:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1039:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1040:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2499);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1053:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1054:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1054:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1055:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2522);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1079:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1080:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1081:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2562);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2573); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1088:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1091:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1092:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1092:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt15=1;
                }
                break;
            case 27:
                {
                alt15=2;
                }
                break;
            case 28:
                {
                alt15=3;
                }
                break;
            case 29:
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1093:2: kw= '>='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1100:2: kw= '<='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1107:2: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1114:2: kw= '<'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2668); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1127:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1128:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1129:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2708);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2718); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1136:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1139:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1140:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1140:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1141:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2765);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1149:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred7_InternalGraphViewStyle()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==31) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred7_InternalGraphViewStyle()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1149:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1149:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1149:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1154:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1154:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1154:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1155:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1160:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1161:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1161:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1162:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2818);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1175:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1176:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1176:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1177:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2841);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1201:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1202:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1203:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2880);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2891); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1210:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1213:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1214:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1214:1: (kw= '->' | kw= '..' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            else if ( (LA17_0==31) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1215:2: kw= '->'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1222:2: kw= '..'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2948); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1235:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1236:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1237:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2988);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2998); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1244:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1247:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1248:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1248:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1249:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3045);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1257:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred8_InternalGraphViewStyle()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==33) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred8_InternalGraphViewStyle()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1257:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1257:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1257:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1262:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1262:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1262:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1263:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1268:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1269:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1269:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1270:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3098);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1283:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1284:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1284:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1285:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3121);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1309:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1310:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1311:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3160);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3171); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1318:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1321:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1322:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1322:1: (kw= '+' | kw= '-' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            else if ( (LA19_0==33) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1323:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd3209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1330:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAdd3228); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1343:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1344:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1345:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3268);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3278); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1352:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1355:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1356:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1356:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1357:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3325);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1365:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    int LA20_2 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (synpred9_InternalGraphViewStyle()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 36:
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1365:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1365:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1365:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1370:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1370:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1370:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1371:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1376:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1377:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1377:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1378:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3378);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1391:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1392:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1392:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1393:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3401);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1417:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1418:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1419:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3440);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3451); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1426:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1429:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1430:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1430:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt21=1;
                }
                break;
            case 34:
                {
                alt21=2;
                }
                break;
            case 35:
                {
                alt21=3;
                }
                break;
            case 36:
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1431:2: kw= '*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleOpMulti3489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1438:2: kw= '**'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1445:2: kw= '/'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1452:2: kw= '%'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3546); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1465:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1466:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1467:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3586);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3596); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1474:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1477:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1478:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1478:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=32 && LA22_0<=33)||LA22_0==37) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_COLOR && LA22_0<=RULE_ID)||LA22_0==29||LA22_0==40||LA22_0==42||LA22_0==45||LA22_0==47||LA22_0==49||(LA22_0>=53 && LA22_0<=55)||LA22_0==59||(LA22_0>=61 && LA22_0<=68)) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1478:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1478:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1478:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1478:3: ()
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1479:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1484:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1485:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1485:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1486:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3654);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1499:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1500:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1500:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1501:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3675);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1519:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3704);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1535:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1536:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1537:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3740);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3751); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1544:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1547:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1548:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1548:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt23=1;
                }
                break;
            case 33:
                {
                alt23=2;
                }
                break;
            case 32:
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1549:2: kw= '!'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpUnary3789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1556:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary3808); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1563:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary3827); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1576:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1577:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1578:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3867);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3877); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1585:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1588:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1589:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1589:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1590:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3924);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1598:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred10_InternalGraphViewStyle()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1598:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1598:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1598:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1600:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1600:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1600:6: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1601:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXCastedExpression3959); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1610:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1611:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1611:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1612:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3982);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1636:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1637:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1638:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4020);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4030); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1645:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1648:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1649:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1649:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1650:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4077);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1658:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop31:
            do {
                int alt31=3;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred11_InternalGraphViewStyle()) ) {
                        alt31=1;
                    }
                    else if ( (synpred12_InternalGraphViewStyle()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred12_InternalGraphViewStyle()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred12_InternalGraphViewStyle()) ) {
                        alt31=2;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1658:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1658:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1658:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1658:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1658:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:26: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1665:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall4126); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1674:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1675:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1675:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1676:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4149);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4165);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1697:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1698:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1698:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1699:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4187);
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1716:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1716:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1716:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1716:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1716:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1732:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1732:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1732:8: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1733:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case 14:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 39:
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
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall4273); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1743:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1743:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1744:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1744:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1745:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall4297); if (state.failed) return current;
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
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1759:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1759:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1760:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1760:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1761:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4334); if (state.failed) return current;
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1774:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==29) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1774:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall4363); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1778:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1779:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1779:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1780:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4384);
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

            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1796:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop26:
            	            do {
            	                int alt26=2;
            	                int LA26_0 = input.LA(1);

            	                if ( (LA26_0==17) ) {
            	                    alt26=1;
            	                }


            	                switch (alt26) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1796:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall4397); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1800:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1801:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1801:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1802:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4418);
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

            	            otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4432); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1822:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1823:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1823:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1824:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4457);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1837:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1837:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1837:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1837:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1844:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1845:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4491); if (state.failed) return current;
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

            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1858:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt29=3;
            	            alt29 = dfa29.predict(input);
            	            switch (alt29) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1858:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1858:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1858:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1870:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1871:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4566);
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
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1888:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1888:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1888:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1888:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1889:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1889:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1890:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4594);
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

            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1906:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop28:
            	                    do {
            	                        int alt28=2;
            	                        int LA28_0 = input.LA(1);

            	                        if ( (LA28_0==17) ) {
            	                            alt28=1;
            	                        }


            	                        switch (alt28) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1906:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall4607); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1910:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1911:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1911:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1912:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4628);
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

            	            otherlv_21=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4645); if (state.failed) return current;
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1940:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1941:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1942:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4686);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4696); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1949:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1952:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1953:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1953:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt32=13;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt32=1;
                }
                break;
            case 49:
                {
                alt32=2;
                }
                break;
            case 47:
                {
                alt32=3;
                }
                break;
            case RULE_ID:
            case 29:
            case 59:
                {
                alt32=4;
                }
                break;
            case RULE_COLOR:
            case RULE_INT:
            case RULE_STRING:
            case 42:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt32=5;
                }
                break;
            case 45:
                {
                alt32=6;
                }
                break;
            case 53:
                {
                alt32=7;
                }
                break;
            case 54:
                {
                alt32=8;
                }
                break;
            case 55:
                {
                alt32=9;
                }
                break;
            case 66:
                {
                alt32=10;
                }
                break;
            case 67:
                {
                alt32=11;
                }
                break;
            case 68:
                {
                alt32=12;
                }
                break;
            case 40:
                {
                alt32=13;
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1954:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4743);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1964:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4770);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1974:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4797);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1984:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4824);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1994:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4851);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2004:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4878);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2014:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4905);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2024:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4932);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2034:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4959);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2044:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4986);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2054:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5013);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2064:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5040);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2074:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5067);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2090:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2091:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2092:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5102);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5112); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2099:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2102:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2103:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2103:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2103:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2103:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2104:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleXClosure5158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2113:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==40||LA34_0==71) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2113:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2113:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2114:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2114:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2115:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5180);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2131:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==17) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2131:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXClosure5193); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2135:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2136:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2136:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2137:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5214);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2157:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2158:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2158:1: (lv_expression_6_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2159:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5251);
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

            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5263); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2187:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2188:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2189:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5299);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5309); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2196:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2199:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2200:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2200:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2200:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2200:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2200:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2211:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2211:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2211:6: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2212:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2217:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==40||LA36_0==71) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2217:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2217:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2218:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2218:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2219:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5407);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2235:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==17) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2235:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXShortClosure5420); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2239:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2240:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2240:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2241:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5441);
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
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure5457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2261:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2262:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2262:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2263:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5480);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2287:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2288:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2289:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5516);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5526); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2296:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2299:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2300:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2300:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2300:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXParenthesizedExpression5563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5585);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXParenthesizedExpression5596); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2325:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2326:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2327:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5632);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5642); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2334:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2337:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2338:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2338:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2338:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2338:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2339:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression5688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXIfExpression5700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2352:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2353:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2353:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2354:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5721);
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

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXIfExpression5733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2374:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2375:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2375:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2376:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5754);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2392:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred16_InternalGraphViewStyle()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2392:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2392:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2392:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression5775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2397:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2398:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2398:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2399:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5797);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2423:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2424:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2425:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5835);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5845); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2432:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2435:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2436:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2436:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2436:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2436:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2437:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression5891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2446:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==48) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2446:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2446:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2447:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2447:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2448:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression5913);
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

                    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression5925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2468:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2469:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2469:1: (lv_switch_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2470:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression5948);
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

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression5960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2490:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==40||LA39_0==48||LA39_0==52||LA39_0==71) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2491:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2491:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2492:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5981);
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
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2508:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2508:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression5995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2516:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2517:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2517:1: (lv_default_9_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2518:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6028);
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

            otherlv_10=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6042); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2546:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2547:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2548:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6078);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6088); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2555:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2558:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2559:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2559:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2559:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2559:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==40||LA41_0==71) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2560:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2560:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2561:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6134);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2577:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==52) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2577:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2581:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2582:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2582:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2583:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6169);
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

            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXCasePart6183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2603:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2604:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2604:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2605:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6204);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2629:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2630:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2631:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6240);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6250); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2638:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2641:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2642:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2642:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2642:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2642:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2643:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression6296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXForLoopExpression6308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2656:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2657:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2657:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2658:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6329);
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

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXForLoopExpression6341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2678:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2679:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2679:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2680:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6362);
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

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXForLoopExpression6374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2700:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2701:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2701:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2702:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6395);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2726:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2727:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2728:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6431);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6441); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2735:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2738:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2739:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2739:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2739:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2739:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2740:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXWhileExpression6487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXWhileExpression6499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2753:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2754:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2754:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2755:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6520);
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

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXWhileExpression6532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2775:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2776:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2776:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2777:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6553);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2801:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2802:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2803:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6589);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6599); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2810:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2813:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2814:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2814:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2814:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2814:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2815:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXDoWhileExpression6645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2824:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2825:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2825:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2826:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6666);
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

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXDoWhileExpression6678); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleXDoWhileExpression6690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2850:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2851:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2851:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2852:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6711);
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

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXDoWhileExpression6723); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2880:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2881:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2882:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6759);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6769); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2889:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2892:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2893:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2893:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2893:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2893:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2894:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXBlockExpression6815); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2903:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_COLOR && LA44_0<=RULE_ID)||LA44_0==29||(LA44_0>=32 && LA44_0<=33)||LA44_0==37||LA44_0==40||LA44_0==42||LA44_0==45||LA44_0==47||LA44_0==49||(LA44_0>=53 && LA44_0<=55)||(LA44_0>=57 && LA44_0<=59)||(LA44_0>=61 && LA44_0<=68)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2903:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2903:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2904:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2904:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2905:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6837);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2921:2: (otherlv_3= ';' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==56) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2921:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression6850); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXBlockExpression6866); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2937:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2938:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2939:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6902);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6912); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2946:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2949:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2950:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2950:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=57 && LA45_0<=58)) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=RULE_COLOR && LA45_0<=RULE_ID)||LA45_0==29||(LA45_0>=32 && LA45_0<=33)||LA45_0==37||LA45_0==40||LA45_0==42||LA45_0==45||LA45_0==47||LA45_0==49||(LA45_0>=53 && LA45_0<=55)||LA45_0==59||(LA45_0>=61 && LA45_0<=68)) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2951:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6959);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2961:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6986);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2977:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2978:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2979:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7021);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7031); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2986:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2989:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2990:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2990:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2990:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2990:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2991:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2996:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==57) ) {
                alt46=1;
            }
            else if ( (LA46_0==58) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2996:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2996:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2997:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2997:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2998:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,57,FOLLOW_57_in_ruleXVariableDeclaration7084); if (state.failed) return current;
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3012:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleXVariableDeclaration7115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3016:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred17_InternalGraphViewStyle()) ) {
                    alt47=1;
                }
                else if ( (true) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA47_0==40) && (synpred17_InternalGraphViewStyle())) {
                alt47=1;
            }
            else if ( (LA47_0==71) && (synpred17_InternalGraphViewStyle())) {
                alt47=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3016:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3016:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3016:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3024:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3024:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3024:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3025:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3025:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3026:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7163);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3042:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3043:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3043:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3044:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7184);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3061:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3061:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3062:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3062:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3063:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7213);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3079:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==19) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3079:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleXVariableDeclaration7227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3083:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3084:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3084:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3085:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7248);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3109:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3110:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3111:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7286);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7296); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3118:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3121:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3122:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3122:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3122:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3122:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==RULE_ID||LA49_1==14||LA49_1==29) ) {
                    alt49=1;
                }
            }
            else if ( (LA49_0==40||LA49_0==71) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3123:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3123:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3124:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7342);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3140:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3141:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3141:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3142:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7364);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3166:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3167:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3168:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7400);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7410); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3175:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3178:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3179:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3179:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3179:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3179:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3180:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3185:2: ( ( ruleStaticQualifier ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==60) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3186:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3186:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3187:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7467);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3200:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==29) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3200:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleXFeatureCall7481); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3204:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3205:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3205:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3206:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7502);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3222:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==17) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3222:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXFeatureCall7515); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3226:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3227:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3227:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3228:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7536);
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
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall7550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3248:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3249:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3249:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3250:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7575);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3263:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3263:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3263:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3263:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3270:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3271:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall7609); if (state.failed) return current;
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3284:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt54=3;
                    alt54 = dfa54.predict(input);
                    switch (alt54) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3284:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3284:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3284:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3296:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3297:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7684);
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
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3314:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3314:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3314:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3314:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3315:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3315:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3316:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7712);
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

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3332:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==17) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3332:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleXFeatureCall7725); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3336:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3337:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3337:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3338:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7746);
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
                            	    break loop53;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7763); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3366:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3367:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3368:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7802);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper7813); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3375:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3378:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3379:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3379:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            else if ( (LA56_0==59) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3380:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper7860);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3392:2: kw= 'super'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleIdOrSuper7884); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3405:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3406:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3407:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7925);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier7936); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3414:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3417:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3418:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3418:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    int LA57_2 = input.LA(2);

                    if ( (LA57_2==60) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3419:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier7983);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleStaticQualifier8001); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3443:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3444:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3445:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8042);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8052); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3452:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3455:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3456:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3456:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3456:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3456:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3457:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXConstructorCall8098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3466:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3467:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3467:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3468:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8121);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3481:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==29) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3481:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleXConstructorCall8134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3485:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3486:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3486:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3487:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8155);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3503:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==17) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3503:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleXConstructorCall8168); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3507:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3508:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3508:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3509:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8189);
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
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,40,FOLLOW_40_in_ruleXConstructorCall8217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3533:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt61=3;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3533:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3533:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3533:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3545:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3546:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8279);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3563:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3563:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3563:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3563:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3564:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3564:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3565:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8307);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3581:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==17) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3581:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleXConstructorCall8320); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3585:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3586:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3586:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3587:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8341);
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
                    	    break loop60;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8358); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3615:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3616:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3617:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8394);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8404); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3624:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3627:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3628:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3628:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3628:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3628:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3629:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3634:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==62) ) {
                alt62=1;
            }
            else if ( (LA62_0==63) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3634:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXBooleanLiteral8451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3639:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3639:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3640:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3640:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3641:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,63,FOLLOW_63_in_ruleXBooleanLiteral8475); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3662:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3663:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3664:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8525);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8535); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3671:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3674:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3675:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3675:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3675:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3675:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3676:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXNullLiteral8581); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3693:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3694:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3695:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8617);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8627); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3702:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3705:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3706:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3706:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3706:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3706:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3707:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3712:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3713:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3713:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3714:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8678); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3738:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3739:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3740:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8719);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8729); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3747:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3750:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3751:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3751:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3751:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3751:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3752:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3757:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3758:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3758:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3759:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral8780); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3783:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3784:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3785:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8821);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral8831); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3792:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3795:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3796:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3796:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3796:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3796:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3797:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXTypeLiteral8877); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXTypeLiteral8889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3810:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3811:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3811:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3812:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8912);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXTypeLiteral8924); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3837:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3838:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3839:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8960);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression8970); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3846:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3849:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3850:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3850:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3850:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3850:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3851:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXThrowExpression9016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3860:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3861:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3861:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3862:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9037);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3886:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3887:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3888:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9073);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9083); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3895:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3898:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3899:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3899:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3899:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3899:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3900:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXReturnExpression9129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3909:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3909:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3914:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3915:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9160);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3939:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3940:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3941:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9197);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9207); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3948:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3951:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3952:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3952:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3952:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3952:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3953:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTryCatchFinallyExpression9253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3962:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3963:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3963:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3964:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9274);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3980:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==70) ) {
                alt66=1;
            }
            else if ( (LA66_0==69) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3980:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3980:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3980:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3980:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==70) ) {
                            int LA64_2 = input.LA(2);

                            if ( (synpred22_InternalGraphViewStyle()) ) {
                                alt64=1;
                            }


                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3980:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3982:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3983:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9304);
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
                    	    if ( cnt64 >= 1 ) break loop64;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3999:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==69) ) {
                        int LA65_1 = input.LA(2);

                        if ( (synpred23_InternalGraphViewStyle()) ) {
                            alt65=1;
                        }
                    }
                    switch (alt65) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3999:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3999:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3999:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9326); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4004:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4005:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4005:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4006:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9348);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4023:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4023:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4023:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4027:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4028:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4028:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4029:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9391);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4053:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4054:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4055:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9429);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9439); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4062:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4065:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4066:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4066:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4066:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4066:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4066:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleXCatchClause9484); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleXCatchClause9497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4075:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4076:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4076:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4077:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9518);
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

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleXCatchClause9530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4097:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4098:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4098:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4099:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9551);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4123:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4124:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4125:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9588);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9599); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4132:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4135:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4136:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4136:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4137:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9646);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4147:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==14) ) {
                    int LA67_2 = input.LA(2);

                    if ( (LA67_2==RULE_ID) ) {
                        int LA67_3 = input.LA(3);

                        if ( (synpred25_InternalGraphViewStyle()) ) {
                            alt67=1;
                        }


                    }


                }


                switch (alt67) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4147:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4147:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4147:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName9674); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9697);
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
            	    break loop67;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4174:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4175:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4176:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9744);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9754); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4183:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4186:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4187:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4187:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            else if ( (LA68_0==40||LA68_0==71) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4188:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9801);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4198:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9828);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4214:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4215:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4216:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9863);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef9873); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4223:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4226:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4227:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4227:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4227:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4227:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==40) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4227:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXFunctionTypeRef9911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4231:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4232:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4232:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9932);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4249:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==17) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4249:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXFunctionTypeRef9945); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4253:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4254:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4254:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4255:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9966);
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
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef9980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleXFunctionTypeRef9994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4279:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4280:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4280:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4281:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10015);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4305:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4306:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4307:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10051);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10061); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4314:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4317:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4318:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4318:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4318:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4318:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4319:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4319:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4320:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10109);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4333:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4333:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4333:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4333:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleJvmParameterizedTypeReference10130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4338:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4339:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4339:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4340:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10152);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4356:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==17) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4356:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleJvmParameterizedTypeReference10165); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4360:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4361:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4361:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4362:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10186);
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
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference10200); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4390:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4391:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4392:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10238);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10248); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4399:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4402:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4403:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4403:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID||LA73_0==40||LA73_0==71) ) {
                alt73=1;
            }
            else if ( (LA73_0==72) ) {
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4404:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10295);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4414:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10322);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4430:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4431:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4432:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10357);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10367); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4439:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4442:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4443:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4443:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4443:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4443:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4444:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleJvmWildcardTypeReference10413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4453:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt74=3;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==73) ) {
                alt74=1;
            }
            else if ( (LA74_0==59) ) {
                alt74=2;
            }
            switch (alt74) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4453:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4453:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4454:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4454:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4455:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10435);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4472:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4472:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4473:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4473:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4474:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10462);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4498:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4499:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4500:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10500);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound10510); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4507:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4510:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4511:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4511:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4511:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleJvmUpperBound10547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4515:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4516:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4516:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4517:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10568);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4541:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4542:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4543:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10604);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10614); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4550:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4553:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4554:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4554:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4554:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleJvmUpperBoundAnded10651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4558:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4559:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4559:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4560:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10672);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4584:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4585:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4586:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10708);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound10718); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4593:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4596:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4597:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4597:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4597:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleJvmLowerBound10755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4601:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4602:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4602:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4603:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10776);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4629:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4630:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4631:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID10815);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID10826); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4638:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4641:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4642:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID10865); if (state.failed) return current;
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:561:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:561:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:561:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:561:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:561:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:562:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:562:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:563:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:563:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:564:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewStyle1252);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:689:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:689:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:689:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:689:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:689:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:690:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:690:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:691:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:691:1: ( ruleOpOr )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:692:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewStyle1600);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:790:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:790:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:790:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:790:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:790:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:791:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:791:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:792:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:792:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:793:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewStyle1859);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:891:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:891:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:891:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:891:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:891:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:892:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:892:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:893:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:893:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:894:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewStyle2118);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:999:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:999:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:999:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:999:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:999:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1000:1: 
        {
        }

        match(input,25,FOLLOW_25_in_synpred5_InternalGraphViewStyle2394); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGraphViewStyle

    // $ANTLR start synpred6_InternalGraphViewStyle
    public final void synpred6_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1027:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1027:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1027:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1027:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1027:10: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1028:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1028:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1029:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1029:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1030:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewStyle2467);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1149:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1149:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1149:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1149:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1149:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1150:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1150:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1151:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1151:1: ( ruleOpOther )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1152:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewStyle2786);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1257:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1257:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1257:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1257:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1257:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1258:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1258:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1259:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1259:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1260:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewStyle3066);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1365:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1365:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1365:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1365:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1365:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1366:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1366:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1367:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1367:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1368:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewStyle3346);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1598:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1598:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1598:4: ( () 'as' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1598:5: () 'as'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1598:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1599:1: 
        {
        }

        match(input,18,FOLLOW_18_in_synpred10_InternalGraphViewStyle3940); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalGraphViewStyle

    // $ANTLR start synpred11_InternalGraphViewStyle
    public final void synpred11_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1658:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1658:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1658:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1658:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1658:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1659:1: 
        {
        }

        match(input,14,FOLLOW_14_in_synpred11_InternalGraphViewStyle4094); if (state.failed) return ;
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1660:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1661:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1661:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1662:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalGraphViewStyle4103);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewStyle4109);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalGraphViewStyle

    // $ANTLR start synpred12_InternalGraphViewStyle
    public final void synpred12_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1716:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1716:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1716:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1716:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1716:10: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1717:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1717:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt75=3;
        switch ( input.LA(1) ) {
        case 14:
            {
            alt75=1;
            }
            break;
        case 38:
            {
            alt75=2;
            }
            break;
        case 39:
            {
            alt75=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 75, 0, input);

            throw nvae;
        }

        switch (alt75) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1717:4: '.'
                {
                match(input,14,FOLLOW_14_in_synpred12_InternalGraphViewStyle4212); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1719:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1719:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1720:1: ( '?.' )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1720:1: ( '?.' )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1721:2: '?.'
                {
                match(input,38,FOLLOW_38_in_synpred12_InternalGraphViewStyle4226); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1726:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1726:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1727:1: ( '*.' )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1727:1: ( '*.' )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1728:2: '*.'
                {
                match(input,39,FOLLOW_39_in_synpred12_InternalGraphViewStyle4246); if (state.failed) return ;

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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1837:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1838:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1838:1: ( '(' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1839:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred13_InternalGraphViewStyle4473); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGraphViewStyle

    // $ANTLR start synpred14_InternalGraphViewStyle
    public final void synpred14_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1858:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1858:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1858:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1858:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1858:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1859:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1859:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt77=2;
        int LA77_0 = input.LA(1);

        if ( (LA77_0==RULE_ID||LA77_0==40||LA77_0==71) ) {
            alt77=1;
        }
        switch (alt77) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1859:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1859:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1860:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1860:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1861:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4525);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1863:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop76:
                do {
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==17) ) {
                        alt76=1;
                    }


                    switch (alt76) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1863:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred14_InternalGraphViewStyle4532); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1864:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1865:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1865:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1866:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4539);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop76;
                    }
                } while (true);


                }
                break;

        }

        match(input,43,FOLLOW_43_in_synpred14_InternalGraphViewStyle4549); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalGraphViewStyle

    // $ANTLR start synpred16_InternalGraphViewStyle
    public final void synpred16_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2392:4: ( 'else' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2392:6: 'else'
        {
        match(input,46,FOLLOW_46_in_synpred16_InternalGraphViewStyle5767); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalGraphViewStyle

    // $ANTLR start synpred17_InternalGraphViewStyle
    public final void synpred17_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3016:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3016:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3016:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3016:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3016:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3017:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3017:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3018:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewStyle7133);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3020:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3021:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3021:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3022:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalGraphViewStyle7142);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3263:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3264:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3264:1: ( '(' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3265:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred18_InternalGraphViewStyle7591); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalGraphViewStyle

    // $ANTLR start synpred19_InternalGraphViewStyle
    public final void synpred19_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3284:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3284:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3284:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3284:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3284:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3285:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3285:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==RULE_ID||LA81_0==40||LA81_0==71) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3285:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3285:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3286:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3286:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3287:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewStyle7643);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3289:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop80:
                do {
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==17) ) {
                        alt80=1;
                    }


                    switch (alt80) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3289:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred19_InternalGraphViewStyle7650); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3290:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3291:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3291:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3292:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewStyle7657);
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

        match(input,43,FOLLOW_43_in_synpred19_InternalGraphViewStyle7667); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalGraphViewStyle

    // $ANTLR start synpred20_InternalGraphViewStyle
    public final void synpred20_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3533:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3533:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3533:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3533:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3533:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3534:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3534:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( (LA83_0==RULE_ID||LA83_0==40||LA83_0==71) ) {
            alt83=1;
        }
        switch (alt83) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3534:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3534:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3535:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3535:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3536:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewStyle8238);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3538:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop82:
                do {
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==17) ) {
                        alt82=1;
                    }


                    switch (alt82) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3538:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred20_InternalGraphViewStyle8245); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3539:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3540:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3540:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3541:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewStyle8252);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop82;
                    }
                } while (true);


                }
                break;

        }

        match(input,43,FOLLOW_43_in_synpred20_InternalGraphViewStyle8262); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalGraphViewStyle

    // $ANTLR start synpred21_InternalGraphViewStyle
    public final void synpred21_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3909:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3910:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3910:1: ( ruleXExpression )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3911:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewStyle9143);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalGraphViewStyle

    // $ANTLR start synpred22_InternalGraphViewStyle
    public final void synpred22_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3980:5: ( 'catch' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3980:7: 'catch'
        {
        match(input,70,FOLLOW_70_in_synpred22_InternalGraphViewStyle9288); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalGraphViewStyle

    // $ANTLR start synpred23_InternalGraphViewStyle
    public final void synpred23_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3999:5: ( 'finally' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3999:7: 'finally'
        {
        match(input,69,FOLLOW_69_in_synpred23_InternalGraphViewStyle9318); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalGraphViewStyle

    // $ANTLR start synpred25_InternalGraphViewStyle
    public final void synpred25_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4147:3: ( '.' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4148:2: '.'
        {
        match(input,14,FOLLOW_14_in_synpred25_InternalGraphViewStyle9665); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalGraphViewStyle

    // $ANTLR start synpred26_InternalGraphViewStyle
    public final void synpred26_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4333:4: ( '<' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4333:6: '<'
        {
        match(input,29,FOLLOW_29_in_synpred26_InternalGraphViewStyle10122); if (state.failed) return ;

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


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA72 dfa72 = new DFA72(this);
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
            "\4\2\6\uffff\2\2\1\uffff\2\2\1\uffff\24\2\1\1\2\2\1\uffff\20"+
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
            return "1837:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
            "\3\5\1\1\25\uffff\1\5\2\uffff\2\5\3\uffff\1\5\2\uffff\1\2\1"+
            "\34\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
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
            return "1858:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA29_0==40) ) {s = 2;}

                        else if ( (LA29_0==71) && (synpred14_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA29_0==43) && (synpred14_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA29_0>=RULE_COLOR && LA29_0<=RULE_STRING)||LA29_0==29||(LA29_0>=32 && LA29_0<=33)||LA29_0==37||LA29_0==42||LA29_0==45||LA29_0==47||LA29_0==49||(LA29_0>=53 && LA29_0<=55)||LA29_0==59||(LA29_0>=61 && LA29_0<=68)) ) {s = 5;}

                        else if ( (LA29_0==41) ) {s = 28;}

                         
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
    static final String DFA55_eotS =
        "\75\uffff";
    static final String DFA55_eofS =
        "\1\2\74\uffff";
    static final String DFA55_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA55_maxS =
        "\1\107\1\0\73\uffff";
    static final String DFA55_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA55_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA55_transitionS = {
            "\4\2\6\uffff\2\2\1\uffff\2\2\1\uffff\24\2\1\1\2\2\1\uffff\20"+
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
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "3263:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\35\uffff";
    static final String DFA54_eofS =
        "\35\uffff";
    static final String DFA54_minS =
        "\1\4\2\0\32\uffff";
    static final String DFA54_maxS =
        "\1\107\2\0\32\uffff";
    static final String DFA54_acceptS =
        "\3\uffff\2\1\1\2\26\uffff\1\3";
    static final String DFA54_specialS =
        "\1\0\1\1\1\2\32\uffff}>";
    static final String[] DFA54_transitionS = {
            "\3\5\1\1\25\uffff\1\5\2\uffff\2\5\3\uffff\1\5\2\uffff\1\2\1"+
            "\34\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
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
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "3284:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_0 = input.LA(1);

                         
                        int index54_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA54_0==RULE_ID) ) {s = 1;}

                        else if ( (LA54_0==40) ) {s = 2;}

                        else if ( (LA54_0==71) && (synpred19_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA54_0==43) && (synpred19_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA54_0>=RULE_COLOR && LA54_0<=RULE_STRING)||LA54_0==29||(LA54_0>=32 && LA54_0<=33)||LA54_0==37||LA54_0==42||LA54_0==45||LA54_0==47||LA54_0==49||(LA54_0>=53 && LA54_0<=55)||LA54_0==59||(LA54_0>=61 && LA54_0<=68)) ) {s = 5;}

                        else if ( (LA54_0==41) ) {s = 28;}

                         
                        input.seek(index54_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\35\uffff";
    static final String DFA61_eofS =
        "\35\uffff";
    static final String DFA61_minS =
        "\1\4\2\0\32\uffff";
    static final String DFA61_maxS =
        "\1\107\2\0\32\uffff";
    static final String DFA61_acceptS =
        "\3\uffff\2\1\1\2\26\uffff\1\3";
    static final String DFA61_specialS =
        "\1\0\1\1\1\2\32\uffff}>";
    static final String[] DFA61_transitionS = {
            "\3\5\1\1\25\uffff\1\5\2\uffff\2\5\3\uffff\1\5\2\uffff\1\2\1"+
            "\34\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
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
            return "3533:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==RULE_ID) ) {s = 1;}

                        else if ( (LA61_0==40) ) {s = 2;}

                        else if ( (LA61_0==71) && (synpred20_InternalGraphViewStyle())) {s = 3;}

                        else if ( (LA61_0==43) && (synpred20_InternalGraphViewStyle())) {s = 4;}

                        else if ( ((LA61_0>=RULE_COLOR && LA61_0<=RULE_STRING)||LA61_0==29||(LA61_0>=32 && LA61_0<=33)||LA61_0==37||LA61_0==42||LA61_0==45||LA61_0==47||LA61_0==49||(LA61_0>=53 && LA61_0<=55)||LA61_0==59||(LA61_0>=61 && LA61_0<=68)) ) {s = 5;}

                        else if ( (LA61_0==41) ) {s = 28;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGraphViewStyle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_2);
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
    static final String DFA63_eotS =
        "\75\uffff";
    static final String DFA63_eofS =
        "\1\32\74\uffff";
    static final String DFA63_minS =
        "\1\4\31\0\43\uffff";
    static final String DFA63_maxS =
        "\1\107\31\0\43\uffff";
    static final String DFA63_acceptS =
        "\32\uffff\1\2\41\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\43"+
        "\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\21\1\15\1\17\1\1\6\uffff\2\32\1\uffff\2\32\1\uffff\11\32"+
            "\1\10\2\32\1\4\1\3\3\32\1\2\2\32\1\31\1\32\1\12\1\uffff\1\32"+
            "\1\22\1\32\1\7\1\32\1\6\3\32\1\23\1\24\1\25\3\32\1\11\1\uffff"+
            "\1\5\1\13\1\14\1\16\1\20\1\26\1\27\1\30\3\32",
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

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "3909:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_3 = input.LA(1);

                         
                        int index63_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA63_4 = input.LA(1);

                         
                        int index63_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA63_5 = input.LA(1);

                         
                        int index63_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA63_6 = input.LA(1);

                         
                        int index63_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA63_7 = input.LA(1);

                         
                        int index63_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA63_8 = input.LA(1);

                         
                        int index63_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA63_9 = input.LA(1);

                         
                        int index63_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA63_10 = input.LA(1);

                         
                        int index63_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA63_11 = input.LA(1);

                         
                        int index63_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA63_12 = input.LA(1);

                         
                        int index63_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA63_13 = input.LA(1);

                         
                        int index63_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA63_14 = input.LA(1);

                         
                        int index63_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA63_15 = input.LA(1);

                         
                        int index63_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA63_16 = input.LA(1);

                         
                        int index63_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA63_17 = input.LA(1);

                         
                        int index63_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA63_18 = input.LA(1);

                         
                        int index63_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA63_19 = input.LA(1);

                         
                        int index63_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA63_20 = input.LA(1);

                         
                        int index63_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA63_21 = input.LA(1);

                         
                        int index63_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA63_22 = input.LA(1);

                         
                        int index63_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA63_23 = input.LA(1);

                         
                        int index63_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA63_24 = input.LA(1);

                         
                        int index63_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA63_25 = input.LA(1);

                         
                        int index63_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewStyle()) ) {s = 60;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\76\uffff";
    static final String DFA72_eofS =
        "\1\2\75\uffff";
    static final String DFA72_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA72_maxS =
        "\1\107\1\0\74\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA72_transitionS = {
            "\4\2\6\uffff\5\2\1\uffff\11\2\1\1\15\2\1\uffff\20\2\1\uffff"+
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
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "4333:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewStyle()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleStyleSheet_in_entryRuleStyleSheet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyleSheet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleStyleSheet131 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleStyleSheet144 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyleSheet165 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleStyleSheet186 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport270 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard386 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildcard405 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildcard418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStyle507 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyle530 = new BitSet(new long[]{0x0002000000060002L});
    public static final BitSet FOLLOW_17_in_ruleStyle543 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyle566 = new BitSet(new long[]{0x0002000000060002L});
    public static final BitSet FOLLOW_18_in_ruleStyle581 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleStyle602 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleStyle625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXColorLiteral_in_ruleXLiteral881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXColorLiteral_in_entryRuleXColorLiteral916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXColorLiteral926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLOR_in_ruleXColorLiteral967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1165 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1181 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1231 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1284 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpSingleAssign1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpMultiAssign1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1579 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1632 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1655 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpOr1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1838 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1891 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1914 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpAnd2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2097 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2150 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2173 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpEquality2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2377 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_25_in_ruleXRelationalExpression2413 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2438 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2499 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2522 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2765 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2818 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2841 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3045 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3098 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3121 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAdd3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3325 = new BitSet(new long[]{0x0000001C00008002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3378 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3401 = new BitSet(new long[]{0x0000001C00008002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpMulti3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3654 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpUnary3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3924 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXCastedExpression3959 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3982 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4077 = new BitSet(new long[]{0x000000C000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall4126 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4149 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4165 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4187 = new BitSet(new long[]{0x000000C000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall4273 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall4297 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4334 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall4363 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4384 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall4397 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4418 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4432 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4457 = new BitSet(new long[]{0x000001C000004002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4491 = new BitSet(new long[]{0xE8E2AF23200000F0L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4566 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4594 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall4607 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4628 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4645 = new BitSet(new long[]{0x000000C000004002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXClosure5158 = new BitSet(new long[]{0x0000090000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5180 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_ruleXClosure5193 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5214 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5230 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5251 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5407 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_ruleXShortClosure5420 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5441 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure5457 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXParenthesizedExpression5563 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5585 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXParenthesizedExpression5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression5688 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXIfExpression5700 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5721 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIfExpression5733 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5754 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression5775 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression5891 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression5913 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression5925 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression5948 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression5960 = new BitSet(new long[]{0x0011010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5981 = new BitSet(new long[]{0x001D010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression5995 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6007 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6028 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6134 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6148 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6169 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXCasePart6183 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression6296 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXForLoopExpression6308 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6329 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXForLoopExpression6341 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6362 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXForLoopExpression6374 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXWhileExpression6487 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXWhileExpression6499 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6520 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXWhileExpression6532 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXDoWhileExpression6645 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6666 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXDoWhileExpression6678 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXDoWhileExpression6690 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6711 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXDoWhileExpression6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXBlockExpression6815 = new BitSet(new long[]{0xEEEAA523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6837 = new BitSet(new long[]{0xEFEAA523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression6850 = new BitSet(new long[]{0xEEEAA523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_51_in_ruleXBlockExpression6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXVariableDeclaration7084 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_58_in_ruleXVariableDeclaration7115 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7163 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7184 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7213 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXVariableDeclaration7227 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7342 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7467 = new BitSet(new long[]{0x0800000020000080L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall7481 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7502 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleXFeatureCall7515 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7536 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall7550 = new BitSet(new long[]{0x0800000020000080L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7575 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall7609 = new BitSet(new long[]{0xE8E2AF23200000F0L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7684 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7712 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_ruleXFeatureCall7725 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7746 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper7813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper7860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleIdOrSuper7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier7936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier7983 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleStaticQualifier8001 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXConstructorCall8098 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8121 = new BitSet(new long[]{0x0000010020000000L});
    public static final BitSet FOLLOW_29_in_ruleXConstructorCall8134 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8155 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleXConstructorCall8168 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8189 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8203 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXConstructorCall8217 = new BitSet(new long[]{0xE8E2AF23200000F0L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8279 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8307 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_ruleXConstructorCall8320 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8341 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXBooleanLiteral8451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXBooleanLiteral8475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXNullLiteral8581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral8831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXTypeLiteral8877 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXTypeLiteral8889 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8912 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXTypeLiteral8924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression8970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXThrowExpression9016 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXReturnExpression9129 = new BitSet(new long[]{0xE8E2A523200000F2L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTryCatchFinallyExpression9253 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9326 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9370 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXCatchClause9484 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXCatchClause9497 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9518 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXCatchClause9530 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9646 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName9674 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9697 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef9873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFunctionTypeRef9911 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9932 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_ruleXFunctionTypeRef9945 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9966 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef9980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleXFunctionTypeRef9994 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10109 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleJvmParameterizedTypeReference10130 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10152 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleJvmParameterizedTypeReference10165 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10186 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference10200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleJvmWildcardTypeReference10413 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound10510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmUpperBound10547 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmUpperBoundAnded10651 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound10718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleJvmLowerBound10755 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID10815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID10826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID10865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewStyle1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewStyle1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewStyle1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewStyle2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred5_InternalGraphViewStyle2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewStyle2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewStyle2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewStyle3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewStyle3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred10_InternalGraphViewStyle3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred11_InternalGraphViewStyle4094 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalGraphViewStyle4103 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewStyle4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred12_InternalGraphViewStyle4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred12_InternalGraphViewStyle4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred12_InternalGraphViewStyle4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred13_InternalGraphViewStyle4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4525 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_synpred14_InternalGraphViewStyle4532 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4539 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalGraphViewStyle4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred16_InternalGraphViewStyle5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewStyle7133 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalGraphViewStyle7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred18_InternalGraphViewStyle7591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewStyle7643 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_synpred19_InternalGraphViewStyle7650 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewStyle7657 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_synpred19_InternalGraphViewStyle7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewStyle8238 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_synpred20_InternalGraphViewStyle8245 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewStyle8252 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_synpred20_InternalGraphViewStyle8262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewStyle9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred22_InternalGraphViewStyle9288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred23_InternalGraphViewStyle9318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred25_InternalGraphViewStyle9665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred26_InternalGraphViewStyle10122 = new BitSet(new long[]{0x0000000000000002L});

}