package com.harshitbhardwaj.basicusage;

import org.aeonbits.owner.ConfigFactory;

public class BasicUsageExample {

	public static void main(String[] args) {

		System.out.println("Checkout ServerConfig.properties file to see these properties");

		// Creates a Config instance using the ServerConfig interface
		ServerConfig serverConfig = ConfigFactory.create(ServerConfig.class);

		// Prints values from ServerConfig properties file
		System.out.println("Hostname : " + serverConfig.hostname());
		System.out.println("Port : " + serverConfig.port());
		System.out.println("Max Threads : " + serverConfig.maxThreads());

		// Demonstrates the behavior for undefined properties without @DeafultValue
		System.out.println("Undefined String will return null : " + serverConfig.undefinedString());

		/*
		 * Un-commenting the following line will throw NullPointerException. if
		 * undefinedInt() is accessed without a @DefaultValue in ServerConfig.java
		 * 
		 * System.out.println("Undefined Int will raise NPE : " +
		 * serverConfig.undefinedInt());
		 */

		System.out.println("------------------------------------------");

		System.out.println("Checkout ComplexServerConfig.properties file to see these properties");

		// Creates a Config instance using the ComplexServerConfig interface
		ComplexServerConfig complexServerConfig = ConfigFactory.create(ComplexServerConfig.class);

		// Prints values from ComplexServerConfig properties file
		System.out.println("server.host.name : " + complexServerConfig.hostname());
		System.out.println("server.http.port : " + complexServerConfig.port());
		System.out.println("server.max.threads : " + complexServerConfig.maxThreads());
	}
}
