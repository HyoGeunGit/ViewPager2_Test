package template.android.hyogeuns.viewpager2_template


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPager2Adapter (private val views: Array<String>): RecyclerView.Adapter<ViewPager2Adapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder =
            viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_2test, parent, false))

    override fun getItemCount(): Int = views.size

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.viewName.text = views[position]
    }

    class viewHolder(view: View): RecyclerView.ViewHolder(view) {
        val viewName: TextView = view.findViewById(R.id.view_name)
    }
}