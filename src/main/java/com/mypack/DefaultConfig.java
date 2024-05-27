package com.mypack;

import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.sql.Driver;

import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
@PropertySources({
        @PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true),
        @PropertySource(value = "classpath:application-${spring.profiles.active}.properties", ignoreResourceNotFound = true)
    }
)
public class DefaultConfig {
    @Bean
    @Conditional(TomcatOnClassPathCondition.class)
    public TomcatLauncher tomcatLauncher() {
        return new TomcatLauncher();
    }

    @Bean
    @Conditional(DataSourcePropertiesDriverSetCondition.class)
    public DataSource dataSource(Environment environment) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Driver driver = (Driver) Class.forName(environment.getProperty("spring.datasource.driver-class-name")).newInstance();
        String url = environment.getProperty("spring.datasource.url");
        return new SimpleDriverDataSource(driver, url);
    }
}