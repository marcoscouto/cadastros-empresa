package com.github.marcoscouto.cadastrosempresa.repository

import com.github.marcoscouto.cadastrosempresa.domain.Funcionario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface FuncionarioRepository : JpaRepository<Funcionario, UUID>