/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.question1_pyp2024;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bibia
 */
public class MovieTicketsTest {
    
    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales(){
        //setup
        MovieTickets movieTickets = new MovieTickets();
        int[] sales = {10, 20, 30, 40};
        int expected = 100;

        //actual value
        int actual = movieTickets.TotalMovieSales(sales);

        //assertEquals statement
        assertEquals(expected, actual);
    }

    @Test
    public void TopMovieSales_ReturnsTopMovie(){
        //setup
        MovieTickets movieTickets = new MovieTickets();
        String[] movies = {"Movie A", "Movie B", "Movie C"};
        int[] totalSales = {100, 300, 200};
        String expected = "Movie B";

        //actual value
        String actual = movieTickets.TopMovie(movies, totalSales);

        //assertEquals statement
        assertEquals(expected, actual);
    }
    
    
    
}
