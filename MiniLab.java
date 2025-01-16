import java.util.*;
public class MiniLab{
    public static void main(String[]args){
        ArrayList<String> flavors = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 6; i++){
            System.out.println("What is your favorite ice cream flavor: ");
            String in = input.nextLine();
            flavors.add(in);
        }
        System.out.println("");
        for(String k: flavors){
            System.out.println(k);
        }
    }
}