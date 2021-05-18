package sk.el.contact_form.repository;

import sk.el.contact_form.domain.ContactFormType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactFormTypeRepository extends JpaRepository<ContactFormType, Long> {
    List<ContactFormType> findAll();
}
