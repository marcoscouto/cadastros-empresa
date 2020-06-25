package com.github.marcoscouto.cadastrosempresa.resource.exception

import com.github.marcoscouto.cadastrosempresa.exception.NotFoundException
import com.github.marcoscouto.cadastrosempresa.exception.StandardError
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.time.LocalDateTime

@RestControllerAdvice
class ExceptionHandler {

    val timestamp = LocalDateTime.now()

    @ExceptionHandler(NotFoundException::class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    fun NotFoundExceptionHandler(e: NotFoundException): StandardError =
            StandardError("Informação não encontrada", listOf(e.message!!), timestamp)

    @ExceptionHandler(IllegalArgumentException::class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    fun IllegalArgumentException(e: IllegalArgumentException): StandardError =
            StandardError("Argumento inválido", listOf(e.message!!), timestamp)
}