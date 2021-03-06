// 4-04 Enum Classes & When - Final

enum class DayOfTheWeek1(val isWeekend: Boolean = false) {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday(true),
    Sunday(true);

    fun daysUntil(other: DayOfTheWeek1): Int {
        if (this.ordinal < other.ordinal) {
            return other.ordinal - this.ordinal
        } else {
            return other.ordinal - this.ordinal + DayOfTheWeek1.values().count()
        }
    }
}

fun main() {
    val today = DayOfTheWeek1.Tuesday

    fun singAboutToday(today: DayOfTheWeek1) {
        when (today) {
//      DayOfTheWeek.Monday -> println("I don't care if $today's blue")
//      DayOfTheWeek.Tuesday -> println("$today's gray")
//      DayOfTheWeek.Wednesday -> println("And $today, too")
//      DayOfTheWeek.Thursday -> println("$today, I don't care 'bout you")
            DayOfTheWeek1.Friday -> println("It's $today, I'm in love")
//      DayOfTheWeek.Saturday -> println("$today, Wait...")
//      DayOfTheWeek.Sunday -> println("$today always comes too late")
        }
    }

    for (day in DayOfTheWeek1.values()) {
        singAboutToday(day)
    }
}