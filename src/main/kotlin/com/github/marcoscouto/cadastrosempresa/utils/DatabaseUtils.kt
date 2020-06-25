package com.github.marcoscouto.cadastrosempresa.utils

import com.github.marcoscouto.cadastrosempresa.domain.Funcionario
import com.github.marcoscouto.cadastrosempresa.repository.FuncionarioRepository
import org.springframework.stereotype.Component

@Component
class DatabaseUtils(val funcionarioRepository: FuncionarioRepository) {

    fun populateDatabase(){
        funcionarioRepository.saveAll(listOf(
                Funcionario(null, "John",40, "john@empresa.com.br", "Presidente"),
                Funcionario(null, "Ringo",35, "ringo@empresa.com.br", "Diretor de Tecnologia"),
                Funcionario(null, "George",32, "george@empresa.com.br", "Diretor de Finanças"),
                Funcionario(null, "Paul",37, "paul@empresa.com.br", "Diretor Administrativo")))
    }

    fun deleteData() = funcionarioRepository.deleteAll()

    fun refreshDatabase(){
        deleteData()
        populateDatabase()
    }

}