package com.github.marcoscouto.cadastrosempresa.service.impl

import com.github.marcoscouto.cadastrosempresa.domain.Funcionario
import com.github.marcoscouto.cadastrosempresa.exception.NotFoundException
import com.github.marcoscouto.cadastrosempresa.repository.FuncionarioRepository
import com.github.marcoscouto.cadastrosempresa.service.FuncionarioService
import com.github.marcoscouto.cadastrosempresa.utils.DatabaseUtils
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.util.*

@Service
class FuncionarioServiceImpl(val repository: FuncionarioRepository,
                             val utils: DatabaseUtils) : FuncionarioService {

    @Value("\${numero_maximo_funcionarios}")
    val numeroMaximoFuncionarios = 50

    override fun findAll(): List<Funcionario> = repository.findAll()

    override fun findById(id: UUID): Funcionario? =
            repository.findById(id).orElseThrow { NotFoundException("Funcionário não encontrado") }


    override fun save(funcionario: Funcionario): Funcionario {
        if (repository.findAll().size > numeroMaximoFuncionarios)
            utils.refreshDatabase()
        funcionario.id = null
        return repository.save(funcionario)
    }

    override fun update(id: UUID, funcionario: Funcionario): Funcionario {
        findById(id)
        funcionario.id = id
        return funcionario
    }

    override fun delete(id: UUID) =
            repository.deleteById(id)

}