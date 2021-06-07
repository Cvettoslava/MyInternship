package Exc6;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryBrowser {

    /** Checks if the provided path points to file or directory and if it points to directory prints all directories that contains.
     * @param path is name of  directory or the full path of file.*/
    public void listContent(String path){
        Path file = new File(path).toPath();
        File file1 = new File(path);
        
        if (path == null || !Files.exists(file)) {
            System.out.println("The file or directory does not exists!");
        }
        else {
            if(file1.isFile()){
                System.out.println("This is file.");
            }else {
                String[] pathnames;
                System.out.println(Files.isDirectory(file));
                pathnames = file1.list();
                for (String pathname : pathnames) {
                    // Print the names of files and directories
                    System.out.println(pathname);
                }

            }
        }
    }
}
