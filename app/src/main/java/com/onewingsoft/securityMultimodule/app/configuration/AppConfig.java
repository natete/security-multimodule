package com.onewingsoft.securityMultimodule.app.configuration;

import com.onewingsoft.securityMultimodule.persistence.configuration.JdbcConfig;
import com.onewingsoft.securityMultimodule.security.config.RedisConfig;
import com.onewingsoft.securityMultimodule.security.config.WebSecurityConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Class that provides the root application context.
 *
 * @author iiglesias
 */
@Configuration
@EnableAspectJAutoProxy
@PropertySource(value = { "classpath:app.properties" })
@ComponentScan(value = { "com.onewingsoft.securityMultimodule.app" })
@Import({ WebSecurityConfig.class, RedisConfig.class, JdbcConfig.class })
public class AppConfig {

}
