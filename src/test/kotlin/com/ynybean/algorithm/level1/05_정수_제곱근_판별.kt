package com.ynybean.algorithm.level1


import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.sqrt

class `정수 제곱근 판별` {
    fun solution(n: Long): Long {
        val sqrt: Double = sqrt(n.toDouble())
        if (sqrt.toLong() * sqrt.toLong() == n) {
            return ((sqrt + 1) * (sqrt + 1)).toLong()
        }
        return -1
    }

    @Test
    fun `Test_121`() {
        assertThat(solution(121)).isEqualTo(144)
    }

    @Test
    fun `Test_3`() {
        assertThat(solution(3)).isEqualTo(-1)
    }

    @Test
    fun `Test_50000000000000`() {
        assertThat(solution(50000000000000)).isEqualTo(-1)
    }
}