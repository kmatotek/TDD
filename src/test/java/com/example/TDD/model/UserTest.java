package com.example.TDD.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldGetFive() {
        User testUser = new User();
        testUser.setAge(5);
        assertEquals(5, testUser.getAge());
    }

    @Test
    void TwoShouldNotBeLegal() {
        User testUser = new User();
        testUser.setAge(2);
        assertFalse(testUser.isLegal());
    }

    @Test
    void ThirtyShouldBeLegal() {
        User testUser = new User();
        testUser.setAge(30);
        assertTrue(testUser.isLegal());
    }
}