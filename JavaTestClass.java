import java.util.*;
public class JavaTestClass {
    public static void main (String [] arguments)
    {
        int operator, n1, n2;
        System.out.println("1 - ADD \n 2 - Substract \n 3 - Multiply \n 4 - Divide");
        System.out.print("Choose Operator: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.print("Enter the First Number: ");
        n1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        n2 = sc.nextInt();
        int result=0;
        switch(operator){
            case 1:
            result= n1 + n2;
            break;
            case 2:
            result= n1 - n2;
            break;
            case 3:
            result= n1 * n2;
            break;
            case 4:
            result= n1 / n2;
            break;

            default:
            System.out.println("Entered operator is not valid");
        }
        System.out.println("Result: "+result);

    }
    
}
