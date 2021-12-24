import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Lab01 {
    static Set<String> keywordarray = new HashSet<String>(); //declear hashset
    static Set<String> identifierarray = new HashSet<String>();
    static Set<String> mathoperatorarray = new HashSet<String>();
    static Set<String> logicaloperatorarray = new HashSet<String>();
    static Set<String> numberarray = new HashSet<String>();
    static Set<String> otherarray = new HashSet<String>();

    public static void lexicalanalyzer(String line){
        StringTokenizer xD = new StringTokenizer(line); //int a, b, c;
        while(xD.hasMoreTokens()){
            String token = xD.nextToken(); //token vaag hoitese space hishebe //int
            if(token.contains(",")){
                String temp[] = token.split(",");   //comma ar semicolon separate korlam
                token = temp[0];
                otherarray.add(",");
            }
            else if(token.contains(";")){
                String temp[] = token.split(";");
                token = temp[0];
                otherarray.add(";");
            }

            switch(token){
                case "int": case "float": case "if": case "else":
                    keywordarray.add(token);
                    break;
                case "+": case "-": case "*": case "/": case "=":
                    mathoperatorarray.add(token);
                    break;
                case ">": case "<": case "<=": case ">=":
                    logicaloperatorarray.add(token);
                    break;
                case "(": case ")": case "{": case "}":
                    otherarray.add(token);
                    break;
                default:
                    if(Character.isDigit(token.charAt(0))){
                        numberarray.add(token);
                    }
                    else{
                        identifierarray.add(token);
                    }
            }
        }

    }


    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Users\\user\\Desktop\\Study Materials\\Summer-21\\CSE420Lab\\src\\input.txt");  //Directory of file location
        BufferedReader xD = new BufferedReader(file);
        String code_read = null;
        while ((code_read = xD.readLine()) != null) {
            lexicalanalyzer(code_read);   //int a, b, c;
        }
        System.out.println("Keywords: " + keywordarray);
        System.out.println("Identifiers: " + identifierarray);
        System.out.println("Math Operators: " + mathoperatorarray);
        System.out.println("Logical Operators: " + logicaloperatorarray);
        System.out.println("Numerical Values: " + numberarray);
        System.out.println("Others: " + otherarray);

    }
}
