import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LionTest {

    private Lion lion;

    Feline feline = new Feline();

    @Test
    //Проверяем метод getKittens класса Lion с пустым параметром входа
    public void checkGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    //Проверяем метод doesHaveMane класса lion для ветки самца
    public void checkDoesHaveManeMale() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Boolean ourLion = lion.doesHaveMane();
        Assert.assertEquals(true, ourLion);
    }
    //Проверяем метод doesHaveMane класса lion для ветки самки
    @Test
    public void checkDoesHaveManeFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Boolean ourLion = lion.doesHaveMane();
        Assert.assertEquals(false, ourLion);
    }
    //Проверяем метод doesHaveMane класса lion для ветки исклчения
    @Test(expected = Exception.class)
    public void checkDoesHaveManeOther() throws Exception {
        Lion lion = new Lion("Другое", feline);
        boolean ourLion = lion.doesHaveMane();
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", ourLion);
    }

    @Test
    public void checkGetFoodReturnPredatorFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> ourLion = lion.getFood();
        List<String> expected = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(expected, ourLion);
    }
}
