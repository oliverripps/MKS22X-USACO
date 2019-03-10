import java.util.*;
import java.io.*;

public class USACO{


  public static int bronze(String filename){
    try{
      String str="";
      File problem = new File(filename);
      Scanner comp = new Scanner(problem);
      int R;
      int C;
      int E;
      int N;
      int[] assign = new int[4];
      for(int i=0; i<4;i++){
        assign[i] = Integer.parseInt(input.next());
    }
      R = assign[0];
      C = assign[1];
      E = assign[2];
      N = asign[3];
    }
    catch(FileNotFoundException e){
      System.out.println("File Not Found:" + filename);
    }
    int[][] board=new int[R][C]
    for (int i=0;i<R;i++){
      for (int l=0;l< C;l++){
        board[i]l=Integer.parseInt(input.next());
      }
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
      int time = Integer.parseInt(eachnum.get(2));
      int[][] nums= new int[n][m];
      char[][] doc = new char[n][m];
      for(int i =0;i<doc.length;i++){
        str=comp.nextLine();
        for(int l=0;l<doc[0].length;l++){
          doc[i][l]=str.charAt(l);
        }
      }

      for(int i =0;i<doc.length;i++){
        for(int l=0;l<doc[0].length;l++){
          if(doc[i][l]=='.'){
            nums[i][l]=0;
          }
          else{
            nums[i][l]=-1;
          }
        }
      }

      for(int t =0;t<time;t++){
        int[][] curr = new int[n][m];
        curr = nums;
        for(int i=0;i<nums.length;i++){
          for(int l=0;l<nums[0].length;l++){
            if(nums[i][l]>0){
              if(curr[i+1][l]>=0){
                curr[i+1][l]+=nums[i][l];
              }
              if(curr[i-1][l]>=0){
                curr[i-1][l]+=nums[i][l];
              }
              if(curr[i][l+1]>=0){
                curr[i][l+1]+=nums[i][l];
              }
              if(curr[i][l-1]>=0){
                curr[i][l-1]+=nums[i][l];
              }
            }n
          }
        }
        nums=curr;
      }
      str=comp.nextLine();
      List<String> eachcoord = Arrays.asList(str.split(" "));
      int xstart
      int xend
      int ystart
      int yend


    }
    catch(FileNotFoundException e){
      System.out.println("File Not Found:" + filename);
    }

    return 0;
  }



}
