package com.example.busbook.ui.selection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.busbook.R
import com.example.busbook.databinding.BusSelectionPageBinding
import com.example.busbook.model.BusInfo
import com.example.busbook.viewmodel.BookingViewModel

/**
 * Shows the 5 hard-coded bus cards. Selecting any card writes the bus into the shared
 * ViewModel and navigates forward; previously this was 5 nearly-identical click handlers
 * each passing 8 string extras.
 */
class BusSelectionFragment : Fragment() {

    private var _binding: BusSelectionPageBinding? = null
    private val binding get() = _binding!!

    private val vm: BookingViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BusSelectionPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vm.query.value?.let { q ->
            binding.tvPlace1.text = q.from
            binding.tvPlace2.text = q.to
            binding.tv3.text = q.date
        }

        binding.arrow1.setOnClickListener { findNavController().popBackStack() }

        // One handler per card, but extracted to a single helper.
        val cards = listOf(
            BusCardViews(binding.cv1, binding.cv1Tv1, binding.cv1Tv2, binding.cv1Tv3, binding.cv1Tv4, binding.cv1Tv5),
            BusCardViews(binding.cv2, binding.cv2Tv1, binding.cv2Tv2, binding.cv2Tv3, binding.cv2Tv4, binding.cv2Tv5),
            BusCardViews(binding.cv3, binding.cv3Tv1, binding.cv3Tv2, binding.cv3Tv3, binding.cv3Tv4, binding.cv3Tv5),
            BusCardViews(binding.cv4, binding.cv4Tv1, binding.cv4Tv2, binding.cv4Tv3, binding.cv4Tv4, binding.cv4Tv5),
            BusCardViews(binding.cv5, binding.cv5Tv1, binding.cv5Tv2, binding.cv5Tv3, binding.cv5Tv4, binding.cv5Tv5)
        )

        cards.forEach { card ->
            card.card.setOnClickListener {
                val bus = BusInfo(
                    operator = card.f1.text.toString(),
                    busType = card.f2.text.toString(),
                    departure = card.f3.text.toString(),
                    arrival = card.f4.text.toString(),
                    price = card.f5.text.toString()
                )
                vm.selectBus(bus)
                findNavController().navigate(R.id.action_selection_to_booking)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private data class BusCardViews(
        val card: CardView,
        val f1: android.widget.TextView,
        val f2: android.widget.TextView,
        val f3: android.widget.TextView,
        val f4: android.widget.TextView,
        val f5: android.widget.TextView
    )
}
