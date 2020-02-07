package com.project.conferencedemo.controllers;

import com.project.conferencedemo.models.Session;
import com.project.conferencedemo.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {

    @Autowired
    private SessionService sessionService;

    @GetMapping
    public List<Session> list(){
        return sessionService.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Session get(@PathVariable Long id){
        return sessionService.getOne(id);
    }

    @PostMapping
    public Session create(@RequestBody final Session session){
        return sessionService.create(session);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        sessionService.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Session update(@PathVariable Long id, @RequestBody Session session){
        return sessionService.update(id, session);
    }
}
