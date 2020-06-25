package com.github.marcoscouto.cadastrosempresa.config

import com.github.marcoscouto.cadastrosempresa.utils.DatabaseUtils
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
class TestConfig(val utils: DatabaseUtils) : CommandLineRunner {

    override fun run(vararg args: String?) {
        utils.deleteData()
        utils.populateDatabase()
    }
}