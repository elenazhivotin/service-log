package com.zhivotin.servicelog.rest;

import com.zhivotin.servicelog.model.LogObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceLogController {

    Logger logger = LoggerFactory.getLogger(ServiceLogController.class);

    @PostMapping("/log")
    public void printLog(@RequestBody LogObject logObject){
        logger.info(logObject.toString());
    }
}
