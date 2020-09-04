import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {

	public static int[][] matrixMultiplication(int[][] a, int[][] b) {
    var dblRes = Arrays.stream(a)
                .map(row -> IntStream.range(0, b[0].length)
                                .mapToDouble(i -> IntStream.range(0, row.length)
                                        .mapToDouble(j -> row[j] * b[j][i]).sum()).toArray()).toArray(double[][]::new);

		return Arrays.stream(dblRes).map(row -> Arrays.stream(row).mapToInt(num -> (int) num).toArray()).toArray(int[][]::new);
	}
}
