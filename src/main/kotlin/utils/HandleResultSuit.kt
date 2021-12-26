package utils

class HandleResultSuit {

    fun getResult(playerOne: String, playerTwo: String) {
        when {
            playerOne == "kertas" && playerTwo == "batu" -> {
                println("-------------------")
                println("PEMAIN SATU MENANG!")
                println("-------------------")
            }
            playerOne == "gunting" && playerTwo == "kertas" -> {
                println("-------------------")
                println("PEMAIN SATU MENANG!")
                println("-------------------")
            }
            playerOne == "batu" && playerTwo == "gunting" -> {
                println("-------------------")
                println("PEMAIN SATU MENANG!")
                println("-------------------")
            }
            playerTwo == "kertas" && playerOne == "batu" -> {
                println("-------------------")
                println("PEMAIN DUA MENANG!")
                println("-------------------")
            }
            playerTwo == "gunting" && playerOne == "kertas" -> {
                println("-------------------")
                println("PEMAIN DUA MENANG!")
                println("-------------------")
            }
            playerTwo == "batu" && playerOne == "gunting" -> {
                println("-------------------")
                println("PEMAIN DUA MENANG!")
                println("-------------------")
            }
            playerOne == playerTwo -> {
                println("---------")
                println("IMBANG!")
                println("---------")
            }
        }
    }

}