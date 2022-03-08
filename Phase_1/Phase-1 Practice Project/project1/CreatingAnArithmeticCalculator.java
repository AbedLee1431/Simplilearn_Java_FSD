package project1;
import java.util.Scanner;
public class CreatingAnArithmeticCalculator {

	
		

			public static void main(String[] args) 
			{
				char operator;
				double number1,number2,result;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("*******************");

				System.out.println("Choose the operator for arithmetic operations +, -, *, /, %");

				System.out.println("*******************");

				operator=sc.next().charAt(0);
				
				System.out.println("Enter the first number");
				number1=sc.nextDouble();
				
				System.out.println("Enter the second number");
				number2=sc.nextDouble();
				
				switch (operator) {
				
				case '+' : 
				{
					result=number1+number2;
					System.out.println(number1+"+"+number2+"="+result);
				}
				break;
				
				case '-' :
				{
					result=number1-number2;
					System.out.println(number1+"-"+number2+"="+result);
				}
				break;
				
				case '*' :
				{
					result=number1*number2;
					System.out.println(number1+"*"+number2+"="+result);
				}
				break;
				
				case '/' :
				{
					result=number1/number2;
					System.out.println(number1+"/"+number2+"="+result);
				}
				break;
				
				case '%' :
				{
					result=number1%number2;
					System.out.println(number1+"%"+number2+"="+result);
				}
				break;
				
				default :
				{
					System.out.println("Invalid operator");
				}
				break;
				}
				sc.close();
			}
		}






