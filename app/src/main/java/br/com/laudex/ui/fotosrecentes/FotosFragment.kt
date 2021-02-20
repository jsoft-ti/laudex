package br.com.laudex.ui.fotosrecentes

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.laudex.R

class FotosFragment : Fragment() {

    companion object {
        fun newInstance() = FotosFragment()
    }

    private lateinit var viewModel: FotosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fotos_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FotosViewModel::class.java)
        // TODO: Use the ViewModel
    }

}