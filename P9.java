import java.io.*;

public class Filecop {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Filecop <source-file> <destination-file>");
            return;
        }

        String basePath = "C:\\Users\\anike\\OneDrive\\Desktop\\files\\";
        String sourceFile = basePath + args[0];
        String destinationFile = basePath + args[1];

        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile)
        ) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        }
    }
}
