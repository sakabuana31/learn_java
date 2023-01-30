import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan angka pertama: ");
    int angka1 = scan.nextInt();
    System.out.print("Masukkan angka kedua: ");
    int angka2 = scan.nextInt();
    System.out.print("Masukkan salah satu perintah (+, -, *, /): ");
    char operator = scan.next().charAt(0);
    int result;
    switch (operator) {
      case '+':
        result = angka1 + angka2;
        break;
      case '-':
        result = angka1 - angka2;
        break;
      case '*':
        result = angka1 * angka2;
        break;
      case '/':
        result = angka1 / angka2;
        break;
      default:
        System.out.println("Invalid operator!");
        return;
    }
    System.out.println("Hasilnya adalah: " + result);
  }
}
