package com.searoth.facebooktechnicalinterview

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `large number`(){
        val hugeNum = 234234234234
        val res = IntToStringRep.findTheNumberString(hugeNum)
        val expected = "two hundred thirty four billion two hundred thirty four million two hundred thirty four thousand two hundred thirty four"
        assertEquals(expected, res)
    }

    @Test
    fun `largest number`(){
        val hugeNum = 999999999999
        val res = IntToStringRep.findTheNumberString(hugeNum)
        val expected = "nine hundred ninety nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine"
        assertEquals(expected, res)
    }

    @Test
    fun `too long`(){
        val hugeNum = 123456789123456789
        val res = IntToStringRep.findTheNumberString(hugeNum)
        val expected = "too long"
        assertEquals(expected, res)
    }

    @Test
    fun `small number`(){
        val hugeNum: Long = 1
        val res = IntToStringRep.findTheNumberString(hugeNum)
        val expected = "one"
        assertEquals(expected, res)
    }

    @Test
    fun `twelve`(){
        val hugeNum: Long = 12
        val res = IntToStringRep.findTheNumberString(hugeNum)
        val expected = "twelve"
        assertEquals(expected, res)
    }

    @Test
    fun `thirsteen`(){
        val hugeNum: Long = 13
        val res = IntToStringRep.findTheNumberString(hugeNum)
        val expected = "thirteen"
        assertEquals(expected, res)
    }

    @Test
    fun `fourteen`(){
        val hugeNum: Long = 14
        val res = IntToStringRep.findTheNumberString(hugeNum)
        val expected = "fourteen"
        assertEquals(expected, res)
    }

    @Test
    fun `fifteen`(){
        val hugeNum: Long = 15
        val res = IntToStringRep.findTheNumberString(hugeNum)
        val expected = "fifteen"
        assertEquals(expected, res)
    }

    @Test
    fun `sixteen`(){
        val hugeNum: Long = 16
        val res = IntToStringRep.findTheNumberString(hugeNum)
        val expected = "sixteen"
        assertEquals(expected, res)
    }

    @Test
    fun `seventeen`(){
        val hugeNum: Long = 17
        val res = IntToStringRep.findTheNumberString(hugeNum)
        val expected = "seventeen"
        assertEquals(expected, res)
    }

    @Test
    fun `eighteen`(){
        val hugeNum: Long = 18
        val res = IntToStringRep.findTheNumberString(hugeNum)
        val expected = "eighteen"
        assertEquals(expected, res)
    }

    @Test
    fun `nineteen`(){
        val hugeNum: Long = 19
        val res = IntToStringRep.findTheNumberString(hugeNum)
        val expected = "nineteen"
        assertEquals(expected, res)
    }

    @Test
    fun `thirty three`(){
        val hugeNum: Long = 33
        val res = IntToStringRep.findTheNumberString(hugeNum)
        val expected = "thirty three"
        assertEquals(expected, res)
    }


}