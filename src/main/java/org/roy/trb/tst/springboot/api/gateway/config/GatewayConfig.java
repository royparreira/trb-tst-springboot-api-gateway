package org.roy.trb.tst.springboot.api.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

  @Bean
  public RouteLocator creditLineApi(RouteLocatorBuilder routeLocatorBuilder) {
    return routeLocatorBuilder
        .routes()
        .route(p -> p.path("/credit-line/v1/validate").uri("http://localhost:5001"))
        .route(p -> p.path("/credit-line/v1/status/{customerId}").uri("http://localhost:5001"))
        .build();
  }
}
