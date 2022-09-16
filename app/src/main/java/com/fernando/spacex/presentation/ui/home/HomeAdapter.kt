package com.fernando.spacex.presentation.ui.home

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fernando.spacex.core.domain.entities.FlightEntity
import com.fernando.spacex.ui_ktx.wigets.notifyChanged

class HomeAdapter(
    private val listener: OnClickListener,
    private val isBackgroundEnabled: Boolean = false
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var flights: List<FlightEntity> by notifyChanged(
        areContentsTheSame = { old, new -> old == new }
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        HomeViewHolder.create(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is HomeViewHolder) {
            val flight = flights[position]
            holder.bindTo(flight, listener, isBackgroundEnabled)
        }
    }

    override fun getItemCount(): Int = flights.size

    fun addFlights(flights: List<FlightEntity>?) {
        this.flights = flights ?: emptyList()
    }

    interface OnClickListener {
        fun onFlightClick(flight: FlightEntity)
    }
}