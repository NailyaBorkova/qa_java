import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineTestGetKittensWithParam {
    Feline feline = new Feline();
    private int inputParam;
    private int outParam;

    public FelineTestGetKittensWithParam(int inputParam, int outParam) {
        this.inputParam = inputParam;
        this.outParam = outParam;

    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] kittens() {
        return new Object[][]{
                {1, 1},
                {0, 0},
                {3, 3},
                {7, 7},
        };
    }

    @Test
    public void checkGetKittensWithParam() {
        int our = feline.getKittens(inputParam);
        int expected = outParam;
        Assert.assertEquals(expected, our);
    }
}
