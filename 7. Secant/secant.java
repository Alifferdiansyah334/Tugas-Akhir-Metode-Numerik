import java.text.DecimalFormat;

public class secant {

  public static void main(String args[]) {

    DecimalFormat digit = new DecimalFormat("00.00000");

    double xn = -1.00;
    double xnNext = 3.00;
    double toleransi = 0.005;
    double fxnLanjut = 0.00;
    double fxn = 0.00;
    double fxnNext = 0.00;
    int no = 1;
    String kol = "";
    double xnLanjut = 0.00;

    fxn = (4 * (xn * xn * xn)) - (15 * (xn * xn)) + (17 * xn) - 6;
    double absfxn = 0.00;
    double absfxnNext = 0.00;

    fxnNext = (4 * (xnNext * xnNext * xnNext)) - (15 * (xnNext * xnNext)) + (17 * xnNext) - 6;
    double absfxnLanjut = 0.00;
    System.out.println("Penyelesaian SPNL dengan Metode SECANT");
    System.out.println("f(x)=4X^3 - 15X^2 + 17X -6");
    System.out.println("Xn = -1, dan Xn+1=3; Toleransi Error = 0.005");
    System.out.println("----------------------------------------");
    System.out.println("| No |    Xn     |   f(Xn)   | |f(Xn)| |");
    System.out.println("----------------------------------------");
    System.out.print("| " + no + "  | ");
    System.out.print(digit.format(xn));

    if (fxn < 0) {
      kol = " | ";
    } else {
      kol = "  | ";
    }
    System.out.print(kol);
    System.out.print(digit.format(fxn) + kol);
    if (fxn < 0) {
      absfxn = fxn * -1;
    } else {
      absfxn = fxn;
    }
    System.out.print(digit.format(absfxn) + " |");
    no++;
    System.out.println("");
    System.out.print("| " + no + "  | ");
    System.out.print(digit.format(xnNext));

    if (fxnNext < 0) {
      kol = " | ";
    } else {
      kol = "  | ";
    }

    System.out.print(kol);
    System.out.print(digit.format(fxnNext) + kol);
    if (fxnNext < 0) {
      absfxnNext = fxnNext * -1;
    } else {
      absfxnNext = fxnNext;
    }
    System.out.println(digit.format(absfxnNext) + " |");
    while (absfxnNext > toleransi) {
      xnLanjut = 0.00;
      fxnLanjut = 0.00;
      absfxnLanjut = 0.00;
      absfxnNext = 0.00;
      xnLanjut = xnNext - ((fxnNext * (xnNext - xn)) / (fxnNext - fxn));
      fxnLanjut = (4 * (xnLanjut * xnLanjut * xnLanjut)) - (15 * (xnLanjut * xnLanjut)) +
          (17 * xnLanjut) - 6;
      no = no + 1;
      System.out.print("| " + no + "  | ");
      System.out.print(digit.format(xnLanjut));
      if (fxnLanjut < 0) {
        kol = " | ";
      } else {
        kol = "  | ";
      }

      System.out.print(kol);
      System.out.print(digit.format(fxnLanjut) + kol);
      if (fxnLanjut < 0) {
        absfxnLanjut = fxnLanjut * -1;
      } else {
        absfxnLanjut = fxnLanjut;
      }
      System.out.print(digit.format(absfxnLanjut) + " |");
      System.out.println("");
      // if (no==6){break;}
      absfxnNext = absfxnLanjut;
      xn = xnNext;
      fxn = fxnNext;
      xnNext = xnLanjut;
      fxnNext = fxnLanjut;
    }
    System.out.println("------------------------ ----------------");

  }

}
