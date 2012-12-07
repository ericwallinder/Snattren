package se.snattren;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Snattren {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AbstractModule() {
			@Override
			protected void configure() {
				
			}
		});
		ArgsParser argumentParser = injector.getInstance(ArgsParser.class);
	}
}
