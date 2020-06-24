module com.rjv.bootcamp.javamodules.domain {

    requires org.mapstruct.processor;
    requires lombok;
    requires java.persistence;

    exports com.rjv.bootcamp.javamodules.domain to com.rjv.bootcamp.javamodules.api, com.rjv.bootcamp.javamodules.service;
    opens com.rjv.bootcamp.javamodules.domain;
}