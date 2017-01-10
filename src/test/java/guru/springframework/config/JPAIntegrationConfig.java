package guru.springframework.config;

import org.junit.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by heleneshaikh on 09/01/2017.
 */

@Configuration
@EnableAutoConfiguration //tell spring boot to configure the defaults automatically
@ComponentScan("guru.springframework")
public class JPAIntegrationConfig {

}