package recursion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RecursionExample {

    private static Logger logger = LogManager.getLogger(RecursionExample.class);

    public int factorial(int n) {
        logger.info(n);
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
