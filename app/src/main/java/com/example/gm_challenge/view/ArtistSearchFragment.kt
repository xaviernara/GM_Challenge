package com.example.gm_challenge.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.gm_challenge.R
import com.example.gm_challenge.databinding.FragmentArtistSearchBinding

class ArtistSearchFragment : Fragment() {

    private lateinit var binding: FragmentArtistSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)
            = FragmentArtistSearchBinding.inflate(inflater, container, false
    ).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener{
            val actions = ArtistSearchFragmentDirections.actionArtistSearchFragmentToArtistsListFragment(binding.artistsearch.toString())
            findNavController().navigate(actions)

        }
    }


}