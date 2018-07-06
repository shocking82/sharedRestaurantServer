package com.johnsong.android.spring.config;

import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;

public class JPrefixJooqStrategyConfig extends DefaultGeneratorStrategy {

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        return "JJJ" + super.getJavaClassName(definition, mode);
    }
}
