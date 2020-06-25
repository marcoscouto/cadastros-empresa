package com.github.marcoscouto.cadastrosempresa

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Entity
data class Funcionario(

        @Id
        @GeneratedValue(generator = "UUID")
        val id: UUID,

        @NotBlank(message = "O nome é obrigatório")
        val nome: String,

        @NotNull
        val idade: Int,

        @NotEmpty(message = "O email é obrigatório")
        @Email(message = "Email inválido")
        val email: String,

        @NotEmpty(message = "O cargo é obrigatório")
        val cargo: String
)