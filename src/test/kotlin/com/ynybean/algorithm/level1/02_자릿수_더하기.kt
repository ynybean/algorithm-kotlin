package com.ynybean.algorithm.level1


import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class `자릿수 더하기` {

    fun solution(n: Int): Int {
        return n.toString()
            .map { it.toString().toInt() }
            .sum()
    }

    @Test
    fun `Test`() {
        assertThat(solution(123)).isEqualTo(6)
        assertThat(solution(987)).isEqualTo(24)
    }
}