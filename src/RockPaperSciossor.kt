class RockPaperSciossor(){


    private  var playerOne: Int = -1
    private var playerTwo: Int = -1

    private fun printOptions(){
        println(
            """
            ======================
            GUNTING BATU KERTAS
            ======================
            option
            0.Gunting
            1.Batu
            2.Kertas
        """.trimIndent()
        )
    }
    private fun showResult(playerOne : Int, playerTwo: Int):String{
        return if (((playerOne+1)%3)== playerTwo){
            "Player 2 menang "
        }else if (playerOne==playerTwo){
            "seri"
        }else{
            "player 1 menang"
        }
    }
    private fun inputPlayerOne(){
        println("Masukkan pilihan 1 (0/1/2) : ")
        playerOne = readln().toInt()
    }
    private  fun inputplayerTwo(){
        println("masukkan pilihan 2 (0/1/1) : ")
        playerTwo = readln().toInt()
    }
    fun run(){
        printOptions()
        inputPlayerOne()
        inputplayerTwo()
        println(showResult(playerOne,playerTwo))
    }
}