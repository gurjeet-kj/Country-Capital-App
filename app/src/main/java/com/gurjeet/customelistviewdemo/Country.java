package com.gurjeet.customelistviewdemo;

public class Country {
    private String countryName;
    private String capitalCity;
    private int flagImage;
    private String population;
    private String area;

    public Country(String countryName, String capitalCity, int flagImage, String population, String area) {
        this.countryName = countryName;
        this.capitalCity = capitalCity;
        this.flagImage = flagImage;
        this.population = population;
        this.area = area;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public int getFlagImage() {
        return flagImage;
    }

    public String getPopulation() {
        return population;
    }

    public String getArea() {
        return area;
    }
}
