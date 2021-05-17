package com.Lundegaard.demo.service;

import com.Lundegaard.demo.domain.ContactFormType;
import com.Lundegaard.demo.domain.ContactFormRequest;
import com.Lundegaard.demo.model.ContactFormRequestModel;
import com.Lundegaard.demo.model.ContactFormTypeModel;
import com.Lundegaard.demo.repository.ContactFormTypeRepository;
import com.Lundegaard.demo.repository.ContactFormRequestRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public void saveFormData(ContactFormRequestModel contactFormRequestModel) {
        contactFormRequestRepository.save(modelMapper.map(contactFormRequestModel, ContactFormRequest.class));
    }

    public List<ContactFormTypeModel> getAllContactFormTypes() {
        List<ContactFormType> contactFormTypes = contactFormTypeRepository.findAll();
        List<ContactFormTypeModel> contactFormTypeModels = new ArrayList<>();
        if (!contactFormTypes.isEmpty()) {
            contactFormTypes.forEach(s -> contactFormTypeModels.add(modelMapper.map(s, ContactFormTypeModel.class)));
        }

        return contactFormTypeModels;
    }
}
