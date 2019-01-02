package com.ynu.sei.lib.controller;


import com.ynu.sei.lib.domain.ScenicInfoGroup;
import com.ynu.sei.lib.repositories.ScenicInfoGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/scenicInfoGroup")
public class ScenicInfoGroupController {

    @Autowired
    private ScenicInfoGroupRepository scenicInfoGroupRepository;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<ScenicInfoGroup> scenicInfoGroupList() {
        return scenicInfoGroupRepository.findAll();
    }
}
