package se.snattren;

import com.google.gson.annotations.SerializedName;

public class Config {
	private final String url;
	private final Integer port;
	
	@SerializedName("database_name")
	private final String databaseName;
	
	@SerializedName("script_path")
	private final String scriptPath;

	public Config(String url, Integer port, String databaseName, String scriptPath) {
		super();
		this.url = url;
		this.port = port;
		this.databaseName = databaseName;
		this.scriptPath = scriptPath;
	}

	public String getUrl() {
		return url;
	}

	public Integer getPort() {
		return port;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public String getScriptPath() {
		return scriptPath;
	}
}
