/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.question2_pyp2024;

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
    public void CalculateTotalTicketPrice_CalculatedSuccessfully(){
        //setup
        MovieTickets mt = new MovieTickets();
        int numberOfTickets = 3;
        double ticketPrice = 100;
        //includes the VAT amount
        double expected = 342.0;

        //actual value
        double actual = mt.CalculateTotalTicketPrice(numberOfTickets, ticketPrice);

        //assertEquals statement
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void validationTest(){
        //setup
        MovieTickets mt = new MovieTickets();

        MovieTicketData valid = new MovieTicketData("Napoleon", "3", "100");
        MovieTicketData emptyMovie = new MovieTicketData("", "3", "100");
        MovieTicketData emptyNumber = new MovieTicketData("Napoleon", "", "100");
        MovieTicketData zeroNumber = new MovieTicketData("Napoleon", "0", "100");
        MovieTicketData emptyPrice = new MovieTicketData("Napoleon", "3", "");
        MovieTicketData zeroPrice = new MovieTicketData("Napoleon", "3", "0");
        MovieTicketData textPrice = new MovieTicketData("Napoleon", "3", "abc");

        //assertEquals statements
        assertTrue(mt.ValidateData(valid));
        assertFalse(mt.ValidateData(emptyMovie));
        assertFalse(mt.ValidateData(emptyNumber));
        assertFalse(mt.ValidateData(zeroNumber));
        assertFalse(mt.ValidateData(emptyPrice));
        assertFalse(mt.ValidateData(zeroPrice));
        assertFalse(mt.ValidateData(textPrice));
    }
}
