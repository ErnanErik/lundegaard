package sk.el.contact_form.controller;

import sk.el.contact_form.model.ContactFormRequestModel;
import sk.el.contact_form.service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ContactFormController {

    private final ContactFormService contactFormService;

    @Autowired
    public ContactFormController(ContactFormService contactFormService) {
        this.contactFormService = contactFormService;
    }

    @GetMapping("/")
    public String launchPage(Model model) { //ContactForm contactForm) {
        model.addAttribute("formRequest", new ContactFormRequestModel());
        model.addAttribute("types", contactFormService.getAllContactFormTypes());
        return "contact-form";
    }

    @GetMapping("/confirm")
    public String confirm(Model model) {
        return "success-confirmed";
    }

    @PostMapping(value = "/")
    public String saveRequest(@Valid @ModelAttribute("formRequest") ContactFormRequestModel contactFormRequest, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("types", contactFormService.getAllContactFormTypes());
            return "contact-form";
        }
        contactFormService.saveFormData(contactFormRequest);
        return "redirect:/confirm";
    }
}
