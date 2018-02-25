package org.phparch.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author yarw
 */
@Configurable
@ComponentScan(basePackages = {"org.phparch"})
@Import(value = PropertiesConfig.class)
public class Config {
}
