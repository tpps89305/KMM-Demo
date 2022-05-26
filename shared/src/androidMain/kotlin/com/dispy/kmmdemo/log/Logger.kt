package com.dispy.kmmdemo.log

import android.util.Log

/**
 * Created by Dispy-Yang on 2022/05/26
 *
 * @author Dispy-Yang
 * @since 2022/5/26
 */
internal actual class Logger {
    actual fun info(tag: String, message: String) {
        Log.i(tag, message)
    }

    actual fun debug(tag: String, message: String) {
        Log.d(tag, message)
    }

    actual fun warn(tag: String, message: String) {
        Log.w(tag, message)
    }

    actual fun error(tag: String, message: String) {
        Log.e(tag, message)
    }
}