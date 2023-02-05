package com.lerner.gateway;

import com.netflix.discovery.EurekaNamespace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LearnerGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnerGatewayApplication.class, args);
    }

/*    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/somepath")
                        .uri("http://www.example.com")
                )
                .build();
    }*/

}
