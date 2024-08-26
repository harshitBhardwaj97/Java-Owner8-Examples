package com.harshitbhardwaj.morefeatures;

import org.aeonbits.owner.ConfigFactory;

public class MoreFeaturesExample {

	public static void main(String[] args) {

		/*
		 * Singleton Pattern of Creating the configuration instance using
		 * ConfigCache.getOrCreate(Configuration.class)
		 */
		Configuration config = ConfigurationManager.getConfiguration();
		Configuration config2 = ConfigurationManager.getConfiguration();

		/*
		 * This will be printed as 'true'
		 */
		System.out.printf("config == config2 ? %b \n", config == config2);
		System.out.println("It's because they have been created using ConfigCache.getOrCreate()");

		System.out.println("------------------------------------------");

		/*
		 * Using ConfigFactory.create() for creating the configuration instance results
		 * in different objects
		 */
		Configuration config3 = ConfigFactory.create(Configuration.class);
		Configuration config4 = ConfigFactory.create(Configuration.class);

		/*
		 * This will be printed as 'false'
		 */
		System.out.printf("config3 == config4 ? %b \n", config3 == config4);
		System.out.println("It's because they have been created using ConfigFactory.create()");

		System.out.println("------------------------------------------");

		System.out.println("Checkout general.properties and extra.properties");

		System.out.println("App Name : " + config.appName());
		System.out.println("App Version : " + config.appVersion());
		System.out.println("Is Debugging Enabled : " + config.isDebuggingEnabled());
		System.out.println("Log Level : " + config.logLevel());
		System.out.println("New Features Enabled : " + config.areNewFeaturesEnabled());
		System.out.println("New Features Version: " + config.newFeatureVersion());

	}

}
