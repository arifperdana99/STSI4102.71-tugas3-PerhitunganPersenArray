import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        int[] gaji = {5000000, 6500000, 9500000};
        int[] persenLembur = {30, 32, 34, 36, 38};

        System.out.print("Masukkan golongan karyawan (A/B/C): ");
        String golongan = input.nextLine().trim().toUpperCase();

        System.out.print("Masukkan jumlah jam lembur: ");
        String inputJamLembur = input.nextLine().trim();
        int jamLembur;

        try {
            jamLembur = Integer.parseInt(inputJamLembur);
        } catch (NumberFormatException error) {
            System.out.println("Jam lembur harus berupa angka.");
            input.close();
            return;
        }

        int indexGaji;

        if (golongan.equals("A")) {
            indexGaji = 0;
        } else if (golongan.equals("B")) {
            indexGaji = 1;
        } else if (golongan.equals("C")) {
            indexGaji = 2;
        } else {
            System.out.println("Golongan tidak valid. Pilih A, B, atau C.");
            input.close();
            return;
        }

        if (jamLembur < 0) {
            System.out.println("Jam lembur tidak boleh bernilai negatif.");
            input.close();
            return;
        }

        int indexLembur;

        if (jamLembur == 1) {
            indexLembur = 0;
        } else if (jamLembur == 2) {
            indexLembur = 1;
        } else if (jamLembur == 3) {
            indexLembur = 2;
        } else if (jamLembur == 4) {
            indexLembur = 3;
        } else {
            indexLembur = 4;
        }

        int gajiPokok = gaji[indexGaji];
        int persen = jamLembur == 0 ? 0 : persenLembur[indexLembur];
        double gajiLembur = jamLembur * (persen / 100.0) * gajiPokok;
        double totalGaji = gajiPokok + gajiLembur;

        System.out.println();
        System.out.println("Golongan       : " + golongan);
        System.out.println("Gaji pokok     : " + rupiah.format(gajiPokok));
        System.out.println("Jam lembur     : " + jamLembur + " jam");
        System.out.println("Persen lembur  : " + persen + "%");
        System.out.println("Gaji lembur    : " + rupiah.format(gajiLembur));
        System.out.println("Total gaji     : " + rupiah.format(totalGaji));

        input.close();
    }
}
