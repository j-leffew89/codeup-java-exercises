package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    public static void main(String[] args) {
//        System.out.println(getFilePath("src","FileIO","test.txt").toAbsolutePath());

//        System.out.println("Does the path exist?");
//        System.out.println(
//                doesPathExist(
//                        getFilePath("src","FileIO","test.txt")));
        Path path = getPath("src","FileIO","files");
        tryCreateDirectory(path);

        path = Paths.get(path.toString(), "text.txt");

        System.out.println(path.toAbsolutePath());

    }

    public static Path getPath(String filename){
        return Paths.get(filename);
    }

    public static Path getPath(String parentDirectory, String fileName){
        return Paths.get(parentDirectory, fileName);
    }

    public static Path getPath(String parentDirectory, String childDirectory, String fileName){
        return Paths.get(parentDirectory, childDirectory, fileName);
    }

    public static boolean doesPathExist(Path path){
        return Files.exists(path);
    }

    public static void tryCreateDirectory(Path pathToCreate){

        if(!doesPathExist(pathToCreate)){
            try {
                Files.createDirectory(pathToCreate);
            }catch (IOException e){
                System.out.println("Could not create the directory at: ");
                System.out.println(pathToCreate.toAbsolutePath());
            }
        } else {
            System.out.println("The path at: " + pathToCreate.toAbsolutePath() + " already exist.");
        }
    }

    public static void tryCreateFile(Path path){

        if(!doesPathExist(path)){
            try {
                Files.createFile(path);
            }catch (IOException e){
                System.out.println("Could not create file at: " + path.toAbsolutePath());
            }
        }else{
            System.out.println("The file at: " + path.toAbsolutePath() + " already exists.");
        }
    }

}
