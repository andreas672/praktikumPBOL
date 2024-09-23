import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class projek {

    Map<String, String> Mahasiswa = new HashMap<>();
    Scanner input = new Scanner(System.in);
    
    public void First() {
        System.out.println("Management System informasi mahasiswa ");
            System.out.println("1. Tambah Mahasiswa"); 
            System.out.println("2. Tampilkan List Mahasiswa"); 
            System.out.println("3. Udate List Mahasiswa"); 
            System.out.println("4. hapus  Mahasiswa"); 
            System.out.println("5. Exit");
    }

    public void Tambah() {
        System.out.print("Masukkan Nim : ");
        String nim = input.nextLine();
        
        if (Mahasiswa.containsKey(nim)) {
            System.out.println("NIM sudah Terdaftar!! ");
            
        }
        else {
            System.out.print("Masukkan Nama : ");
            String nama = input.nextLine();
            Mahasiswa.put(nim,nama);
        }
        
    }

    public void List() {
        if (Mahasiswa.isEmpty()) {
            System.out.println("List Mahasiswa Kosong");
        } else {
            for (Map.Entry<String, String> data : Mahasiswa.entrySet()) {
                System.out.println("NIM: " + data.getKey() + ", NAMA: " + data.getValue());
        }
        
        }
    }
    public void Ubah() {
        System.out.print("Masukkan Nim untuk Update Mahasiswa : ");
        String nim = input.nextLine();
        if (Mahasiswa.containsKey(nim) ) {
            System.out.print("Masukkan Nama Baru Mahasiswa :");
            String nama = input.nextLine();
            Mahasiswa.put(nim,nama);
        }
        else {
            System.out.println("Nim Mahasiswa tida ditemukan");
        }
    }

    public void Hapus() {
        System.out.print("Masukkan NIM Mahasiswa untuk dihapus : ");
        String nim = input.nextLine();
        if (Mahasiswa.containsKey(nim)) {
            Mahasiswa.remove(nim);
            System.out.println("Data Mahasiswa Berhasil dihapus");
        }
        else {
            System.out.println("Data Mahasiswa Tidak dDitemukan.");

        }
    }

    public static void main(String[] args) {
        
        projek mhs = new projek();
        Integer pil;
        Scanner scan = new Scanner(System.in);

        do {
            mhs.First();
            System.out.print("Masukkan Pilihan : ");
            pil = scan.nextInt();
            switch (pil) {
                case 1:
                    mhs.Tambah();
                    System.out.println("\n\n");
                    break;
                case 2:
                    mhs.List();
                    System.out.println("\n\n");
                    break;
                case 3:
                    mhs.Ubah();
                    System.out.println("\n\n");
                    break;
                case 4:
                    mhs.Hapus();
                    System.out.println("\n\n");
                    break;
                default:
                    break;
            }

            

        }while(pil!=5);
        scan.close();

    }

}
