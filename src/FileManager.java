import java.io.*;
import java.util.*;

public class FileManager {

    private String FILE = "data.txt";

    public void save(List<Booking> list) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(FILE));

            for (Booking b : list) {
                pw.println(b.toFile());
            }

            pw.close();
        } catch (Exception e) {
            System.out.println("Save error");
        }
    }

    public List<Booking> load() {
        List<Booking> list = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE));
            String line;

            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");

                Booking b = new Booking(
                        Integer.parseInt(p[0]),
                        p[1],
                        p[2],
                        p[3],
                        p[4]
                );

                list.add(b);
            }

            br.close();
        } catch (Exception e) {
            // file may not exist
        }

        return list;
    }
}
