package org.matthenry87.configpropsbug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ConfigpropsBugApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConfigpropsBugApplication.class, args);
    }

    @Configuration
    @ConfigurationProperties(prefix = "foo")
    static class ConfigPropertiesConfigBean {

        private final Environment environment;

        private String bar;

        @Autowired
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

}
