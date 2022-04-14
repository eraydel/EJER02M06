package com.dev.eraydel.navigationdrawer.ui.contact

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.dev.eraydel.navigationdrawer.R
import com.dev.eraydel.navigationdrawer.databinding.FragmentContactBinding

class ContactFragment : Fragment() {

    private var _binding: FragmentContactBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val contactViewModel = ViewModelProvider(this).get(ContactViewModel::class.java)

        _binding = FragmentContactBinding.inflate(inflater,container,false)
        val root: View = binding.root

        val textView: TextView = binding.tvNombre
        val email: TextView = binding.tvCorreo
        val address: TextView = binding.tvDireccion

        contactViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        contactViewModel.correo.observe(viewLifecycleOwner){
            email.text = it
        }

        contactViewModel.direccion.observe(viewLifecycleOwner){
            address.text = it
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}