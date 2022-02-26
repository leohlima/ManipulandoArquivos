import java.io.*;

public class Buff_File_Reader {
    public static void main(String[] args) {

        String path = "C:\\Users\\leoli\\OneDrive\\Área de Trabalho\\JAVA\\secao17_Files\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
