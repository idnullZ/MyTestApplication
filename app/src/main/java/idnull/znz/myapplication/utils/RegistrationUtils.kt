package idnull.znz.myapplication.utils

object RegistrationUtils {

    private val existingUser = listOf("Jon", "Rick")

    fun validateRegistrationUtils(
        username: String,
        password: String,
        confirmedPassword: String,

        ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }

        if (username in existingUser) {
            return false
        }

        if (password != confirmedPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}