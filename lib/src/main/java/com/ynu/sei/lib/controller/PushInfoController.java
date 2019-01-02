package com.ynu.sei.lib.controller;


import com.ynu.sei.lib.domain.PushInfo;
import com.ynu.sei.lib.repositories.PushInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/pushInfo")
public class PushInfoController {

    @Autowired
    private PushInfoRepository pushInfoRepository;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<PushInfo> pushInfoList() {
        return pushInfoRepository.findAll();
    }
}
