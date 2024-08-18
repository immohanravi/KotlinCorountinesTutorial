package com.mohanravi

import kotlinx.coroutines.*
import kotlin.concurrent.thread

@OptIn(DelicateCoroutinesApi::class)
fun main()= runBlocking {
    println("Main Program Started ${Thread.currentThread().name}")

    /*GlobalScope.launch {
        // creaates a background corountine that run on a background thread
        //unlike threads, for corountines the application by default does not wait for it to finish its execution
        println("""Inside thread ${Thread.currentThread().name}""")// thread one
        delay(1000)
        println("Thread ended ${Thread.currentThread().name}") // possibility of running in different thread

    }

    //blocks the current main thread to corountine to finish
    //Thread.sleep(2000)

    runBlocking {//creates a corountine that blocks the current main thread
        delay(2000)
    }*/

   /*val job =  launch { //runs in mainthread because of running inside the socpe of runBlock{}
        println("""Inside thread ${Thread.currentThread().name}""")
        delay(1000)
        println("Thread ended ${Thread.currentThread().name}")

    }

    job.join()*/

    val job =  async { //runs in mainthread because of running inside the socpe of runBlock{}

        println("""Inside thread ${Thread.currentThread().name}""")
        delay(1000)
        println("Thread ended ${Thread.currentThread().name}")

    }

    job.join()
    println("Main Program ended ${Thread.currentThread().name}")
}

suspend fun myOwnSuspendFunction() {
    delay(1000)
}