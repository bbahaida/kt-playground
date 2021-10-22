package com.github.bbahaida

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MainTest {
    private val main = Main()

    @Test
    fun `Adding 1 and 3 should be equal to 4`() {
        Assertions.assertThat(main.add(1, 3)).isEqualTo(4);
    }
}
