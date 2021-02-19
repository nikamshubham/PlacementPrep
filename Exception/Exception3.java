package Exception;

import java.util.Scanner;

class YoungException extends RuntimeException{
	YoungException(String msg){
		super(msg);
	}
}
public class Exception3 {

	public static void main(String[] args){
		System.out.print("Enter age - ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			if(age<18)
			{
				throw new YoungException("you are not eligible");
//	it will give compile time error if we write anything after throw exception //unreachable code
//				System.out.println("fail");
			}	
			else
				System.out.println("You are eligible");
		} catch (YoungException e) {
			System.out.println(e);
		}
	}
}

/*
throw keyword is used to explicitly throw an exception to jvm mostly we used throw 
to to customize exception.
even if we write throw keyword we need to handle the exception using try catch block 
otherwise jvm will abruptly terminate the method .

*/
