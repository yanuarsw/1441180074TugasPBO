package bank;

/**
 * Created by TTheBraveone on 6/17/2015.
 */
public class Rek {

    private Double saldo;

    public Rek(Double saldo) {
        this.saldo = saldo;
    }




    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    //    fungsi tarik
    public void tarik(Double jumlah){
        saldo = saldo - jumlah;
        System.out.println("Sisa saldo anda(-)"+jumlah);
    }

    public void stoor(Double jumlah){
        saldo = saldo + jumlah;
        System.out.println("Saldo terakhir anda(+)"+jumlah);
    }

    @Override
    public String toString() {
        return "Rek{" +
                "saldo=" + saldo +
                '}';
    }
}
