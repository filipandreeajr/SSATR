package com.project.conferencedemo.services;

import com.project.conferencedemo.models.Speaker;

import java.util.List;

public interface SpeakerService {

    public List<Speaker> list();

    public Speaker get(Long id);

    public Speaker create(Speaker speaker);

    public void delete(Long id);

    public Speaker update(Long id, Speaker speaker);
}
