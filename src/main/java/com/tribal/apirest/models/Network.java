package com.tribal.apirest.models;

public class Network {

    private Integer id;
    private String name;
    private Country country;
    
    public Integer getId() {
    return id;
    }
    
    public void setId(Integer id) {
    this.id = id;
    }
    
    public String getName() {
    return name;
    }
    
    public void setName(String name) {
    this.name = name;
    }
    
    public Country getCountry() {
    return country;
    }
    
    public void setCountry(Country country) {
    this.country = country;
    }
    
}
