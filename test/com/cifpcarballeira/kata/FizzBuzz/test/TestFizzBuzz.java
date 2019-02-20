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
    
    @Test
    public void TestDosDevuelveDos() {
        FizzBuzz fb=new FizzBuzz();
        String resultado=fb.GetFizzBuzz(2);
        assertEquals("2",resultado);
    }
    
    @Test
    public void TestTresDevuelveFizz() {
        FizzBuzz fb=new FizzBuzz();
        String resultado=fb.GetFizzBuzz(3);
        assertEquals("Fizz",resultado);
    }
    @Test
    public void CincoTresDevuelveBuzz() {
        FizzBuzz fb=new FizzBuzz();
        String resultado=fb.GetFizzBuzz(5);
        assertEquals("Buzz",resultado);
    }
    
    @Test
    public void QuinceDevuelveFizzBuzz() {
        FizzBuzz fb=new FizzBuzz();
        String resultado=fb.GetFizzBuzz(15);
        assertEquals("FizzBuzz",resultado);
    }
}
