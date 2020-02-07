package com.project.conferencedemo.controllers;

import com.project.conferencedemo.models.Speaker;
import com.project.conferencedemo.services.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakersController {

    @Autowired
    private SpeakerService speakerService;

    @GetMapping
    public List<Speaker> list() {
        return speakerService.list();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Speaker get(@PathVariable Long id) {
        return speakerService.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Speaker create(@RequestBody final Speaker speaker) {
        return speakerService.create(speaker);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        speakerService.delete(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Speaker update(@PathVariable Long id, @RequestBody Speaker speaker) {
        return speakerService.update(id, speaker);
    }

}
