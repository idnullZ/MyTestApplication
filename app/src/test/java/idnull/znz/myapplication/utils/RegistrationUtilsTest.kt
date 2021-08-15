package idnull.znz.myapplication.utils


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilsTest{
    @Test
    fun `empty username return false`(){
        val result = RegistrationUtils.validateRegistrationUtils(
            username = "",
            password = "123456789",
            confirmedPassword = "123456789"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated return true`(){
        val result = RegistrationUtils.validateRegistrationUtils(
            username = "Carl",
            password = "123456789",
            confirmedPassword = "123456789"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists return false`(){
        val result = RegistrationUtils.validateRegistrationUtils(
            username = "Rick",
            password = "123456789",
            confirmedPassword = "123456789"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `incorrectly confirmed password return false`(){
        val result = RegistrationUtils.validateRegistrationUtils(
            username = "Maike",
            password = "123456789",
            confirmedPassword = "02104"
        )
        assertThat(result).isFalse()
    }
     @Test
    fun `empty password return false`(){
        val result = RegistrationUtils.validateRegistrationUtils(
            username = "Sam",
            password = "",
            confirmedPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less  that 2 digit password return false`(){
        val result = RegistrationUtils.validateRegistrationUtils(
            username = "Sam",
            password = "uhiuhtr1",
            confirmedPassword = "uhiuhtr1"
        )
        assertThat(result).isFalse()
    }











}