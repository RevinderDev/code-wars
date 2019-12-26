public class NumberFun {
  public static long findNextSquare(long sq) {
      double squareRootedArgument = Math.sqrt(sq);
      if(squareRootedArgument % 1 != 0)
        return -1;
      Long nextSquare = (long) squareRootedArgument + 1;
      return nextSquare * nextSquare; 
  }
}