package se.snattren;

import com.google.gson.Gson;

public class ConfigParser {
	private final Gson gson;
	
	public ConfigParser(Gson gson) {
		this.gson = gson;
	}
	
	public Config parse(String json) {
		return gson.fromJson(json, Config.class);
	}
}
