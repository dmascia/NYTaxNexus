package com.davemascia.NYTaxNexus.Model;

import java.util.Map;

public class Tax {
    private Map<String, Double> Cities;

    public Map<String, Double> getCities() {
        return Cities;
    }

    public void setCities(Map<String, Double> cities) {
        Cities = cities;
    }
}
