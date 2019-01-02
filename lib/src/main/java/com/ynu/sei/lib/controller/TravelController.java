package com.ynu.sei.lib.controller;

import com.ynu.sei.lib.domain.Travel;
import com.ynu.sei.lib.repositories.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelController {

    @Autowired
    private TravelRepository travelRepository;

    @CrossOrigin
    @RequestMapping(value = "/api/travel", method = RequestMethod.GET)
    public List<Travel> travelList() {
        return travelRepository.findAll();
    }
}
