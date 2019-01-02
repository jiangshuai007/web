package com.ynu.sei.lib.controller;


import com.ynu.sei.lib.domain.Comment;
import com.ynu.sei.lib.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/comment")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<Comment> commentList() {
        return commentRepository.findAll();
    }
}
