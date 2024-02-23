
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n//input\n");

        System.out.print("namaorang: ");
        String nama = input.nextLine();
        System.out.print("jenis kelamin (P/L): ");
        String gender = input.nextLine();
        String jenis = (gender.equalsIgnoreCase("p")) ? "Perempuan" : "Laki-Laki";
        System.out.print("Tanggal lahir (tahun-bulan-tanggal):");
        String birthday = input.nextLine();
        LocalDate tahun = LocalDate.parse(birthday);

        LocalDate day = LocalDate.now();
        Period agePeriod = Period.between(tahun, day);
        int years = agePeriod.getYears();
        int months = agePeriod.getMonths();

        System.out.println("\nData Diri :");
        System.out.println("namaorang : " + nama);
        System.out.println("Jenis Kelamin :" + gender);
        System.out.println("Umur : " + years + " Tahun " + months + " bulan");

        input.close();
    }
}
