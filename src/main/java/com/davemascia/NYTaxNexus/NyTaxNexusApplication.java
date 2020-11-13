package com.davemascia.NYTaxNexus;

import com.davemascia.NYTaxNexus.Model.Tax;
import com.davemascia.NYTaxNexus.Service.TaxService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class NyTaxNexusApplication {

    public static void main(String[] args) {
        SpringApplication.run(NyTaxNexusApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaxService taxService) {
        return args -> {
            try {
                ObjectMapper mapper = new ObjectMapper();
                TypeReference<Tax> typeReference = new TypeReference<Tax>() {
                };
                InputStream inputStream = TypeReference.class.getResourceAsStream("/json/taxes.json");
                Tax taxes = mapper.readValue(inputStream, typeReference);
                taxService.save(taxes);
                System.out.println("Taxes Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save taxes: " + e.getMessage());
            }
        };
    }
}
