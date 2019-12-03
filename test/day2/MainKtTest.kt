package day2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test as test

class Day2Test {
    @test
    fun testProgramm() {
        var c: List<Int> = listOf<Int>(99, 0, 0, 0, 99)
        var res: List<Int> = listOf<Int>(99, 0, 0, 0, 99)
        assertEquals(res, day2.execute(c))

        c = listOf<Int>(1,0,0,0,99)
        res = listOf<Int>(2,0,0,0,99)
        assertEquals(res, day2.execute(c))

        c = listOf<Int>(2,3,0,3,99)
        res = listOf<Int>(2,3,0,6,99)
        assertEquals(res, day2.execute(c))

        c = listOf<Int>(2,4,4,5,99,0)
        res = listOf<Int>(2,4,4,5,99,9801)
        assertEquals(res, day2.execute(c))

        c = listOf<Int>(1,1,1,4,99,5,6,0,99)
        res = listOf<Int>(30,1,1,4,2,5,6,0,99)
        assertEquals(res, day2.execute(c))
    }
}

