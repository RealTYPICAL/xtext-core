/*
 * generated by Xtext
 */
package org.eclipse.xtext.grammarinheritance.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.grammarinheritance.services.InheritanceTestLanguageGrammarAccess;

public class InheritanceTestLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private InheritanceTestLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.xtext.grammarinheritance.parser.antlr.internal.InternalInheritanceTestLanguageParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.grammarinheritance.parser.antlr.internal.InternalInheritanceTestLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public InheritanceTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(InheritanceTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}