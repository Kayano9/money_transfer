fun main() {
    val amount = 12513652
    val comission = 0.75
    val minimumComission = 3500
    val calculation = (amount * comission) / 100
    val result = if (calculation.toInt() < minimumComission) minimumComission else calculation.toInt()
    println ("Ваша комиссия: " + result + " коп.")

}