package com.shaurya.spring.ch10springbootrestservices.Model;

public class CountryModel {
    private String country;
    private String population;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public static CountryModel of (String country, String population){
        CountryModel countryModel = new CountryModel();
        countryModel.setCountry(country);
        countryModel.setPopulation(population);
        return countryModel;
    }
}
