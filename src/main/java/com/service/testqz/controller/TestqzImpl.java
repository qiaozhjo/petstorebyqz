package com.service.testqz.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-15T06:48:21.699Z")

@RestSchema(schemaId = "testqz")
@RequestMapping(path = "/testqz", produces = MediaType.APPLICATION_JSON)
public class TestqzImpl {

    @Autowired
    private TestqzDelegate userTestqzDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestqzDelegate.helloworld(name);
    }

}
