
fun main(args: Array<String>){

    var list = listOf<Int>(22, 33, 286)         //Immutable list, Fixed size, Read only

    for (index in 0..list.size -1) {
        if (list[index] > 50){
            println("$index is greater" )
        } else {
            println("$index is too low")
        }
    }
}

