package com.aanpenn.myactivity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Employee {
    @SerializedName("userId")
    @Expose
    var userId: String? = null

    @SerializedName("jobTitle")
    @Expose
    var jobTitle: String? = null

    @SerializedName("firstName")
    @Expose
    var firstName: String? = null

    @SerializedName("lastName")
    @Expose
    var lastName: String? = null

    @SerializedName("employeeCode")
    @Expose
    var employeeCode: String? = null

    @SerializedName("region")
    @Expose
    var region: String? = null

    @SerializedName("phoneNumber")
    @Expose
    var phoneNumber: String? = null

    @SerializedName("emailAddress")
    @Expose
    var emailAddress: String? = null
}