package com.ynybean.algorithm.level1


import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class `약수의 합` {

    fun solution(n: Int): Int {
        return (1..n).filter { n % it == 0 }.sum()
    }

    fun solution0(n: Int): Int {
        var answers : MutableList<Int> = mutableListOf(n)
        for (i in 1 until n / 2 + 1) {
            if (n % i == 0) {
                answers.add(i)
                answers.add(n / i)
            }
        }

        return answers.distinct().sum()
    }

    @Test
    fun `Test`() {
        assertThat(solution(0)).isEqualTo(0)
        assertThat(solution(1)).isEqualTo(1)
        assertThat(solution(12)).isEqualTo(28)
        assertThat(solution(5)).isEqualTo(6)
        assertThat(solution(500)).isEqualTo(1092)
        assertThat(solution(501)).isEqualTo(672)
    }
}