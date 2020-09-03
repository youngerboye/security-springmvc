package com.young.security.springmvc.init;

import com.young.security.springmvc.config.ApplicationConfig;
import com.young.security.springmvc.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringApplication extends AbstractAnnotationConfigDispatcherServletInitializer {
    //spring容器,相亲与加载application.xml
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class};
    }

    //servletContext，相当于加载springmvc.xml
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    //urlMapping
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
