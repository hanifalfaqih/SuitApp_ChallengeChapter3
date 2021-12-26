package app

import utils.HandleResultSuit
import utils.Player

class SuitApp {

    private var inputPlayerOne: String = ""
    private var inputPlayerTwo: String = ""

    fun run() {
        printHeader()
        handleInputPlayerOne()
        handleInputPlayerTwo()
    }

    private fun printHeader() {
        println("==================================")
        println("GAME SUIT TERMINAL")
        println("Pilih antara kertas, gunting, batu ")
        println("==================================")
    }

    private fun handleInputPlayerOne() {
        println("Silahkan masukkan pemain satu: ")
        inputPlayerOne = getInputFromUser()
        if (Player(inputPlayerOne).validateInputUser()) {
            printResult(inputPlayerOne, inputPlayerTwo)
        } else {
            handleInputPlayerOne()
        }
    }

    private fun handleInputPlayerTwo() {
        println("Silahkan masukkan pemain dua: ")
        inputPlayerTwo = getInputFromUser()
        if (Player(inputPlayerTwo).validateInputUser()) {
            printResult(inputPlayerOne, inputPlayerTwo)
        } else {
            handleInputPlayerTwo()
        }
    }

    private fun printResult(playerOne: String, playerTwo: String) {
        val result = HandleResultSuit()
        result.getResult(playerOne, playerTwo)
    }

    private fun getInputFromUser(): String {
        return try {
            readLine().toString()
        } catch (e: Exception) {
            ""
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SuitApp().run()
        }
    }
}