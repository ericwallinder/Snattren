package se.snattren;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;

public class ConfigParserTest {
	private ConfigParser parser; 

	@Before
	public void setup() {
		parser = new ConfigParser(new Gson());
	}
	@Test
	public void test() {
		Config config = parser.parse("{ \"url\":\"test\", \"port\":12, \"database_name\":\"asd\", \"script_path\":\"a\"}");
		assertTrue(config.getDatabaseName().equals("asd"));
		assertTrue(config.getPort() == 12);
		assertTrue(config.getUrl().equals("test"));
		assertTrue(config.getScriptPath().equals("a"));
	}
}
