package sk.el.contact_form.config;

import sk.el.contact_form.domain.ContactFormType;
import sk.el.contact_form.repository.ContactFormTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataLoader {

    private final ContactFormTypeRepository contactFormTypeRepository;

    @Autowired
    public DataLoader(ContactFormTypeRepository contactFormTypeRepository) {
        this.contactFormTypeRepository = contactFormTypeRepository;
    }

    @PostConstruct
    public void init() {
        contactFormTypeRepository.save(new ContactFormType(1, "Contract Adjustment"));
        contactFormTypeRepository.save(new ContactFormType(2, "Damage Case"));
        contactFormTypeRepository.save(new ContactFormType(3, "Complaint"));
    }
}
