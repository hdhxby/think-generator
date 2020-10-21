package io.github.thinkframework.generator.core.design.strategy.impl;

import io.github.thinkframework.generator.core.context.GeneratorContext;
import io.github.thinkframework.generator.core.design.prototype.GeneratorPrototype;
import io.github.thinkframework.generator.core.design.templatemethod.AbstractStrategy;
import io.github.thinkframework.generator.core.exception.GeneratorRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

/**
 * 根据类生成
 *
 * @author lixiaobin
 * @since 1.0.0
 */
@Slf4j
public class GeneratorClass extends AbstractStrategy<Class,String> {

    /**
     * 生成
     *
     * @return
     */
    @Override
    public void internal(GeneratorContext<Class,String> generatorContext) throws GeneratorRuntimeException {
        log.info("传入的文件名称:{}", generatorContext.getTarget());

            Stream.of(generatorContext.getSource())
                .map(clazz ->
                    GeneratorPrototype.clone(generatorContext)
                        .source(clazz)
                        .target(generatorContext.getTarget()))//设置环境上下文
                .peek(super::responsibilitys);
    }
}