import java.util.Scanner;

public class CreateArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan nama: ");
    String nama = scan.nextLine();
    System.out.print("Masukkan umur: ");
    int umur = scan.nextInt();
    System.out.println("Nama anda " + nama + " umur anda " + umur + " tahun");
  }
}
