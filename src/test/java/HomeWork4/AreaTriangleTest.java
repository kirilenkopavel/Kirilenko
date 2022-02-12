package HomeWork4;

import org.junit.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Java Web UI
 *@author Pavel Kirilenko
 *@version 12.02.2022
 */

public class AreaTriangleTest {

    static Logger logger = LoggerFactory.getLogger(AreaTriangleTest.class);

    private Object areaTriangle;

    @Test
    public void areaTest () {
        assertEquals(6.4951906, AreaTriangle.areaTriangle(s), "не верно");
        logger.info("Логируем строчку");
        assertTrue( true );
    }


}
