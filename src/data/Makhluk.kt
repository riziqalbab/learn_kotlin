package data.data

interface Makhluk {
    var nama: String
    var jenis: String

    fun halo(){
        println("Halo $nama")
    }
}