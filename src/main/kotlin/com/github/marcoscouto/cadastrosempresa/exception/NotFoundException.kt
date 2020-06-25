package com.github.marcoscouto.cadastrosempresa.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import kotlin.RuntimeException

class NotFoundException(message: String) : RuntimeException(message)