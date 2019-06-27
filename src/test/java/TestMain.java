import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {


    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, Main.comp(a, b));
    }

    @Test
    public void test2() {
        int[] a = new int[]{2,2,3};
        int[] b = new int[]{9,9,4};
        assertEquals(false, Main.comp(a, b));
    }



}
