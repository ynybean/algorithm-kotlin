package com.ynybean.algorithm.level1


import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class `문자열을 정수로 바꾸기` {

    fun solution(s: String): Int {
//        return Integer.parseInt(s)
        return s.toInt()
    }

    @Test
    fun `양수, 음수`() {
        assertThat(solution("1234")).isEqualTo(1234)
        assertThat(solution("-1234")).isEqualTo(-1234)
    }
}