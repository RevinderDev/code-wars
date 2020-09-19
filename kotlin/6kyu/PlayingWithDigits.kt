import kotlin.math.pow

fun digPow(n: Int, p: Int): Int {
  // ...
    val str = n.toString();
    var result = 0.0;
    var power = p;
    for (digit in str) {
        result += Character.getNumericValue(digit).toDouble().pow(power)
        power++;
    }
    val s = result / n
    val t = result % s
    if (t == 0.0)
        return s.toInt()
    return -1
}
