import java.io.*;
import java.io.FileWriter;

public class Participant {
    String name;
    int age;
    String email;

    public Participant(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public static void displayParticipants(String filepath) {
        File file = new File(filepath);

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filepath);
        } catch (IOException e) {
            System.out.println("Error reading file : " + filepath);
        }
    }
    public static void saveParticipiant(Participant participant, String filepath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true))) {
            bw.write("Name: " + participant.name + ", Age: " + participant.age + ", Email: " + participant.email);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file : " + filepath);
        }
    }
}
