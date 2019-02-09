package com.atinjin.zephyros

import mu.KotlinLogging

/**
 * Project : Flying Zephyros
 *
 * @author RyanJin(Atin) (atinjin@gmail.com)
 * @since 2019.02.09.
 */
class Zephyros {
    val log = KotlinLogging.logger {  }

    fun simple() {
        log.debug { "simple debug" }
    }
}