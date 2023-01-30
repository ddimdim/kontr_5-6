fun main(){
    try{
    println("Введите число x")
    var a = readLine()!!.toDouble()
    var x:Double = 0.0
    if (a<5) x=Math.pow(a, 2.0)+ 15*a
    if (a>5 && a<=8) x = a-25
    if (a>8) x=(a+3)/10
    println(x)
    }
    catch (e: Exception)
    {
        println("Ошибка, можно вводить только числа")
    }
}