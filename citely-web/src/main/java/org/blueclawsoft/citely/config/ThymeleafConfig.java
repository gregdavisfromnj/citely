package org.blueclawsoft.citely.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.dialect.IDialect;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by greg on 10/1/2015.
 */
@Configuration
public class ThymeleafConfig {
    @Bean
    public ServletContextTemplateResolver getTemplateResolver() {
        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
        resolver.setPrefix("/WEB-INF/templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML5");
        resolver.setOrder(1);
        return resolver;
    }

    @Bean
    public SpringTemplateEngine getTemplateEngine() {
        Set<IDialect> dialects = new HashSet<IDialect>();
        dialects.add(new nz.net.ultraq.thymeleaf.LayoutDialect());

        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(getTemplateResolver());
        engine.setAdditionalDialects(dialects);

        return engine;
    }

    @Bean
    public ThymeleafViewResolver getThymeleafViewResolver() {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(getTemplateEngine());
        return resolver;
    }
}
