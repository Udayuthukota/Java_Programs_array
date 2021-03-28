/*

1  1  0             2    2   0

1  1  0    -->      2    2   0

1  0  1             2    0   0




*/
import java.util.Scanner;

public class Floodfill {
	
	
	public int[][]  flood(int[][] image,int sr, int sc, int newColor) {
		
		int color = image[sr][sc];
		
		if(color!= newColor) {
			helper(image,sr,sc,newColor,color);
		}
		
		return image;
	}
	
	
	public void helper(int[][]image,int i,int j,int newColor,int color) {
		
		
		if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!= color )
			return;
		image[i][j] = newColor;
		helper(image,i+1,j,newColor,color);
		helper(image,i-1,j,newColor,color);
		helper(image,i,j+1,newColor,color);
		helper(image,i,j-1,newColor,color);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		  int n =scan.nextInt();
		  int[][] arr = new int[n][n];
		  for(int i=0;i<n;i++) {
			  for(int j=0;j<n;j++) {
				  arr[i][j]=scan.nextInt();
			  }
		  }
		  int newColor = 2,sr=1,sc=1;

		  Floodfill ff= new Floodfill();
		  
		  int[][] res= ff.flood(arr,sr,sc,newColor);
		  
		  for(int i=0;i<n;i++) {
			  for(int j=0;j<n;j++) {
				System.out.println(res[i][j]);  
			  }
			  System.out.println('\n');
		  }
	}

}
