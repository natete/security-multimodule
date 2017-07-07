package com.onewingsoft.securityMultimodule.app.configuration;

import com.onewingsoft.securityMultimodule.security.config.RedisConfig;
import com.onewingsoft.securityMultimodule.security.config.WebSecurityConfig;
import org.springframework.context.annotation.*;

/**
 * Class that provides the root application context.
 *
 * @author iiglesias
 */
@Configuration
@EnableAspectJAutoProxy
@PropertySource(value = { "classpath:app.properties" })
@ComponentScan(value = { "com.onewingsoft.securityMultimodule.app" })
@Import({ WebSecurityConfig.class, RedisConfig.class })
public class AppConfig {

}
