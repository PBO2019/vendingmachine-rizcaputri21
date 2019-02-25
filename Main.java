import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList <String> a = new ArrayList <String>();
        Scanner aa = new Scanner (System.in);

        MesinKopi arabica = new MesinKopi();
        arabica.setJenisKopi("Arabica");
        arabica.setJumlahStokKopi(40);
        a.add(arabica.getJenisKopi());

        MesinKopi robusta = new MesinKopi();
        robusta.setJenisKopi("Robusta");
        robusta.setJumlahStokKopi(40);
        a.add(robusta.getJenisKopi());

        MesinKopi flores = new MesinKopi();
        flores.setJenisKopi("Flores");
        flores.setJumlahStokKopi(40);
        a.add(flores.getJenisKopi());

        Topping susu = new Topping();
        susu.setJenisTopping("susu");
        susu.setJumlahStokTopping(40);
        a.add(susu.getJenisTopping());

        Topping gula = new Topping();
        gula.setJenisTopping("Gula");
        gula.setJumlahStokTopping(40);
        a.add(gula.getJenisTopping());

        Topping cream = new Topping();
        cream.setJenisTopping("Cream");
        cream.setJumlahStokTopping(40);
        a.add(cream.getJenisTopping());

        for(int i=0; i< a.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+ a.get(i));
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih ");
        int pilihanKopi = keyboard.nextInt() -1;

    }
}
