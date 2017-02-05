package com.base.utils

class PropertiesReader {

    static String getConfigKey(String key) {
        return config.getProperty(key) as String
    }

    final
    static ConfigObject config = new ConfigSlurper().parse(new File("src/test/resources/configuration.groovy").toURI().toURL())

}
