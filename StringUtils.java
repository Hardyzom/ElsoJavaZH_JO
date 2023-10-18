public class StringUtils {
    private StringUtils(){  //nem lehet példányosítani

    }

    public static String rotateStringRight(String szo){
        StringBuilder sb = new StringBuilder();

        char[] karakterek = szo.toCharArray();

        sb.append(karakterek[szo.length()]);
        for(int i = 0; i < szo.length() - 1; i++){
            sb.append(karakterek[i]);
        }

        return sb.toString();

    }
    public static String rotateStringRight(String szo, int db){
        String eredmeny = szo;
        for(int i = 0; i < db; i++){
            eredmeny = rotateStringRight(eredmeny);
        }

        return eredmeny;
    }
}
