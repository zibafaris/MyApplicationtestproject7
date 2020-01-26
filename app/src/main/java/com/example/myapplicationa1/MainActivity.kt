package com.example.myapplicationa1
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Initializing an empty ArrayList to be filled with name
    private val list: ArrayList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button3 = button3
        addList()

        // Creates a vertical Layout Manager
        rv_name_list.layoutManager = LinearLayoutManager(this)
//        rv_name_list.layoutManager = GridLayoutManager(this, 2)

        // Access the RecyclerView Adapter and load the data into it
        rv_name_list.adapter = ListAdapter(list, this)

        button3.setOnClickListener(View.OnClickListener {
            val drawerLayout = drawer_layout
            drawerLayout.openDrawer(GravityCompat.START)
            val toast = Toast.makeText(applicationContext, "Open Drawer", Toast.LENGTH_SHORT)
            toast.show()
        })

    }

    // Adds name to the empty name ArrayList
    private fun addList() {
        list.add("name")
        list.add("family")
        list.add("card number")
        list.add("nationality")
        list.add("gender")
        list.add("name")
        list.add("family")
        list.add("card number")
        list.add("nationality")
        list.add("gender")
        list.add("name")
        list.add("family")
        list.add("card number")
        list.add("nationality")
        list.add("gender")


    }
}
