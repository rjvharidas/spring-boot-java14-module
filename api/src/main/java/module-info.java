module com.rjv.bootcamp.javamodules.api {

    //requires java.sql;
    //requires java.xml.ws.annotation;

    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires spring.aop;
    requires spring.web;
    requires spring.expression;

    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires com.rjv.bootcamp.javamodules.service;
    requires com.rjv.bootcamp.javamodules.domain;

    exports com.rjv.bootcamp.javamodules.api;
    exports com.rjv.bootcamp.javamodules.api.controller;

    opens com.rjv.bootcamp.javamodules.api;
    opens com.rjv.bootcamp.javamodules.api.controller;
}