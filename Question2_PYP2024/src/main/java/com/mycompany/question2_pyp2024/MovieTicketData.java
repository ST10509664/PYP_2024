/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2_pyp2024;

/**
 *
 * @author bibia
 */
public class MovieTicketData {
    private String movie;
    private String number;
    private String price;

    //constructor
    public MovieTicketData(String movie, String number, String price){
        this.movie = movie;
        this.number = number;
        this.price = price;
    }

    //getters
    public String getMovie(){ 
        return movie; 
    }
    
    public String getNumber(){
        return number; 
    }
    
    public String getPrice(){ 
        return price; 
    }
}
