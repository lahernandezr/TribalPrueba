package com.tribal.apirest.models;

import java.util.List;

public class Schedule {

    private String time;
    private List<String> days = null;
    
    public String getTime() {
    return time;
    }
    
    public void setTime(String time) {
    this.time = time;
    }
    
    public List<String> getDays() {
    return days;
    }
    
    public void setDays(List<String> days) {
    this.days = days;
    }
    
    }
