import kotlin.jvm.JvmStatic

object Main {
    fun checkLuhn(cardNo: String): Boolean {
        val nDigits = cardNo.length
        var nSum = 0
        var isSecond = false
        for (i in nDigits - 1 downTo 0) {
            var d = cardNo[i] - '0'
            if (isSecond == true) d = d * 2
            nSum += d / 10
            nSum += d % 10
            isSecond = !isSecond
        }
        return nSum % 10 == 0
    }
    @JvmStatic
    fun main(args: Array<String>) {
        val cardNo = "79927398713"
        if (checkLuhn(cardNo)) println("This is a valid card") else println("This is not a valid card")
    }
}