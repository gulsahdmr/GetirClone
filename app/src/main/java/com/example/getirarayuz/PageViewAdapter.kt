package com.example.getirarayuz

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.getirarayuz.databinding.PageViewBinding

class PageViewAdapter (var mContext:Context, var  pageViewList:List<PageViewModel>) : RecyclerView.Adapter<PageViewAdapter.PageViewBindingHolder>(){
     inner class PageViewBindingHolder(view: View):RecyclerView.ViewHolder(view){
         var imageview: ImageView
         init {
             imageview = view.findViewById(R.id.pageViewImage)
         }

     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageViewBindingHolder {
         val binding = LayoutInflater.from(mContext).inflate(R.layout.page_view,parent,false)
         return PageViewBindingHolder(binding)

     }

     override fun getItemCount(): Int {
        return pageViewList.size
     }

     override fun onBindViewHolder(holder: PageViewBindingHolder, position: Int) {
val model = pageViewList[position]
         holder.imageview.setImageResource(
             model.ımagepath
         )
     }


 }