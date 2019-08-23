import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*

fun main(args : Array<String>)  {
        hasilbadan()
}
fun hasilbadan () {

    var scan = Scanner(System.`in`)
    println("jumlah siswa ")
    var siswa = scan.nextInt()
    var nama = StringArray()
    var nomer = IntArray(10)
    do {
        println("==== sorting ======")
        println("1. masukkan daftar diri anda")
        println("2. urutkan pengunjung")
        var pilih = scan.nextInt()
        if (pilih == 1) {
            for (p in 1..siswa) {
                println("masukkan nama")
                nama.add(scan.next())
                println("masukkan nomer")
                nomer[p] = (scan.nextInt())
            }
        } else if (pilih == 2) {
            var sisa = nomer.size
            for (p in 1..siswa) {
                for (g in p..siswa) {
                    if (nomer[g] < nomer[g + 1]) {
                        var temp = nomer[g+1]
                        nomer[g] = nomer[g+1]
                        nomer[g] = temp
                        println(nama[g])
                        println(nomer[g])
                    }
                }
            }
        }
    } while (pilih == 1 || pilih == 2)

}




