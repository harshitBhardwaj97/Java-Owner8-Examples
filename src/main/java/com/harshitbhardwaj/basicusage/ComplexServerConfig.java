package com.harshitbhardwaj.basicusage;

import org.aeonbits.owner.Config;

public interface ComplexServerConfig extends Config {

	// Maps to the property 'server.http.port' in ComplexServerConfig.properties
	@Key("server.http.port")
	int port();

	// Maps to the property 'server.host.name' in in ComplexServerConfig.properties
	@Key("server.host.name")
	String hostname();

	/*
	 * Maps to the property 'server.max.threads' with a default value of 42 if not
	 * specified in ComplexServerConfig.properties
	 */
	@Key("server.max.threads")
	@DefaultValue("42")
	int maxThreads();
}
