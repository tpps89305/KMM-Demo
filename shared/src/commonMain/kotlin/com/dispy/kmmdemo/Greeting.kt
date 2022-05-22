package com.dispy.kmmdemo

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}