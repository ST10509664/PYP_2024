/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1_pyp2024;

/**
 *
 * @author bibia
 */
public class Question1_PYP2024 {
    //delcare 2d array
    static int[][] movieTicketSales = {{3000,1500,1700},{3500,1200,1600}};
    //delcare 1d arrays
    static int[] total1 = new int[3];
    static int[] total2 = new int[3];
    static int[] totalSales = new int[2];
    static String[] months = {"JAN","FEB","MAR"};
    static String[] names = {"Napoleon","Oppenheimer"};
    
    
    public static void main(String[] args) {
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        
        //print out the table
        System.out.println("");
        System.out.printf("%-20s","");

        for (String m : months){
            System.out.printf("%-18s", m);
        }
        System.out.println("");
        System.out.println("---------------------------------------------------------------------");
        for (int n = 0; n < movieTicketSales.length; n++){
            System.out.printf("%-20s", names[n]);
            for (int sale : movieTicketSales[n]){
                System.out.printf("%-18s", sale);
            }
            System.out.println("");
        }
        
        //transfer the appropriate sales to each person using 1d arrays
        for (int r = 0 ; r < movieTicketSales.length; r++){
            for (int c = 0 ; c < movieTicketSales[r].length; c++){
                if (r == 0){
                    total1[c] = movieTicketSales[r][c];
                }else{
                    total2[c] = movieTicketSales[r][c];  
                }
                    
            }
         }

        //establish connection to MovieTickets class
        MovieTickets mt = new MovieTickets();
        //use variables to prevent redundancy in calling the TotalMovieSales method
        int totalN = mt.TotalMovieSales(total1);
        int totalO = mt.TotalMovieSales(total2);
        
        System.out.println("");
        System.out.println("Total movie ticket sales for Napolean: " + totalN);
        System.out.println("Total movie ticket sales for Oppenheimer: " + totalO);
        System.out.println("");
        
        //populate the totalSales array to use in the TopMovie method
        totalSales[0] = totalN;
        totalSales[1] = totalO;
        System.out.println("Top performing movie: " + mt.TopMovie(names, totalSales));
        
    }
    
    
    
    
    
}
