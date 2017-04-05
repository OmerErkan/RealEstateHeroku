package com.realestate.model;

import java.util.List;

/**
 * Created by omererkan on 4/5/17.
 */
public class BannerAd {

    private String title;
    private String address;
    private String description;
    private float price;
    private int area;
    private List<Country> countries;
    private List<Status> statuses;

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public void addCountries(Country country){
        countries.add(country);
    }

    public void addStatus(Status status){
        statuses.add(status);
    }
}
