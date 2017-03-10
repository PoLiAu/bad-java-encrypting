import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        boolean d;
        String str, passwd="";
        System.out.println("Decrypt or encrypt? d/e");
        d = s.next().equals("d");
        System.out.println("Take text from console or file? t/f");
        if (s.next().equals("t")) {
            System.out.println("No spaces! Use _ like_here");
            str=s.next();
        }else{
            str=readFromFile(s.next());
        }
        Random r=new Random();
        System.out.println("Input passwd or generate it? i/g");
        String st=s.next();
        if (st.equals("i")){
            passwd=s.next();
        }else{
            for (int i = 0; i < 30; i++) {
                passwd=passwd+String.valueOf(r.nextInt(4));
            }
            System.out.println(passwd);
        }
        String cry=d?Decrypt(str,passwd):Crypt(str,passwd);
        System.out.println(cry);
        System.out.println("Write to file? y/n");
        if (s.next().equals("y")) {
            writeToFile(s.next(),cry);
        }
        s.close();
    }

    private static String Decrypt(String str, String passwd) {
        for (int i = passwd.length()-1; i > -1 ; i--) {
            switch (passwd.charAt(i)) {
                case '0' :{
                    int j = 0;
                    while (j < str.length()- 2) {
                        boolean b = Base.getNs().containsValue(str.substring(j, j + 3));
                        if (b) {
                            str = str.replaceFirst(str.substring(j, j + 3), Base.getFromNs(str.substring(j, j + 3)));
                        }
                        j++;
                    }
                    break;
                }
                case '1' :{
                    int j = 0;
                    while (j < str.length()- 2) {
                        boolean b = Base.getSNs().containsValue(str.substring(j, j + 3));
                        if (b) {
                            str = str.replaceFirst(str.substring(j, j + 3), Base.getFromSNs(str.substring(j, j + 3)));
                        }
                        j++;
                    }
                    break;
                }
                case '2' :{
                    int j = 0;
                    while (j < str.length()- 2) {
                        boolean b = Base.getFPs().containsValue(str.substring(j, j + 3));
                        if (b) {
                            str = str.replaceFirst(str.substring(j, j + 3), Base.getFromFPs(str.substring(j, j + 3)));
                        }
                        j++;
                    }
                    break;
                }
                case '3' :{
                    int j = 0;
                    while (j < str.length()- 2) {
                        boolean b = Base.getSFPs().containsValue(str.substring(j, j + 3));
                        if (b) {
                            str = str.replaceFirst(str.substring(j, j + 3), Base.getFromSFPs(str.substring(j, j + 3)));
                        }
                        j++;
                    }
                    break;
                }
            }
        }
        return (str);
    }

    private static String Crypt(String str, String passwd) {
        for (int i = 0; i < passwd.length(); i++) {
            switch (passwd.charAt(i)) {
                case '0' :{
                    int j = 0;
                    int ls = str.length();
                    for (int j1 = 0; j1 < ls; j1++) {
                        boolean b = Base.getNs().containsKey(String.valueOf(str.charAt(j)));
                        if (b) {
                            String sstr = str.substring(j);
                            str = j == 0 ? sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getNs().get(String.valueOf(sstr.charAt(0)))) : str.substring(0, j) + sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getNs().get(String.valueOf(sstr.charAt(0))));
                            j += 2;
                        }
                        j++;
                    }
                }
                case '1' :{
                    int j = 0;
                    int ls = str.length();
                    for (int j1 = 0; j1 < ls; j1++) {
                        boolean b = Base.getSNs().containsKey(String.valueOf(str.charAt(j)));
                        if (b) {
                            String sstr = str.substring(j);
                            str = j == 0 ? sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getSNs().get(String.valueOf(sstr.charAt(0)))) : str.substring(0, j) + sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getSNs().get(String.valueOf(sstr.charAt(0))));
                            j += 2;
                        }
                        j++;
                    }
                }
                case '2' :{
                    int j = 0;
                    int ls = str.length();
                    for (int j1 = 0; j1 < ls; j1++) {
                        boolean b = Base.getFPs().containsKey(String.valueOf(str.charAt(j)));
                        if (b) {
                            String sstr = str.substring(j);
                            str = j == 0 ? sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getFPs().get(String.valueOf(sstr.charAt(0)))) : str.substring(0, j) + sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getFPs().get(String.valueOf(sstr.charAt(0))));
                            j += 2;
                        }
                        j++;
                    }
                }
                case '3' :{
                    int j = 0;
                    int ls = str.length();
                    for (int j1 = 0; j1 < ls; j1++) {
                        boolean b = Base.getSFPs().containsKey(String.valueOf(str.charAt(j)));
                        if (b) {
                            String sstr = str.substring(j);
                            str = j == 0 ? sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getSFPs().get(String.valueOf(sstr.charAt(0)))) : str.substring(0, j) + sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getSFPs().get(String.valueOf(sstr.charAt(0))));
                            j += 2;
                        }
                        j++;
                    }
                }
            }
        }
        return (str);
    }

    private static void writeToFile(String path, String str) {
        try(FileOutputStream fos=new FileOutputStream(path))
        {
            byte[] buffer = str.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


    private static String readFromFile(String path) {
        String str="";
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            int i;
            assert fin != null;
            while ((i = fin.read()) != -1) {
                str = str + (char) i;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return str;
    }
}
