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
      char ch;
      int n = s.nextInt();
      int m = s.nextInt();
      int t = s.nextInt();
      s.nextLine();
      int[][] doc = new int[n][m];
      for(int i =0;i<n;i++){
        String x = s.nextLine();
        /*System.out.println(n);
        System.out.println(m);
        System.out.println(t);
        System.out.println(x);*/
        for(int l=0;l<m;l++){
          ch=x.charAt(l);
          if(ch=='.'){
            doc[i][l]=0;
          //System.out.println(doc[i][l]);
        }
          if(ch=='*'){
            doc[i][l]=-1;
          }
      }
    }

      int[][] nums= new int[n][m];
      int[][] sums= new int[n][m];

      int sR = Integer.parseInt(s.next())-1;
      int sC = Integer.parseInt(s.next())-1 ;
      int eR = Integer.parseInt(s.next()) -1;
      int eC = Integer.parseInt(s.next())-1;
      doc[sR][sC]=1;

      for(int i=0;i<4;i++){
        int r= sR+moves[i][0];
        int c=sC+moves[i][1];
        if(r>=0 && r< n && c>=0 && c<m && doc[r][c]!=-1){
          nums[r][c]=1;
          sums[r][c]=1;
        }
      }
      //System.out.println("hi");
      while(t > 1){
        move(nums);
      for(int i=0; i<n;i++){
          for (int l=0; l < m; l++){
            nums[i][l] = sums[i][l];
          }
        }
        t--;
      }
      return sums[eR][eC];
    }
    catch(FileNotFoundException e){
      System.out.println("File Not Found:" + filename);
    }

    return -1;
  }
  public static int[][] move(int[][] nums){
    int[][] moves = {{1, 0},{-1, 0},{0, 1},{0, -1}};
    int n =nums.length;
    int m = nums[0].length;
    int[][] sums=new int[n][m];
    for(int i=0;i<n;i++){
      for (int j=0;j<m;j++){
        if(nums[i][j]==-1){
          sums[i][j]=-1
        }
        else{
        int nextTo=0;
        for (int l=0; l< 4; l++){
          int r = i + moves[l][0];
          int c = l + moves[l][1];
          if (r >= 0 && r <n && c >= 0 && c < m && nums[r][c] != -1){
            nextTo+=sums[r][c];
          }
        }
        sums[i][j]=nextTo;
      }
    }
  }
  return sums;
}
  }




}
