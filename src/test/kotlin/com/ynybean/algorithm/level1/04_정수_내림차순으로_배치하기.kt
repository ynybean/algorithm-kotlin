package com.ynybean.algorithm.level1


import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class `정수 내림차순으로 배치하기` {

    fun solution(n: Long): Long {
        return n.toString()
            .map { it.toString() }
            .sortedDescending()
            .joinToString("")
            .toLong()
    }

    @Test
    fun `Test_118372`() {
        assertThat(solution(118372)).isEqualTo(873211)
    }

    @Test
    fun `Test_8000000000`() {
        assertThat(solution(8000000000)).isEqualTo(8000000000)
    }
}