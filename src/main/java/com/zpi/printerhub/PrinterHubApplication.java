package com.zpi.printerhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class PrinterHubApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PrinterHubApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PrinterHubApplication.class);
    }
}

//@SpringBootApplication
//public class PrinterHubApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(PrinterHubApplication.class, args);
//    }
//
//}
