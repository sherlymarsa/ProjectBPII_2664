package com.example.project2664

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FairyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FairyFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fairy, container, false)
        val rvBuku: RecyclerView = view.findViewById(R.id.recycleViewBook)

        // Set layout manager di RecyclerView
        rvBuku.layoutManager = LinearLayoutManager(requireContext())

        // List data buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book11, "When Do Hippos Play", "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))
        data.add(BukuModel(R.drawable.book12, "Charlottes Web'", "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))
        data.add(BukuModel(R.drawable.book13, "Good Habits", "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))
        data.add(BukuModel(R.drawable.book14, "Good HabitsII", "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))
        data.add(BukuModel(R.drawable.book15, "Good Habits For Kids", "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))
        data.add(BukuModel(R.drawable.book16, "The Calm Work Book", "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))

        //        set adapter
        val adapter = AdapterFragmentFairy(data)
//        set adapater ke recycle view
        rvBuku.adapter = adapter

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FairyFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FairyFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}