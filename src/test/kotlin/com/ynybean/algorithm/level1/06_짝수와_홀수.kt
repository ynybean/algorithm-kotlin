package com.ynybean.algorithm.level1


import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class `짝수와 홀수` {
    fun solution(num: Int): String {
        return if (num % 2 == 0) "Even" else "Odd"
    }

    @Test
    fun `Test_3`() {
        assertThat(solution(3)).isEqualTo("Odd")
    }

    @Test
    fun `Test_4`() {
        assertThat(solution(4)).isEqualTo("Even")
    }

    @Test
    fun `Test_0`() {
        assertThat(solution(0)).isEqualTo("Even")
    }
}