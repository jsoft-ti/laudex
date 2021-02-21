package br.com.laudex.ui.laudos

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.laudex.R
import kotlinx.android.synthetic.main.laudos_fragment.view.*

class LaudosFragment : Fragment() {


    companion object {
        fun newInstance() = LaudosFragment()
    }

    private lateinit var viewModel: LaudosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.laudos_fragment, container, false)
        view.btnAddLaudos.setOnClickListener({
            val intent = Intent(this.context, AddLaudoActivity::class.java)
            startActivity(intent)

        })
        return view;
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LaudosViewModel::class.java)
        // TODO: Use the ViewModel
    }

}