package day1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test as test

class Day1Test {
    @test fun testSingleModule() {
        assertEquals(2, day1.getFuelRequirement(12))
        assertEquals(2, day1.getFuelRequirement(14))
        assertEquals(654, day1.getFuelRequirement(1969))
        assertEquals(33583, day1.getFuelRequirement(100756))
    }

    @test fun testSingleModule2() {
        assertEquals(2, day1.getFuelRequirementOfFuelRequirement(12))
        assertEquals(2, day1.getFuelRequirementOfFuelRequirement(14))
        assertEquals(966, day1.getFuelRequirementOfFuelRequirement(1969))
        assertEquals(50346, day1.getFuelRequirementOfFuelRequirement(100756))
    }
}

