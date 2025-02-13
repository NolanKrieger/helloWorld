import java.util.*;
public class calculator{
    public static void main(String[] args){
        Scanner mainScan = new Scanner(System.in);

        int first = mainScan.nextInt();
        int second = mainScan.nextInt();

        System.out.println(first + second);

        System.out.println("Addition or Subtraction?");

        String choice = mainScan.nextLine();
        if(choice.equals("addition")){
            System.out.println(first + second);
        }else if(choice.equals("subtraction")){
            System.out.println(first - second);
        }

        String choiceTwo = mainScan.nextLine();
        if(choice.equals("multiplication")){
            System.out.println(first * second);
        }else if(choice.equals("division")){
            if(second == 0){
                System.out.println("ERROR: division by 0");
            }
            System.out.println(first / second);
        }
    }
}