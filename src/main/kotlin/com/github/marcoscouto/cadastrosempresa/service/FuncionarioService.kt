package com.github.marcoscouto.cadastrosempresa.service

import com.github.marcoscouto.cadastrosempresa.domain.Funcionario
import java.util.*

interface FuncionarioService {

    fun findAll(): List<Funcionario>

    fun findById(id: UUID): Funcionario?

    fun save(funcionario: Funcionario): Funcionario

    fun update(id: UUID, funcionario: Funcionario): Funcionario

    fun delete(id: UUID)

}