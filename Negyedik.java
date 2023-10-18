import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Negyedik {
    public static void main(String[] args){
        List<String> sorok = FileUtils.readLines("people.csv");
        List<String> szinek = new ArrayList<>();

        String aktualisSzin;
        int sargaSzamlalo = 0;

        for (String sor: sorok){
            aktualisSzin = sor.split(",")[4]; //4. indexen van a szín
            if(aktualisSzin.equals("YELLOW")){
                sargaSzamlalo++;
            }

            if(!szinek.contains(aktualisSzin.toLowerCase())){
                szinek.add(aktualisSzin.toLowerCase());
            }
        }

        Collections.sort(szinek); //helyben rendezi a listát

        System.out.println("Colors: " + szinek);
        System.out.println("The number of people whose favorite color is yellow: " + sargaSzamlalo);

    }
}
