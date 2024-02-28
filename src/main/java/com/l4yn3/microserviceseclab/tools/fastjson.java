package com.l4yn3.microserviceseclab.tools;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.l4yn3.microserviceseclab.data.Teacher;

public class fastjson {
    public JSONObject testFastjson(String json){
        return JSON.parseObject(json);
    }
}
