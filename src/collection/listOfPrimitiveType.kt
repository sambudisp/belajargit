package collection

class listOfPrimitiveType {

private val stringList = mutableListOf<String>()     //hanya bisa menampung string dilihat dari genericnya atau dalam kurung lancip itu
private val intList = mutableListOf<Int>() //hanya bisa menampug int dilihat dari genericnya atau dalam kurung lancip itu

    //menampilkan data
    fun cetakDataString(){
        println("List data string : ${stringList}")
    }

    fun cetakDataInteger(){
        println("List data integer : ${intList}")
    }

    //yang dipanggil ke Main
    fun hasilRunning() {
        stringList.add("Sambudi") //memaskan data satu per satu pakai Add aja
        stringList.add("Supri")

        stringList.addAll(listOf("A", "B", "C", "A", "A")) //memasukan data langsung banyak pakai AddAll-listOf
        stringList.addAll(listOf("D", "E", "F", "G", "H"))

        cetakDataString() //output

        //primitiveList.stringList.replaceAll{"Replace"} //untuk mereplace

        stringList.removeAt(0)

        stringList.remove("A")

        stringList.removeIf {
            it == "F"
        }
        stringList.removeIf {
            //menghapus data yang mengandung huruf h kecil
            it.contains("h")
        }
        stringList.removeIf {
            //mengubah huruf H-nya menjadi kecil semua, lalu menghapus huruf kecil tersebut
            it.toLowerCase().contains("h") //sebenernya sama aja jika menggunakan logika IF OR
        }

        //mencari data
        val nama = stringList.find { it == "A" } //hanya sampai menemukan 1 data, satu iterasi
        println("Nama : $nama")

        //mengubah data di index tertentu
        stringList.set(0, "Lala") // bisa juga ditulis seperti ini primitiveList.stringList[0]= "Lala")

        //menyaring atau memunculkan data berdasarkan kondisi tertentu
        //dimasukan ke variable karena datanya mau kita munculkan di variabel baru, kalau engga juga ngga ngga papa, tergantung kebutuhan kita gimana
        val stringListBaru = stringList.filter {
            it.toLowerCase().contains("a")
        }
        println("Filter : $stringListBaru")
        //mengubah data dari Old ke New
        val stringListTransform = stringList.map {
            it.toLowerCase().replace("a", "C")
        }
        println("Transform : $stringListTransform")

        cetakDataString()
    }
}

