import java.io.*;
import java.util.*;

public class ReviseFileName {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the path of the folder");
      String filePath = "C:/Users/10319/Desktop/" + input.nextLine() + "/";
      File file = new File(filePath);
      ArrayList<File> files = new ArrayList<File>(Arrays.asList(file.listFiles()));
      System.out.println("Enter the format that you want. (for example: jpg)");
      String fileFormat = input.nextLine();
      int count = files.size();
      for (int i = 0; i < count; i++) {
         File currentFile = files.get(i);
         String fileName = currentFile.getName();
         File newFile = new File("C:/Users/10319/Desktop/lockscreen/" + fileName + "." + fileFormat);
         currentFile.renameTo(newFile);
      }
   }
}
