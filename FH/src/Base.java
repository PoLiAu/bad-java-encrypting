import java.util.*;

class Base{
    static Map<String, String> getNs() {//0
        Map<String, String> ns = new HashMap<>();
        ns.put("1","qhd");
        ns.put("2","stf");
        ns.put("3","asf");
        ns.put("4","nvs");
        ns.put("5","mcl");
        ns.put("6","olr");
        ns.put("7","lcb");
        ns.put("8","djc");
        ns.put("9","jvb");
        ns.put("0","xvd");
        return ns;
    }
    static String getFromNs(int t,String val){
        String r;
        switch (val){
            case "qhd":r="1";
                    break;
            default:r="";
                    break;
        }
        return r;
    }
    static Map<String, String> getSNs() {//1
        Map<String, String> ns = new HashMap<>();
        ns.put("1","q5d");
        ns.put("2","s2f");
        ns.put("3","a7f");
        ns.put("4","n1s");
        ns.put("5","m9l");
        ns.put("6","o4r");
        ns.put("7","l8b");
        ns.put("8","d0c");
        ns.put("9","j3b");
        ns.put("0","x6d");
        return ns;
    }
    static Map<String, String> getFPs() {//2
        Map<String, String> ns = new HashMap<>();
        ns.put("q","vds");
        ns.put("w","m,v");
        ns.put("e","fzp");
        ns.put("r","ofv");
        ns.put("t","q,e");
        ns.put("y","utg");
        ns.put("u","poi");
        ns.put("i","vhj");
        ns.put("o","mkj");
        ns.put("p","ser");
        ns.put("й","tre");
        ns.put("ц","qwd");
        ns.put("у","bvh");
        ns.put("к","mjk");
        ns.put("е","zdf");
        ns.put("н","wer");
        ns.put("г","vhl");
        ns.put("ш","ctu");
        ns.put("щ","gtf");
        ns.put("з","bkl");
        ns.put("х","n.k");
        ns.put("ъ","rth");
        return ns;
    }
    static Map<String, String> getSFPs() {//3
        Map<String, String> ns = new HashMap<>();
        ns.put("q", "vd9");
        ns.put("w", "m,0");
        ns.put("e", "fz4");
        ns.put("r", "of1");
        ns.put("t", "q5t");
        ns.put("y", "ut7");
        ns.put("u", "po2");
        ns.put("i", "vh3");
        ns.put("o", "mk8");
        ns.put("p", "se6");
        ns.put("й", "tr9");
        ns.put("ц", "qw3");
        ns.put("у", "bv6");
        ns.put("к", "mj2");
        ns.put("е", "zd8");
        ns.put("н", "we1");
        ns.put("г", "vh3");
        ns.put("ш", "ct3");
        ns.put("щ", "gt2");
        ns.put("з", "bk1");
        ns.put("х", "n.9");
        ns.put("ъ", "rt5");
        return ns;
    }
}
