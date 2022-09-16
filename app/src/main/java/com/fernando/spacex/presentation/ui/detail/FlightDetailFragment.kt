package com.fernando.spacex.presentation.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.fernando.spacex.R
import com.fernando.spacex.core.domain.entities.FlightEntity
import com.fernando.spacex.databinding.FragmentFlightDetailBinding
import dagger.hilt.android.AndroidEntryPoint


class FlightDetailFragment : Fragment() {

    private var _binding: FragmentFlightDetailBinding? = null
    private val binding get() = _binding!!

    private val args: FlightDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFlightDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.flight = args.flight
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}