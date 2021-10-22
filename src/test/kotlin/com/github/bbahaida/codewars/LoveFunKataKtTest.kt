package com.github.bbahaida.codewars

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LoveFunKataKtTest {
    @Test
    fun exampleTests() {
        Assertions.assertThat(loveFun(1, 4)).isTrue()
        Assertions.assertThat(loveFun(2, 2)).isFalse()
        Assertions.assertThat(loveFun(0, 1)).isTrue()
        Assertions.assertThat(loveFun(0, 0)).isFalse()
    }
}
