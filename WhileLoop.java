import java.util.Scanner;

public class WhileLoop {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Masukkan jumlah perulangan: ");
int jumlah = scan.nextInt();
int i = 2;
while (i <= jumlah) {
System.out.println("Perulangan ke-" + i);
i++;
}
}
}
