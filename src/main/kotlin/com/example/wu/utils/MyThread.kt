package com.example.wu.utils

import java.util.*

class MyThread(val name: String): Runnable {

    override fun run() {
        println(Thread.currentThread().name + " Start. Time = " + Date());
        processCommand();
        println(Thread.currentThread().name + " End. Time = " + Date());
    }

    private fun processCommand() {
        try {
            Thread.sleep(5000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }

}
