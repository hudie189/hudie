package com.caomt.noxmlweb.config;

import java.util.regex.Pattern;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan(basePackages={"com.caomt.noxmlweb"},
    excludeFilters={
        @Filter(type=FilterType.ANNOTATION, value= EnableWebMvc.class)
    })
public class RootConfig {
}
