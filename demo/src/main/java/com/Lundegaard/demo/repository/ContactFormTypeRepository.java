package com.Lundegaard.demo.repository;

import com.Lundegaard.demo.domain.ContactFormType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactFormTypeRepository extends JpaRepository<ContactFormType, Long> {
    List<ContactFormType> findAll();
}
