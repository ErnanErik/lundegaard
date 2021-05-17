package com.Lundegaard.demo.repository;

import com.Lundegaard.demo.domain.ContactFormRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactFormRequestRepository extends JpaRepository<ContactFormRequest, Long> {
    List<ContactFormRequest> findAll();

}
