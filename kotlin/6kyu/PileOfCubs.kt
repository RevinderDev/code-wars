package solution
import kotlin.math.pow

object ASum {

    fun findNb(m: Long): Long {
        // your code
        var i = 0.0;
        var n = 0.0;
        while(n < m)
        {
            n += (i).pow(3);
            if(n.toLong() == m)
                return i.toLong();
            i++;
        }
        return -1;
    }
}
