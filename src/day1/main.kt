package day1

import java.io.File

fun main() {
    println("Part 1: " + getFuelRequirementOfList("input/day1/modules.txt"))
    println("Part 2: " + getFuelRequirementFuelRequirementOfList("input/day1/modules.txt"))
}

fun getFuelRequirementOfList(filePath: String): Int {
    var sum = 0
    File(filePath).forEachLine { sum += getFuelRequirement(it.toInt()) }
    return sum
}

fun getFuelRequirementFuelRequirementOfList(filePath: String): Int {
    var sum = 0
    File(filePath).forEachLine { sum += getFuelRequirementOfFuelRequirement(it.toInt()) }
    return sum
}

fun getFuelRequirement(mass: Int): Int {
    return mass / 3 - 2
}

fun getFuelRequirementOfFuelRequirement(mass: Int): Int {
    val fuel = mass / 3 - 2
    return when {
        (fuel > 0) -> fuel + getFuelRequirementOfFuelRequirement(fuel)
        else -> 0
    }
}
