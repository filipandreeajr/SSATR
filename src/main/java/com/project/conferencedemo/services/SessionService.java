package com.project.conferencedemo.services;


import com.project.conferencedemo.models.Session;

import java.util.List;

public interface SessionService {

    public List<Session> findAll();

    public Session getOne(Long id);

    public void deleteById(Long id);

    public Session create(Session session);

    public Session update(Long id, Session session);
}
