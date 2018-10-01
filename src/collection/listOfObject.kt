package collection

class listOfObject {

    private val listOfBaju = mutableListOf<baju>()

    fun run() {
        //penambahan manual
        listOfBaju.add(baju("S", "Biru", true))
        listOfBaju.add(baju("M", "Merah", true))
        listOfBaju.add(baju("L", "Kuning", true))
        listOfBaju.add(baju("XL", "Hijau", false))
        listOfBaju.add(baju("XL", "Emas", false))

        //menambahkan dengan menggunakan perulangan FOR
        (0..5).forEach {
            val isLenganPanjang = (it.rem(2) == 0) // rem adalah hasil modulus, bilangan yang habis dibagi dua maka kita tentukan 0/false
            listOfBaju.add(baju("S", "Biru$it", isLenganPanjang))
        }

        //menghapus object berdasarkan kondisi menggunakan removeIF
        listOfBaju.removeIf {
            it.warna == "Biru"
        }

        val listLenganPanjang = listOfBaju.filter {
            it.isLenganPanjang //jika ingin false maka tinggal beri tanda seru menjadi !it.isLenganPanjang
        }
        listLenganPanjang.forEach { //output dari filtering mencari yang lengan panjang == true
            println(it)
        }

        //ini biar tampilannya bisa ENTER aja
        listOfBaju.forEach { baju ->
            println(baju)
        }

    }
}