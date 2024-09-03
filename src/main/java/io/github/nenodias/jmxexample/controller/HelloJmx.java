package io.github.nenodias.jmxexample.controller;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource
public class HelloJmx {

    @ManagedOperation(description = "Say Hello")
    @ManagedOperationParameter(name  ="name", description = "name to say hello")
    public String sayHello(final String name){
        if(name == null || name.isEmpty()) return "Hello World";
        return "Hello " + name;
    }

}
