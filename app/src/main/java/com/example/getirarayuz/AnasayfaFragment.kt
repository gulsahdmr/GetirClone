package com.example.getirarayuz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getirarayuz.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private var _binding: FragmentAnasayfaBinding? = null
    private val binding get() = _binding!!

    private var pageViewList: ArrayList<PageViewModel> = ArrayList()

    private lateinit var adapter: PageViewAdapter
    private lateinit var categoryAdapter: CategoryViewAdapter
    private val adress = ArrayList<String>()
    private lateinit var adressAdapter: ArrayAdapter<String>
    private var categoryViewList: ArrayList<CategoryViewModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.categoryviewRv.layoutManager =
            StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)
        binding.pageviewRv.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        adress.add("Ev,Özgürlük Mahallesi.....")
        adress.add("Atatürk Mahallesi.....")
        adress.add("Kabaoğlu mahallesi.....")

        adressAdapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            adress
        )
        binding.spinner.adapter = adressAdapter

        val c1 = CategoryViewModel("Süper İkili", R.drawable.im_super)
        val c2 = CategoryViewModel("İndirimler", R.drawable.im_discount)
        val c3 = CategoryViewModel("Yeni ürünler", R.drawable.im_new_product)
        val c4 = CategoryViewModel("Su & İçecek", R.drawable.im_drink)
        val c5 = CategoryViewModel("Meyve & S..", R.drawable.im_fruit_vegetable)
        val c6 = CategoryViewModel("Fırından", R.drawable.im_bakery)
        val c7 = CategoryViewModel("Temel Gıda", R.drawable.im_basic_food)
        val c8 = CategoryViewModel("Atıştırmalık", R.drawable.im_snack)
        val c9 = CategoryViewModel("Dondurma", R.drawable.im_ice_cream)
        val c10 = CategoryViewModel("Süt Ürünleri", R.drawable.im_milk_products)
        val c11 = CategoryViewModel("Kahvaltılık", R.drawable.im_breakfast)
        val c12 = CategoryViewModel("Yiyecek", R.drawable.im_food)
        val c13 = CategoryViewModel("Fit & Form", R.drawable.im_fit_form)
        val c14 = CategoryViewModel("Kişisel Bakım", R.drawable.im_personal_care)
        val c15 = CategoryViewModel("Ev bakım", R.drawable.im_care)
        val c16 = CategoryViewModel("Ev & Yaşam", R.drawable.im_life)
        val c17 = CategoryViewModel("Teknoloji", R.drawable.im_technology)
        val c18 = CategoryViewModel("Evcil Hayvan", R.drawable.im_pet)
        val c19 = CategoryViewModel("Bebek", R.drawable.im_baby)
        val c20 = CategoryViewModel("Cinsel Sağlık", R.drawable.im_sexual)

        val onboard1 = PageViewModel( R.drawable.im_board_free, "promo")
        val onboard2 = PageViewModel(R.drawable.im_board_getir, "promo")
        val onboard3 = PageViewModel(R.drawable.im_board_iphone, "promo")

        pageViewList.add(onboard1)
        pageViewList.add(onboard2)
        pageViewList.add(onboard3)

        adapter = PageViewAdapter(requireContext(), pageViewList)
        categoryAdapter = CategoryViewAdapter(requireContext(), categoryViewList)
        binding.categoryviewRv.adapter = categoryAdapter
        binding.pageviewRv.adapter = adapter
        categoryViewList.add(c1)
        categoryViewList.add(c2)
        categoryViewList.add(c3)
        categoryViewList.add(c4)
        categoryViewList.add(c5)
        categoryViewList.add(c6)
        categoryViewList.add(c7)
        categoryViewList.add(c8)
        categoryViewList.add(c9)
        categoryViewList.add(c10)
        categoryViewList.add(c11)
        categoryViewList.add(c12)
        categoryViewList.add(c13)
        categoryViewList.add(c14)
        categoryViewList.add(c15)
        categoryViewList.add(c16)
        categoryViewList.add(c17)
        categoryViewList.add(c18)
        categoryViewList.add(c19)
        categoryViewList.add(c20)


        return view

    }

}