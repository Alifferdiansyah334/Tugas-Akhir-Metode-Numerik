import java.text.DecimalFormat;

public class NewtonRaphson {

  public static void main(String args[]) {
    DecimalFormat digit = new DecimalFormat("00.00000");
    double xn = 3.00;
    double fxn = 0.00;
    double toleransi = 0.005;
    double faksen = 0.00;
    double xnNext = 0.00;
    int no = 1;
    double EXn = 1500.00;
    fxn = (4 * (xn * xn * xn)) - (15 * (xn * xn)) + (17 * xn) - 6;
    double ExnCetak = 0.00;

    faksen = (12 * (xn * xn)) - (30 * xn) + 17;
    String kol = "";
    System.out.println("Penyelesaian SPNL dengan Metode Newton Raphson");
    System.out.println("f(x)=4X^3 - 15X^2 + 17X -6 maka f'(x)=12X^2 - 30X + 17");
    System.out.println("Xn = 3; Toleransi Error = 0.005");
    System.out.println("---------------------------------------------------");
    System.out.println("| No | Xn | f(Xn) | f'(Xn) | |EXn| |");
    System.out.println("---------------------------------------------------");
    System.out.print("| " + no + " | ");
    System.out.print(digit.format(xn));

    if (fxn < 0) {
      System.out.print(" | ");
    } else {
      System.out.print(" | ");
    }
    System.out.print(digit.format(fxn) + " | ");
    System.out.print(digit.format(faksen) + " | ");
    System.out.print(" - |");
    System.out.println();
    while (EXn > toleransi) {
      no = no + 1;
      xnNext = xn - (fxn / faksen);
      fxn = (4 * (xnNext * xnNext * xnNext)) - (15 * (xnNext * xnNext)) + (17 * xnNext) - 6;
      faksen = (12 * (xnNext * xnNext)) - (30 * xnNext) + 17;
      System.out.print("| " + no + " | ");
      System.out.print(digit.format(xnNext));
      if (fxn < 0) {
        System.out.print(" | ");
      } else {
        System.out.print(" | ");
      }
      System.out.print(digit.format(fxn) + " | ");
      System.out.print(digit.format(faksen) + " | ");
      EXn = (xnNext - xn) / xnNext;
      if (EXn < 0) {
        kol = " | ";
        EXn = EXn * -1;
        ExnCetak = EXn;
      } else {
        kol = " | ";
        ExnCetak = EXn;
      }
      System.out.println(digit.format(ExnCetak) + kol);
      xn = xnNext;
    }
    System.out.println("---------------------------------------------------");
    System.out.println("Maka Nilai Akar Persamaan yang dicari adalah : " + digit.format(xnNext));
    System.out.println("");
  }
}