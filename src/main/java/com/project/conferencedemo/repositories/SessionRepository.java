package com.project.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
