package com.project.conferencedemo.services.impl;

import com.project.conferencedemo.models.Session;
import com.project.conferencedemo.repositories.SessionRepository;
import com.project.conferencedemo.services.SessionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Override
    public List<Session> findAll(){
        return sessionRepository.findAll();
    }

    @Override
    public Session getOne(Long id) {
        return sessionRepository.getOne(id);
    }

    @Override
    public void deleteById(Long id) {
        sessionRepository.deleteById(id);
    }

    @Override
    public Session create(Session session) {
        return sessionRepository.saveAndFlush(session);
    }

    @Override
    public Session update(Long id, Session session) {
        Session existingSession = sessionRepository.getOne(id);
        BeanUtils.copyProperties(session, existingSession, "session_id");
        return sessionRepository.saveAndFlush(existingSession);
    }
}