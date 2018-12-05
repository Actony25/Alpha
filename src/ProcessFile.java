import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;

public class ProcessFile {

  private Path p;
  private Path p2;
  private Path p3;

  public ProcessFile() {
    p = Paths.get("C:\\LineTests");
    p2 = Paths.get("TestResults.txt");
    p3 = p.resolve(p2);
    CreateDirectory();
  }

  private void CreateDirectory() {
    try {
      if (Files.notExists(p)) {
        Files.createDirectory(p);
      }
    } catch (Exception ex) {
      System.out.println("Problem reading directory");
    }
  }

  /*
  public void WriteFile(String emp) throws IOException {
    FileWriter writer = new FileWriter(p3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.print(emp);

    printWriter.close();
  }

  public void WriteFile(ArrayList<Product> products) throws IOException {

  }
  */
  public void WriteFile(Object objName) throws IOException {
    CreateDirectory();
    String filepath = p3.toString();
    PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filepath, true)));
    writer.println(objName);
    writer.close();
  }
}
