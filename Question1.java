import java.util.Scanner;
public class Question1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int UserInput = scanner.nextInt();
        
        for(int i = 1; i <= UserInput; ++i) {
            for(int j = 0; j < UserInput - i; j++) {
                System.out.print("\t");
            }
            for(int k = 0; k < 2 * i - 1; k++){
            if(k < i){
                    System.out.print(i - k + "\t");
                }
                else{
                    System.out.print(k - i + 2 + "\t");
                }
            }
            System.out.println();
        }
    }
}
