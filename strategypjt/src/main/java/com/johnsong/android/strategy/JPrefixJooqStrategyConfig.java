package com.johnsong.android.strategy;

import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;

public class JPrefixJooqStrategyConfig extends DefaultGeneratorStrategy {

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        return "J" + super.getJavaClassName(definition, mode);
    }
}
