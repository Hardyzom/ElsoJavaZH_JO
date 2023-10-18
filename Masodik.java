import java.util.Scanner;

public class Masodik {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Kerem adjon meg egy sztringet: ");
        String szo = sc.nextLine();
        System.out.print("Adja meg hanya karakterrel szeretne jobbra rotalni a sztringet: ");
        String db = sc.nextLine();
        sc.close();

        System.out.println("Eredmeny: " + StringUtils.rotateStringRight);


    }
}
