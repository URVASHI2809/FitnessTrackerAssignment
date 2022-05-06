package com.project;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.models.ContactMessage;

public interface ContactRepository extends JpaRepository<ContactMessage, Integer> {

}
