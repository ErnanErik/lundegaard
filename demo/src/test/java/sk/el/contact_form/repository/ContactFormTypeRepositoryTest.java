package sk.el.contact_form.repository;


import sk.el.contact_form.domain.ContactFormType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ContactFormTypeRepositoryTest {

    @Autowired
    public ContactFormTypeRepository contactFormTypeRepository;

    @Test
    public void saveFormType() {
        long requestId = 1;
        ContactFormType contactFormType = new ContactFormType(
                requestId,
                "Contract Adjustment");

        contactFormTypeRepository.save(contactFormType);

        List<ContactFormType> savedFormRequests = contactFormTypeRepository.findAll();

        assertThat(savedFormRequests).isNotEmpty();
        assertThat(savedFormRequests.size()).isEqualTo(requestId);
    }
}
