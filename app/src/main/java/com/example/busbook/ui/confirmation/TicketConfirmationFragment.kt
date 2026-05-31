package com.example.busbook.ui.confirmation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.busbook.R
import com.example.busbook.databinding.TicketconfirmationpageBinding
import com.example.busbook.viewmodel.BookingViewModel

class TicketConfirmationFragment : Fragment() {

    private var _binding: TicketconfirmationpageBinding? = null
    private val binding get() = _binding!!

    private val vm: BookingViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = TicketconfirmationpageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ticket = vm.pendingTicket.value ?: run {
            findNavController().popBackStack()
            return
        }

        binding.tvPlace5.text = ticket.query.from
        binding.tvPlace6.text = ticket.query.to
        binding.tv8.text = ticket.query.date
        binding.displayCvtv01.text = ticket.bus.operator
        binding.displayCvtv02.text = ticket.bus.busType
        binding.displayCvtv03.text = ticket.bus.departure
        binding.displayCvtv04.text = ticket.bus.arrival
        binding.displayCvtv05.text = ticket.bus.price

        binding.arrow3.setOnClickListener { findNavController().popBackStack() }

        binding.conBtn.setOnClickListener {
            vm.confirmTicket()
            findNavController().navigate(R.id.action_confirmation_to_final)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
