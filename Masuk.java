import java.util.Scanner;

public class Masuk {
    private String ID="admin123";

    public boolean doMasuk(){
        boolean isMasuk=true;

        String idInput="";
        
        System.out.println("Silahkan Masukan ID Anda");
        System.out.println("=========================");
        System.out.print("ID : ");
        idInput = sc.nextLine();
        if(!idInput.equalsIgnoreCase(ID)){
            System.out.println("ID Anda Salah -> "+idInput);
            isMasuk=false;
        }

        return isMasuk;
    }

}