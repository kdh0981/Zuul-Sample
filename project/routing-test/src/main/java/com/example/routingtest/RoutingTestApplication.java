package com.example.routingtest;

import com.example.routingtest.filter.ErrorFilter;
import com.example.routingtest.filter.PostFilter;
import com.example.routingtest.filter.PreFilter;
import com.example.routingtest.filter.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class RoutingTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoutingTestApplication.class, args);
    }

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

}
