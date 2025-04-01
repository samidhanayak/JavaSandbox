package mar29;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIODemo {

    public static void WriteToFile(){
        try {
            FileWriter fileWriter = new FileWriter("Demo.txt",false);
            fileWriter.write("Hello, I am learning Java!");
            //System.out.println("File has been written");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToFileWithResources() {

        // try with resources
        try (FileWriter fileWriter = new FileWriter("Demo.txt",true)) {
            fileWriter.append("Test1234");
            //System.out.println("File has been written");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadFromFile(){

        try {
            FileReader fileReader = new FileReader("Demo.txt");

            int characters;
            while((characters = fileReader.read()) != -1){
                System.out.print((char) characters);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        WriteToFile();
        writeToFileWithResources();
        ReadFromFile();
    }


}
