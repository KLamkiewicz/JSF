package com.example.jsfdemo.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named("counterBean")
public class SiteCounterBean implements Serializable{
    private int count;  
    
    public int getCount() {  
        return count;  
    }  
  
    public void setCount(int count) {  
        this.count = count;  
    }  
      
    public void increment() {  
        count++;  
    }  
}