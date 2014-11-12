package com.github.watersoft.main.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for the Simple grammar.
 * Created by Wouter on 11/12/2014.
 */
@Configuration
@ComponentScan(value = {"com.github.watersoft.main.interpreter.simple"})
public class SimpleConfiguration {
}
