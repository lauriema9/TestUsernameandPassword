
import java.util.Scanner;
public class TestUsernameandPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String username,username1;
    username = "Likun";
    String password,password1;
    password = "GoodLuck";
    
    Scanner keyborad1 = new Scanner(System.in);
    Scanner keyborad2 = new Scanner(System.in);
    System.out.println("Enter username: ");
    username1 = keyborad1.next();
    System.out.println("Enter password: ");
    password1 = keyborad2.next();
    
    if (username1.equals(username) && password1.equals(password))
    {
    	System.out.println("Welcome Likun Ma!");
    }
    	else
    	{
    		System.out.println("Wrong USERNAME or PASSWORD!");
    	}
    
    		
    		
	}

}
