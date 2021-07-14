package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "José"

    for(nome in nomes){
        println(nome)
    }
    println("xxxxxxxxxxxxxxxxxxxxxxxxxx")

    nomes.sort()
    nomes.forEach {
        println(it)
    }
    println("xxxxxxxxxxxxxxxxxxxxxxxxxx")
    val nomes2 = arrayOf("Maria", "João", "José")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

}