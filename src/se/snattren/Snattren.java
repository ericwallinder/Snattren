package se.snattren;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.io.IOException;
import java.net.URL;

public class Snattren {
	public static void main(String[] args) throws IOException {
//		Injector injector = Guice.createInjector(new AbstractModule() {
//			@Override
//			protected void configure() {
//
//			}
//		});
//		ArgsParser argumentParser = injector.getInstance(ArgsParser.class);
        ConfigParser configParser = new ConfigParser(new Gson());
        URL url = Resources.getResource("config.json");
        String json = Resources.toString(url, Charsets.UTF_8);
        Config config = configParser.parse(json);
        System.out.println(config.getPort());
	}
}
