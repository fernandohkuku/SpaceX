package com.fernando.spacex.presentation.components

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fernando.spacex.core.domain.entities.FlightEntity
import com.fernando.spacex.presentation.ui.home.HomeAdapter
import com.skydoves.bindables.BindingListAdapter
import com.skydoves.whatif.whatIfNotNullAs

object RecyclerViewBinding {
    @JvmStatic
    @BindingAdapter("app:submitList")
    fun bindSubmitList(view: RecyclerView, itemList: List<FlightEntity>?) {
        view.layoutManager = LinearLayoutManager(view.context)
        view.adapter.whatIfNotNullAs<HomeAdapter> { adapter ->
            adapter.addFlights(itemList)
        }
    }
}