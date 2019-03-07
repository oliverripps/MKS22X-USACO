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
      int r = Integer.parseInt(eachnum.get(0));
      int c = Integer.parseInt(eachnum.get(1));
      int e = Integer.parseInt(eachnum.get(2));
      int n = Integer.parseInt(eachnum.get(3));
    }
    catch(FileNotFoundException e){
      System.out.println("File Not Found:" + filename);
    }

    return 0;
  }

  public static int silver(String filename){
    try{
      String str="";
      File problem = new File(filename);
      Scanner comp = new Scanner(problem);
      str+=comp.nextLine();
      List<String> eachnum = Arrays.asList(str.split(" "));
      int n = Integer.parseInt(eachnum.get(0));
      int m = Integer.parseInt(eachnum.get(1));
      int t = Integer.parseInt(eachnum.get(2));
      int[][] nums= new int[n][m];
      int[][] doc = new int[n][m];
      for(int i =0;i<doc.length();i++){
        str=comp.nextLine();
        for(int l=0;l<doc[0].length();l++){
          doc[i][l]=str.substring(l);
        }
      }
      for(int i =0;i<doc.length();i++){
        str=comp.nextLine();
        for(int l=0;l<doc[0].length();l++){
          doc[i][l]=str.substring(l);
        }
      }


    }
    catch(FileNotFoundException e){
      System.out.println("File Not Found:" + filename);
    }

    return 0;
  }



}
