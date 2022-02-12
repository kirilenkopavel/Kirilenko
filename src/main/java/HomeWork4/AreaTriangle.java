package HomeWork4;

/**
 * Java Web UI
 *@author Pavel Kirilenko
 *@version 12.02.2022
 */

public class AreaTriangle {

    public static float areaTriangle () {
        int a = 5;
        int b = 7;
        int c = 3;
        float p = (a + b + c) / 2.f;
        float s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
