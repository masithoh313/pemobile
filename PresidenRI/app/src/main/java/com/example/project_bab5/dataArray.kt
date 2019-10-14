package com.example.presidenri

import getset //untuk meng import kelas Getsetarray

object dataArray {
    //untuk menampung data array

    //muntuk mendeklarasikan listOf()string
    private val languages = listOf("Soekarno","Syafrudin", "Asaat","Soeharto", "Habibie", "Gusdur", "Megawati","Susilo Bambang Yudhoyono","Jokowi WiDodo")

    val desk = listOf( // untuk mengisi listOF pada variabel desk atau deskripsi
        "Soekarno adalah presiden ke 1 di indonesia",
        "Syafrudin adalah perdana menteri Indonesia sebelum merdeka",
        "Asaat adalah presiden cadangan saat RI menjadi RIS",
        "Soeharto adalah presiden ke 2  di indonesia",
        "Habibie adalah presiden ke 3 di indonesia",
        "Gusdur adalah presiden ke 4 di indonesia",
        "Megawati Soekarno putri adalah presiden ke 5 di indonesia",
        "Susilo Bambang Yudhoyono adalah presiden ke 6 & 7 di indonesia",
        "Jokowi widodo adalah presiden ke 8 & 9 di indonesia"
    )

    private val pictDat = intArrayOf( //untuk mendeklarasikan gambar harus menggunakan IntArrayOf()
        R.drawable.bung_karno,//untuk memanggil gambar pada drawlable
        R.drawable.syafrudin,
        R.drawable.asaat,
        R.drawable.habibie,
        R.drawable.soeharto,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listData: ArrayList<getset> //mengoper data pada class GetSetArray
        get() {
            val list = arrayListOf<getset>()  //mendeklarasikan data array sebagai list
            for (position in languages.indices) { //perulangan untuk mengisi data ke GetSetArray
                val listDat = getset()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list //mengembalikan data untuk mengirim ke GetSetArray
        }
}