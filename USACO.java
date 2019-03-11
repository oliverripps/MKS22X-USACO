import java.util.*;
import java.io.*;

public class USACO{


  public static int bronze(String filename) throws FileNotFoundException{

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
      N = assign[3];

    int[][] board=new int[R][C];
    for (int i=0;i<R;i++){
      for (int l=0;l< C;l++){
        board[i][l]=Integer.parseInt(comp.next());
      }
    }
    int m=0;
    while(m<N){
      int row=Integer.parseInt(comp.next())-1;
      int col=Integer.parseInt(comp.next())-1;
      int stomp=Integer.parseInt(comp.next());
      int max=0;
      for(int r=row;r<row+3;r++){
        for(int c=col;c<col+3;c++){
          if(board[r][c]>max){
            max=board[r][c];
          }
        }
      }

    for(int r=row;r<row+3;r++){
      for(int c=col;c<col+3;c++){
        int delta=max-board[r][c];
        if(delta<stomp){
          board[r][c]=max-stomp;
        }
      }
    }
    m++;
  }
    for(int r=0;r<R;r++){
      for (int c=0;c<C;c++){
        int curr=board[r][c];
      if(E-curr>0){
        total += E-curr;
      }
    }
  }

  total=total*72*72;
  return total;
}



  public static int silver(String filename) throws FileNotFoundException{
    try{
      //System.out.println(filename);
      File f = new File(filename);
      Scanner s = new Scanner(f);
      String str=s.nextLine();
      System.out.println(str);
      List<String> eachnum = Arrays.asList(str.split(" "));
      int n = Integer.parseInt(eachnum.get(0));
      int m = Integer.parseInt(eachnum.get(1));
      int t = Integer.parseInt(eachnum.get(2));
      char[][] doc = new char[n][m];
      for(int i =0;i<n;i++){
        String x = s.nextLine();
        /*System.out.println(n);
        System.out.println(m);
        System.out.println(t);
        System.out.println(x);*/
        for(int l=0;l<m;l++){
          doc[i][l]=x.charAt(l);
        }
      }
      int[][] nums= new int[n][m];
      int[][] sums= new int[n][m];

      int sR = Integer.parseInt(s.next()) - 1;
      int sC = Integer.parseInt(s.next()) - 1;
      int eR = Integer.parseInt(s.next()) - 1;
      int eC = Integer.parseInt(s.next()) - 1;

      int[][] moves = {{1, 0},{-1, 0},{0, 1},{0, -1}};

      for(int i=0;i<4;i++){
        int r= sR+moves[i][0];
        int c=sC+moves[i][1];
        if(r>=0 && r< n && c>=0 && c<m && doc[r][c]!='.'){
          nums[r][c]=1;
          sums[r][c]=1;
        }
      }

      while(t > 1){
        for(int i=0;i<n;i++){
          for (int j=0;j<m;j++){
            int nextTo=0;
            for (int l=0; l< 4; l++){
              int r = i + moves[l][0];
              int c = l + moves[l][1];
              if (r >= 0 && r < n && c >= 0 && c < m && doc[r][c] != '.'){
                nextTo+= doc[r][c];
              }
            }
            if (doc[i][j] != '.'){
              sums[i][j] = nextTo;
            }
          }
        }
      for(int i=0; i<n;i++){
          for (int l=0; l < m; l++){
            nums[i][l] = sums[i][l];
          }
        }
        t--;
      }
      return nums[eR][eC];
    }
    catch(FileNotFoundException e){
      System.out.println("File Not Found:" + filename);
    }

    return -1;
  }



}
