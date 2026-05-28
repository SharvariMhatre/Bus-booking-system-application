package com.example.busbook.ui.booking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.busbook.R
import com.example.busbook.databinding.BookingPageBinding
import com.example.busbook.viewmodel.BookingViewModel

/**
 * Seat picker. Old code had 20 hand-written ImageView click handlers, each
 * launching the next activity with 8 putExtras. Now: one list, one handler,
 * state goes through the ViewModel.
 */
class BookingFragment : Fragment() {

    private var _binding: BookingPageBinding? = null
    private val binding get() = _binding!!

    private val vm: BookingViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BookingPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Render the in-flight query + bus from the shared ViewModel.
        vm.query.value?.let { q ->
            binding.tvPlace3.text = q.from
            binding.tvPlace4.text = q.to
            binding.tv7.text = q.date
        }
        vm.selectedBus.value?.let { b ->
            binding.displayCvtv1.text = b.operator
            binding.displayCvtv2.text = b.busType
            binding.displayCvtv3.text = b.departure
            binding.displayCvtv4.text = b.arrival
            binding.displayCvtv5.text = b.price
        }

        binding.arrow2.setOnClickListener { findNavController().popBackStack() }

        // Wire up all 20 seats with a single handler.
        seats().forEachIndexed { index, seat ->
            val seatNumber = index + 1
            seat.setOnClickListener {
                vm.stageSeat(seatNumber)
                findNavController().navigate(R.id.action_booking_to_confirmation)
            }
        }
    }

    private fun seats(): List<ImageView> = with(binding) {
        listOf(
            s1, s2, s3, s4, s5,
            s6, s7, s8, s9, s10,
            s11, s12, s13, s14, s15,
            s16, s17, s18, s19, s20
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
