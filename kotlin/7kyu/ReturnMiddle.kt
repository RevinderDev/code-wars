package middle

fun getMiddle(word : String) : String {
    val middlePoint = word.length/2;
    return when {
        word.length % 2 == 0 -> word.substring(middlePoint - 1, middlePoint + 1)
        else -> word.substring(middlePoint, middlePoint + 1)
    }
}
