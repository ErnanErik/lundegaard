package com.Lundegaard.demo.config;

import com.Lundegaard.demo.model.ContactFormRequestModel;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ModelAttribute;

@Configuration
public class SpringConfig {

    @Bean
    public ModelMapper modelMapper() {
      return new ModelMapper();
    }
}

