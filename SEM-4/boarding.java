import java.util.*;
public class boarding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int top =-1;

        int [] arr = new int [100];
        for (int i = 0; i <n ; i++) {
            String command = sc.nextLine();

            if(command.startsWith("Push")){
                int value = Integer.parseInt(command.split(" ")[1]);
                if(top==99){
                    System.out.println("overflow");
                }
                else{
                    top=top+1;
                    arr[top]=value;
                }
            }

            else if(command.equals("Pop")){
                if(top==-1){
                    System.out.println("Stack Underflow");
                }
                else{
                    arr[top]=0;
                    top=top-1;
                }
            }

            else if(command.equals("Top")){
                if(top==-1){
                    System.out.println("Stack is empty");
                }
                else{
                    System.out.println(arr[top]);
                }

            }
            else if(command.equals("IsEmpty")){
                if(top==-1){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }
            else if(command.equals("Size")){
                System.out.println(top+1);
            }

        }
    }
}