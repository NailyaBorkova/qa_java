import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FelineTest {
    Feline feline = new Feline();

    @Test
    //Тест класса Feline метода EatMeat
    public void checkEatMeat() throws Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(expected, actual);

    }

    @Test
    //Тест класса Feline метода GetFamily
    public void checkGetFamily() {
        String expected = "Кошачьи";
        String ourFamily = feline.getFamily();
        Assert.assertEquals(expected, ourFamily);

    }

    @Test
    //Тест класса Feline метода GetKittens без входящих параметров
    public void checkGetKittensWithoutParam() {
        int actual = feline.getKittens();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

}
