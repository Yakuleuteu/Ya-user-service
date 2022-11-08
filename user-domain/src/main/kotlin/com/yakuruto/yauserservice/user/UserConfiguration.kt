package com.yakuruto.yauserservice.user

import com.yakuruto.yauserservice.configuration.annotation.SagaStep
import com.yakuruto.yauserservice.configuration.annotation.UseCase
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.FilterType

@Configuration
@ComponentScan(
    basePackages = ["com.yakuruto.yauserservice"],
    includeFilters = [
        ComponentScan.Filter(
            type = FilterType.ANNOTATION,
            value = [UseCase::class, SagaStep::class]
        )
    ]
)
open class UserConfiguration
