import java.io.File;
import java.io.FilenameFilter;

public class q3 {
    public static void main(String[] args) {
        // Specify the directory path (you can modify the path as needed)
        String directoryPath = "C:/your_directory_path_here"; // Change this to your directory path

        // Create a File object for the specified directory
        File directory = new File(directoryPath);

        // Check if the directory exists and is indeed a directory
        if (directory.exists() && directory.isDirectory()) {
            // Use a FilenameFilter to filter files that have a .txt extension
            FilenameFilter txtFilter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".txt");  // Only accept files that end with .txt
                }
            };

            // Get the list of .txt files
            File[] txtFiles = directory.listFiles(txtFilter);

            // Check if there are any .txt files
            if (txtFiles != null && txtFiles.length > 0) {
                System.out.println(".txt files in the directory:");
                for (File txtFile : txtFiles) {
                    System.out.println(txtFile.getName());
                }
            } else {
                System.out.println("No .txt files found in the specified directory.");
            }
        } else {
            System.out.println("The specified directory does not exist or is not a directory.");
        }
    }
}
