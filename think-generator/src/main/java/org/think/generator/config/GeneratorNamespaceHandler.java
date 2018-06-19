package org.think.generator.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.think.generator.config.GeneratorBeanDefinitionParser;

/**
 * 注册NamespaceHandler.
 * @author lixiaobin
 * @since 2017/3/24
 */
public class GeneratorNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("generator",new GeneratorBeanDefinitionParser());
    }
}
