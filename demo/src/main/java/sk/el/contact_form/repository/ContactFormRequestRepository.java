package sk.el.contact_form.repository;

import sk.el.contact_form.domain.ContactFormRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactFormRequestRepository extends JpaRepository<ContactFormRequest, Long> {
    List<ContactFormRequest> findAll();
}
