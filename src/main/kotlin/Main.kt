fun isPrime(x: Int): Boolean {
    for (i in 2..x-1)
    {
        if (x%i==0)
        {
            return false
        }
    }
    return true

}


fun sumaProstihDoN(n: Int): Int {
    var sumaProstih=2
    for (i in 3..n-1)
    {
        if(isPrime(i))
        {
            sumaProstih+=i
        }
    }
    return sumaProstih


}
fun stepenuj(baza: Int, eksponent: Int): Int {
    var rez=1
    if (eksponent==0)
    {
        return rez
    }
    else if (eksponent>0)
    {
        for (i:Int in 1..eksponent)
        {
            rez=rez*baza
        }
    }
    else
    {
        rez=-2
    }
    return rez

}

fun prebrojSamogl(recenica: String): Int {
    val samogoslici= listOf<Char>('a', 'e', 'i', 'o', 'u')
    var brojSamogsalnika=0
    var tmpRecenica=recenica.lowercase()
    for (znak:Char in tmpRecenica)
    {
        if (znak in samogoslici)
        {
            brojSamogsalnika++
        }
    }
    return brojSamogsalnika

}

fun main() {
    println("Unesite broj n")
    var n:Int= readLine()!!.toInt()
    val tmpS=sumaProstihDoN(n)
    println("Suma prostih je $tmpS")
    var s=stepenuj(2,2)
    println("Stepen je $s")
    var r="Ovo je recenica"
    val tmp=prebrojSamogl(r)
    println("$tmp")


}