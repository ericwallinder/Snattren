package se.snattren;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Splitter;
import com.google.common.collect.Maps;
import com.google.inject.Inject;

public class ArgsParser {
	private final Splitter parameterSplitter = Splitter.on(Pattern.compile("\\s*\\-{2}")).omitEmptyStrings();
	private final Pattern keyValuePattern = Pattern.compile("(.+?)=\"?(.*?)\"?$");
	
	@Inject
	public ArgsParser(Splitter parameterSplitter, Pattern keyValuePattern) {
		//this.parameterSplitter = parameterSplitter;
		//this.keyValuePattern = keyValuePattern;
	}

	public Map<String, String> getParameterValues(String parameter){
		Map<String, String> parameterValues = Maps.newLinkedHashMap();
		for (String param : parameterSplitter.split(parameter)) {
			Matcher matcher = keyValuePattern.matcher(param);
			if (!matcher.find()){
				throw new IllegalArgumentException("Bad parameter: " + param);
			}
			parameterValues.put(matcher.group(1), matcher.group(2));
		}
		return parameterValues;
	}
}