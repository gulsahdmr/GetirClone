package com.example.getirarayuz

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryViewAdapter(var mcontext: Context, var categoryviewlist: List<CategoryViewModel>) :
    RecyclerView.Adapter<CategoryViewAdapter.CategoryViewBindingHolder>() {


    inner class CategoryViewBindingHolder(view: View) : RecyclerView.ViewHolder(view) {
        var categoryName: TextView
        var categoryImage: ImageView

        init {
            categoryName = view.findViewById(R.id.categoryName)
            categoryImage = view.findViewById(R.id.categoryImage)
        }
    }

    override fun onCreateViewHolder(   // binding tanımlaması yapılır.
        parent: ViewGroup,
        viewType: Int
    ): CategoryViewAdapter.CategoryViewBindingHolder {
        val binding = LayoutInflater.from(mcontext).inflate(R.layout.category_view, parent, false)
        return CategoryViewBindingHolder(binding)
    }

    override fun onBindViewHolder(
        holder: CategoryViewAdapter.CategoryViewBindingHolder, position: Int) {
        val category = categoryviewlist[position]
        holder.categoryName.text = category.categoryname
        holder.categoryImage.setImageResource(
            category.categoryImage
        )
    }

    override fun getItemCount(): Int {
        return categoryviewlist.size
    }


}