package com.harshitbhardwaj.morefeatures;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;
import org.aeonbits.owner.Config.Sources;

@LoadPolicy(LoadType.MERGE)
@Sources({ "system:properties", "classpath:general.properties", "classpath:extra.properties" })
public interface Configuration extends Config {

	@Key("app.name")
	String appName();

	@Key("app.version")
	String appVersion();

	@Key("app.debug")
	String isDebuggingEnabled();

	@Key("app.log.level")
	String logLevel();

	@Key("app.new.feature.enabled")
	String areNewFeaturesEnabled();

	@Key("app.new.feature.version")
	String newFeatureVersion();

}
