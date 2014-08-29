/*
* generated by Xtext
*/
grammar InternalSPrototyper;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package fr.obeo.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.obeo.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.obeo.dsl.services.SPrototyperGrammarAccess;

}

@parser::members {

 	private SPrototyperGrammarAccess grammarAccess;
 	
    public InternalSPrototyperParser(TokenStream input, SPrototyperGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "SPrototyper";	
   	}
   	
   	@Override
   	protected SPrototyperGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSPrototyper
entryRuleSPrototyper returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSPrototyperRule()); }
	 iv_ruleSPrototyper=ruleSPrototyper 
	 { $current=$iv_ruleSPrototyper.current; } 
	 EOF 
;

// Rule SPrototyper
ruleSPrototyper returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='proto' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSPrototyperAccess().getProtoKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSPrototyperAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSPrototyperRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSPrototyperAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='qualifier' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSPrototyperAccess().getQualifierKeyword_3_0());
    }
(
(
		lv_qualifier_4_0=RULE_STRING
		{
			newLeafNode(lv_qualifier_4_0, grammarAccess.getSPrototyperAccess().getQualifierSTRINGTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSPrototyperRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"qualifier",
        		lv_qualifier_4_0, 
        		"STRING");
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getSPrototyperAccess().getViewpointsSPViewpointParserRuleCall_4_0()); 
	    }
		lv_viewpoints_5_0=ruleSPViewpoint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSPrototyperRule());
	        }
       		add(
       			$current, 
       			"viewpoints",
        		lv_viewpoints_5_0, 
        		"SPViewpoint");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getSPrototyperAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleSPViewpoint
entryRuleSPViewpoint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSPViewpointRule()); }
	 iv_ruleSPViewpoint=ruleSPViewpoint 
	 { $current=$iv_ruleSPViewpoint.current; } 
	 EOF 
;

// Rule SPViewpoint
ruleSPViewpoint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='viewpoint' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSPViewpointAccess().getViewpointKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSPViewpointAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSPViewpointRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSPViewpointAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='shortcut' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSPViewpointAccess().getShortcutKeyword_3_0());
    }
(
(
		lv_shortcut_4_0=RULE_STRING
		{
			newLeafNode(lv_shortcut_4_0, grammarAccess.getSPViewpointAccess().getShortcutSTRINGTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSPViewpointRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"shortcut",
        		lv_shortcut_4_0, 
        		"STRING");
	    }

)
))?(	otherlv_5='ext' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSPViewpointAccess().getExtKeyword_4_0());
    }
(
(
		lv_extension_6_0=RULE_STRING
		{
			newLeafNode(lv_extension_6_0, grammarAccess.getSPViewpointAccess().getExtensionSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSPViewpointRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"extension",
        		lv_extension_6_0, 
        		"STRING");
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getSPViewpointAccess().getRepresentationsSPRepresentationParserRuleCall_5_0()); 
	    }
		lv_representations_7_0=ruleSPRepresentation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSPViewpointRule());
	        }
       		add(
       			$current, 
       			"representations",
        		lv_representations_7_0, 
        		"SPRepresentation");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getSPViewpointAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleSPRepresentation
entryRuleSPRepresentation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSPRepresentationRule()); }
	 iv_ruleSPRepresentation=ruleSPRepresentation 
	 { $current=$iv_ruleSPRepresentation.current; } 
	 EOF 
;

// Rule SPRepresentation
ruleSPRepresentation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getSPRepresentationAccess().getSPTableParserRuleCall()); 
    }
    this_SPTable_0=ruleSPTable
    { 
        $current = $this_SPTable_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleSPTable
entryRuleSPTable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSPTableRule()); }
	 iv_ruleSPTable=ruleSPTable 
	 { $current=$iv_ruleSPTable.current; } 
	 EOF 
;

// Rule SPTable
ruleSPTable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='table' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSPTableAccess().getTableKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSPTableAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSPTableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSPTableAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='label' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSPTableAccess().getLabelKeyword_3_0());
    }
(
(
		lv_label_4_0=RULE_STRING
		{
			newLeafNode(lv_label_4_0, grammarAccess.getSPTableAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSPTableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_4_0, 
        		"STRING");
	    }

)
))?(	otherlv_5='title' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSPTableAccess().getTitleKeyword_4_0());
    }
(
(
		lv_title_6_0=RULE_STRING
		{
			newLeafNode(lv_title_6_0, grammarAccess.getSPTableAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSPTableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"title",
        		lv_title_6_0, 
        		"STRING");
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getSPTableAccess().getMetamodelsMetamodelRefParserRuleCall_5_0()); 
	    }
		lv_metamodels_7_0=ruleMetamodelRef		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSPTableRule());
	        }
       		add(
       			$current, 
       			"metamodels",
        		lv_metamodels_7_0, 
        		"MetamodelRef");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_8='root' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getSPTableAccess().getRootKeyword_6());
    }
(
(
		lv_root_9_0=RULE_STRING
		{
			newLeafNode(lv_root_9_0, grammarAccess.getSPTableAccess().getRootSTRINGTerminalRuleCall_7_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSPTableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"root",
        		lv_root_9_0, 
        		"STRING");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSPTableAccess().getElementsTableElementParserRuleCall_8_0()); 
	    }
		lv_elements_10_0=ruleTableElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSPTableRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_10_0, 
        		"TableElement");
	        afterParserOrEnumRuleCall();
	    }

)
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getSPTableAccess().getPropertiesTablePropertyParserRuleCall_9_0()); 
	    }
		lv_properties_11_0=ruleTableProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSPTableRule());
	        }
       		add(
       			$current, 
       			"properties",
        		lv_properties_11_0, 
        		"TableProperty");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getSPTableAccess().getRightCurlyBracketKeyword_10());
    }
)
;





// Entry rule entryRuleTableElement
entryRuleTableElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTableElementRule()); }
	 iv_ruleTableElement=ruleTableElement 
	 { $current=$iv_ruleTableElement.current; } 
	 EOF 
;

// Rule TableElement
ruleTableElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='element' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTableElementAccess().getElementKeyword_0());
    }
(
(
		lv_eClass_1_0=RULE_STRING
		{
			newLeafNode(lv_eClass_1_0, grammarAccess.getTableElementAccess().getEClassSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableElementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"eClass",
        		lv_eClass_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='accessibleThrough' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTableElementAccess().getAccessibleThroughKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTableElementAccess().getExpressionSPExpressionParserRuleCall_3_0()); 
	    }
		lv_expression_3_0=ruleSPExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTableElementRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_3_0, 
        		"SPExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_canCreate_4_0=	'create' 
    {
        newLeafNode(lv_canCreate_4_0, grammarAccess.getTableElementAccess().getCanCreateCreateKeyword_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableElementRule());
	        }
       		setWithLastConsumed($current, "canCreate", true, "create");
	    }

)
)?(	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getTableElementAccess().getLeftCurlyBracketKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTableElementAccess().getSubElementsTableElementParserRuleCall_5_1_0()); 
	    }
		lv_subElements_6_0=ruleTableElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTableElementRule());
	        }
       		add(
       			$current, 
       			"subElements",
        		lv_subElements_6_0, 
        		"TableElement");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getTableElementAccess().getRightCurlyBracketKeyword_5_2());
    }
)?)
;





// Entry rule entryRuleTableProperty
entryRuleTableProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTablePropertyRule()); }
	 iv_ruleTableProperty=ruleTableProperty 
	 { $current=$iv_ruleTableProperty.current; } 
	 EOF 
;

// Rule TableProperty
ruleTableProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='property' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTablePropertyAccess().getPropertyKeyword_0());
    }
(
(
		lv_feature_1_0=RULE_STRING
		{
			newLeafNode(lv_feature_1_0, grammarAccess.getTablePropertyAccess().getFeatureSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTablePropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"feature",
        		lv_feature_1_0, 
        		"STRING");
	    }

)
)(	otherlv_2='label' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTablePropertyAccess().getLabelKeyword_2_0());
    }
(
(
		lv_label_3_0=RULE_STRING
		{
			newLeafNode(lv_label_3_0, grammarAccess.getTablePropertyAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTablePropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_3_0, 
        		"STRING");
	    }

)
))?(	otherlv_4='expression' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTablePropertyAccess().getExpressionKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTablePropertyAccess().getExpressionSPExpressionParserRuleCall_3_1_0()); 
	    }
		lv_expression_5_0=ruleSPExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTablePropertyRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_5_0, 
        		"SPExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleSPExpression
entryRuleSPExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSPExpressionRule()); }
	 iv_ruleSPExpression=ruleSPExpression 
	 { $current=$iv_ruleSPExpression.current; } 
	 EOF 
;

// Rule SPExpression
ruleSPExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSPExpressionAccess().getAcceleoExpressionParserRuleCall_0()); 
    }
    this_AcceleoExpression_0=ruleAcceleoExpression
    { 
        $current = $this_AcceleoExpression_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSPExpressionAccess().getVarRefParserRuleCall_1()); 
    }
    this_VarRef_1=ruleVarRef
    { 
        $current = $this_VarRef_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSPExpressionAccess().getFeatureRefParserRuleCall_2()); 
    }
    this_FeatureRef_2=ruleFeatureRef
    { 
        $current = $this_FeatureRef_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAcceleoExpression
entryRuleAcceleoExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAcceleoExpressionRule()); }
	 iv_ruleAcceleoExpression=ruleAcceleoExpression 
	 { $current=$iv_ruleAcceleoExpression.current; } 
	 EOF 
;

// Rule AcceleoExpression
ruleAcceleoExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='acc:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAcceleoExpressionAccess().getAccKeyword_0());
    }
(
(
		lv_value_1_0=RULE_STRING
		{
			newLeafNode(lv_value_1_0, grammarAccess.getAcceleoExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAcceleoExpressionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleVarRef
entryRuleVarRef returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVarRefRule()); }
	 iv_ruleVarRef=ruleVarRef 
	 { $current=$iv_ruleVarRef.current; } 
	 EOF 
;

// Rule VarRef
ruleVarRef returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='var:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getVarRefAccess().getVarKeyword_0());
    }
(
(
		lv_value_1_0=RULE_STRING
		{
			newLeafNode(lv_value_1_0, grammarAccess.getVarRefAccess().getValueSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVarRefRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleFeatureRef
entryRuleFeatureRef returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeatureRefRule()); }
	 iv_ruleFeatureRef=ruleFeatureRef 
	 { $current=$iv_ruleFeatureRef.current; } 
	 EOF 
;

// Rule FeatureRef
ruleFeatureRef returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='feature:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFeatureRefAccess().getFeatureKeyword_0());
    }
(
(
		lv_value_1_0=RULE_STRING
		{
			newLeafNode(lv_value_1_0, grammarAccess.getFeatureRefAccess().getValueSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFeatureRefRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleMetamodelRef
entryRuleMetamodelRef returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMetamodelRefRule()); }
	 iv_ruleMetamodelRef=ruleMetamodelRef 
	 { $current=$iv_ruleMetamodelRef.current; } 
	 EOF 
;

// Rule MetamodelRef
ruleMetamodelRef returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='use' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMetamodelRefAccess().getUseKeyword_0());
    }
(
(
		lv_metamodel_1_0=RULE_STRING
		{
			newLeafNode(lv_metamodel_1_0, grammarAccess.getMetamodelRefAccess().getMetamodelSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetamodelRefRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"metamodel",
        		lv_metamodel_1_0, 
        		"STRING");
	    }

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


