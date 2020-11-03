package com.example.kotlingraphQLclient.config

import io.aexp.nodes.graphql.GraphQLTemplate
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class TestConfig {
    @Bean
    open fun graphQLTemplate(): GraphQLTemplate {
        return GraphQLTemplate()
    }
}