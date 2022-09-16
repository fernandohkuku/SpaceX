package com.fernando.spacex.presentation.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fernando.spacex.core.domain.entities.FlightEntity
import com.fernando.spacex.databinding.ItemFlightBinding
import com.fernando.spacex.ui_ktx.wigets.click

class HomeViewHolder(
    private val binding: ItemFlightBinding
) : RecyclerView.ViewHolder(binding.root) {
    companion object {
        fun create(parent: ViewGroup): HomeViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val view = ItemFlightBinding.inflate(inflater, parent, false)
            return HomeViewHolder(view)
        }
    }

    private val context: Context = itemView.context

    fun bindTo(
        flight: FlightEntity,
        listener: HomeAdapter.OnClickListener,
        isBackgroundEnabled: Boolean
    ) = with(binding) {
        this.flight = flight
        flight.setOnclick(listener)
        executePendingBindings()
    }

    private fun FlightEntity.setOnclick(listener: HomeAdapter.OnClickListener) = with(binding) {
        cvFlight click {
            listener.onFlightClick(this@setOnclick)
        }
    }
}