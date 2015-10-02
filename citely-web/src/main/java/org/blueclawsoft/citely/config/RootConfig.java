package org.blueclawsoft.citely.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by greg on 10/1/2015.
 */
@Configuration
@ComponentScan(basePackages = {"org.blueclawsoft.citely.web"})
public class RootConfig {
}
