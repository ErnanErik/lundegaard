package com.Lundegaard.demo.config;

import com.Lundegaard.demo.domain.ContactFormType;
import com.Lundegaard.demo.repository.ContactFormTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private final ContactFormTypeRepository contactFormTypeRepository;

    @Autowired
    public DataLoader(ContactFormTypeRepository contactFormTypeRepository) {
        this.contactFormTypeRepository = contactFormTypeRepository;
    }

    public void run(ApplicationArguments args) {
        contactFormTypeRepository.save(new ContactFormType(1, "Contract Adjustment"));
        contactFormTypeRepository.save(new ContactFormType(2, "Damage Case"));
        contactFormTypeRepository.save(new ContactFormType(3, "Complaint"));
    }
}
