package com.example.busbook.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.busbook.R
import com.example.busbook.databinding.BusSearchPageBinding
import com.example.busbook.model.SearchQuery
import com.example.busbook.viewmodel.BookingViewModel
import com.google.firebase.auth.FirebaseAuth

class SearchFragment : Fragment() {

    private var _binding: BusSearchPageBinding? = null
    private val binding get() = _binding!!

    private val vm: BookingViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BusSearchPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val greeting = FirebaseAuth.getInstance().currentUser?.email?.substringBefore('@')
        binding.tvName.text = greeting?.let { "Hey $it" }.orEmpty()

        binding.proLink.setOnClickListener {
            findNavController().navigate(R.id.action_search_to_profile)
        }

        binding.searchBuses.setOnClickListener {
            val query = SearchQuery(
                from = binding.dest1.text.toString(),
                to = binding.frDesti.text.toString(),
                date = binding.dateSelect1.text.toString()
            )
            vm.setQuery(query)
            findNavController().navigate(R.id.action_search_to_selection)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
