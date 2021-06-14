package com.example.gm_challenge.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.gm_challenge.R
import com.example.gm_challenge.databinding.FragmentArtsitDetailsBinding

class ArtsitDetailsFragment : Fragment() {

    private lateinit var binding: FragmentArtsitDetailsBinding
    private val args: ArtsitDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    )= FragmentArtsitDetailsBinding.inflate(inflater, container, false).also{binding = it}.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViews()


    }

    private fun setUpViews() {
        binding.artistname.text = args.gmResult.artistName
        binding.trackname.text = args.gmResult.trackName
        binding.primaryGenreName.text = args.gmResult.primaryGenreName
        binding.releaseDate.text = args.gmResult.releaseDate
        binding.trackprice.text = args.gmResult.trackPrice.toString()
    }
}