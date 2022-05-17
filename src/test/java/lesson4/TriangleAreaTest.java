package lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleAreaTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Предусловие для выполнения перед всеми тестами. Красивое. Готово.");
    }

    @Test
    @DisplayName("Значение сторон треугольника больше 0")
    void chekArea() throws Exception{
        Assertions.assertEquals(6, TriangleArea.triangleArea(3,4,5), 0.001);
    }

    @Test
    void incorrectValueOfTriangleSides () {
        Assertions.assertThrows(Exception.class, () -> TriangleArea.triangleArea(-3,4,5));
    }
}
