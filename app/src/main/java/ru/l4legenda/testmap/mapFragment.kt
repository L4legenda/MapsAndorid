package ru.l4legenda.testmap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.SupportMapFragment

class mapFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_map, container, false)

        val supportMapFragment = childFragmentManager.findFragmentById(R.id.maps) as SupportMapFragment

        supportMapFragment.getMapAsync { googleMap ->
            //Код для карты
        }

        return view
    }

}