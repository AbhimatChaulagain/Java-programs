
public class Swap_4_temp {
	public static void main(String[] args) {
		int fno=100; int sno=200; int tno=300; int fono=400;
		System.out.println("Before Swapping: ");
		System.out.println("Fno: "+fno+" Sno :"+sno+ " Tno: "+tno+" Fono: "+fono);
		//Swapping
		int temp=0;
		temp=fno;
		fno=sno;
		sno=tno;
		tno=fono;
		fono=temp;
		
		System.out.println("After Swapping: ");
		System.out.println("Fno: "+fno+ " Sno: "+sno+" Tno: "+tno+ " Fono: "+fono);
		
				
	}

}
