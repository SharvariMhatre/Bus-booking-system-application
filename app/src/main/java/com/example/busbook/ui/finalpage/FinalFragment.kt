package com.example.busbook.ui.finalpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.busbook.R
import com.example.busbook.databinding.FinalpageBinding
import com.example.busbook.viewmodel.BookingViewModel

class FinalFragment : Fragment() {

    private var _binding: FinalpageBinding? = null
    private val binding get() = _binding!!

    private val vm: BookingViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FinalpageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vm.pendingTicket.value?.let { ticket ->
            binding.displayCvtv11.text = ticket.bus.operator
            binding.displayCvtv12.text = ticket.bus.busType
            binding.displayCvtv13.text = ticket.bus.departure
            binding.displayCvtv14.text = ticket.bus.arrival
            binding.displayCvtv15.text = ticket.bus.price
        }

        binding.homePage.setOnClickListener {
            vm.resetFlow()
            findNavController().navigate(R.id.action_final_to_search)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
