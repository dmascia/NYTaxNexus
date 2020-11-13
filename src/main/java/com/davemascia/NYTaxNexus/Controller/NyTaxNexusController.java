package com.davemascia.NYTaxNexus.Controller;

import com.davemascia.NYTaxNexus.Model.Tax;
import com.davemascia.NYTaxNexus.Service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping(path = "/tax-nexus")
public class NyTaxNexusController {
    @Autowired
    private TaxService taxService;

    @GetMapping(path = "/{city}")
    public @ResponseBody
    Map<String, Double> getTaxNexusForCity(@PathVariable String city) {
        Map<String, Double> response = new HashMap<>();
        Map<String, Double> taxes = taxService.getTaxList().getCities();
        if (!taxes.isEmpty()) {
            taxes.forEach((name, taxRate) -> {
                if (name.trim().toLowerCase().compareTo(city.trim().toLowerCase()) == 0) {
                    response.put(city, taxRate / 100);
                }
            });
        }

        return response;
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Tax getAllRates() {
        return taxService.getTaxList();
    }
}
