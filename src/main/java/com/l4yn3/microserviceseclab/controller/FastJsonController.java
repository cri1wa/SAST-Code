package com.l4yn3.microserviceseclab.controller;

import com.alibaba.fastjson.JSON;
import com.l4yn3.microserviceseclab.data.Teacher;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value = "/fastjson")
public class FastJsonController {

    @PostMapping(value = "/create")
    public Teacher createActivity(@RequestBody String applyData,
                                  HttpServletRequest request, HttpServletResponse response){
        Teacher teachVO = JSON.parseObject(applyData, Teacher.class);
        return teachVO;
    }

}
