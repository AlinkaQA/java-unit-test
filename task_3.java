import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    // Конструктор для инициализации полей
    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    // Параметризованный метод для предоставления тестовых данных
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
            { 17, false },  // Несовершеннолетний
            { 18, true },   // Совершеннолетний (по общим стандартам)
            { 19, true },   // Совершеннолетний (по общим стандартам)
            { 20, true }    // Совершеннолетний (по общим стандартам)
        };
    }

    // Тестовый метод для проверки совершеннолетия
    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Для возраста " + age + " ожидаемый результат: " + result, result, isAdult);
    }
}
