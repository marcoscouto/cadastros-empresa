package com.github.marcoscouto.cadastrosempresa.resource

import com.github.marcoscouto.cadastrosempresa.domain.Funcionario
import com.github.marcoscouto.cadastrosempresa.service.FuncionarioService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/funcionarios")
class FuncionarioResource(val service: FuncionarioService) {

    @GetMapping
    fun findAll() = service.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID) = service.findById(id)

    @PostMapping
    fun save(@RequestBody funcionario: Funcionario) = service.save(funcionario)

    @PutMapping("/{id}")
    fun update(@PathVariable id: UUID,
               @RequestBody funcionario: Funcionario) =
            service.update(id, funcionario)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: UUID) = service.delete(id)

}