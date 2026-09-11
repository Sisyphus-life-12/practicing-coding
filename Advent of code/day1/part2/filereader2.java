    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;

    public class filereader2 {

        public static void readFile(String filepath) {

            try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {

                String line;

                while ((line = br.readLine()) != null) {
                    cal2.solve(line);
                
                }

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }