import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Lab04 {
    static String[] datatype = {"void","int","String","double","float","Integer"};
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Users\\user\\Desktop\\Study Materials\\Summer-21\\CSE420Lab\\src\\input1.txt");
        BufferedReader br = new BufferedReader(file);
        String code_read = br.readLine();
        System.out.println("Methods: ");
        while ((code_read = br.readLine()) != null) {
            symbol_Table(code_read);
        }

    }

    public static void symbol_Table(String code_read) {
        StringTokenizer xD = new StringTokenizer(code_read); //space diye token e vaag korlam
        if (code_read.contains("(") && !code_read.contains("main")&&(!code_read.contains("System"))) {
            String s = xD.nextToken();  //prothom token
            String rtrn = "";

            if (s.equals("public")) {
                rtrn = s = xD.nextToken();
            }
            if (s.equals("static")) {
                rtrn = s = xD.nextToken();
            }
            s = xD.nextToken("{");
            System.out.println(s.trim());  //space kete dibe s er shuru or sesh theke theke
            System.out.println("return type : " + rtrn);
            System.out.println("");

        }
        }
    }