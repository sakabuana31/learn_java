import java.util.Scanner;

public class LuasPersegi {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan sisi persegi: ");
    int sisi = scan.nextInt();
    int luas = sisi * sisi;
    System.out.println("Luas persegi adalah: " + luas);
  }
}