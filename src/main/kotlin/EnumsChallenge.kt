// 4-05 Challenge Enum Classes - Starter

/*
Challenge - Transform SimpleDate into an Enum Class!
- Make it an Enum Class and call it `Month` instead of `SimpleDate`
- Turn that months array into the enum cases
- Get the monthsUntilJingleBells and monthsUntilHalloweenDecorations methods working again
- Write a new property named `season` with a custom getter that will return the season of the year
for each month. (Maybe model `Season` as another Enum Class?)
*/

enum class Season{
    Spring, Summer, Autumn, Winter;

}

enum class Month {
    January, February, March, April, May, June,
    July, August, September,October, November, December;

    val season: Season
        get() =
            when (this){
                December, January, February -> Season.Winter
                March, April, May -> Season.Spring
                June, July, August -> Season.Summer
                else ->  Season.Autumn
            }


    fun monthsUntilJingleBells(): Int {
        return December.ordinal - this.ordinal
    }
    fun monthsUntilHalloweenDecorations(): Int {
        val currentMonth = this.ordinal
        val halloweenStart = September.ordinal
        val halloweenEnd = October.ordinal

        return if (currentMonth in 0..halloweenStart) {
            halloweenStart - currentMonth
        } else if (currentMonth in halloweenStart..halloweenEnd) {
            0
        } else {
            halloweenStart + (12 - currentMonth)
        }
    }
}

fun main() {

    val month = Month.July
    println(month.season)

}