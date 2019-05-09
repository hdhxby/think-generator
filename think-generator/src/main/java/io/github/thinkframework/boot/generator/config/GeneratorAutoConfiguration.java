package io.github.thinkframework.boot.generator.config;

import io.github.thinkframework.generator.config.GeneratorConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties({GeneratorConfiguration.class})
@Import({GeneratorConfigurationBean.class, GeneratorImportSelector.class, GeneratorImportBeanDefinitionRegistrar.class})
public class GeneratorAutoConfiguration {

}
