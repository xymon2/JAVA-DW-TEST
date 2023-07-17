package com.example;

import com.example.api.hello.HelloController;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class buriburiApplication extends Application<buriburiConfiguration> {

    public static void main(final String[] args) throws Exception {
        new buriburiApplication().run(args);
    }

    @Override
    public String getName() {
        return "buriburi";
    }

    @Override
    public void initialize(final Bootstrap<buriburiConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final buriburiConfiguration configuration,
                    final Environment environment) {

        HelloController helloController = new HelloController();
        environment.jersey().register(helloController);
        // TODO: implement application
    }

}
