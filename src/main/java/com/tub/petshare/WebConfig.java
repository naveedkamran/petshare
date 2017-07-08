package com.tub.petshare;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * config data source , entity manager here
 * http://docs.spring.io/spring-data/commons/docs/1.5.0.RELEASE/reference/html/repositories.html
 * https://stormpath.com/blog/tutorial-crud-spring-boot-20-minutes
 * https://dzone.com/articles/persistence-layer-spring-data
 *
 * @author naved
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {
    "com.datenc.bunnycrm.web"//, "com.datenc.com.datenc.apputil"
})
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false).
                favorParameter(true).
                defaultContentType(MediaType.APPLICATION_JSON).
                mediaType("xml", MediaType.APPLICATION_XML);
    }
}
