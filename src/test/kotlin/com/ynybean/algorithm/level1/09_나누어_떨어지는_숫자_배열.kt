package com.ynybean.algorithm.level1


import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class `나누어 떨어지는 숫자 배열` {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var filteredArr = arr.filter { it % divisor == 0 }
        return if (filteredArr.size < 1) intArrayOf(-1) else filteredArr.sorted().toIntArray()
    }

    @Test
    fun `Test_1`() {
        assertThat(solution(intArrayOf(5, 9, 7, 10), 5)).isEqualTo(intArrayOf(5, 10))
    }

    @Test
    fun `Test_2`() {
        assertThat(solution(intArrayOf(2, 36, 1, 3), 1)).isEqualTo(intArrayOf(1, 2, 3, 36))
    }

    @Test
    fun `Test_3`() {
        assertThat(solution(intArrayOf(3,2,6), 10)).isEqualTo(intArrayOf(-1))
    }
}