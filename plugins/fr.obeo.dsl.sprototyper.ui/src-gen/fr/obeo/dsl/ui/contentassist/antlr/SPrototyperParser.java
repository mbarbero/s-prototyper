/*
* generated by Xtext
*/
package fr.obeo.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import fr.obeo.dsl.services.SPrototyperGrammarAccess;

public class SPrototyperParser extends AbstractContentAssistParser {
	
	@Inject
	private SPrototyperGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected fr.obeo.dsl.ui.contentassist.antlr.internal.InternalSPrototyperParser createParser() {
		fr.obeo.dsl.ui.contentassist.antlr.internal.InternalSPrototyperParser result = new fr.obeo.dsl.ui.contentassist.antlr.internal.InternalSPrototyperParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSPRepresentationAccess().getAlternatives(), "rule__SPRepresentation__Alternatives");
					put(grammarAccess.getContainerTypeAccess().getAlternatives(), "rule__ContainerType__Alternatives");
					put(grammarAccess.getContainerColorDefinitionAccess().getAlternatives(), "rule__ContainerColorDefinition__Alternatives");
					put(grammarAccess.getSPExpressionAccess().getAlternatives(), "rule__SPExpression__Alternatives");
					put(grammarAccess.getPreDefinedColorAccess().getAlternatives(), "rule__PreDefinedColor__Alternatives");
					put(grammarAccess.getSPrototyperAccess().getGroup(), "rule__SPrototyper__Group__0");
					put(grammarAccess.getSPrototyperAccess().getGroup_3(), "rule__SPrototyper__Group_3__0");
					put(grammarAccess.getSPViewpointAccess().getGroup(), "rule__SPViewpoint__Group__0");
					put(grammarAccess.getSPViewpointAccess().getGroup_3(), "rule__SPViewpoint__Group_3__0");
					put(grammarAccess.getSPViewpointAccess().getGroup_4(), "rule__SPViewpoint__Group_4__0");
					put(grammarAccess.getSPTableAccess().getGroup(), "rule__SPTable__Group__0");
					put(grammarAccess.getSPTableAccess().getGroup_3(), "rule__SPTable__Group_3__0");
					put(grammarAccess.getSPTableAccess().getGroup_4(), "rule__SPTable__Group_4__0");
					put(grammarAccess.getTableElementAccess().getGroup(), "rule__TableElement__Group__0");
					put(grammarAccess.getTableElementAccess().getGroup_6(), "rule__TableElement__Group_6__0");
					put(grammarAccess.getTablePropertyAccess().getGroup(), "rule__TableProperty__Group__0");
					put(grammarAccess.getTablePropertyAccess().getGroup_2(), "rule__TableProperty__Group_2__0");
					put(grammarAccess.getTablePropertyAccess().getGroup_3(), "rule__TableProperty__Group_3__0");
					put(grammarAccess.getSPDiagramAccess().getGroup(), "rule__SPDiagram__Group__0");
					put(grammarAccess.getSPDiagramAccess().getGroup_3(), "rule__SPDiagram__Group_3__0");
					put(grammarAccess.getSPDiagramAccess().getGroup_4(), "rule__SPDiagram__Group_4__0");
					put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
					put(grammarAccess.getContainerAccess().getGroup_8(), "rule__Container__Group_8__0");
					put(grammarAccess.getContainerStyleDefinitionAccess().getGroup(), "rule__ContainerStyleDefinition__Group__0");
					put(grammarAccess.getContainerStyleDefinitionAccess().getGroup_2(), "rule__ContainerStyleDefinition__Group_2__0");
					put(grammarAccess.getContainerStyleDefinitionAccess().getGroup_3(), "rule__ContainerStyleDefinition__Group_3__0");
					put(grammarAccess.getSolidColorDefinitionAccess().getGroup(), "rule__SolidColorDefinition__Group__0");
					put(grammarAccess.getGradientColorDefinitionAccess().getGroup(), "rule__GradientColorDefinition__Group__0");
					put(grammarAccess.getLabelStyleDefinitionAccess().getGroup(), "rule__LabelStyleDefinition__Group__0");
					put(grammarAccess.getLabelStyleDefinitionAccess().getGroup_3(), "rule__LabelStyleDefinition__Group_3__0");
					put(grammarAccess.getBorderStyleDefinitionAccess().getGroup(), "rule__BorderStyleDefinition__Group__0");
					put(grammarAccess.getBorderStyleDefinitionAccess().getGroup_2(), "rule__BorderStyleDefinition__Group_2__0");
					put(grammarAccess.getAcceleoExpressionAccess().getGroup(), "rule__AcceleoExpression__Group__0");
					put(grammarAccess.getVarRefAccess().getGroup(), "rule__VarRef__Group__0");
					put(grammarAccess.getFeatureRefAccess().getGroup(), "rule__FeatureRef__Group__0");
					put(grammarAccess.getMetamodelRefAccess().getGroup(), "rule__MetamodelRef__Group__0");
					put(grammarAccess.getSPrototyperAccess().getNameAssignment_1(), "rule__SPrototyper__NameAssignment_1");
					put(grammarAccess.getSPrototyperAccess().getQualifierAssignment_3_1(), "rule__SPrototyper__QualifierAssignment_3_1");
					put(grammarAccess.getSPrototyperAccess().getViewpointsAssignment_4(), "rule__SPrototyper__ViewpointsAssignment_4");
					put(grammarAccess.getSPViewpointAccess().getNameAssignment_1(), "rule__SPViewpoint__NameAssignment_1");
					put(grammarAccess.getSPViewpointAccess().getShortcutAssignment_3_1(), "rule__SPViewpoint__ShortcutAssignment_3_1");
					put(grammarAccess.getSPViewpointAccess().getExtensionAssignment_4_1(), "rule__SPViewpoint__ExtensionAssignment_4_1");
					put(grammarAccess.getSPViewpointAccess().getRepresentationsAssignment_5(), "rule__SPViewpoint__RepresentationsAssignment_5");
					put(grammarAccess.getSPTableAccess().getNameAssignment_1(), "rule__SPTable__NameAssignment_1");
					put(grammarAccess.getSPTableAccess().getLabelAssignment_3_1(), "rule__SPTable__LabelAssignment_3_1");
					put(grammarAccess.getSPTableAccess().getTitleAssignment_4_1(), "rule__SPTable__TitleAssignment_4_1");
					put(grammarAccess.getSPTableAccess().getMetamodelsAssignment_5(), "rule__SPTable__MetamodelsAssignment_5");
					put(grammarAccess.getSPTableAccess().getRootAssignment_7(), "rule__SPTable__RootAssignment_7");
					put(grammarAccess.getSPTableAccess().getElementsAssignment_8(), "rule__SPTable__ElementsAssignment_8");
					put(grammarAccess.getSPTableAccess().getPropertiesAssignment_9(), "rule__SPTable__PropertiesAssignment_9");
					put(grammarAccess.getTableElementAccess().getCreatableAssignment_0(), "rule__TableElement__CreatableAssignment_0");
					put(grammarAccess.getTableElementAccess().getRecursiveAssignment_1(), "rule__TableElement__RecursiveAssignment_1");
					put(grammarAccess.getTableElementAccess().getEClassAssignment_3(), "rule__TableElement__EClassAssignment_3");
					put(grammarAccess.getTableElementAccess().getExpressionAssignment_5(), "rule__TableElement__ExpressionAssignment_5");
					put(grammarAccess.getTableElementAccess().getSubElementsAssignment_6_1(), "rule__TableElement__SubElementsAssignment_6_1");
					put(grammarAccess.getTablePropertyAccess().getFeatureAssignment_1(), "rule__TableProperty__FeatureAssignment_1");
					put(grammarAccess.getTablePropertyAccess().getLabelAssignment_2_1(), "rule__TableProperty__LabelAssignment_2_1");
					put(grammarAccess.getTablePropertyAccess().getExpressionAssignment_3_1(), "rule__TableProperty__ExpressionAssignment_3_1");
					put(grammarAccess.getSPDiagramAccess().getNameAssignment_1(), "rule__SPDiagram__NameAssignment_1");
					put(grammarAccess.getSPDiagramAccess().getLabelAssignment_3_1(), "rule__SPDiagram__LabelAssignment_3_1");
					put(grammarAccess.getSPDiagramAccess().getTitleAssignment_4_1(), "rule__SPDiagram__TitleAssignment_4_1");
					put(grammarAccess.getSPDiagramAccess().getMetamodelsAssignment_5(), "rule__SPDiagram__MetamodelsAssignment_5");
					put(grammarAccess.getSPDiagramAccess().getRootAssignment_7(), "rule__SPDiagram__RootAssignment_7");
					put(grammarAccess.getSPDiagramAccess().getElementsAssignment_8(), "rule__SPDiagram__ElementsAssignment_8");
					put(grammarAccess.getContainerAccess().getCreatableAssignment_0(), "rule__Container__CreatableAssignment_0");
					put(grammarAccess.getContainerAccess().getRecursiveAssignment_1(), "rule__Container__RecursiveAssignment_1");
					put(grammarAccess.getContainerAccess().getContainerTypeAssignment_2(), "rule__Container__ContainerTypeAssignment_2");
					put(grammarAccess.getContainerAccess().getEClassAssignment_4(), "rule__Container__EClassAssignment_4");
					put(grammarAccess.getContainerAccess().getExpressionAssignment_6(), "rule__Container__ExpressionAssignment_6");
					put(grammarAccess.getContainerAccess().getStyleAssignment_7(), "rule__Container__StyleAssignment_7");
					put(grammarAccess.getContainerAccess().getElementsAssignment_8_1(), "rule__Container__ElementsAssignment_8_1");
					put(grammarAccess.getContainerStyleDefinitionAccess().getColorAssignment_1(), "rule__ContainerStyleDefinition__ColorAssignment_1");
					put(grammarAccess.getContainerStyleDefinitionAccess().getLabelAssignment_2_1(), "rule__ContainerStyleDefinition__LabelAssignment_2_1");
					put(grammarAccess.getContainerStyleDefinitionAccess().getBorderAssignment_3_1(), "rule__ContainerStyleDefinition__BorderAssignment_3_1");
					put(grammarAccess.getSolidColorDefinitionAccess().getColorAssignment_1(), "rule__SolidColorDefinition__ColorAssignment_1");
					put(grammarAccess.getGradientColorDefinitionAccess().getFromAssignment_1(), "rule__GradientColorDefinition__FromAssignment_1");
					put(grammarAccess.getGradientColorDefinitionAccess().getToAssignment_3(), "rule__GradientColorDefinition__ToAssignment_3");
					put(grammarAccess.getLabelStyleDefinitionAccess().getExpressionAssignment_1(), "rule__LabelStyleDefinition__ExpressionAssignment_1");
					put(grammarAccess.getLabelStyleDefinitionAccess().getColorAssignment_2(), "rule__LabelStyleDefinition__ColorAssignment_2");
					put(grammarAccess.getLabelStyleDefinitionAccess().getSizeAssignment_3_1(), "rule__LabelStyleDefinition__SizeAssignment_3_1");
					put(grammarAccess.getLabelStyleDefinitionAccess().getBoldAssignment_4(), "rule__LabelStyleDefinition__BoldAssignment_4");
					put(grammarAccess.getLabelStyleDefinitionAccess().getItalicAssignment_5(), "rule__LabelStyleDefinition__ItalicAssignment_5");
					put(grammarAccess.getBorderStyleDefinitionAccess().getColorAssignment_1(), "rule__BorderStyleDefinition__ColorAssignment_1");
					put(grammarAccess.getBorderStyleDefinitionAccess().getSizeAssignment_2_1(), "rule__BorderStyleDefinition__SizeAssignment_2_1");
					put(grammarAccess.getAcceleoExpressionAccess().getValueAssignment_1(), "rule__AcceleoExpression__ValueAssignment_1");
					put(grammarAccess.getVarRefAccess().getValueAssignment_1(), "rule__VarRef__ValueAssignment_1");
					put(grammarAccess.getFeatureRefAccess().getValueAssignment_1(), "rule__FeatureRef__ValueAssignment_1");
					put(grammarAccess.getMetamodelRefAccess().getMetamodelAssignment_1(), "rule__MetamodelRef__MetamodelAssignment_1");
					put(grammarAccess.getPreDefinedColorDefinitionAccess().getColorAssignment(), "rule__PreDefinedColorDefinition__ColorAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			fr.obeo.dsl.ui.contentassist.antlr.internal.InternalSPrototyperParser typedParser = (fr.obeo.dsl.ui.contentassist.antlr.internal.InternalSPrototyperParser) parser;
			typedParser.entryRuleSPrototyper();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SPrototyperGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SPrototyperGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
