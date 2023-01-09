import java.io.FileInputStream;
import java.io.IOException;

class readFile {
  
  public static void main(String[] args) throws IOException{
    ReadTheText();
  }
  
  public static void ReadTheText() throws IOException{
    FileInputStream in = new FileInputStream("File.txt");
    
    int k=0;
    
    while ((k = in.read()) != -1){
      System.out.print((char)k);
    }
  }
  
}
