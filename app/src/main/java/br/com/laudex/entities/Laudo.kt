package br.com.laudex.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Laudo(
    @PrimaryKey val id:Int?,
    val titulo:String?,
    val endereco:String?,
    val cidade:String?,
    val estado:String?,
    val cep:String?,
    val descricao:String?
)