package br.com.ebac.ebacgatewayapi.roteamento;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguradorRotas {

    @Bean
    public RouteLocator rotas(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("get-route", p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("oi", "Ebac"))
                        .uri("http://httpbin.org"))
                .route("ebac-host", p -> p
                        .host("*.ebac.com.br")
                        .filters(f -> f.addRequestHeader("Origem", "Site da Ebac"))
                        .uri("http://httpbin.org"))

                .build();
    }
}
