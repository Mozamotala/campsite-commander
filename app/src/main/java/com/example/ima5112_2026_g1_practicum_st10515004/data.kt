package com.example.ima5112_2026_g1_practicum_st10515004

class data {
    private var items = Array(10) { "" } //specifes the size of  the array and the type of data it will store
    private var comments = Array(10) { "" }
    private var quantities = IntArray(10)
    private var catagories = Array(10){""}
    private var count = 0


    fun addData(item: String, comment: String, quantity: Int, catagory: String) { //this is how i stored the data in my arrays
        items[count] = item
        comments[count] = comment
        quantities[count] = quantity
        catagories[count] = catagory
        count++//helps me count how many items are in the array
    }

    fun getCount(): Int {
        return count
    }
    fun getTotal(): Int {//this is  how i calculated the total quantity of the items
        var total = 0
        for (i in 0 until count) {
            total += quantities[i]
        }
        return total
    }

    fun getData(): String { //moves the stored data to the details page
        var data = ""
        for (i in 0 until count) {
            data += "Item: " + items[i] + "\n" + "Comment: " + comments[i] + "\n" + "Quantity: " + quantities[i] + "\n" + "Catagory: " + catagories[i]
        }
return data
    }

}
