package HomeWork4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Java Web UI
 *@author Pavel Kirilenko
 *@version 12.02.2022
 */

public class AreaTriangleTest {

    static Logger logger = LoggerFactory.getLogger(AreaTriangleTest.class);

    static Integer myTestInt = 0;

    @Test
    public void areaTest () throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(6.495190620422363, triangle.areaTriangle(5,7,3));
        myTestInt++;
        logger.info("Логируем строчку");
    }

    @ParameterizedTest
    @CsvSource({ "8,10,-7","5, 8,0","9,0,-5"})
    void negativeValuesTest (int a, int b, int c) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class, () -> triangle.areaTriangle(a, b, c));
        myTestInt++;
        logger.info("Логируем строчку");
    }

    @ParameterizedTest
    @CsvSource({ "3,5,8","10, 5,5"})
    void notTriangleTest (int a, int b, int c) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class, () -> triangle.areaTriangle(a, b, c));
        myTestInt++;
        logger.info("Логируем строчку");
    }
}
