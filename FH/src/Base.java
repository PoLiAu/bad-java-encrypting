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
    static String getFromNs(String val){
        String r;
        switch (val){
            case "qhd":r="1";
                    break;
            case "stf":r="2";
                break;
            case "asf":r="3";
                break;
            case "nvs":r="4";
                break;
            case "mcl":r="5";
                break;
            case "olr":r="6";
                break;
            case "lcb":r="7";
                break;
            case "djc":r="8";
                break;
            case "jvb":r="9";
                break;
            case "xvd":r="10";
                break;
            default:r=val;
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
    static String getFromSNs(String val){
        String r;
        switch (val){
            case "q5d":r="1";
                break;
            case "s2f":r="2";
                break;
            case "a7f":r="3";
                break;
            case "n1s":r="4";
                break;
            case "m9l":r="5";
                break;
            case "o4r":r="6";
                break;
            case "l8b":r="7";
                break;
            case "d0c":r="8";
                break;
            case "j3b":r="9";
                break;
            case "x6d":r="10";
                break;
            default:r=val;
                break;
        }
        return r;
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
    static String getFromFPs(String val){
        String r;
        switch (val){
            case "vds":r="q";
                break;
            case "m,v":r="w";
                break;
            case "fzp":r="e";
                break;
            case "ofv":r="r";
                break;
            case "q,e":r="t";
                break;
            case "utg":r="y";
                break;
            case "poi":r="u";
                break;
            case "vhj":r="i";
                break;
            case "mkj":r="o";
                break;
            case "ser":r="p";
                break;
            case "tre":r="й";
                break;
            case "qwd":r="ц";
                break;
            case "bvh":r="у";
                break;
            case "mgk":r="к";
                break;
            case "zdf":r="е";
                break;
            case "ver":r="н";
                break;
            case "vhl":r="г";
                break;
            case "ctu":r="ш";
                break;
            case "gtf":r="щ";
                break;
            case "bkl":r="з";
                break;
            case "h.k":r="х";
                break;
            case "rth":r="ъ";
                break;
            default:r=val;
                break;
        }
        return r;
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
        ns.put("г", "ve3");
        ns.put("ш", "ct3");
        ns.put("щ", "gt2");
        ns.put("з", "bk1");
        ns.put("х", "n.9");
        ns.put("ъ", "rt5");
        return ns;
    }
    static String getFromSFPs(String val) {
        String r;
        switch (val) {
            case "vd9":
                r = "q";
                break;
            case "m,0":
                r = "w";
                break;
            case "fz4":
                r = "e";
                break;
            case "of1":
                r = "r";
                break;
            case "q5e":
                r = "t";
                break;
            case "ut7":
                r = "y";
                break;
            case "po2":
                r = "u";
                break;
            case "vh3":
                r = "i";
                break;
            case "mk8":
                r = "o";
                break;
            case "se6":
                r = "p";
                break;
            case "tr9":
                r = "й";
                break;
            case "qw3":
                r = "ц";
                break;
            case "bv6":
                r = "у";
                break;
            case "mg2":
                r = "к";
                break;
            case "zd8":
                r = "е";
                break;
            case "ve1":
                r = "н";
                break;
            case "ve3":
                r = "г";
                break;
            case "ct3":
                r = "ш";
                break;
            case "gt2":
                r = "щ";
                break;
            case "bk1":
                r = "з";
                break;
            case "h.9":
                r = "х";
                break;
            case "rt5":
                r = "ъ";
                break;
            default:
                r = val;
                break;
        }
        return r;
    }
}
