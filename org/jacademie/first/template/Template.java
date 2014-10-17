package org.jacademie.first.template;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.jacademie.first.exception.MissingValueException;

public class Template {

	private String text;
	
	private Map<String, String> variables;

	public Template(String text) {
		this.text = text;
		this.variables = new HashMap<String, String>();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public Map<String, String> getVariables() {
		return variables;
	}

	public void setVariables(Map<String, String> variables) {
		this.variables = variables;
	}
	
	public void put(String variableName, String variableValue) {
		this.variables.put(variableName, variableValue);
	}

	public String evaluate() throws MissingValueException {
		
		String result = this.text;
		
		for (String variableName : this.variables.keySet()) {
			result = StringUtils.replace(result, "${" + variableName + "}",
					this.variables.get(variableName));
		}
		
		if (StringUtils.contains(result, "${")) {
			throw new MissingValueException();
		}
		
		return result;
	}
}
