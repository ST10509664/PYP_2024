/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1_pyp2024;

/**
 *
 * @author bibia
 */
public class MovieTickets implements IMovieTickets {
    
    @Override
    public int TotalMovieSales(int[] movieTicketSales){
        int total = 0;
        for (int i = 0; i < movieTicketSales.length; i++){
                total += movieTicketSales[i];
            }
        
        return total;
    }
    
    @Override
    public String TopMovie(String[] movies, int[] totalSales){
        String top = movies[0];
        int highest = totalSales[0];
        for (int i = 0; i < totalSales.length; i++){
            if (highest < totalSales[i]){
                highest = totalSales[i];
                top = movies[i];
            }
        } 
        return top;
    }
    
}
