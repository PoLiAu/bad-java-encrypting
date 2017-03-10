import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String path, passwd="";
        if (args.length!=1) {
            path="/home/niklev/test.txt";//s.next();
        }else{
            path=args[0];
        }
        Random r=new Random();
        for (int i = 0; i < 5; i++) {

            passwd=passwd+String.valueOf(r.nextInt(4));
        }
        writeToFile(path,"123");
        String crypted=Crypt(path,passwd);
        System.out.print(crypted+' '+passwd);
        //System.out.print(Decrypt(crypted,passwd));
        s.close();
    }

    /*private static String Decrypt(String path, String passwd) {
        String str=readFromFile(path);
        for (int i = 0; i < passwd.length(); i++) {
            if (passwd.charAt(i)=='0'){
                for (int j = 0; j < str.length(); j++) {
                    boolean b=Base.getNs().containsValue(String.valueOf(str.charAt(j)));
                    if (b) {
                        str = str.replaceFirst(Base.getNs().);
                        j+=3;
                    }
                }
            }
            if (passwd.charAt(i)=='1'){
                for (int j = 0; j < str.length(); j++) {
                    boolean b=Base.getSNs().containsKey(String.valueOf(str.charAt(j)));
                    if (b) {
                        str = str.replaceFirst(String.valueOf(str.charAt(j)), Base.getSNs().get(String.valueOf(str.charAt(j))));
                        j+=3;
                    }
                }
            }
            if (passwd.charAt(i)=='2'){
                for (int j = 0; j < str.length(); j++) {
                    boolean b=Base.getFPs().containsKey(String.valueOf(str.charAt(j)));
                    if (b) {
                        str = str.replaceFirst(String.valueOf(str.charAt(j)), Base.getFPs().get(String.valueOf(str.charAt(j))));
                        j+=3;
                    }
                }
            }
            if (passwd.charAt(i)=='3'){
                for (int j = 0; j < str.length(); j++) {
                    boolean b=Base.getSFPs().containsKey(String.valueOf(str.charAt(j)));
                    if (b) {
                        str = str.replaceFirst(String.valueOf(str.charAt(j)), Base.getSFPs().get(String.valueOf(str.charAt(j))));
                        j+=3;
                    }
                }
            }
        }
        writeToFile(path,str);
        return (str);
    }*/

    private static String Crypt(String path, String passwd) {
        String str=readFromFile(path);
        for (int i = 0; i < passwd.length(); i++) {
           if (passwd.charAt(i)=='0'){
               int j=0;
               int ls=str.length();
               for (int j1 = 0; j1 < ls; j1++) {
                   boolean b=Base.getNs().containsKey(String.valueOf(str.charAt(j)));
                   if (b) {
                       String sstr=str.substring(j);
                       str =j==0 ? sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getNs().get(String.valueOf(sstr.charAt(0)))) :str.substring(0,j)+sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getNs().get(String.valueOf(sstr.charAt(0))));
                       j+=3;
                   }
               }
           }
            if (passwd.charAt(i)=='1'){
                int j=0;
                int ls=str.length();
                for (int j1 = 0; j1 < ls; j1++) {
                    boolean b=Base.getSNs().containsKey(String.valueOf(str.charAt(j)));
                    if (b) {
                        String sstr=str.substring(j);
                        str =j==0 ? sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getSNs().get(String.valueOf(sstr.charAt(0)))) : str.substring(0,j)+sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getSNs().get(String.valueOf(sstr.charAt(0))));
                        j+=3;
                    }
                }
            }
            if (passwd.charAt(i)=='2'){
                int j=0;
                int ls=str.length();
                for (int j1 = 0; j1 < ls; j1++) {
                    boolean b=Base.getFPs().containsKey(String.valueOf(str.charAt(j)));
                    if (b) {
                        String sstr=str.substring(j);
                        str =j==0 ? sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getFPs().get(String.valueOf(sstr.charAt(0)))) :  str.substring(0,j)+sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getFPs().get(String.valueOf(sstr.charAt(0))));
                        j+=3;
                    }
                }
            }
            if (passwd.charAt(i)=='3'){
                int j=0;
                int ls=str.length();
                for (int j1 = 0; j1 < ls; j1++) {
                    boolean b=Base.getSFPs().containsKey(String.valueOf(str.charAt(j)));
                    if (b) {
                        String sstr=str.substring(j);
                        str =j==0 ? sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getSFPs().get(String.valueOf(sstr.charAt(0)))) :  str.substring(0,j)+sstr.replaceFirst(String.valueOf(sstr.charAt(0)), Base.getSFPs().get(String.valueOf(sstr.charAt(0))));
                        j+=3;
                    }
                }
            }
        }
        writeToFile(path,str);
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
