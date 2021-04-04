package com.aanpenn.myactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    val list = mutableListOf<Employee>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<RecyclerView>(R.id.list)

        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        list.layoutManager = linearLayoutManager
        list.adapter = RecyclerviewAdapter(this , getDataFromServer())

    }


    fun getDataFromServer() : MutableList<Employee> {
        list.clear()
        
        // converting json to pojo using GSON library
        val employees : Employees = Gson().fromJson(Server.getDataFromServer() , Employees::class.java)

        try {
            // returning list , but if null returned it will crash and go to exception
            list.addAll(employees.employees?.toMutableList()!!)
            return list
        }catch (e : Exception){
            // here empty list is send if crashed
            return list
        }

    }

}