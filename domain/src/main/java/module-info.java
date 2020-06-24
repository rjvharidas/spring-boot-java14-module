module com.rjv.bootcamp.javamodules.domain {

//    requires java.xml.ws.annotation;
    requires org.mapstruct.processor;
    requires lombok;

    exports com.rjv.bootcamp.javamodules.domain to com.rjv.bootcamp.javamodules.api, com.rjv.bootcamp.javamodules.service;
    opens com.rjv.bootcamp.javamodules.domain;
}