package com.github.watersoft.main;

import com.github.watersoft.main.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Wouter on 11/8/2014.
 */
public class Launcher {

    /**
     *
     */
    public final void run() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
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