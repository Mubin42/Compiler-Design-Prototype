import java.util.Scanner;

public class Lab02 { //Classname Lab02
    public static boolean EmailChecker(String str){
        boolean b = false;
        if(!Character.isDigit(str.charAt(0))){ //checking if first digit is number or not
            if(str.contains("@")){ //checking if string contains @ or not
                String [] stringarray = str.split("@");
                if(!Character.isDigit(stringarray[1].charAt(0))){ //first char after @ can't be number
                    b = true;
                }
            }
        }

        return b;
    }

    public static boolean WebsiteChecker(String str){
        boolean b = false;
        if(str.startsWith("www.")){//starts with www.
            if(!Character.isDigit(str.charAt(0))){ //checking if first digit is number or not
                if(!str.endsWith(".")){// not ends with .
                    b = true;
                }

            }
        }
        return b;
    }
    public static void main(String []args){
        System.out.print("Input the number of MailID/Website: ");
        Scanner xD = new Scanner(System.in);
        int num = xD.nextInt();
        int i = 0;
        while(i < num){
            System.out.println("Input String : ");
            String str = xD.next();
            boolean isEmail = EmailChecker(str);
            boolean isWebsite = WebsiteChecker(str);
            if(isEmail){
                System.out.println("Email "+(i+1));
            }
            else if(isWebsite){
                System.out.println("Website "+(i+1));
            }
            else{
                System.out.println("Invalid Format");
            }
            i++;
        }
    }
}
