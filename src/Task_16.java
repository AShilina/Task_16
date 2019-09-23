/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt */

import java.io.FileReader;
import java.util.Scanner;

public class Task_16 {

    public static void main(String[] args) throws Exception {

        FileReader fr= new FileReader("D://file.txt");
        Scanner scan = new Scanner(fr);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
            i++;
        }

        fr.close();
    }
}