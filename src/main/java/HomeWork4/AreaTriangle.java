package HomeWork4;

/**
 * Java Web UI
 *@author Pavel Kirilenko
 *@version 12.02.2022
 */

class Triangle {

        public static float areaTriangle ( int a, int b, int c) throws MyException {
            if (a < 0 || b < 0 || c < 0) throw new MyException("Отрицательное значение сторон");
            if (a + b <= c || a + c <= b || b + c <= a) throw new MyException("Не является треугольником");
            float p = (a + b + c) / 2.f;
            float result = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return result;
        }
}
