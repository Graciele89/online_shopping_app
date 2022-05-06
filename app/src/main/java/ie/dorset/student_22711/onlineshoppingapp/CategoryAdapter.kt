package ie.dorset.student_22711.onlineshoppingapp


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//class CategoryAdapter: RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
//        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
//        val view = inflater.inflate(R.layout.template_category, parent, false)
//        return CategoryViewHolder(view)
//    }

 class CategoryAdapter(private val context: Context): RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
       val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.template_category, parent, false)
        return CategoryViewHolder(view)
  }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
//   val categoryContent = holder.itemView.findViewById<TextView>(R.id.category_content)
//        if (position == 3){
//            categoryContent.text = context.getString(R.string.template_category_content, position)
//        }
    }

    override fun getItemCount(): Int {
        return 4
    }
}


