package com.tribal.apirest.models;

import java.util.List;

public class PersonResponse {

    List<PersonWSDL> persons;

    public List<PersonWSDL> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonWSDL> persons) {
        this.persons = persons;
    }

    
}
