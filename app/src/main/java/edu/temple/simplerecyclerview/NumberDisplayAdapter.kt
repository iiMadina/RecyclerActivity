package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// adapter, recycling is done by the methods themselves
class NumberDisplayAdapter(private val numbers: IntArray) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    // creates views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = NumberViewHolder(
            // returns the object itself
            TextView(parent.context).apply {
                setPadding(5,5,5, 5)
            }
    )
    /* longer way to do the same thing:
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            TextView(parent.context).apply {
                setPadding(5,5,5, 5)
            }
        )
    }*/

    override fun getItemCount(): Int {
        return numbers.size
    }

    // populates the screen with the view
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = numbers[position].toString()
        holder.textView.textSize = numbers[position].toFloat()
    }
}