package ie.dorset.student_22711.onlineshoppingapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_products_categories.*

class CategoriesActivity: AppCompatActivity(R.layout.activity_products_categories) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        category_recycler_view.layoutManager = LinearLayoutManager(this)
        category_recycler_view.adapter = CategoryAdapter()

//        getString(R.string.template_category_content)
    }
}
class CategoryAdapter:RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.template_category, parent, false)
        return CategoryViewHolder(view)
    }

// class CategoryAdapter(private val context: Context): RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
//       val inflater: LayoutInflater = LayoutInflater.from(parent.context)
//        val view = inflater.inflate(R.layout.template_category, parent, false)
//        return CategoryViewHolder(view)
//  }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
//   val categoryContent = holder.itemView.findViewById<TextView>(R.id.category_content)
//        if (position == 3){
//            categoryContent.text = context.getString(R.string.template_category_content, position) + position.toString()
//        }
    }

    override fun getItemCount(): Int {
        return 4
    }


    class CategoryViewHolder(v: View) : RecyclerView.ViewHolder(v) {}
}
