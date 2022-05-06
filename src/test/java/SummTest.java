import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummTest {
    Summa summa;

    @BeforeEach
    public void beforeEachMathod() {
        System.out.println("BeforeEach call");
        summa = new Summa();
    }

   @Test
   public void testSummPositive() {
       int a = 1;
       int b = 3;
       int c = 5;
       int expected = 9;

       int result = summa.sum(a, b, c);

       assertEquals(expected, result);
   }

   @Test
    public void testSummNegative() {
        int a = 5;
        int b = -4;
        int c = 2;
        int expected = 3;

        int result = summa.sum(a, b, c);

        assertEquals(expected, result);
   }
}
