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

class CategoryActivity: AppCompatActivity(R.layout.activity_products_categories) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        category_recycler_view.layoutManager = LinearLayoutManager(this)
        category_recycler_view.adapter = CategoryAdapter(this)

    }

}
