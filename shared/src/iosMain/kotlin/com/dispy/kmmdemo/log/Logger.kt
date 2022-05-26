package com.dispy.kmmdemo.log

/**
 * Created by Dispy-Yang on 2022/05/26
 *
 * @author Dispy-Yang
 * @since 2022/5/26
 */
internal actual class Logger {
    actual fun info(tag: String, message: String) {
        println("Log level: info || [$tag] $message")
    }

    actual fun debug(tag: String, message: String) {
        println("Log level: debug || [$tag] $message")
    }

    actual fun warn(tag: String, message: String) {
        println("Log level: warn || [$tag] $message")
    }

    actual fun error(tag: String, message: String) {
        println("Log level: error || [$tag] $message")
    }

}