import java.text.DecimalFormat;

public class RegulaFalsi {

  public static void main(String args[]) {
    double xn = 2.5;
    double xnNext = 2.6;
    double xMid = 0.0;
    double toleransi = 0.005;
    double absFxMid = 1500;
    int no = 0;
    double fXn = 0.0;
    double fxnNext = 0.0;
    double fXmid = 0.0;
    double upper;
    double lower;

    System.out.println("Penyelesaian SPL dengan Metode REGULA FALSI");
    System.out.println("----------------------------------------");
    System.out.println("Persamaan : X^3 - 7X + 1");
    System.out.println("Nilai Xn=2.5 dan nilai Xn+1=2.6, dengan Toleransi-Error=0.005");
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("| No|  Xn   |  Xn+1  |  f(Xn)  |f(Xn+1) | X(mid) | f(Xmid) | |f(Xmid)||");
    System.out.print("-----------------------------------------------------------------------");

    while (absFxMid > toleransi) {

      DecimalFormat digit1 = new DecimalFormat("0.000");
      // mencari nilai fungsi Xn
      fXn = (xn * xn * xn) - (7 * xn) + 1;
      // mencari nilai fungsi Xn+1
      fxnNext = (xnNext * xnNext * xnNext) - (7 * xnNext) + 1;
      upper = (xnNext - xn);
      lower = (fxnNext - fXn);
      xMid = xn - (fXn * (upper / lower));
      // mencari nilai fungsi xMid
      fXmid = (xMid * xMid * xMid) - (7 * xMid) + 1;
      no++;
      System.out.println("");
      System.out.print("| " + no + " | ");
      System.out.print(digit1.format(xn) + " | ");
      System.out.print(digit1.format(xnNext) + "  | ");
      System.out.print(digit1.format(fXn) + "  | ");
      System.out.print(digit1.format(fxnNext) + "  | ");
      System.out.print(digit1.format(xMid) + "  | ");
      System.out.print(digit1.format(fXmid) + "  | ");
      if ((fXn < 0 && fXmid < 0) || (fXn > 0 && fXmid > 0)) {
        xn = xMid;
      } else {
        xnNext = xMid;
      }
      if (fXmid < 0) {
        absFxMid = fXmid * -1;
      } else {
        absFxMid = fXmid;
      }
      System.out.print(digit1.format(absFxMid) + "  | ");
    }
    System.out.println();
    System.out.print("-----------------------------------------------------------------------");

  }
}
