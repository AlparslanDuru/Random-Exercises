import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

class readFileLineByLine {
  
  public static void main(String[] args){
    ReadFileLineByLine();
  }
  
  public static void ReadFileLineByLine(){
    
    try{
        BufferedReader reader = new BufferedReader(new FileReader("File.txt"));
        String line = reader.readLine();
      
        while(line != null){
            System.out.println(line);
            line = reader.readLine();
        }
    } catch (IOException e){
        e.getMessage();
    }
    
  }
  
}
