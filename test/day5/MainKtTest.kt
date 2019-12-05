package day5

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test as test

class Day5Test {
    @test
    fun testProgramm() {
        var c: List<Int> = listOf<Int>(99, 0, 0, 0, 99)
        var res: List<Int> = listOf<Int>(99, 0, 0, 0, 99)
        var comp = Computer(c)
        comp.execute()
        assertEquals(res, comp.code)

        c = listOf<Int>(1,0,0,0,99)
        res = listOf<Int>(2,0,0,0,99)
        comp = Computer(c)
        comp.execute()
        assertEquals(res, comp.code)

        c = listOf<Int>(1001,0,5,0,99)
        res = listOf<Int>(1006,0,5,0,99)
        comp = Computer(c)
        comp.execute()
        assertEquals(res, comp.code)

        c = listOf<Int>(1101,7,5,0,99)
        res = listOf<Int>(12,7,5,0,99)
        comp = Computer(c)
        comp.execute()
        assertEquals(res, comp.code)

        c = listOf<Int>(1005, 3, 7, 1, 0, 0, 0, 99)
        res = listOf<Int>(1005, 3, 7, 1, 0, 0, 0, 99)
        comp = Computer(c)
        comp.execute()
        assertEquals(res, comp.code)

        c = listOf<Int>(1006, 3, 7, 1101, 1, 1, 0, 99)
        res = listOf<Int>(2, 3, 7, 1101, 1, 1, 0, 99)
        comp = Computer(c)
        comp.execute()
        assertEquals(res, comp.code)

        c = listOf<Int>(1107, 3, 7, 0, 99)
        res = listOf<Int>(1, 3, 7, 0, 99)
        comp = Computer(c)
        comp.execute()
        assertEquals(res, comp.code)
    }
}

