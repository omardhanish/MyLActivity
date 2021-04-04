package com.aanpenn.myactivity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Employees {
    @SerializedName("Employees")
    @Expose
    var employees: List<Employee>? = null
}