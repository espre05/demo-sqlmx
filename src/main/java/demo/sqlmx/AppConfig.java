package demo.sqlmx;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Config generic to the whole application goes here. 
 *
 */
@Configuration
@PropertySource(value= "file:/var/tmp/${spring.application.name}/${DEMOSQLMX_PROFILE:h2}/conf/override.properties", ignoreResourceNotFound=true)
public class AppConfig {
    @Bean
    public PropertyPlaceholderConfigurer placeholderConfigurer(){
        PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
        configurer.setIgnoreUnresolvablePlaceholders(true);
        return configurer;
    }
}