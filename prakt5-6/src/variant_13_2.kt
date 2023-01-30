fun main(){
    try{
    println("Введите 1-ое число")
    var a = readLine()!!.toDouble()
    println("Введите 2-ое число")
    var b = readLine()!!.toDouble()
    a/=10
    b/=10
    if((a>=1 && a<10 || a<=-1 && a>-10) && b>-1 && b<1) println("Условие соблюдено")
    else println("условие не соблюдено")
    }
    catch (e: Exception)
    {
        println("Ошибка, можно вводить только числа")
    }
}