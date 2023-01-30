fun main(){
    try{
    println("Введите кол-во учеников")
    var st = readLine()!!.toInt()
    var i:Int=1
    var oc:Int = 0
    var p:Int = 0
    var ch:Int = 0
    var tr:Int = 0
    var dv:Int = 0
    var sum:Double = 0.0
    var sr:Double = 0.0
    var sum1:Int = 0
    while (st>=i){
        while (oc<=1 || oc>5){
            println("Введите оценку у " +i+ " ученика")
            var oc = readLine()!!.toInt()

            when (oc)
            {
                2 -> dv++
                3 -> tr++
                4 -> ch++
                5 -> p++
            }

            if (oc<=1 || oc>5) println("Можно ввести от 2 до 5")
            if(oc>1 && oc<=5){
                sum+=oc
                break
            }

        }
        oc = 0
        i++
        if (st+1==i){
            sr =  sum / st
            println("Средний балл:" +sr)
            if (sr>2 && sr<3)
            {
                sum1 = tr + ch + p
                println("Ученики, у которых оценка больше среднего балла " +sum1)
            }
            if (sr>3 && sr<4) {
                sum1 = ch + p
                println("Ученики, у которых оценка больше среднего балла " +sum1)
            }
            if (sr>4 && sr<5) {
                sum1 = p
                println("Ученики, у которых оценка больше среднего балла " +sum1)
            }
        }
    }
  }
    catch (e: Exception)
    {
        println("Ошибка, можно вводить только числа")
    }
}