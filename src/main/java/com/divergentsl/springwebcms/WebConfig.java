package com.divergentsl.springwebcms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.divergentsl.springwebcms")
public class WebConfig implements WebMvcConfigurer {

	 @Bean
	    public InternalResourceViewResolver jspViewResolver() {
	        InternalResourceViewResolver bean = new InternalResourceViewResolver();
	        bean.setPrefix("/WEB-INF/jsp/");
	        bean.setSuffix(".jsp");
	        return bean;
	    }
	
	   @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry
	          .addResourceHandler("/resources/**")
	          .addResourceLocations("/resources/");	
	    }
	
}
