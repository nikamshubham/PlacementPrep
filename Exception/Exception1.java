package Exception;

public class Exception1 {

	public static void main(String[] args) {
		try {
			int res = 10/0;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println(e);
		}
		System.out.println("Exception handles");
	}
}

/*
inside main method exception occured so main method creates an exception object and pass to jvm 
jvm check if that method handling that exception or not if not that jvm will abruptly terminate
that method and pass exception object to caller methodif their is no caller method then jvm pass
this exception object to default exception handler and it will print that exception.
*/
