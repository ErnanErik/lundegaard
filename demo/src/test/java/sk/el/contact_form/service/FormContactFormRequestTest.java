package sk.el.contact_form.service;

import sk.el.contact_form.domain.ContactFormRequest;
import sk.el.contact_form.model.ContactFormRequestModel;
import sk.el.contact_form.repository.ContactFormTypeRepository;
import sk.el.contact_form.repository.ContactFormRequestRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FormContactFormRequestTest {

    private ContactFormService contactFormService;
    private final ModelMapper modelMapper = new ModelMapper();

    @Mock
    private ContactFormRequestRepository contactFormRequestRepository;

    @Mock
    private ContactFormTypeRepository contactFormTypeRepository;

    @Before
    public void setup() {
        contactFormService = new ContactFormService(modelMapper, contactFormRequestRepository, contactFormTypeRepository);
    }

    @Test
    public void ContactFormRequestModelMapToContactFormRequest(){

        ContactFormRequestModel contactFormRequestModel = new ContactFormRequestModel(
                "Contract Adjustment",
                "150",
                "name",
                "surname",
                "message");

        ContactFormRequest contactFormRequest = modelMapper.map(contactFormRequestModel, ContactFormRequest.class);

        assertEquals(contactFormRequest.getContactFormType(), contactFormRequestModel.getContactFormType());
        assertEquals(contactFormRequest.getName(), contactFormRequestModel.getName());
        assertEquals(contactFormRequest.getSurname(), contactFormRequestModel.getSurname());
        assertEquals(contactFormRequest.getPolicyNumber(), contactFormRequestModel.getPolicyNumber());
        assertEquals(contactFormRequest.getRequestField(), contactFormRequestModel.getRequestField());
    }
}
