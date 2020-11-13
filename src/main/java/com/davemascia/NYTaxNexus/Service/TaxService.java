package com.davemascia.NYTaxNexus.Service;

import com.davemascia.NYTaxNexus.Model.Tax;
import org.springframework.stereotype.Service;

@Service
public class TaxService {
    private Tax taxList;

    public Tax getTaxList() {
        return this.taxList;
    }

    public void save(Tax taxes) {
        System.out.println(taxes);
        this.taxList = taxes;
    }
}
