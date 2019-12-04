package day4

fun main() {
    println("Part 1: " + nrPw(245318, 765747))
    println("Part 2: " + nrPw2(245318, 765747))
}


fun nrPw(start: Int, end: Int): Int {
    var count = 0
    for (x in start until end) {
        if (valid(x)) count++
    }
    return count
}

fun nrPw2(start: Int, end: Int): Int {
    var count = 0
    for (x in start until end) {
        if (valid2(x)) count++
    }
    return count
}

fun valid(num: Int): Boolean {
    var oldChar = '0'
    var same = false
    for (c in num.toString()) {
        if (c < oldChar) {
            return false
        }
        if (c == oldChar) {
            same = true
        }
        oldChar = c
    }
    return same
}

fun valid2(num: Int): Boolean {
    var oldChar = '0'
    var same = false
    var clusterLen = 1
    for (c in num.toString()) {
        if (c < oldChar) {
            return false
        }
        if (c == oldChar) {
            clusterLen++
        } else  {
            if (clusterLen == 2) {
                same = true
            }
            clusterLen = 1
        }
        oldChar = c
    }
    return same || clusterLen == 2
}
