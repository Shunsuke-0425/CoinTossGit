import java.util.Scanner;
public class cointoss{
    public static void main(String[] args){
        System.out.println("Who are you?");
        System.out.print(">");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("Hello,"+str+"!");
        System.out.println("Tossing a coin...");
        int rand;
        int heads = 0;
        int tails = 0;
        for(int i=1;i<=3;i++){
            rand = new java.util.Random().nextInt(2);
            if(rand==0){
                System.out.println("Round "+i+": Heads");
                heads++;
            }
            else{
                System.out.println("Round "+i+": Tails");
                tails++;
            }
        }
        System.out.println("Heads: "+heads+", Tails: "+tails);
        if(heads>tails)System.out.println(str+" win!");
        else System.out.println(str+" lost!");
    }
}