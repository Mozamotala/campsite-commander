package com.example.ima5112_2026_g1_practicum_st10515004

class data {
    private var items = Array(7) { "" }
    private var comments = Array(7) { "" }
    private var quantities = IntArray(7)
    private var catagories = IntArray(7)
    private var count = 0


    fun addData(item: String, comment: String, quantity: Int, catagory: Int) {
        items[count] = item
        comments[count] = comment
        quantities[count] = quantity
        catagories[count] = catagory
        count++
    }

    fun getCount(): Int {
        return count
    }

    fun getData(): String {
        var data = ""
        for (i in 0 until count) {
            data += "Item: " + items[i] + "\n" + "Comment: " + comments[i] + "\n" + "Quantity: " + quantities[i] + "\n" + "Catagory: " + catagories[i]
        }
return data
    }

}
