package com.github.marcoscouto.cadastrosempresa.exception

import java.time.LocalDateTime

class StandardError (
        val title: String,
        val message: List<String>,
        val timestamp: LocalDateTime
)