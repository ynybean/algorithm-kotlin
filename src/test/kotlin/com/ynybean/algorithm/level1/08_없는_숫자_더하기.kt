package com.ynybean.algorithm.level1


import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class `없는 숫자 더하기` {
    fun solution(numbers: IntArray): Int {
        return (0..9).filter { !numbers.contains(it) }.sum()
    }

    @Test
    fun `Test_1`() {
        assertThat(solution(intArrayOf(1,2,3,4,6,7,8,0))).isEqualTo(14)
    }

    @Test
    fun `Test_2`() {
        assertThat(solution(intArrayOf(5,8,4,0,6,7,9))).isEqualTo(6)
    }
}