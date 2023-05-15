package boletin1;
import java.util.Scanner;

public class TerceraClase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float x, y, media;
		x=sc.nextFloat();
		y=sc.nextFloat();
		sc.close();
		media=(x+y)/2;
		System.out.println(media);
	}

}
