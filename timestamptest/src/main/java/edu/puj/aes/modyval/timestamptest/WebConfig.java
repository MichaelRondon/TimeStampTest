/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.puj.aes.modyval.timestamptest;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * Total customization - see below for explanation.
     * https://spring.io/blog/2013/05/11/content-negotiation-using-spring-mvc
     *
     * @param configurer
     */
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.
//                favorPathExtension(true).
//                favorParameter(false).
                //            favorParameter(true).
                //            parameterName("mediaType").
                ignoreAcceptHeader(false).
                //            ignoreAcceptHeader(true).
//                            useJaf(false).
//                            useJaf(true).
                defaultContentType(MediaType.APPLICATION_JSON) //            .mediaType("xml", MediaType.APPLICATION_XML).
                //            mediaType("json", MediaType.APPLICATION_JSON)
                ;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
