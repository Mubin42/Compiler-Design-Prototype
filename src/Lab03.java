import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Lab03 {
    public static List<String> reList =  new ArrayList<>();
    public static List<String> strings =  new ArrayList<>();

    public static void matchregex(){
        for(String s1:strings){ //pura string check kortesi
            innerloop:
            for(int i=0; i<reList.size();i++){
                if(Pattern.matches(reList.get(i),s1)){           //string match koraitesi
                    System.out.println("Yes, " + (i+1));
                break innerloop;                                 //pura loop theke ber hoye gese,
                }
                else if(i==reList.size()-1){
                    System.out.println("No, 0");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner xD = new Scanner(System.in);
        System.out.println("Enter the number of regex : ");      //regex input koraitesi
        int num1 = xD.nextInt();
        for(int i = 0;i<num1;i++){
            reList.add(xD.next());
        }

        System.out.println("Enter the number of Strings : ");    //strings input koraitesi
        int num2 = xD.nextInt();
        for(int i = 0;i<num2;i++){
            strings.add(xD.next());
        }
        matchregex();
    }
}
