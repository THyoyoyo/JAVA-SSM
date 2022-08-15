package com.at.ssm.controller;


import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    /**
    * 测试GET
    * */
    @GetMapping("/getTest")
    @ResponseBody
    public Map<String,Object> test(@RequestParam(value = "text",required = false) String text){
        HashMap<String, Object> obj = new HashMap<>();
        obj.put("code",200);
        obj.put("message","测试成功!");
        if(text != null && text !=""){
            obj.put("String",text);
        }
        return  obj;
    }

    /**
     * 测试POST
     * */
    @PostMapping("/postTest")
    @ResponseBody
    public Map<String,Object> postTest( @RequestBody  Map<String, Object> user){
        HashMap<String, Object> obj = new HashMap<>();
        obj.put("code",200);
        obj.put("message","测试成功!");
        obj.put("data",user);
        return  obj;
    }








}
