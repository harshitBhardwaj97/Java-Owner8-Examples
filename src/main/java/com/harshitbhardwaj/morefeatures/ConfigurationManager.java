package com.harshitbhardwaj.morefeatures;

import org.aeonbits.owner.ConfigCache;

public class ConfigurationManager {

	/*
	 * To avoid class instantiation
	 */
	private ConfigurationManager() {
	}

	public static Configuration getConfiguration() {
		return ConfigCache.getOrCreate(Configuration.class);
	}

}
