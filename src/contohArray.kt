class contohArray {
    val empty = emptyArray<String>() //Array Kosongan bisa untuk diisi
    val kosongan = Array<String>(size = 5, init = {index -> "Item ke $index"}) // init artinya inisialisasi atau pemberian nilai

}