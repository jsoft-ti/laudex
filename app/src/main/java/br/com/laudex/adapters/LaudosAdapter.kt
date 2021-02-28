package br.com.laudex.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.laudex.R
import br.com.laudex.entities.Laudo
import kotlinx.android.synthetic.main.laudo_item.view.*


class LaudosAdapter(private val laudos:List<Laudo>, private val context:Context):RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.laudo_item, parent, false);
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return laudos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val laudo = laudos.get(position)
        holder?.bindView(laudo)
    }



}

class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){


    fun bindView(laudo:Laudo){
        val titulo = itemView.txtLaudoTitulo
        val descricao = itemView.txtLaudoDescricao
        titulo.text = laudo.titulo
        descricao.text = laudo.descricao


    }

}