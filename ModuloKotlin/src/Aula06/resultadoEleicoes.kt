package Aula06

fun main(args: Array<String>) {
    println("Qual o melhor Sistema Operacional para uso em servidores?")
    println(
            "As possíveis respostas são:\n" +
                    "1- Windows Server\n" +
                    "2- Unix\n" +
                    "3- Linux\n" +
                    "4- Netware\n" +
                    "5- Mac OS\n" +
                    "6- Outro",
    )
    println("Use somente os números acima!")

    val urna: ArrayList<Int> = arrayListOf<Int>()
    do {
        print("informe um voto válido ou 0 pra parar a votação: ")
        val voto: Int = readLine()!!.toInt()
        if (voto == 0) break
        urna.add(voto)

    } while (true)

    val total: Int = urna.size

    var WS: Int = 0 // windows server
    var U: Int = 0 //  unix
    var linux: Int = 0 //  linux
    var netware: Int = 0 //netware
    var macOS: Int = 0 //macOS
    var outros: Int = 0 //outros

    var maior = Int.MIN_VALUE

    for (i in 0 until total) {
        if (urna[i] == 1) {
            WS++
            if (WS > maior) maior = WS
        }
        if (urna[i] == 2) {
            U++
            if (U > maior) maior = U
        }
        if (urna[i] == 3) {
            linux++
            if (linux > maior) maior = linux
        }
        if (urna[i] == 4) {
            netware++
            if (netware > maior) maior = netware
        }
        if (urna[i] == 5) {
            macOS++
            if (macOS > maior) maior = macOS
        }
        if (urna[i] == 6) {
            outros++
            if (outros > maior) maior = outros
        }

    }
    val percentWS: Float = (WS.toFloat() / total.toFloat()) * 100F
    val percentU: Float = (U.toFloat() / total.toFloat()) * 100F
    val percentLinux: Float = (linux.toFloat() / total.toFloat()) * 100F
    val percentNetware: Float = (netware.toFloat() / total.toFloat()) * 100F
    val percentMacOS: Float = (macOS.toFloat() / total.toFloat()) * 100F
    val percentOutros: Float = (outros.toFloat() / total.toFloat()) * 100F


    println(
            """
        Sistema Operacional Votos %
        ------------------- ----- ---
        Windows Server      $WS ${percentWS}%
        Unix                $U ${percentU}%
        Linux               $linux ${percentLinux}%
        Netware             $netware ${percentNetware}%
        Mac OS              $macOS ${percentMacOS}%
        Outro               $outros ${percentOutros}%
        ------------------- -----
        Total               $total
        
    """.trimIndent(),
    )
    println("Sistema Operacional mais votado foi o de número $maior")

}