package com.mercadolivro

fun teste(){
    var list = strings()
    var livro : Liver? = Liver()
    var i: Int = 0
    list.forEach{
        var x: String? = it
        livro?.id = i
        livro?.name = x?: "teste"
        livro?.author = "${x} ${i}"?: "teste"
        i++
        println(livro)
    }
}

private fun strings(): ArrayList<String> {
    var list = ArrayList<String>()

    list.add("teste")
    list.add("teste1")
    list.add("teste2")
    list.add("teste3")
    list.add("teste4")

    return list
}


data class Liver (
    var id: Int? = null,
    var name: String? = null,
    var author: String? = null,
)