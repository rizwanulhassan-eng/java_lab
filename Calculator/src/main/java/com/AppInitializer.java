package com;

import com.AppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        Class[] configFiles={AppConfig.class};
        return configFiles;
    }

    protected String[] getServletMappings() {
        String[] mappings = {"/"};
        return mappings;
    }
}
