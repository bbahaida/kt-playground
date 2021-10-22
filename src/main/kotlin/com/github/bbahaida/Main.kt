package com.github.bbahaida

class Main {

    fun add(a: Int, b: Int): Int = a+b
}

fun main(args: Array<String>){
    println("Hello world!")
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")
    println("Hello, ${args.getOrElse(1){"Kotlin"}}!")
    println("1 + 3 = ${Main().add(1, 3)}")
    val list = mutableListOf("Test")
    list.add("test 2")
    println(list)
    val list2 = listOf("Test 3")
    // list2.add("test 2") <- Unresolved reference: add
    println(list2)

    displaySeparator('#', 5)
    displaySeparator('#')
    displaySeparator()
    displaySeparator(size = 5)

}


fun displaySeparator(char: Char = '*', size: Int = 10) {
    repeat(size) {
        print(char)
    }
    println()
}

