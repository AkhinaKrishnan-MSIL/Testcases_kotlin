package com.example.testcases_kotlin


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{
     @Test
     fun `empty username returns false`(){
         val result =RegistrationUtil.validateRegistrationInput(
             "",
               "123",
               "123"
         )
         assertThat(result).isFalse()

    }

    @Test
    fun `valid user name and correctly repeated password is true`(){
        val result =RegistrationUtil.validateRegistrationInput(
            "anjana",
            "123",
            "123"
        )
        assertThat(result).isTrue()

    }

    @Test
    fun `username already exists returns false`(){
        val result =RegistrationUtil.validateRegistrationInput(
            "akhina",
            "123",
            "123"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `password comes empty`(){
        val result =RegistrationUtil.validateRegistrationInput(
            "akhina",
            "",
            ""
        )
        assertThat(result).isFalse()

    }


    @Test
    fun `password repeated incorrectly`(){
        val result =RegistrationUtil.validateRegistrationInput(
            "akhina",
            "aaa",
            "a123"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `password must contain less than 2 digits`(){
        val result =RegistrationUtil.validateRegistrationInput(
            "akhina",
            "a1234",
            "a1234"
        )
        assertThat(result).isFalse()

    }


}