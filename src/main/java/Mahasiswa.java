import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mahasiswa {
    private String Nama[] = new String[3];
    private String NIM[] = new String[3];
    private int i;

    public void inputData() {
        BufferedReader b;
        b = new BufferedReader(new InputStreamReader(System.in));
        try //Penjelasan Exception lebih lanjut di berikutnya
        {
            System.out.println("-Input Data Mahasiswa-");
            for (i = 0; i < 3; i++) // Perulangan (looping)
            {
                System.out.print("Masukkan Nama : ");
                Nama[i] = b.readLine(); //Pembacaan inputan melaluimkeyboard (seperti "cin" dalam C++)
                System.out.print("Masukkan NIM : ");
                NIM[i] = b.readLine();
            }
        } catch (Exception E) {
        }
    }

    public void display() {
        System.out.println("");
        System.out.println("-Display Data Mahasiswa-");
        for (i = 0; i < 3; i++) {
            System.out.println("Nama : " + Nama[i]);
            System.out.println("NIM : " + NIM[i]);
            System.out.println("");
        }
    }
}

