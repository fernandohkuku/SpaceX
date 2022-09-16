package com.fernando.spacex.presentation.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.viewbinding.ViewBinding
import com.fernando.spacex.NavGraphHomeLandDirections
import com.fernando.spacex.R
import com.fernando.spacex.core.data.mappers.toParcelable
import com.fernando.spacex.core.domain.entities.FlightEntity
import com.fernando.spacex.databinding.FragmentHomeBinding
import com.fernando.spacex.databinding.FragmentHomeLandBinding
import com.fernando.spacex.ui_ktx.content.childNavigate
import com.fernando.spacex.ui_ktx.content.navigate
import com.skydoves.bindables.BindingFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(), HomeAdapter.OnClickListener {

    private val viewModel: HomeViewModel by viewModels()

    private var _binding: ViewBinding? = null
    private val binding get() = _binding!!

    private val isTablet: Boolean
        get() = requireContext().resources.getBoolean(R.bool.isTablet)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = when {
        isTablet -> {
            _binding = FragmentHomeLandBinding.inflate(inflater, container, false)
            binding.root
        }
        else -> {
            _binding = FragmentHomeBinding.inflate(inflater, container, false)
            binding.root
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        prepareUI()
    }

    private fun prepareUI() {
        when (binding) {
            is FragmentHomeBinding -> setupHomeBinding(binding as FragmentHomeBinding)
            else -> setupHomeLandBinding(binding as FragmentHomeLandBinding)
        }
    }

    private fun setupHomeBinding(binding: FragmentHomeBinding) = with(binding) {
        lifecycleOwner = viewLifecycleOwner
        viewModel = this@HomeFragment.viewModel
        adapter = HomeAdapter(this@HomeFragment, true)
    }

    private fun setupHomeLandBinding(binding: FragmentHomeLandBinding) = with(binding) {
        lifecycleOwner = viewLifecycleOwner
        viewModel = this@HomeFragment.viewModel
        adapter = HomeAdapter(this@HomeFragment, true)
    }

    override fun onFlightClick(flight: FlightEntity) {
        navigateToDetail(flight)
    }

    private fun navigateToDetail(flight: FlightEntity) {
        when (binding) {
            is FragmentHomeBinding -> {
                val action = HomeFragmentDirections.actionHomeToDetail(
                    flight = flight.toParcelable()
                )
                navigate(action)
            }
            else -> {
                val action = NavGraphHomeLandDirections.actionGlobalDetail(
                    flight = flight.toParcelable()
                )
                childNavigate(R.id.nav_host_fragment_content_home_land, action)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}