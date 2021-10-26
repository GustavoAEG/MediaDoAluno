fun main(args: Array<String>) {

    var primeiro = 0.0
    var segundo = 0.0
    var terceiro = 0.0
    var quarto =  0.0

    println("Informe nota do 1 bimestre")
    primeiro = readLine()!!.toDouble()

    println("Informe nota do 2 bimestre")
    segundo = readLine()!!.toDouble()

    println("Informe nota do 3 bimestre")
    terceiro = readLine()!!.toDouble()

    println("Informe nota do 4 bimestre")
    quarto = readLine()!!.toDouble()

    var media = primeiro+segundo+terceiro+quarto/4


    if (media <= 4.0) {

        println("REPROVADO")
    }else if (media > 4.0 || media <= 5.0 ) {

        println("REGULAR")
    }else if(media>5.0 || media <=8.0){

        println("BOA")
    }else if(media >8.0 || media <= 10.0){
        println("EXCELENTE")
}
}