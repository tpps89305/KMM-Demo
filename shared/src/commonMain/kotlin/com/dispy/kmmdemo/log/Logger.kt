package com.dispy.kmmdemo.log

/**
 * Created by Dispy-Yang on 2022/05/26
 *
 * @author Dispy-Yang
 * @since 2022/5/26
 */
internal expect class Logger() {
    fun info(tag: String, message: String)
    fun debug(tag: String, message: String)
    fun warn(tag: String, message: String)
    fun error(tag: String, message: String)
}

object KMMLogger {
    private val logger = Logger()

    fun i(tag: String, message: String) {
        logger.info(tag, message)
    }

    fun d(tag: String, message: String) {
        logger.debug(tag, message)
    }

    fun w(tag: String, message: String) {
        logger.warn(tag, message)
    }

    fun e(tag: String, message: String) {
        logger.error(tag, message)
    }
}