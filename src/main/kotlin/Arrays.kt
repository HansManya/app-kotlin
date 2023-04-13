fun main(args:Array<String>) {
    var names = arrayListOf("Yvone", "Erick", "Ocs", "Alpyh")
    println(names[2])
    names.add("King")
    // Use for in loop to print
    for (i in 0 until (names.size - 1)){
        println(names[1])
    }

    //for each loop can also be used
    names.forEach {
        println(it)
    }
}