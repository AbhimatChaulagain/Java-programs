
public class Swap_3_temp {
	public static void main(String[] args) {
		int fno=100; int sno=200; int tno=300;
		System.out.println("Before Swapping: ");
		System.out.println("Fno: "+fno+ " Sno: "+sno+ " Tno:"+tno);
		//swapping
		int temp=0;
		temp=fno; //100
		fno=sno;// 200
		sno=tno;//300
		tno=temp;//100
		System.out.println("After Swapping: ");
		System.out.println("Fno : "+fno+" Sno :"+sno+ " Tno :"+tno);
		
		
	}

}
