package utils

class Player(private val inputPlayer: String) {

    fun validateInputUser(): Boolean {
        return if (inputPlayer != "kertas" && inputPlayer != "gunting" && inputPlayer != "batu") {
            println("Input yang anda masukkan salah, silahkan pilih antara kertas, gunting, atau batu!")
            false
        } else {
            true
        }
    }

}