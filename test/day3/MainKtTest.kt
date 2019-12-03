package day3

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test as test

class Day3Test {
    @test
    fun testIntersect() {
        var a = day3.Section(vertical = false, row = 2, start = 0, end = 5)
        var b = day3.Section(vertical = true, row = 2, start = 0, end = 3)
        assertEquals(true, a.intersects(b))

        a = day3.Section(vertical = false, row = 2, start = 0, end = 5)
        b = day3.Section(vertical = true, row = 2, start = 0, end = 1)
        assertEquals(false, a.intersects(b))

        a = day3.Section(vertical = true, row = 2, start = 0, end = 5)
        b = day3.Section(vertical = true, row = 2, start = 0, end = 3)
        assertEquals(false, a.intersects(b))

        a = day3.Section(vertical = true, row = 15, start = 4, end = 12)
        b = day3.Section(vertical = false, row = 6, start = 11, end = 18)
        assertEquals(true, a.intersects(b))
    }
}

