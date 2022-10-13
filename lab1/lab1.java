import java.lang.Math;
import java.text.DecimalFormat;
public class lab1 {
    public static void main(String[] args) {
        short[] a = new short[8];
        double[] x = new double[18];
        double[][] m = new double[8][];

        for (short i = 18, b = 0; i >= 4; i -= 2) { // Заполняем массив a
            a[b] = i;
            b++;
        }

        for (int i = 0; i < 18; i++) { // Заполняем массив x
            x[i] = (Math.random() * 8) - 7;
        }
        for (int i = 0; i < 8; i++) { // Заполняем двойной массив
            m[i] = new double[18];
            for (int j = 0; j < 18; j++) {
                if (a[i] == 18) {
                    m[i][j] = Math.pow(Math.exp(Math.sin(x[j])), 1.0 / 3); // Корень третьей степени из e^(sin(x))
                }
                if (a[i] == 6 || a[i] == 8 || a[i] == 10 || a[i] == 14) {
                    m[i][j] = Math.atan(Math.sin(x[j])); // arctan(sin(ln(e^x))) ==> arctan(sin(x));
                } else {
                    m[i][j] = Math.sin(Math.tan(Math.exp(Math.pow(2 - x[j], 3)))); // sin(tan(e^((2-x)^3)))
                }
            }
        }
        for (int i = 0; i < 8; i++) { // Выводим полученный двойной массив
            for (int j = 0; j < 18; j++) {
                DecimalFormat df = new DecimalFormat("0.000");
                if (m[i][j] > 0)
                    System.out.print("+" + df.format(m[i][j]) + " ");
                else {
                    System.out.print(df.format(m[i][j]) + " ");
                }
            }
            System.out.println();
        }
    }
}
