/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2_pyp2024;

/**
 *
 * @author bibia
 */
public class MovieTickets implements IMovieTickets{
 
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice){
        double amount = numberOfTickets * ticketPrice;
        //multiply by the VAT amount to get the final answer
        double VAT = amount * 0.14;
        return amount + VAT;
    }
    
    @Override
    public boolean ValidateData(MovieTicketData movieTicketData){
        String movie = movieTicketData.getMovie();
        String number = movieTicketData.getNumber();
        String price = movieTicketData.getPrice();

        //movie must not be empty
        if (movie == null || movie.trim().isEmpty()){
            return false;
        }

        //number must not be empty
        if (number == null || number.trim().isEmpty()){
            return false;
        }
        //must be whole digit
        if (!number.trim().matches("\\d+")){
            return false;
        }
        //must be > 0
        if (Integer.parseInt(number.trim()) <= 0){
            return false;
        }

        //price must not be empty
        if (price == null || price.trim().isEmpty()){
            return false;
        }
        //must be a number
        if (!price.trim().matches("\\d+(\\.\\d+)?")){
            return false;
        }
        //must be > 0
        if (Double.parseDouble(price.trim()) <= 0){
            return false;
        }

        return true;
    }
    
    
}
