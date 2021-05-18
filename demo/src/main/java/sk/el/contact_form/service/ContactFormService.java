package sk.el.contact_form.service;

import sk.el.contact_form.domain.ContactFormRequest;
import sk.el.contact_form.model.ContactFormRequestModel;
import sk.el.contact_form.model.ContactFormTypeModel;
import sk.el.contact_form.repository.ContactFormTypeRepository;
import sk.el.contact_form.repository.ContactFormRequestRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactFormService {

    private final ModelMapper modelMapper;
    private final ContactFormRequestRepository contactFormRequestRepository;
    private final ContactFormTypeRepository contactFormTypeRepository;

    @Autowired
    public ContactFormService(ModelMapper modelMapper,
                              ContactFormRequestRepository contactFormRequestRepository,
                              ContactFormTypeRepository contactFormTypeRepository) {
        this.modelMapper = modelMapper;
        this.contactFormRequestRepository = contactFormRequestRepository;
        this.contactFormTypeRepository = contactFormTypeRepository;
    }

    @Transactional
    public void saveFormData(ContactFormRequestModel contactFormRequestModel) {
        contactFormRequestRepository.save(modelMapper.map(contactFormRequestModel, ContactFormRequest.class));
    }

    @Transactional(readOnly = true)
    public List<ContactFormTypeModel> getAllContactFormTypes() {
        return contactFormTypeRepository.findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, ContactFormTypeModel.class)).collect(Collectors.toList());
    }
}
