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
      int total=0;
      int[] assign = new int[4];
      for(int i=0; i<4;i++){
        assign[i] = Integer.parseInt(comp.next());
    }
      R = assign[0];
      C = assign[1];
      E = assign[2];
      N = asign[3];

    int[][] board=new int[R][C]
    for (int i=0;i<R;i++){
      for (int l=0;l< C;l++){
        board[i]l=Integer.parseInt(input.next());
      }
    }
    int m=0;
    while(m<N){
      int row=Integer.parseInt(comp.next())-1;
      int col=Integer.parseInt(comp.next())-1;
      int stomp=Integer.parseInt(comp.next());
      int max=0;
      for(int r=0;r<row+3;r++){
        for(int c=0;c<col+3;c++){
          if(board[r][c]>max){
            max=board[r][c];
          }
        }
      }

    for(int r=0;r<row+3;r++){
      for(int c=0;c<col+3;c++){
        int delta=maxV-board[r][c];
        if(delta<stomp){
          board[r][c]=max-stomp;
        }
      }
    }
    m++;
  }
    for(int r=0;r<R;r++){
      for (int c=0;c<C;c++){
        int curr=board[row][col];
      if(E-curr>0){
        total += E-curr;
      }
    }
  }

  total=total*72*72;
  return total;
}
  catch(FileNotFoundException e){
    System.out.println("File Not Found:" + filename);
  }
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
