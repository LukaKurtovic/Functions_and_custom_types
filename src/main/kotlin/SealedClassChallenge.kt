// 4-07 Challenge Sealed Classes - Starter

/*
Challenge
Create a function that can take a `List` of `AcceptedCurrency` objects and the cost of an item
in Dollars, and return whether the user has sufficient funds in the list of currency objects
to pay for what they’re trying to buy.

Hint: Try a companion object!
*/

sealed class AcceptedCurrency1 {
    abstract val valueInDollars: Float
    var amount: Float = 0.0f

    class Dollar: AcceptedCurrency1() { override val valueInDollars = 1.0f }
    class Euro: AcceptedCurrency1() { override val valueInDollars = 1.25f }
    class Crypto: AcceptedCurrency1() { override val valueInDollars = 2534.92f }

    val name: String
        get() = when (this) {
            is Euro -> "Euro"
            is Dollar -> "Dollars"
            is Crypto -> "MeowCoin"
        }

    fun totalValueInDollars(): Float {
        return amount * valueInDollars
    }

    // Challenge
    companion object{
        fun isSufficient(acceptedCurrency: List<AcceptedCurrency1>, price: Float): Boolean{
            var total = 0.0
            for (currency in acceptedCurrency){
                total += (currency.amount * currency.valueInDollars)
            }
            return total > price
        }
    }


}

fun main() {
    val currency = AcceptedCurrency1.Crypto()
    currency.amount = .27541f

    val dollars = AcceptedCurrency1.Dollar()
    dollars.amount = 2000f

    val listOfCurrencies = listOf(currency, dollars)

    val isEnough = AcceptedCurrency1.isSufficient(listOfCurrencies, 5000f)
    println(isEnough)

}