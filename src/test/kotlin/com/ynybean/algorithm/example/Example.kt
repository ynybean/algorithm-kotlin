package com.ynybean.algorithm.example


import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

fun solution(n: Int): Boolean {
    return n % 2 == 0
}


class Example {

    @Test
    fun `is it even`() {
        assertThat(
            solution(12)
        ).isTrue()

        assertThat(
            solution(5)
        ).isFalse()
    }
}