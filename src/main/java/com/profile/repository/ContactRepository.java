package com.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profile.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
