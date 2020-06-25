package com.github.marcoscouto.cadastrosempresa.repository

import com.github.marcoscouto.cadastrosempresa.domain.Funcionario
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface FuncionarioRepository : JpaRepository<Funcionario, UUID>