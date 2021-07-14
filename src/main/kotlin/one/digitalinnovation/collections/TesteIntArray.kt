package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    // Método utilizado criando uma variável (valor)
    for(valor in values){
        println(valor)
    }
    // Método forEach utiliza uma expressão Lambda onde é criada uma variável (it) sem necessidade de declarar
    println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
    values.forEach {
        println(it)
    }
    // Método para iterar em cima do index do array
    println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
    for(index in values.indices){
        println(values[index])
    }
    // Método para ordenar os componentes do array por padrão do menor para o maior
    println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
    values.sort()
    for(valor in values){
        println(valor)
    }


}