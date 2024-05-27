package com.mypack;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DataSourcePropertiesDriverSetCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getEnvironment().containsProperty("spring.datasource.driver-class-name")
                && conditionContext.getEnvironment().containsProperty("spring.datasource.url");
    }
}
