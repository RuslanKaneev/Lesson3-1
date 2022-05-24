fun main(args: Array<String>) {
    println(agoToText(1u))
    println(agoToText(61u))
    println(agoToText(121u))
    println(agoToText(361u))
    println(agoToText(3601u))
    println(agoToText(7201u))
    println(agoToText(18001u))
    println(agoToText(86401u))
    println(agoToText(172801u))
    println(agoToText(259201u))
}

fun agoToText(time: UInt): String {
    return when (time) {
        in 0u..60u -> "только что"
        in 61u..3600u -> minutConvert(time)
        in 3601u..86400u -> hourConvert(time)
        in 86401u..172800u -> "сегодня"
        in 172801u..259200u -> "вчера"
        else -> "давно"
    }
}

fun minutConvert(time: UInt): String {
    return when (val minut: UInt = time / 60u) {
        1u, 21u, 31u, 41u, 51u -> "$minut минуту назад."
        in 2u..4u, in 12u..14u, in 22u..24u, in 32u..34u, in 42u..44u, in 52u..54u -> "$minut минуты назад."
        else -> "$minut минут назад."
    }

}

fun hourConvert(time: UInt): String {
    return when (val hour: UInt = time / 3600u) {
        1u, 21u, 31u, 41u, 51u -> "$hour час назад."
        in 2u..4u, in 12u..14u, in 22u..24u, in 32u..34u, in 42u..44u, in 52u..54u -> "$hour часа назад."
        else -> "$hour часов назад."
    }

}