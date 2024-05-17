
import java.io.*;
public class FileMerge {

    public static void main(String[] args) {

        String[] files = {"C:\\Users\\komputer 31\\Music\\PRAKTIKUM_PBO_SESI11\\students.csv", 
            "C:\\Users\\komputer 31\\Music\\PRAKTIKUM_PBO_SESI11\\new_students.csv"};
         String mergedFile = "C:\\Users\\komputer 31\\Music\\PRAKTIKUM_PBO_SESI11\\fileMerge.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))) {

            for (String file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.newLine();
                        bw.write(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
