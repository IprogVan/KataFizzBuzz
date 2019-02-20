package com.cifpcarballeira.kata.FizzBuzz.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM207
 */
public class TestFizzBuzz {
    
    public TestFizzBuzz() {
    }
    
    @Test
    public void TestUnoDevuelveUno() {
        FizzBuzz fb=new FizzBuzz();
        String resultado=fb.GetFizzBuzz(1);
        assertEquals("1",resultado);
    }
}
