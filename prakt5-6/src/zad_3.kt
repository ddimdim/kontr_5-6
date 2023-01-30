import java.lang.Exception

fun main(){
    try {
        while (true) {
            println("Введите возраст")
            var age = readLine()!!.toInt()
            when (age) {
                in 0..2 -> println("Младенец")
                in 3..6 -> println("Дошкольник")
                in 7..17 -> println("Подросток")
                in 18..45 -> println("Взрослый")
                in 46..110 -> println("Пенсионер")

            }
            if (age >= 0 && age <= 110) break
            else println("Такого не может быть")
        }
    }
    catch (e: Exception)
    {
        println("Ошибка, можно вводить только числа")
    }
}