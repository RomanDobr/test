import org.junit.jupiter.api.Test;

public class CalcTest {

    private Calc calc = new Calc();
    @Test
    public void test() {
       int result = calc.add(2, 3);
       if (result != 5) {
           throw new RuntimeException("Ошибка");
       }
    }

}
