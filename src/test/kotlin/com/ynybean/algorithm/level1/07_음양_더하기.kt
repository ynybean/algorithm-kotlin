package com.ynybean.algorithm.level1


import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class `음양 더하기` {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        return absolutes.foldIndexed(0) { i, acc, absolute -> acc + (if (signs[i]) 1 else -1) * absolute }
    }

    @Test
    fun `Test_1`() {
        assertThat(solution(intArrayOf(4,7,12), booleanArrayOf(true,false,true))).isEqualTo(9)
    }

    @Test
    fun `Test_2`() {
        assertThat(solution(intArrayOf(1,2,3), booleanArrayOf(false,false,true))).isEqualTo(0)
    }

    @Test
    fun `Test_3`() {
        assertThat(solution(intArrayOf(1,2,3), booleanArrayOf(true,false,false))).isEqualTo(-4)
    }
}