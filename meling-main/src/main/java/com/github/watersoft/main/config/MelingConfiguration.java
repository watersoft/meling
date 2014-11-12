package com.github.watersoft.main.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for the Meling grammar.
 * Created by Wouter on 11/12/2014.
 */
@Configuration
@ComponentScan(value = {"com.github.watersoft.main.interpreter.meling"})
public class MelingConfiguration {
}
