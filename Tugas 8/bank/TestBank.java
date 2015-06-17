package bank;

/**
 * Created by TTheBraveone on 6/17/2015.
 */
public class TestBank {

    public static void main(String[] args) {

//        buat rekening
        Rek ku = new Rek(1000000.0);
        Nasabah Yanuar = new Nasabah("Yanuar Satria Wijaya");
        Yanuar.setSaldoku(ku);
        System.out.println(Yanuar.toString());
        ku.stoor(10000.0);
        System.out.println(Yanuar.toString());
        ku.tarik(100000.0);
        System.out.println(Yanuar.toString());
    }
}
