package com.project.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.springboot.web.model.Todo;
import com.project.springboot.web.service.TodoService;


@RestController
public class TodoRestController {
    @Autowired
    private TodoService service;

    @RequestMapping(value = "/rest/todos", method = RequestMethod.GET)
    public List<Todo> listAllTodos() {
        List<Todo> users = service.retrieveTodos("sam");
        return users;
    }

}