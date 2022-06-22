package com.example.imperialapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTests {
    ImperialAPI api = new ImperialAPI();

    @Test
    void cmTest(){
        double inch = 5;
        double expRes = 12.7;
        double res = api.cm(inch);

        assertEquals(expRes, res);
    }

    @Test
    void mTest(){
        double yard = 5;
        double expRes = 4.570383912248628;
        double res = api.m(yard);

        assertEquals(expRes, res);
    }
}
