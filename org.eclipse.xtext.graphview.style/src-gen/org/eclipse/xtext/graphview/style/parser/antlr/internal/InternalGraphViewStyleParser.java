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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:242:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' ( (lv_names_1_0= ruleQualifiedName ) ) (otherlv_2= ',' ( (lv_names_3_0= ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )? ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_names_1_0 = null;

        AntlrDatatypeRuleToken lv_names_3_0 = null;

        EObject lv_javaClass_5_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:245:28: ( (otherlv_0= 'style' ( (lv_names_1_0= ruleQualifiedName ) ) (otherlv_2= ',' ( (lv_names_3_0= ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:246:1: (otherlv_0= 'style' ( (lv_names_1_0= ruleQualifiedName ) ) (otherlv_2= ',' ( (lv_names_3_0= ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:246:1: (otherlv_0= 'style' ( (lv_names_1_0= ruleQualifiedName ) ) (otherlv_2= ',' ( (lv_names_3_0= ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:246:3: otherlv_0= 'style' ( (lv_names_1_0= ruleQualifiedName ) ) (otherlv_2= ',' ( (lv_names_3_0= ruleQualifiedName ) ) )* (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )? ( (lv_expression_6_0= ruleXBlockExpression ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleStyle507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:250:1: ( (lv_names_1_0= ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:251:1: (lv_names_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:251:1: (lv_names_1_0= ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:252:3: lv_names_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStyleAccess().getNamesQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStyle528);
            lv_names_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStyleRule());
              	        }
                     		add(
                     			current, 
                     			"names",
                      		lv_names_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:268:2: (otherlv_2= ',' ( (lv_names_3_0= ruleQualifiedName ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:268:4: otherlv_2= ',' ( (lv_names_3_0= ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStyle541); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getStyleAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:272:1: ( (lv_names_3_0= ruleQualifiedName ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:273:1: (lv_names_3_0= ruleQualifiedName )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:273:1: (lv_names_3_0= ruleQualifiedName )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:274:3: lv_names_3_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStyleAccess().getNamesQualifiedNameParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleStyle562);
            	    lv_names_3_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStyleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"names",
            	              		lv_names_3_0, 
            	              		"QualifiedName");
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:290:4: (otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:290:6: otherlv_4= 'as' ( (lv_javaClass_5_0= ruleJvmTypeReference ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStyle577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getStyleAccess().getAsKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:294:1: ( (lv_javaClass_5_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:295:1: (lv_javaClass_5_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:295:1: (lv_javaClass_5_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:296:3: lv_javaClass_5_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStyleAccess().getJavaClassJvmTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleStyle598);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:312:4: ( (lv_expression_6_0= ruleXBlockExpression ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==49) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:313:1: (lv_expression_6_0= ruleXBlockExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:313:1: (lv_expression_6_0= ruleXBlockExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:314:3: lv_expression_6_0= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStyleAccess().getExpressionXBlockExpressionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleStyle621);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:338:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:339:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:340:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral658);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral668); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:347:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:350:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:351:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:351:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral | this_XColorLiteral_6= ruleXColorLiteral )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:352:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral715);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:362:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral742);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:372:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral769);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:382:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral796);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:392:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral823);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:402:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral850);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:412:5: this_XColorLiteral_6= ruleXColorLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXColorLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXColorLiteral_in_ruleXLiteral877);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:428:1: entryRuleXColorLiteral returns [EObject current=null] : iv_ruleXColorLiteral= ruleXColorLiteral EOF ;
    public final EObject entryRuleXColorLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXColorLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:429:2: (iv_ruleXColorLiteral= ruleXColorLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:430:2: iv_ruleXColorLiteral= ruleXColorLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXColorLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXColorLiteral_in_entryRuleXColorLiteral912);
            iv_ruleXColorLiteral=ruleXColorLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXColorLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXColorLiteral922); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:437:1: ruleXColorLiteral returns [EObject current=null] : ( (lv_color_0_0= RULE_COLOR ) ) ;
    public final EObject ruleXColorLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_color_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:440:28: ( ( (lv_color_0_0= RULE_COLOR ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:441:1: ( (lv_color_0_0= RULE_COLOR ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:441:1: ( (lv_color_0_0= RULE_COLOR ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:442:1: (lv_color_0_0= RULE_COLOR )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:442:1: (lv_color_0_0= RULE_COLOR )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:443:3: lv_color_0_0= RULE_COLOR
            {
            lv_color_0_0=(Token)match(input,RULE_COLOR,FOLLOW_RULE_COLOR_in_ruleXColorLiteral963); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:467:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:468:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:469:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1003);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1013); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:476:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:479:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:481:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1059);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:497:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:498:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:499:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1093);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1103); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:506:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:509:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:510:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:510:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=RULE_COLOR && LA9_1<=RULE_ID)||(LA9_1>=14 && LA9_1<=15)||(LA9_1>=17 && LA9_1<=18)||(LA9_1>=20 && LA9_1<=42)||(LA9_1>=44 && LA9_1<=71)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==19) ) {
                    alt9=1;
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:510:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:510:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:510:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:510:3: ()
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:511:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:516:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:517:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:517:1: ( ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:518:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1161);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1177);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:539:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:540:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:540:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:541:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1197);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:558:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:558:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:559:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1227);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:567:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
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
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:567:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:567:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:567:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:572:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:572:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:572:7: ()
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:573:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:578:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:579:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:579:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:580:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1280);
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

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:593:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:594:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:594:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:595:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1303);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:619:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:620:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:621:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1343);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1354); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:628:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:631:28: (kw= '=' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:633:2: kw= '='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpSingleAssign1391); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:646:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:647:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:648:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1431);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1442); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:655:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:658:28: (kw= '+=' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:660:2: kw= '+='
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpMultiAssign1479); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:673:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:674:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:675:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1518);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1528); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:682:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:685:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:686:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:686:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:687:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1575);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:695:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:695:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:695:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:695:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:700:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:700:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:700:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:701:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:706:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:707:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:707:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:708:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1628);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:721:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:722:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:722:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:723:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1651);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:747:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:748:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:749:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1690);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1701); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:756:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:759:28: (kw= '||' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:761:2: kw= '||'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpOr1738); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:774:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:775:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:776:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1777);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1787); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:783:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:786:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:787:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:787:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:788:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1834);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:796:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:796:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:796:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:796:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:801:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:801:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:801:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:802:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:807:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:808:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:808:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:809:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1887);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:822:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:823:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:823:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:824:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1910);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:848:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:849:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:850:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1949);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1960); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:857:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:860:28: (kw= '&&' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:862:2: kw= '&&'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpAnd1997); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:875:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:876:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:877:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2036);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2046); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:884:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:887:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:888:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:888:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:889:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2093);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:897:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:897:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:897:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:897:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:902:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:902:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:902:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:903:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:908:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:909:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:909:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:910:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2146);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:923:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:924:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:924:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:925:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2169);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:949:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:950:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:951:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2208);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2219); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:958:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:961:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:962:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:962:1: (kw= '==' | kw= '!=' )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:963:2: kw= '=='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality2257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:970:2: kw= '!='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpEquality2276); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:983:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:984:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:985:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2316);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2326); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:992:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:995:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:996:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:996:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:997:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2373);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1007:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1007:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1007:6: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1008:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXRelationalExpression2409); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1017:3: ( ( ruleQualifiedName ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:1: ( ruleQualifiedName )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1018:1: ( ruleQualifiedName )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1019:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2434);
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1033:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1033:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1033:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1033:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1033:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1038:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1038:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1038:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1039:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1044:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1045:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1045:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1046:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2495);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1059:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1060:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1060:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1061:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2518);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1085:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1086:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1087:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2558);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2569); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1094:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1097:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1098:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1098:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1099:2: kw= '>='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1106:2: kw= '<='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1113:2: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1120:2: kw= '<'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2664); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1133:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1134:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1135:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2704);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2714); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1142:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1145:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1146:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1146:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1147:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2761);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1155:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1155:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1155:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1155:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1160:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1160:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1160:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1161:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1166:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1167:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1167:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1168:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2814);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1181:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1182:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1182:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1183:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2837);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1207:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1208:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1209:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2876);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2887); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1216:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1219:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1220:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1220:1: (kw= '->' | kw= '..' )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1221:2: kw= '->'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1228:2: kw= '..'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2944); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1241:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1242:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1243:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2984);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2994); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1250:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1253:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1254:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1254:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1255:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3041);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1263:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1263:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1263:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1263:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1268:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1268:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1268:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1269:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1274:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1275:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1275:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1276:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3094);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1289:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1290:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1290:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1291:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3117);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1315:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1316:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1317:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3156);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3167); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1324:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1327:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1328:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1328:1: (kw= '+' | kw= '-' )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1329:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd3205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1336:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAdd3224); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1349:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1350:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1351:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3264);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3274); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1358:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1361:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1362:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1362:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1363:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3321);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1371:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1371:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1371:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1371:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1376:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1376:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1376:7: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1377:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1382:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1383:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1383:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1384:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3374);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1397:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1398:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1398:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1399:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3397);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1423:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1424:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1425:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3436);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3447); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1432:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1435:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1436:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1436:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1437:2: kw= '*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleOpMulti3485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1444:2: kw= '**'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1451:2: kw= '/'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1458:2: kw= '%'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3542); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1471:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1472:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1473:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3582);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3592); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1480:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1483:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1484:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1484:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1484:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1484:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1484:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1484:3: ()
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1485:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1490:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1491:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1491:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1492:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3650);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1505:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1506:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1506:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1507:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3671);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1525:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3700);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1541:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1542:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1543:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3736);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3747); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1550:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1553:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1554:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1554:1: (kw= '!' | kw= '-' | kw= '+' )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1555:2: kw= '!'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpUnary3785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1562:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary3804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1569:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary3823); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1582:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1583:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1584:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3863);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3873); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1591:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1594:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1595:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1595:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1596:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3920);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1604:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1604:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1604:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1604:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1606:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1606:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1606:6: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1607:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXCastedExpression3955); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1616:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1617:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1617:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1618:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3978);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1642:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1643:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1644:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4016);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4026); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1651:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1654:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1655:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1655:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1656:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4073);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1670:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1670:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1670:26: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1671:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall4122); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1680:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1681:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1681:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1682:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4145);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4161);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1703:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1704:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1704:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1705:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4183);
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1722:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1722:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1722:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1722:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1722:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1738:8: ()
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1739:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1744:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
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
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1744:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall4269); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1749:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1749:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1750:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1750:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1751:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall4293); if (state.failed) return current;
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
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1765:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1765:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1766:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1766:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1767:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4330); if (state.failed) return current;
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1780:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==29) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1780:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall4359); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1784:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1785:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1785:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1786:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4380);
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

            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1802:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop26:
            	            do {
            	                int alt26=2;
            	                int LA26_0 = input.LA(1);

            	                if ( (LA26_0==17) ) {
            	                    alt26=1;
            	                }


            	                switch (alt26) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1802:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall4393); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1806:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1807:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1807:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1808:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4414);
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

            	            otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4428); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1828:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1829:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1829:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1830:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4453);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1843:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1843:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1843:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1843:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1850:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1851:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4487); if (state.failed) return current;
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

            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1864:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt29=3;
            	            alt29 = dfa29.predict(input);
            	            switch (alt29) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1864:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1864:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1864:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1876:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1877:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4562);
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
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1894:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1894:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1894:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1894:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1895:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1895:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1896:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4590);
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

            	                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1912:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop28:
            	                    do {
            	                        int alt28=2;
            	                        int LA28_0 = input.LA(1);

            	                        if ( (LA28_0==17) ) {
            	                            alt28=1;
            	                        }


            	                        switch (alt28) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1912:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall4603); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1916:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1917:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1917:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1918:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4624);
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

            	            otherlv_21=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4641); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1946:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1947:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1948:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4682);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4692); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1955:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1958:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1959:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1959:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1960:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4739);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1970:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4766);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1980:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4793);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1990:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4820);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2000:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4847);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2010:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4874);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2020:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4901);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2030:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4928);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2040:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4955);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2050:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4982);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2060:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5009);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2070:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5036);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2080:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5063);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2096:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2097:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2098:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5098);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5108); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2105:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2108:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2109:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2109:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2109:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2109:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2110:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleXClosure5154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2119:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==40||LA34_0==71) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2119:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2119:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2120:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2120:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2121:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5176);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2137:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==17) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2137:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXClosure5189); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2141:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2142:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2142:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2143:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5210);
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

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5226); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2163:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2164:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2164:1: (lv_expression_6_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2165:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5247);
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

            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5259); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2193:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2194:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2195:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5295);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5305); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2202:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2205:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2206:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2206:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2206:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2206:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2206:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2217:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2217:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2217:6: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2218:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2223:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==40||LA36_0==71) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2223:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2223:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2224:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2224:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2225:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5403);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2241:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==17) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2241:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXShortClosure5416); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2245:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2246:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2246:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2247:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5437);
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

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure5453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2267:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2268:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2268:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2269:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5476);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2293:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2294:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2295:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5512);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5522); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2302:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2305:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2306:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2306:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2306:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXParenthesizedExpression5559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5581);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXParenthesizedExpression5592); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2331:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2332:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2333:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5628);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5638); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2340:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2343:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2344:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2344:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2344:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2344:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2345:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression5684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXIfExpression5696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2358:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2359:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2359:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2360:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5717);
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

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXIfExpression5729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2380:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2381:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2381:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2382:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5750);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2398:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2398:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2398:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2398:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression5771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2403:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2404:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2404:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2405:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5793);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2429:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2430:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2431:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5831);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5841); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2438:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2441:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2442:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2442:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2442:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2442:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2443:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression5887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2452:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2452:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2452:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2453:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2453:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2454:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression5909);
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

                    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression5921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2474:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2475:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2475:1: (lv_switch_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2476:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression5944);
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

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression5956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2496:1: ( (lv_cases_6_0= ruleXCasePart ) )+
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2497:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2497:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2498:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5977);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2514:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2514:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression5991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2522:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2523:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2523:1: (lv_default_9_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2524:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6024);
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

            otherlv_10=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6038); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2552:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2553:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2554:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6074);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6084); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2561:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2564:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2565:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2565:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2565:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2565:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==40||LA41_0==71) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2566:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2566:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2567:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6130);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2583:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==52) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2583:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2587:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2588:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2588:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2589:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6165);
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

            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXCasePart6179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2609:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2610:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2610:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2611:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6200);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2635:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2636:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2637:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6236);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6246); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2644:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2647:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2648:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2648:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2648:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2648:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2649:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression6292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXForLoopExpression6304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2662:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2663:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2663:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2664:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6325);
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

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXForLoopExpression6337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2684:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2685:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2685:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2686:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6358);
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

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXForLoopExpression6370); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2706:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2707:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2707:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2708:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6391);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2732:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2733:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2734:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6427);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6437); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2741:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2744:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2745:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2745:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2745:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2745:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2746:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXWhileExpression6483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXWhileExpression6495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2759:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2760:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2760:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2761:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6516);
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

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXWhileExpression6528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2781:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2782:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2782:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2783:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6549);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2807:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2808:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2809:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6585);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6595); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2816:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2819:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2820:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2820:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2820:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2820:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2821:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXDoWhileExpression6641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2830:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2831:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2831:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2832:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6662);
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

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXDoWhileExpression6674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleXDoWhileExpression6686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2856:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2857:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2857:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2858:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6707);
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

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXDoWhileExpression6719); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2886:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2887:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2888:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6755);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6765); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2895:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2898:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2899:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2899:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2899:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2899:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2900:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXBlockExpression6811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2909:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_COLOR && LA44_0<=RULE_ID)||LA44_0==29||(LA44_0>=32 && LA44_0<=33)||LA44_0==37||LA44_0==40||LA44_0==42||LA44_0==45||LA44_0==47||LA44_0==49||(LA44_0>=53 && LA44_0<=55)||(LA44_0>=57 && LA44_0<=59)||(LA44_0>=61 && LA44_0<=68)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2909:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2909:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2910:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2910:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2911:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6833);
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

            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2927:2: (otherlv_3= ';' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==56) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2927:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression6846); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXBlockExpression6862); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2943:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2944:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2945:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6898);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6908); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2952:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2955:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2956:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2956:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2957:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6955);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2967:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6982);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2983:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2984:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2985:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7017);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7027); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2992:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2995:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2996:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2996:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2996:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2996:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2997:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3002:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3002:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3002:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3003:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3003:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3004:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,57,FOLLOW_57_in_ruleXVariableDeclaration7080); if (state.failed) return current;
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3018:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleXVariableDeclaration7111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3022:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3022:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3022:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3022:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3030:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3030:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3030:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3031:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3031:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3032:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7159);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3048:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3049:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3049:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3050:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7180);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3067:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3067:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3068:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3068:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3069:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7209);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3085:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==19) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3085:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleXVariableDeclaration7223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3089:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3090:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3090:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3091:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7244);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3115:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3116:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3117:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7282);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7292); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3124:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3127:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3128:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3128:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3128:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3128:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3129:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3129:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3130:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7338);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3146:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3147:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3147:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3148:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7360);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3172:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3173:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3174:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7396);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7406); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3181:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3184:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3185:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3185:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3185:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3185:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3186:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3191:2: ( ( ruleStaticQualifier ) )?
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3192:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3192:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3193:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7463);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3206:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==29) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3206:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleXFeatureCall7477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3210:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3211:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3211:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3212:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7498);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3228:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==17) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3228:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXFeatureCall7511); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3232:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3233:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3233:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3234:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7532);
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

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall7546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3254:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3255:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3255:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3256:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7571);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3269:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3269:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3269:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3269:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3276:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3277:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall7605); if (state.failed) return current;
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3290:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt54=3;
                    alt54 = dfa54.predict(input);
                    switch (alt54) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3290:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3290:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3290:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3302:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3303:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7680);
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
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3320:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3320:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3320:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3320:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3321:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3321:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3322:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7708);
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

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3338:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==17) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3338:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleXFeatureCall7721); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3342:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3343:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3343:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3344:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7742);
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

                    otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7759); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3372:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3373:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3374:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7798);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper7809); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3381:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3384:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3385:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3385:1: (this_ValidID_0= ruleValidID | kw= 'super' )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3386:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper7856);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3398:2: kw= 'super'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleIdOrSuper7880); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3411:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3412:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3413:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7921);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier7932); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3420:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3423:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3424:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3424:1: (this_ValidID_0= ruleValidID kw= '::' )+
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3425:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier7979);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleStaticQualifier7997); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3449:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3450:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3451:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8038);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8048); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3458:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3461:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3462:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3462:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3462:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3462:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3463:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXConstructorCall8094); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3472:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3473:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3473:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3474:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8117);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3487:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==29) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3487:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleXConstructorCall8130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3491:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3492:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3492:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3493:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8151);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3509:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==17) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3509:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleXConstructorCall8164); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3513:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3514:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3514:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3515:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8185);
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

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,40,FOLLOW_40_in_ruleXConstructorCall8213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3539:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt61=3;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3539:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3539:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3539:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3551:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3552:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8275);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3569:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3569:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3569:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3569:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3570:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3570:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3571:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8303);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3587:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==17) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3587:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleXConstructorCall8316); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3591:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3592:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3592:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3593:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8337);
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

            otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8354); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3621:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3622:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3623:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8390);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8400); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3630:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3633:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3634:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3634:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3634:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3634:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3635:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3640:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3640:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXBooleanLiteral8447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3645:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3645:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3646:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3646:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3647:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,63,FOLLOW_63_in_ruleXBooleanLiteral8471); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3668:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3669:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3670:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8521);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8531); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3677:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3680:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3681:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3681:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3681:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3681:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3682:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXNullLiteral8577); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3699:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3700:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3701:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8613);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8623); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3708:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3711:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3712:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3712:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3712:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3712:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3713:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3718:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3719:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3719:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3720:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8674); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3744:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3745:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3746:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8715);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8725); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3753:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3756:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3757:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3757:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3757:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3757:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3758:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3763:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3764:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3764:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3765:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral8776); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3789:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3790:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3791:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8817);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral8827); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3798:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3801:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3802:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3802:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3802:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3802:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3803:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXTypeLiteral8873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXTypeLiteral8885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3816:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3817:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3817:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3818:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8908);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXTypeLiteral8920); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3843:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3844:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3845:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8956);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression8966); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3852:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3855:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3856:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3856:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3856:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3856:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3857:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXThrowExpression9012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3866:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3867:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3867:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3868:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9033);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3892:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3893:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3894:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9069);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9079); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3901:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3904:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3905:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3905:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3905:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3905:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3906:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXReturnExpression9125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3915:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3915:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3920:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3921:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9156);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3945:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3946:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3947:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9193);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9203); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3954:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3957:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3958:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3958:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3958:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3958:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3959:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTryCatchFinallyExpression9249); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3968:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3969:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3969:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3970:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9270);
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

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3986:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3986:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3986:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3986:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3986:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
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
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3986:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3988:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3989:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9300);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4005:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
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
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4005:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4005:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4005:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9322); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4010:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4011:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4011:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4012:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9344);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4029:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4029:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4029:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4033:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4034:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4034:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4035:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9387);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4059:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4060:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4061:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9425);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9435); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4068:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4071:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4072:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4072:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4072:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4072:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4072:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleXCatchClause9480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleXCatchClause9493); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4081:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4082:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4082:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4083:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9514);
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

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleXCatchClause9526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4103:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4104:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4104:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4105:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9547);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4129:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4130:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4131:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9584);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9595); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4138:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4141:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4142:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4142:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4143:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9642);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4153:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
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
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4153:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4153:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4153:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName9670); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9693);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4180:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4181:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4182:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9740);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9750); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4189:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4192:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4193:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4193:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4194:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9797);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4204:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9824);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4220:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4221:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4222:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9859);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef9869); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4229:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4232:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==40) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4233:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXFunctionTypeRef9907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4237:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4238:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4238:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4239:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9928);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4255:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==17) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4255:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXFunctionTypeRef9941); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4259:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4260:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4260:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4261:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9962);
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

                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef9976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleXFunctionTypeRef9990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4285:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4286:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4286:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4287:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10011);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4311:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4312:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4313:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10047);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10057); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4320:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4323:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4324:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4324:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4324:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4324:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4325:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4325:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4326:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10105);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4339:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4339:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4339:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4339:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleJvmParameterizedTypeReference10126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4344:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4345:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4345:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4346:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10148);
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

                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4362:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==17) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4362:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleJvmParameterizedTypeReference10161); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4366:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4367:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4367:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4368:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10182);
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

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference10196); if (state.failed) return current;
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4396:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4397:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4398:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10234);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10244); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4405:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4408:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4409:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4409:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4410:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10291);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4420:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10318);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4436:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4437:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4438:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10353);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10363); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4445:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4448:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4449:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4449:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4449:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4449:2: ()
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4450:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleJvmWildcardTypeReference10409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4459:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4459:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4459:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4460:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4460:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4461:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10431);
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
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4478:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4478:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4479:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4479:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4480:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10458);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4504:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4505:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4506:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10496);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound10506); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4513:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4516:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4517:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4517:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4517:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleJvmUpperBound10543); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4521:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4522:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4522:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4523:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10564);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4547:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4548:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4549:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10600);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10610); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4556:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4559:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4560:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4560:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4560:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleJvmUpperBoundAnded10647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4564:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4565:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4565:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4566:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10668);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4590:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4591:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4592:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10704);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound10714); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4599:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4602:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4603:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4603:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4603:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleJvmLowerBound10751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4607:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4608:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4608:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4609:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10772);
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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4635:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4636:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4637:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID10811);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID10822); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4644:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4647:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4648:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID10861); if (state.failed) return current;
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:567:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:567:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:567:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:567:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:567:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:568:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:568:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:569:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:569:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:570:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewStyle1248);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:695:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:695:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:695:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:695:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:695:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:696:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:696:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:697:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:697:1: ( ruleOpOr )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:698:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewStyle1596);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:796:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:796:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:796:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:796:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:796:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:797:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:797:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:798:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:798:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:799:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewStyle1855);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:897:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:897:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:897:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:897:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:897:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:898:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:898:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:899:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:899:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:900:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewStyle2114);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1005:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1006:1: 
        {
        }

        match(input,25,FOLLOW_25_in_synpred5_InternalGraphViewStyle2390); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGraphViewStyle

    // $ANTLR start synpred6_InternalGraphViewStyle
    public final void synpred6_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1033:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1033:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1033:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1033:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1033:10: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1034:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1034:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1035:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1035:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1036:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewStyle2463);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1155:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1155:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1155:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1155:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1155:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1156:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1156:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1157:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1157:1: ( ruleOpOther )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1158:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewStyle2782);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1263:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1263:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1263:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1263:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1263:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1264:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1264:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1265:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1265:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1266:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewStyle3062);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1371:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1371:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1371:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1371:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1371:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1372:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1372:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1373:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1373:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1374:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewStyle3342);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1604:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1604:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1604:4: ( () 'as' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1604:5: () 'as'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1604:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1605:1: 
        {
        }

        match(input,18,FOLLOW_18_in_synpred10_InternalGraphViewStyle3936); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalGraphViewStyle

    // $ANTLR start synpred11_InternalGraphViewStyle
    public final void synpred11_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1664:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1665:1: 
        {
        }

        match(input,14,FOLLOW_14_in_synpred11_InternalGraphViewStyle4090); if (state.failed) return ;
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1666:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1667:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1667:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1668:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalGraphViewStyle4099);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewStyle4105);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalGraphViewStyle

    // $ANTLR start synpred12_InternalGraphViewStyle
    public final void synpred12_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1722:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1722:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1722:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1722:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1722:10: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1723:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1723:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
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
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1723:4: '.'
                {
                match(input,14,FOLLOW_14_in_synpred12_InternalGraphViewStyle4208); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1725:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1725:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1726:1: ( '?.' )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1726:1: ( '?.' )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1727:2: '?.'
                {
                match(input,38,FOLLOW_38_in_synpred12_InternalGraphViewStyle4222); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1732:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1732:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1733:1: ( '*.' )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1733:1: ( '*.' )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1734:2: '*.'
                {
                match(input,39,FOLLOW_39_in_synpred12_InternalGraphViewStyle4242); if (state.failed) return ;

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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1843:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1844:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1844:1: ( '(' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1845:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred13_InternalGraphViewStyle4469); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGraphViewStyle

    // $ANTLR start synpred14_InternalGraphViewStyle
    public final void synpred14_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1864:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1864:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1864:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1864:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1864:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1865:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1865:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt77=2;
        int LA77_0 = input.LA(1);

        if ( (LA77_0==RULE_ID||LA77_0==40||LA77_0==71) ) {
            alt77=1;
        }
        switch (alt77) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1865:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1865:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1866:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1866:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1867:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4521);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1869:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop76:
                do {
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==17) ) {
                        alt76=1;
                    }


                    switch (alt76) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1869:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred14_InternalGraphViewStyle4528); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1870:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1871:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1871:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:1872:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4535);
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

        match(input,43,FOLLOW_43_in_synpred14_InternalGraphViewStyle4545); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalGraphViewStyle

    // $ANTLR start synpred16_InternalGraphViewStyle
    public final void synpred16_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2398:4: ( 'else' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:2398:6: 'else'
        {
        match(input,46,FOLLOW_46_in_synpred16_InternalGraphViewStyle5763); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalGraphViewStyle

    // $ANTLR start synpred17_InternalGraphViewStyle
    public final void synpred17_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3022:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3022:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3022:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3022:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3022:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3023:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3023:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3024:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewStyle7129);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3026:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3027:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3027:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3028:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalGraphViewStyle7138);
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
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3269:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3270:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3270:1: ( '(' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3271:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred18_InternalGraphViewStyle7587); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalGraphViewStyle

    // $ANTLR start synpred19_InternalGraphViewStyle
    public final void synpred19_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3290:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3290:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3290:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3290:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3290:6: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3291:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3291:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==RULE_ID||LA81_0==40||LA81_0==71) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3291:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3291:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3292:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3292:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3293:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewStyle7639);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3295:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop80:
                do {
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==17) ) {
                        alt80=1;
                    }


                    switch (alt80) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3295:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred19_InternalGraphViewStyle7646); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3296:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3297:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3297:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3298:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewStyle7653);
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

        match(input,43,FOLLOW_43_in_synpred19_InternalGraphViewStyle7663); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalGraphViewStyle

    // $ANTLR start synpred20_InternalGraphViewStyle
    public final void synpred20_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3539:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3539:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3539:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3539:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3539:5: ()
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3540:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3540:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( (LA83_0==RULE_ID||LA83_0==40||LA83_0==71) ) {
            alt83=1;
        }
        switch (alt83) {
            case 1 :
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3540:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3540:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3541:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3541:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3542:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewStyle8234);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3544:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop82:
                do {
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==17) ) {
                        alt82=1;
                    }


                    switch (alt82) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3544:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred20_InternalGraphViewStyle8241); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3545:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3546:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3546:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3547:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewStyle8248);
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

        match(input,43,FOLLOW_43_in_synpred20_InternalGraphViewStyle8258); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalGraphViewStyle

    // $ANTLR start synpred21_InternalGraphViewStyle
    public final void synpred21_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3915:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3916:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3916:1: ( ruleXExpression )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3917:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewStyle9139);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalGraphViewStyle

    // $ANTLR start synpred22_InternalGraphViewStyle
    public final void synpred22_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3986:5: ( 'catch' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:3986:7: 'catch'
        {
        match(input,70,FOLLOW_70_in_synpred22_InternalGraphViewStyle9284); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalGraphViewStyle

    // $ANTLR start synpred23_InternalGraphViewStyle
    public final void synpred23_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4005:5: ( 'finally' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4005:7: 'finally'
        {
        match(input,69,FOLLOW_69_in_synpred23_InternalGraphViewStyle9314); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalGraphViewStyle

    // $ANTLR start synpred25_InternalGraphViewStyle
    public final void synpred25_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4153:3: ( '.' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4154:2: '.'
        {
        match(input,14,FOLLOW_14_in_synpred25_InternalGraphViewStyle9661); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalGraphViewStyle

    // $ANTLR start synpred26_InternalGraphViewStyle
    public final void synpred26_InternalGraphViewStyle_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4339:4: ( '<' )
        // ../org.eclipse.xtext.graphview.style/src-gen/org/eclipse/xtext/graphview/style/parser/antlr/internal/InternalGraphViewStyle.g:4339:6: '<'
        {
        match(input,29,FOLLOW_29_in_synpred26_InternalGraphViewStyle10118); if (state.failed) return ;

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
            return "1843:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
            return "1864:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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
            return "3269:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
            return "3290:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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
            return "3539:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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
            return "3915:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
            return "4339:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyle528 = new BitSet(new long[]{0x0002000000060002L});
    public static final BitSet FOLLOW_17_in_ruleStyle541 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStyle562 = new BitSet(new long[]{0x0002000000060002L});
    public static final BitSet FOLLOW_18_in_ruleStyle577 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleStyle598 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleStyle621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXColorLiteral_in_ruleXLiteral877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXColorLiteral_in_entryRuleXColorLiteral912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXColorLiteral922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLOR_in_ruleXColorLiteral963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1161 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1177 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1227 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1280 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpSingleAssign1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpMultiAssign1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1575 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1628 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1651 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpOr1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1834 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1887 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1910 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpAnd1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2093 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2146 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2169 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpEquality2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2373 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_25_in_ruleXRelationalExpression2409 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2434 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2495 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2518 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2761 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2814 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2837 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3041 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3094 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3117 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAdd3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3321 = new BitSet(new long[]{0x0000001C00008002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3374 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3397 = new BitSet(new long[]{0x0000001C00008002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpMulti3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3650 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpUnary3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3920 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXCastedExpression3955 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3978 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4073 = new BitSet(new long[]{0x000000C000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall4122 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4145 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4161 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4183 = new BitSet(new long[]{0x000000C000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall4269 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall4293 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4330 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall4359 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4380 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall4393 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4414 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4428 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4453 = new BitSet(new long[]{0x000001C000004002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4487 = new BitSet(new long[]{0xE8E2AF23200000F0L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4562 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4590 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall4603 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4624 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4641 = new BitSet(new long[]{0x000000C000004002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXClosure5154 = new BitSet(new long[]{0x0000090000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5176 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_ruleXClosure5189 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5210 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5226 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5247 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5403 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_ruleXShortClosure5416 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5437 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure5453 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXParenthesizedExpression5559 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5581 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXParenthesizedExpression5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression5684 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXIfExpression5696 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5717 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIfExpression5729 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5750 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression5771 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression5887 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression5909 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression5921 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression5944 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression5956 = new BitSet(new long[]{0x0011010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5977 = new BitSet(new long[]{0x001D010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression5991 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6003 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6024 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6130 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6144 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6165 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXCasePart6179 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression6292 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXForLoopExpression6304 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6325 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXForLoopExpression6337 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6358 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXForLoopExpression6370 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXWhileExpression6483 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXWhileExpression6495 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6516 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXWhileExpression6528 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXDoWhileExpression6641 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6662 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXDoWhileExpression6674 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXDoWhileExpression6686 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6707 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXDoWhileExpression6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXBlockExpression6811 = new BitSet(new long[]{0xEEEAA523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6833 = new BitSet(new long[]{0xEFEAA523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression6846 = new BitSet(new long[]{0xEEEAA523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_51_in_ruleXBlockExpression6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXVariableDeclaration7080 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_58_in_ruleXVariableDeclaration7111 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7159 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7180 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7209 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXVariableDeclaration7223 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7338 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7463 = new BitSet(new long[]{0x0800000020000080L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall7477 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7498 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleXFeatureCall7511 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7532 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall7546 = new BitSet(new long[]{0x0800000020000080L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7571 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall7605 = new BitSet(new long[]{0xE8E2AF23200000F0L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7680 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7708 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_ruleXFeatureCall7721 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7742 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper7809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleIdOrSuper7880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier7932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier7979 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleStaticQualifier7997 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXConstructorCall8094 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8117 = new BitSet(new long[]{0x0000010020000000L});
    public static final BitSet FOLLOW_29_in_ruleXConstructorCall8130 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8151 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleXConstructorCall8164 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8185 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8199 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXConstructorCall8213 = new BitSet(new long[]{0xE8E2AF23200000F0L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8275 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8303 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_ruleXConstructorCall8316 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8337 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXBooleanLiteral8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXBooleanLiteral8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXNullLiteral8577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral8776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral8827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXTypeLiteral8873 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXTypeLiteral8885 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8908 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXTypeLiteral8920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression8966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXThrowExpression9012 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXReturnExpression9125 = new BitSet(new long[]{0xE8E2A523200000F2L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTryCatchFinallyExpression9249 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9300 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9322 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9366 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXCatchClause9480 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXCatchClause9493 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9514 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXCatchClause9526 = new BitSet(new long[]{0xE8E2A523200000F0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9642 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName9670 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9693 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef9869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFunctionTypeRef9907 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9928 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_ruleXFunctionTypeRef9941 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9962 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef9976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleXFunctionTypeRef9990 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10105 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleJvmParameterizedTypeReference10126 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10148 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleJvmParameterizedTypeReference10161 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10182 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference10196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleJvmWildcardTypeReference10409 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound10506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmUpperBound10543 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmUpperBoundAnded10647 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound10714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleJvmLowerBound10751 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID10811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID10822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID10861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewStyle1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewStyle1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewStyle1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewStyle2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred5_InternalGraphViewStyle2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewStyle2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewStyle2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewStyle3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewStyle3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred10_InternalGraphViewStyle3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred11_InternalGraphViewStyle4090 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalGraphViewStyle4099 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewStyle4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred12_InternalGraphViewStyle4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred12_InternalGraphViewStyle4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred12_InternalGraphViewStyle4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred13_InternalGraphViewStyle4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4521 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_synpred14_InternalGraphViewStyle4528 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewStyle4535 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalGraphViewStyle4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred16_InternalGraphViewStyle5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewStyle7129 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalGraphViewStyle7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred18_InternalGraphViewStyle7587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewStyle7639 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_synpred19_InternalGraphViewStyle7646 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewStyle7653 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_synpred19_InternalGraphViewStyle7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewStyle8234 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_synpred20_InternalGraphViewStyle8241 = new BitSet(new long[]{0x0000010000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewStyle8248 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_synpred20_InternalGraphViewStyle8258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewStyle9139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred22_InternalGraphViewStyle9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred23_InternalGraphViewStyle9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred25_InternalGraphViewStyle9661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred26_InternalGraphViewStyle10118 = new BitSet(new long[]{0x0000000000000002L});

}