import java.util.Scanner;

public class project {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan nama anda : ");
            String name = scanner.nextLine();
            System.out.print("Masukkan NIM anda  : ");
            int nim = scanner.nextInt();

            System.out.println("\n\n********************");
            System.out.println("  NIM  : " + nim);
            System.out.println("  Nama : " + name);
            System.out.println("********************");
            
            scanner.close();
        }
    
}