package org.matthenry87.configpropsbug.foo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@ConfigurationProperties(prefix = "foo")
class ConfigPropertiesConfigBean {

    private final Environment environment;

    private String bar;

    public ConfigPropertiesConfigBean(Environment environment) {

        this.environment = environment;
    }

    public String getBar() {

        return bar;
    }

    public void setBar(String bar) {

        this.bar = bar;
    }

}
