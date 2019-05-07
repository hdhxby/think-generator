package io.github.thinkframework.generator.command.impl;

import io.github.thinkframework.generator.Generator;
import io.github.thinkframework.generator.command.Command;
import io.github.thinkframework.generator.context.GeneratorContext;
import io.github.thinkframework.generator.context.GeneratorProperties;
import io.github.thinkframework.generator.sql.TableFactory;
import io.github.thinkframework.generator.sql.model.impl.TableImpl;

import java.util.Collection;

/**
 * 数据库模型的脚本构建
 * @author lixbiaobin
 */
public class TableGeneratorCommand implements Command {

    private GeneratorProperties generatorProperties;

    private Generator generator;

    public TableGeneratorCommand() {
    }

//    public TableGeneratorCommand(GeneratorProperties generatorProperties) {
//        generator = new Generator(generatorProperties);
//    }

    public TableGeneratorCommand(Generator generator) {
        this.generator = generator;
    }

    /**
     * 执行操作
     */
    @Override
    public void execute() {
        generator.generate();
    }

    /**
     * 撤销操作
     */
    @Override
    public void unDo() {

    }
}