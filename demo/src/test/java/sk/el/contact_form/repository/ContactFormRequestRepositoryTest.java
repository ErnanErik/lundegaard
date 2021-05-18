package sk.el.contact_form.repository;

import sk.el.contact_form.domain.ContactFormRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ContactFormRequestRepositoryTest {

    @Autowired
    private ContactFormRequestRepository contactFormRequestRepository;

    @Test
    public void saveFormRequest() {
        long requestId = 1;
        ContactFormRequest contactFormRequest = new ContactFormRequest(
                requestId,
                "Contract Adjustment",
                "150",
                "name",
                "surname",
                "message");

        contactFormRequestRepository.save(contactFormRequest);

        List<ContactFormRequest> savedFormRequests = contactFormRequestRepository.findAll();

        assertThat(savedFormRequests).isNotEmpty();
        assertThat(savedFormRequests.size()).isEqualTo(requestId);
    }
}
