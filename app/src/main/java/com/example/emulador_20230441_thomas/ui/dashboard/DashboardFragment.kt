package com.example.emulador_20230441_thomas.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.emulador_20230441_thomas.R
import com.example.emulador_20230441_thomas.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        val btnContactanos = view.findViewById<Button>(R.id.btnPerfil)
        val txtContactanos = view.findViewById<TextView>(R.id.txtPerfil)

        btnContactanos.setOnClickListener {
            txtContactanos.text = "Thomas Alexander Galdamez Palomares"
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}