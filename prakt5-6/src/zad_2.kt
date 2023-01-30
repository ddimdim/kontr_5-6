fun main(){
    try{
        while (true)
        {
            println("Введите число от 0 до 9")
            var num = readLine()!!.toInt()
            when (num){
                0 -> println("Ноль")
                1 -> println("Один")
                2 -> println("Два")
                3 -> println("Три")
                4 -> println("Четыре")
                5 -> println("Пять")
                6 -> println("Шесть")
                7 -> println("Семь")
                8 -> println("Восемь")
                9 -> println("Девять")
            }
            if (num>=0 && num<=9) break
        }
    }
    catch (e: Exception){
        println("Ошибка, можно вводить только числа")
    }
}