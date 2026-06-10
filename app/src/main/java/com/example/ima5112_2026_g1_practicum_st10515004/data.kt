package com.example.ima5112_2026_g1_practicum_st10515004

class data {
    private var items = Array(10) { "" }
    private var comments = Array(10) { "" }
    private var quantities = IntArray(10)
    private var catagories = Array(10){""}
    private var count = 0


    fun addData(item: String, comment: String, quantity: Int, catagory: String) {
        items[count] = item
        comments[count] = comment
        quantities[count] = quantity
        catagories[count] = catagory
        count++
    }

    fun getCount(): Int {
        return count
    }
    fun getTotal(): Int {
        var total = 0
        for (i in 0 until count) {
            total += quantities[i]
        }
        return total
    }

    fun getData(): String {
        var data = ""
        for (i in 0 until count) {
            data += "Item: " + items[i] + "\n" + "Comment: " + comments[i] + "\n" + "Quantity: " + quantities[i] + "\n" + "Catagory: " + catagories[i]
        }
return data
    }

}
