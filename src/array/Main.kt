package array

import java.util.*

fun main(args: Array<String>){
    println("Textnya")

    val contoharray = contohArray()
    val kosongan = contoharray.kosongan

    println("Data Array nya : " + Arrays.toString(kosongan)) //menampilkan data array
    println("Jumlah data :  ${kosongan.size}") //menampilkan jumlah data

    for (a in kosongan){
        println("For-Data : $a") //perulangan pada array
    }

    kosongan.forEach {
        println("Data : $it")
    }

    kosongan.forEachIndexed { index, s ->
        println("Data ke-$index adalah $s")
    }

    //perulangan pada array
    kosongan.forEachIndexed { index, s ->
        println("A. Data ke- ${index.plus(1)} adalah $s")
        println("B. Data ke- ${index.inc()} adalah $s")
    }

    //Menampilkan data array berdasarkan ke index tertentu
    println("Data index ke2 : ${kosongan[1]}")

    //Mengubah nilai array pada index tertentu
    kosongan[3] = "Value baru"
    println("Data baru index ke-2 : ${kosongan[3]}")

    //Array isi data langsung
    val arrayData = intArrayOf(1,2,3,4) //<-- ini isi data arraynya
    println("Data Array : ${Arrays.toString(arrayData)}")

    //Ekstensi
    val nama2 =  arrayOf("A", "C", "D", "Nama", "Serahan")
    println("Nama : ${Arrays.toString(nama2)}")

    nama2.sortBy { it }
    println("Sort Ascending : ${nama2}") //dibuat 2 output karena tidak dapat menampung secara langsung

    nama2.sortByDescending { it }
    println("Sort Descending : ${nama2}") //dibuat 2 output karena tidak dapat menampung secara langsung

}