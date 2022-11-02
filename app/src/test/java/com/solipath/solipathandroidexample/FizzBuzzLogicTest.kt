package com.solipath.solipathandroidexample

import org.junit.Test

import org.junit.Assert.*

class FizzBuzzLogicTest {
    @Test
    fun given3ReturnFizz() {
        assertEquals("Fizz", FizzBuzzLogic.doFizzBuzz(3));
    }

    @Test
    fun given5ReturnBuzz() {
        assertEquals("Buzz", FizzBuzzLogic.doFizzBuzz(5));
    }

    @Test
    fun given6ReturnFizz() {
        assertEquals("Fizz", FizzBuzzLogic.doFizzBuzz(6));
    }

    @Test
    fun given1Return1() {
        assertEquals("1", FizzBuzzLogic.doFizzBuzz(1));
    }

    @Test
    fun given2Return2() {
        assertEquals("2", FizzBuzzLogic.doFizzBuzz(2));
    }

    @Test
    fun given10ReturnBuzz() {
        assertEquals("Buzz", FizzBuzzLogic.doFizzBuzz(10));
    }

    @Test
    fun given15ReturnFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzzLogic.doFizzBuzz(15));
    }
}