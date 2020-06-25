package com.github.marcoscouto.cadastrosempresa.resource

import com.github.marcoscouto.cadastrosempresa.utils.DatabaseUtils
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/refresh")
class Database(val utils: DatabaseUtils) {

    @GetMapping
    fun refreshDatabase(): String {
        utils.refreshDatabase()
        return "Banco de dados resetado com sucesso!"
    }

}