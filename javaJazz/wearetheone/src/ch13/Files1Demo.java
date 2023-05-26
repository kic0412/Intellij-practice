package ch13;

import java.io.File;
import java.nio.file.Files;

public class Files1Demo {
    public static void main(String[] args) throws Exception {
        File f1 = new File("D:\\Temp\\org.txt");
        File f2 = new File("D:\\Temp");

        System.out.println("org.txt 는 폴더?" + Files.isDirectory(f1.toPath()));
        System.out.println("Temp 는 폴더?" + Files.isDirectory(f2.toPath()));
        System.out.println("org.txt 는 읽을 수 있는 파일?" + Files.isReadable(f1.toPath()));
        System.out.println("org.txt 의 크기?" + Files.size(f1.toPath()));
    }
}
