package com.project.conferencedemo.services.impl;

import com.project.conferencedemo.models.Speaker;
import com.project.conferencedemo.repositories.SpeakerRepository;
import com.project.conferencedemo.services.SpeakerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    public SpeakerRepository speakerRepository;

    @Override
    public List<Speaker> list() {
        return speakerRepository.findAll();
    }

    @Override
    public Speaker get(Long id) {
        return speakerRepository.getOne(id);
    }

    @Override
    public Speaker create(Speaker speaker) {
        return speakerRepository.saveAndFlush(speaker);
    }

    @Override
    public void delete(Long id) {
        speakerRepository.deleteById(id);
    }

    @Override
    public Speaker update(Long id, Speaker speaker) {
        Speaker existingSpeaker = speakerRepository.getOne(id);
        BeanUtils.copyProperties(speaker, existingSpeaker, "speaker_id");
        return speakerRepository.saveAndFlush(existingSpeaker);
    }
}
