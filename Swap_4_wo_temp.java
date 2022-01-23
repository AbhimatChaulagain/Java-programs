
public class Swap_4_wo_temp {
	public static void main(String[] args) {
		int a=100; int b=200; int c=300; int d=400;
		System.out.println("Before Swapping: ");
		System.out.println("Fno: "+a+" Sno: "+b+ " Tno: "+c+ " Fourth: "+d);
		//Swapping
		a=a+b+c+d;
		d=a-b-c-d;
		c=a-b-c-d;
		b=a-b-c-d;
		a=a-b-c-d;
		System.out.println("After Swapping: ");
		System.out.println("Fno: "+a+ " Sno: "+b+ " Tno: "+c+ " Fourth: "+d);
	}

}
