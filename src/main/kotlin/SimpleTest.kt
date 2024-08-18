package com.mohanravi

import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class SimpleTest {


    @Test
    fun MyFirstTest() = runBlocking{
        myOwnSuspendFunction()
        Assert.assertEquals(10,5+5)
    }
}