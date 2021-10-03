import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner scn=new Scanner(System.in);
	    String testCases=scn.nextLine();
	    int T=Integer.parseInt(testCases);
	    for(int k=1;k<=T;k++){
	    String num=scn.nextLine();
	    int N=Integer.parseInt(num);
	    String s=scn.nextLine();
	    String[] sarr = new String[N];
	    sarr=s.split(" ");
	    int[] A = new int[N];
	    for(int j=0;j<N;j++){
	        A[j]=Integer.parseInt(sarr[j]);
	    }
		
		int l=0;
		int r=A.length-1;
		while(l<r){
		    int temp=A[l];
		    A[l]=A[r];
		    A[r]=temp;
		    l++;
		    r--;
		}
		for(int i=0;i<A.length;i++){
		    System.out.print(A[i]+" ");
		}
	    System.out.print("\n");
	    }
	}
}