
public class Swap_3_wo_temp {
	public static void main(String[] args) {
		int fno=100; int sno=200; int tno=300;
		System.out.println("Before Swapping: ");
		System.out.println("Fno:" +fno+ " Sno: " +sno+ " Tno: " +tno);
		fno=fno+sno+tno; //600
		tno=fno-sno-tno;//600-200-300=100
		sno=fno-sno-tno;// 600-200-100=300
		fno=fno-sno-tno;//600-300-100=200
		System.out.println("After Swapping ");
		System.out.println("Fno: "+fno+ "Sno: "+sno+ " Tno: "+tno);
	}

}
