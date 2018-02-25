package org.phparch.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.PropertySource;

@Configurable
@PropertySource(value = {"classpath:bean.properties"}, encoding = "UTF-8")
public class PropertiesConfig {
}
