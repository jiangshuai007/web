package com.ynu.sei.lib.controller;

// import org.springframework.stereotype.Controller;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// 这个类的所有方法返回的数据直接写给浏览器
// 如返回的是对象将转换为json数据

// @ResponseBody
// @Controller
// @ResponseBody和@Controller可由@RestController来替代

@RestController
public class HelloController {

    // 最辣鸡的第一个controller
    @RequestMapping("/api/hello")
    public String hello(){
        return "hello spring!";
    }

    // 访问指定路径下的图片，并将图片转换为二进制数组字节流
    // 将二进制数组进行返回
    @RequestMapping(value = "/api/get",produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getImage() throws IOException {
        File file = new File("/Users/zhaorunxuan/Documents/wechat_image/av.png");
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, inputStream.available());
        return bytes;
    }
}
