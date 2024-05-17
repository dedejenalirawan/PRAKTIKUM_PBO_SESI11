import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CSVReader {
    public static void main(String[] args) {
        String csvFile =  "C:\\Users\\komputer 31\\Music\\PRAKTIKUM_PBO_SESI11";
        String line;
        String csvSplitBy = ",";
        int indeks = 0;
        System.out.println("NIM, NAMA, UMUR, PRODI");
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                indeks++;
                if(indeks > 0){
                    String[] student = line.split(csvSplitBy);
                    System.out.println(student[0] + ", " + student[1] + ", " + student[2] + ", " + student[3]);
                }
            } 
            System.out.println("===");
            System.out.println("Jumlah Barisnya adalah: " + indeks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
