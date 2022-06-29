package ft1.aspan;

import java.util.Arrays;
import java.util.Scanner;

public class NomorSatu {
	
	
	public int inputNilai() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Nilai n = ");
		int n = scan.nextInt();
		scan.close();
		
		
		return n;
		
		
	}
	
	public void tentukanDeret() {
		
		int n = inputNilai();
//		int[] arrDeret = new int[n];
		String deretSatu = "";
		
		System.out.println("Deret Satu");
		for (int i =1; i<n*2; i++) {
			
			if(i%2==1) {
				System.out.print(i);
			}
			else {
				System.out.print(" ");
			}
//			arrDeret[i]= i*2;
			
		}
		System.out.println();
		System.out.println("Deret Dua");		
		for (int i =(n*2)-1; i>0; i--) {
			
			if(i%2==1) {
				System.out.print(i);
			}
			else {
				System.out.print(" ");
			}
//			arrDeret[i]= i*2;
			
		}
		
//		System.out.println(Arrays.to(arrDeret));
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		NomorSatu mulai = new NomorSatu();
		mulai.tentukanDeret();
		
	}
	

}
