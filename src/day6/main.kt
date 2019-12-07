package day6

import day1.getFuelRequirement
import java.io.File

data class Obj(var name: String, var orbited: MutableList<Obj>, var orbits: Boolean)

fun main() {
    val m = mutableMapOf<String, Obj>()
    File("input/day6/input.txt").forEachLine {
        var tmp = it.split(")")
        var orbitted = m[tmp[0]]
        var orbitter = m[tmp[1]]
        orbitter = orbitter ?: Obj(tmp[1], mutableListOf(), true)
        orbitted = orbitted ?: Obj(tmp[0], mutableListOf(), false)

        orbitted.orbited.add(orbitter)
        orbitter.orbits = true

        m[tmp[0]] = orbitted
        m[tmp[1]] = orbitter
    }
    var sum: Long = 0
    for ((k, v) in m) {
        if (!v.orbits) {
            sum += count(v, 0)
        }
    }
    println("Part 1: $sum")

    commonAncestor(m["COM"]!!)

}

fun count(o: Obj, a: Int): Int {
    var res: Int = a
    for (i in o.orbited) {
        res += count(i, a+1)
    }
    return res
}

// This is horribly hacky but I kind of like it..
fun commonAncestor(o: Obj): Int {
    if (o.name == "SAN" || o.name == "YOU") return 0
    var otherTree = Integer.MAX_VALUE
    for (i in o.orbited) {
        val tree = commonAncestor(i)
        if ( tree != Integer.MAX_VALUE) {
            if (otherTree != Integer.MAX_VALUE) println("""Part 2: ${i.name} ${otherTree + tree}""")
            otherTree = tree
        }
    }
    return if (otherTree != Integer.MAX_VALUE) {
        otherTree + 1
    }else {
        otherTree
    }
}