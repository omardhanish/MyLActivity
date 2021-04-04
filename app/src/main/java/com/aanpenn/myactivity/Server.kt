package com.aanpenn.myactivity

object Server {


    fun getDataFromServer() : String {
        return "{\n" +
                "  \"Employees\": [\n" +
                "    {\n" +
                "      \"userId\": \"krish\",\n" +
                "      \"jobTitle\": \"Developer\",\n" +
                "      \"firstName\": \"Krish\",\n" +
                "      \"lastName\": \"Lee\",\n" +
                "      \"employeeCode\": \"E1\",\n" +
                "      \"region\": \"CA\",\n" +
                "      \"phoneNumber\": \"123456\",\n" +
                "      \"emailAddress\": \"krish.lee@learningcontainer.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"userId\": \"devid\",\n" +
                "      \"jobTitle\": \"Developer\",\n" +
                "      \"firstName\": \"Devid\",\n" +
                "      \"lastName\": \"Rome\",\n" +
                "      \"employeeCode\": \"E2\",\n" +
                "      \"region\": \"CA\",\n" +
                "      \"phoneNumber\": \"1111111\",\n" +
                "      \"emailAddress\": \"devid.rome@learningcontainer.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"userId\": \"tin\",\n" +
                "      \"jobTitle\": \"Program Directory\",\n" +
                "      \"firstName\": \"tin\",\n" +
                "      \"lastName\": \"jonson\",\n" +
                "      \"employeeCode\": \"E3\",\n" +
                "      \"region\": \"CA\",\n" +
                "      \"phoneNumber\": \"2222222\",\n" +
                "      \"emailAddress\": \"tin.jonson@learningcontainer.com\"\n" +
                "    }\n" +
                "  ]\n" +
                "}"
    }

}