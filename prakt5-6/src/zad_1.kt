import java.lang.Exception

fun main() {
    try{
        println("Введите 1-ое число")
        var a = readLine()!!.toDouble()
        println("Введите 2-ое число")
        var b = readLine()!!.toDouble()
        if (a>b) a++
        if (b>a) b++
        else a = Math.pow(a, 3.0)
        println("Числа после изменений: " +a+ "   " +b )
    }
    catch (e:Exception){
        println("Ошибка, можно вводить только числа")
    }


}