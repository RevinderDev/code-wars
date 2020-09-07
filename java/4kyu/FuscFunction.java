public class Fusc {

  public static BigInteger fuscWithF(BigInteger n) {
      return F(n, BigInteger.ONE, BigInteger.ZERO);
  }
  public static BigInteger F(BigInteger n, BigInteger a, BigInteger b) {
      if (n.equals(BigInteger.ZERO))
          return b;
      var aPlusB = a.add(b);
      if (n.equals(BigInteger.ONE))
          return aPlusB;
      var nDivided = n.divide(BigInteger.TWO);
      boolean isEven = n.mod(BigInteger.TWO).equals(BigInteger.ZERO);
      return isEven ? F(nDivided, aPlusB, b) : F(nDivided, a, aPlusB);
  }



  static Map<BigInteger, BigInteger> cache = new HashMap<>();

  public static BigInteger fuscCached(BigInteger n) {
      if (cache.containsKey(n))
          return cache.get(n);

      if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE))
          return n;

      boolean isEven = n.mod(BigInteger.TWO).equals(BigInteger.ZERO);
      var division = n.divide(BigInteger.TWO);
      var val = isEven ? fuscCached(division) : fuscCached(division).add(fuscCached(division.add(BigInteger.ONE)));
      cache.put(n, val);
      return val;
  }

  public static BigInteger fuscLooped(BigInteger n) {
    if (n.equals(BigInteger.ZERO)) {
        return n;
    }
    var a = BigInteger.ONE;
    var b = BigInteger.ZERO;
    while (n.compareTo(BigInteger.ZERO) > 0) {
        var modVal = n.mod(BigInteger.TWO);
        if (modVal.equals(BigInteger.ZERO)) {
            a = a.add(b);
            n = n.divide(BigInteger.TWO);
        } else {
            n = n.subtract(BigInteger.ONE).divide(BigInteger.TWO);
            b = b.add(a);
        }
    }
    return b;
}

}
