package Converters;

public class DecimalToOctal {

	public static void main(String[] args) {
		int decimal = 372;
		System.out.println("Decimal Value is : "+decimal);
		int octal = 0;
		int power = 0;
		while(decimal > 0){
			int r = decimal % 8;
			octal += r * Math.pow(10, power);
			decimal = decimal / 8;
			power++;
		}
		System.out.println("Octal Value is : "+octal);
		
	}

}
/*
OUTPUT

Decimal Value is : 57
Octal Value is : 71
*/