package com.juhwan203.containerrecyclerview

import androidx.recyclerview.widget.RecyclerView
import com.juhwan203.containerrecyclerview.databinding.ItemRecyclerBinding
import java.text.SimpleDateFormat
import java.util.logging.SimpleFormatter

class CustomAdapter {
}

class  Holder(val binding: ItemRecyclerBinding): RecyclerView.ViewHolder(binding.root) {
    fun setMemo(memo: Memo){
        binding.textNo.text = "${memo.no}"
        binding.textTitle.text = memo.title
        var sdf = SimpleDateFormat("yyyy/mm/dd")
        var formattedDate = sdf.format((memo.timestamp))
        binding.textDate.text = formattedDate
    }
}