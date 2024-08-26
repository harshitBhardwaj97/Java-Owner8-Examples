package com.harshitbhardwaj.basicusage;

import org.aeonbits.owner.Config;

public interface ServerConfig extends Config {

	// Maps to the property 'port'
	int port();

	// Maps to the property 'hostname'
	String hostname();

	/*
	 * Maps to the property 'maxThreads' with a default value of 42 if not specified
	 * in the properties file
	 */
	@DefaultValue("42")
	int maxThreads();

	/*
	 * Property 'undefinedString' is not defined in the ServerConfig.properties
	 * file, and will return null if accessed (Since its a non-primitive type).
	 * Add @DefaultValue() to fix this behaviour
	 * 
	 */
	String undefinedString();

	/*
	 * Property 'undefinedInt' is not defined in the properties file, and will throw
	 * NullPointerException if accessed (Since its a primitive type).
	 * Add @DefaultValue() to fix this behaviour
	 */
	int undefinedInt();
}
