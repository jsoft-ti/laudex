package br.com.laudex.ui.laudos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.room.Room
import br.com.laudex.R
import br.com.laudex.dao.AppDatabase
import br.com.laudex.dao.LaudoRepository
import br.com.laudex.entities.Laudo
import kotlinx.android.synthetic.main.activity_add_laudo.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class AddLaudoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_laudo)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        btnCadastrar.setOnClickListener({
            val db = Room.databaseBuilder(this.applicationContext,AppDatabase::class.java,"laudodb").build()
            val laudo = Laudo(null,
                txtTitulo.text.toString(),
                txtEndereco.text.toString(),
                txtCidade.text.toString(),
                spEstado.selectedItem.toString(),
                txtCep.text.toString(),
                txtDescricao.text.toString())
            GlobalScope.launch {
                LaudoRepository(db.laudoDao()).insert(laudo)
            }


            Toast.makeText(this.applicationContext, "Laudo Cadastrado com sucesso",Toast.LENGTH_LONG).show()
            finish()
        })

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}