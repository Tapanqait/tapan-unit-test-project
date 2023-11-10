package com.hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TableTest {
    private Table table;

    @BeforeEach
    public void setUp() {
        table = new Table();
    }

    @Test
    void firstNameTest() {

        table.setFirstName("Tapan");
        assertEquals("Tapan", table.getFirstName());
    }

    @Test
    void lastNameTest() {

        table.setLastName("Sarker");
        assertEquals("Sarker", table.getLastName());

    }

    @Test
    void address() {
        table.setAddress("Albany");
        assertEquals("Albany", table.getAddress());
    }

    @Test
    void cell() {

        table.setCell("5183629712");
        assertEquals("5183629712", table.getCell());

    }

    // @Test
    //public void fullAddress() {
    //  System.out.println("Full Name = " + table.getFirstName() + " " + table.getLastName()
    //          + "Address = " + table.getAddress()
    //       + "CellNumber = " + table.getCell());
    // }


}
