package com.example.kotlingraphQLclient.client

import com.example.kotlingraphQLclient.model.Countries
import io.aexp.nodes.graphql.GraphQLRequestEntity
import io.aexp.nodes.graphql.GraphQLTemplate
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Component
class TestClient(
//    private val graphQLTemplate: GraphQLTemplate,
) {
    fun getCountries(): Flux<Countries> {
        val graphQLRequestEntity = GraphQLRequestEntity.Builder()
            .url("https://countries.trevorblades.com")
            .request(Countries::class.java)
            .build()

        val graphQLTemplate = GraphQLTemplate()
        val responseEntity = graphQLTemplate.query(graphQLRequestEntity, Countries::class.java)

        return Flux.just(responseEntity.response)
    }
}