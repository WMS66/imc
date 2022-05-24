package IMC;

import java.util.Scanner;

// calcula o IMC - Indice de massa corporal
class calculaIMC {
  public static void main(String entrada[]) {
    Scanner ler = new Scanner(System.in);
    double pc, alt, vlrIMC;
    System.out.println(" Peso corporal em (kgs): ");
    pc = ler.nextDouble();

    System.out.println("Altura (em metros)....: ");
    alt = ler.nextDouble();

    vlrIMC = IMC(pc, alt);

    System.out.println();
    System.out.printf("IMC = %.2f (%s)\n",
        vlrIMC, interpretarIMC(vlrIMC));

  }

  public static double IMC(double pc, double alt) {
    // return (pc / (alt * alt));
    return pc / Math.pow(alt, 2);
  }

  public static String interpretarIMC(double vlrIMC) {
    if (vlrIMC < 18.5)
      return ("Magreza");
    else if (vlrIMC < 25.0)
      return ("Normal");
    else if (vlrIMC <= 30.0)
      return ("sobrepeso");
    else
      return ("obesidade");

  }
}
