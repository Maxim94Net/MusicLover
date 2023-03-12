fun main() {
    val purchaseAmount =100000
    val statusShopper = true
    val discount1 = (purchaseAmount - 100)  //1000 до 10000  -100р
    val discount2 = purchaseAmount - (purchaseAmount * 0.05) // от 10000 тыс -5%
    var regularShopper =   purchaseAmount - (purchaseAmount * 0.01)  // -1 %
    if (purchaseAmount > 1000 && purchaseAmount <= 10000) {
        regularShopper = discount1 - (discount1 * 0.01)
    } else if (purchaseAmount > 10000) {
        regularShopper = discount2 - (discount2 * 0.01)
    }
    var newShopper = purchaseAmount
    if (purchaseAmount > 1000 && purchaseAmount <= 10000) {
        newShopper = discount1
    } else if (purchaseAmount > 10000) {
        newShopper = discount2.toInt()
    }
    val finalAmount = if (statusShopper) regularShopper else  newShopper
    println("Итого,с учётом скидки сумма к оплате: $finalAmount руб")
}