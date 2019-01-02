package com.ynu.sei.lib.controller;

import com.ynu.sei.lib.domain.Image;
import com.ynu.sei.lib.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;



@RestController
@RequestMapping(value = "/api/images")
public class ImageController {

    @Autowired
    private ImageRepository imageRepository;

    // 定义上传图片在本地储存的基本路径
    private static final String basedPath = "/Users/zhaorunxuan/Documents/wechat_image/";

    // 定义所存储图片的基本URI
    private static final String basedURI = "/api/images/";

    @RequestMapping(method = RequestMethod.GET)
    public List<Image> imageList() {
        return imageRepository.findAll();
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty())
            return "上传文件为空!!!";
        // 获取所上传图片的文件名
        String fileName = file.getOriginalFilename();
        String path = basedPath + fileName;
        File dest = new File(path);
        if (dest.exists())
            return "该文件已存在!!!";
        try {
            file.transferTo(dest);
            String uri = basedURI + fileName;
            Image image = new Image(uri);
            imageRepository.save(image);
        } catch (IOException e) {
            return "上传失败哦!!!";
        }
        return "SUCCESS!!!";
    }
}
