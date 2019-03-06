import java.util.*;
import java.io.*;

public class USACO{


  public static int bronze(String filename){
    try{
      String str="";
      File problem = new File(filename);
      Scanner comp = new Scanner(problem);
      str+=comp.nextLine();
      List<String> eachnum = Arrays.asList(str.split(" "));
      int r = eachnum.get(0);
      int c = eachnum.get(1);
      int e = eachnum.get(2);
      int n = eachnum.get(3);
    }
    catch(FileNotFoundException e){
      System.out.println("File Not Found:" + filename);
    }

    return 0;
  }

  public static int silver(String filename){
    return 0;
  }



}
