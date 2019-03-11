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

        for(int l=0;l<m;l++){
          ch=x.charAt(l);
          if(ch=='.'){
            doc[i][l]=0;
        }
          if(ch=='*'){
            doc[i][l]=-1;
          }
      }
    }


      int sR = Integer.parseInt(s.next())-1;
      int sC = Integer.parseInt(s.next())-1 ;
      int eR = Integer.parseInt(s.next()) -1;
      int eC = Integer.parseInt(s.next())-1;
      doc[sR][sC]=1;
      int[][] moves = {{1, 0},{-1, 0},{0, 1},{0, -1}};

    for(int k=0;k<t;k++){
        doc=move(doc);

      }

      return doc[eR][eC];


  }
  public static int[][] move(int[][] nums){
    int[][] moves = {{1, 0},{-1, 0},{0, 1},{0, -1}};
    int n =nums.length;
    int m = nums[0].length;
    int[][] sums=new int[n][m];
    for(int i=0;i<n;i++){
      for (int j=0;j<m;j++){
        if(nums[i][j]==-1){
          sums[i][j]=-1;
}
        else{
        int nextTo=0;
        for (int l=0; l< 4; l++){
          int r = i + moves[l][0];
          int c = j + moves[l][1];
          if (r >= 0 && r <n && c >= 0 && c < m && nums[r][c] != -1){
            nextTo+=nums[r][c];
          }
        }
        sums[i][j]=nextTo;
      }
    }
  }
  return sums;
}
  }

  //I SPENT HOURS TRYING TO FIGURE OUT SILVER. MOHHAMAD JAWWAD HELPED ME WORK THROUGH MY CODE AND UNDERSTAND MY  LOGICAL
  //MISTAKES AS WELL AS FOUND STUPID  VARIABLE ERRORS...FULL CREDIT TO  HIM FOR HIS HELP
