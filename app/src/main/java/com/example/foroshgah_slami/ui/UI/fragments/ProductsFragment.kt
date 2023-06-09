package com.example.foroshgah_slami.ui.UI.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.foroshgah_slami.databinding.FragmentProductsBinding

class ProductsFragment : Fragment() {

private var _binding: FragmentProductsBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {

    _binding = FragmentProductsBinding.inflate(inflater, container, false)
    val root: View = binding.root
    val textView: TextView = binding.textHome

      textView.text = "ProductsFragment"

    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}