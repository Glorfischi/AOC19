package day4

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test as test

class Day4Test {
    @test
    fun testValid() {
        assertEquals(true, day4.valid(112345))
        assertEquals(false, day4.valid(112341))
        assertEquals(false, day4.valid(112141))
        assertEquals(false, day4.valid(124567))
        assertEquals(true, day4.valid(112347))
        assertEquals(true, day4.valid(122347))
    }

    @test
    fun testValid2() {
        assertEquals(true, day4.valid2(112345))
        assertEquals(false, day4.valid2(112341))
        assertEquals(false, day4.valid2(112141))
        assertEquals(false, day4.valid2(124567))
        assertEquals(true, day4.valid2(112347))
        assertEquals(true, day4.valid2(122347))
        assertEquals(false, day4.valid2(222347))
        assertEquals(true, day4.valid2(222337))
        assertEquals(true, day4.valid2(223333))
        assertEquals(true, day4.valid2(112233))
        assertEquals(false, day4.valid2(111113))
        assertEquals(true, day4.valid2(111133))
    }
}

