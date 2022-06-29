package ft1.aspan;

import java.util.Scanner;

public class NomorDua {
	Scanner scan = new Scanner(System.in);
	public int rangeScn = scan.nextInt();
	public int range =2;
	
	
	public int inputDana() {
		
//		Scanner scan = new Scanner(System.in);
		System.out.print("Uang Andi adalah : ");
		int masukanUang = scan.nextInt();
//		int masukanUang = scan.nextInt();
		
		
//		for (int i =0; i<)
		
//		scan.close();
		return masukanUang;
		
		
	}
	
	public int[] inputHargaKacamata() {
//		System.out.print("Uang Andi adalah : ");
		
		int[] arrKacamata = new int[this.rangeScn];
		
		for (int i=0; i<this.rangeScn; i++) {
			System.out.print("harga kacamata ke-"+(i+1)+" = ");
			int masukanHargaKacamata = scan.nextInt();
			arrKacamata[i]= masukanHargaKacamata;
			
		}
		
		System.out.println();
		return arrKacamata;
	}
	
	
	public int[] inputHargaBaju() {
//		System.out.print("harga Baju : ");
		
		int[] arrBaju = new int[this.rangeScn];
		
		for (int i=0; i<this.rangeScn; i++) {
			System.out.print("harga Baju ke-"+(i+1)+" = ");
			int masukanHargaBaju = scan.nextInt();
			arrBaju[i]= masukanHargaBaju;
			
		}
		System.out.println();
		
		
		return arrBaju;
	}
	
	public void bisaBeliApa() {
		
		int uangAndi = inputDana();
		int[] arrHargaBaju = inputHargaBaju();
		int[] arrHargaKacamata = inputHargaKacamata();
		
//		int[] hargaKacamata = {34,26,44};
//		int[] hargaBaju = {21,39,33};
		
		int sum=0;
		int sum1 =0;
		int sum2= 0;
		int count1 =rangeScn-1;
		int count2 =rangeScn-1;
		
		for (int i =0; i<this.rangeScn; i++) {
			
			sum = arrHargaBaju[i]+arrHargaKacamata[i];
			
			if(sum <= uangAndi) {

				System.out.println("Total harga Beli ke-"+(i+1)+" adalah "+sum);
				System.out.println();
			}
			else {
				System.out.println("Barang ke-"+(i+1));
				System.out.println("Dana tidak mencukupi");
				System.out.println();
			}
		}
		
		for (int i =0; i<this.rangeScn; i++) {
			

			sum1 = arrHargaBaju[i]+arrHargaKacamata[count1];
			
			if(sum1 <= uangAndi) {

				System.out.println("Total harga Beli ke-"+(rangeScn+i+1)+" adalah "+sum1);
				System.out.println();
			}
				
			else {
				System.out.println("Barang ke-"+(rangeScn+i+1));
				System.out.println("Dana tidak mencukupi");
				System.out.println();
			}
			count1--;
		}
		for (int i =0; i<this.rangeScn; i++) {
			
			
			sum2 = arrHargaBaju[count2]+arrHargaKacamata[i];
			
			if(sum2 <= uangAndi) {
				System.out.println("Total harga Beli ke-"+((rangeScn*2)+i+1)+" adalah "+sum2);
				System.out.println();
			}
				
			else {
				System.out.println("Barang ke-"+((rangeScn*2)+i+1));
				System.out.println("Dana tidak mencukupi");
				System.out.println();
			}
			count2--;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.print("Masukan Range : ");
		NomorDua mulai = new NomorDua();
		mulai.bisaBeliApa();
		
	}

}
