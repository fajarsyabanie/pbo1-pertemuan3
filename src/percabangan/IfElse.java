package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 50000;
        double uangDiDompet = 25000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi jajan anda");
        }else if (uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang cukup, selamat menikmati, kembalian :" +angsul);
        }else{
            System.out.println("uang pas.. UwU..");
        }
    }
}
