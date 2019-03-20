package io.github.thinkframework.generator.lang.reflect.impl;

import io.github.thinkframework.generator.lang.Clazz;
import io.github.thinkframework.generator.lang.reflect.ClazzMethod;
import io.github.thinkframework.generator.lang.annotation.ClazzAnnotation;
import io.github.thinkframework.generator.lang.annotation.ClazzAnnotations;

import java.util.Collection;

/**
 * @author lixiaobin
 * @since 2017/3/24
 */
public class ClazzMethodImpl extends ClazzMemberImpl implements ClazzMethod {
    private Clazz returnType;
    private Collection<Clazz> parameterTypes;
    private ClazzAnnotations annotations = new ClazzAnnotations();

    @Override
    public Clazz getReturnType() {
        return returnType;
    }

    public void setReturnType(Clazz returnType) {
        this.returnType = returnType;
    }

    @Override
    public Collection<Clazz> getParameterTypes() {
        return parameterTypes;
    }

    public void setParameterTypes(Collection<Clazz> parameterTypes) {
        this.parameterTypes = parameterTypes;
    }

    @Override
    public ClazzAnnotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(ClazzAnnotations annotations) {
        this.annotations = annotations;
    }

    public void addAnnotation(ClazzAnnotation annotation) {
        annotations.add(annotation);
    }

    public String toString(){
        return name;
    }
}