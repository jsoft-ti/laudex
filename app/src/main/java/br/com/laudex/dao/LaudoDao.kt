package br.com.laudex.dao

import androidx.room.*
import br.com.laudex.entities.Laudo

@Dao
interface LaudoDao {
    //Listar Todos
    @Query("select * from laudo ")
    fun getAll():List<Laudo>
    //Cadastrar
    @Insert
    fun insert(vararg laudo: Laudo)
    //Selecionar pelo id
    @Query("select * from laudo where id in (:laudoids)")
    fun getLaudo(laudoids: IntArray):List<Laudo>
    //Atualizar
    @Update
    fun setLaudo(laudo: Laudo):Int
    //Excluir
    @Delete
    fun delete(laudo: Laudo)

}