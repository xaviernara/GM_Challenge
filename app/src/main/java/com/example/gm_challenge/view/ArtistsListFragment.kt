package com.example.gm_challenge.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.snapshots.Snapshot.Companion.observe
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.example.gm_challenge.R
import com.example.gm_challenge.adaptor.GMAdapter
import com.example.gm_challenge.adaptor.GMClickListener
import com.example.gm_challenge.databinding.FragmentArtistsListBinding
import com.example.gm_challenge.model.Result
import com.example.gm_challenge.viewmodel.MainViewModel

class ArtistsListFragment : Fragment(), GMClickListener {

    private lateinit var binding : FragmentArtistsListBinding
    private val args : ArtistsListFragmentArgs by navArgs()
    private val viewModel by viewModels<MainViewModel> ()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentArtistsListBinding.inflate(inflater, container, false).also { binding = it}.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initObservers()
    }

    private fun initObservers(){

        viewModel.createGMResponse(args.artistName.toString())
        viewModel.gmResultListLiveData.observe(viewLifecycleOwner, Observer {
            generateJikanAdapter(it)
        })

    }

    private fun generateJikanAdapter(result : List<Result>){
        binding.recyclerview.layoutManager = GridLayoutManager(binding.root.context,1)
        binding.recyclerview.adapter = GMAdapter(result,this)
    }

    override fun onClickListener(result : Result) {
        viewModel.gmResultLiveData.observe(viewLifecycleOwner, Observer {
            val actions = ArtistsListFragmentDirections.actionArtistsListFragmentToArtsitDetailsFragment(result)
            findNavController().navigate(actions)
        })


    }
}