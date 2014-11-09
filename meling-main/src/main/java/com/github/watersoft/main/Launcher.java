package com.github.watersoft.main;

import com.github.watersoft.main.config.ApplicationConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Wouter on 11/8/2014.
 */
public class Launcher {

    /**
     *
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Launcher.class);

    /**
     *
     */
    public final void run() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        LOGGER.info("Starting interpreter.");
        Interpreter interpreter = context.getBean(Interpreter.class);
        interpreter.run();
    }

    /**
     * @param args Application arguments.
     */
    public static void main(final String[] args) {
        new Launcher().run();
    }
}
