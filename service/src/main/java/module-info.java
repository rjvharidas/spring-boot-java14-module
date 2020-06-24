module com.rjv.bootcamp.javamodules.service {

    requires spring.beans;
    requires spring.context;
    requires spring.data.jpa;
    requires spring.boot.autoconfigure;
    requires com.h2database;

    requires com.rjv.bootcamp.javamodules.domain;

    exports com.rjv.bootcamp.javamodules.service.service to com.rjv.bootcamp.javamodules.api;
    exports com.rjv.bootcamp.javamodules.service.configuration to com.rjv.bootcamp.javamodules.api;

    opens com.rjv.bootcamp.javamodules.service.service;
    opens com.rjv.bootcamp.javamodules.service.configuration;
    opens com.rjv.bootcamp.javamodules.service.repository;
}