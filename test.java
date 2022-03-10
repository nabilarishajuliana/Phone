
package interface2;
import java.util.Scanner;
public class test {

   static Scanner  masukkan = new Scanner  (System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        //objek hp
        phone redmi=new xiaomi(); //bisa langsung manggil subclassnya
        phone iphone11=new iphone();
        phone samsungs1=new samsung();
        phone oppo11=new oppo();
        
        
        //objek user
        phoneUser dian=new phoneUser(redmi); //masukin objek phone,contoh redmi
        phoneUser lala=new phoneUser(iphone11);
        phoneUser lili=new phoneUser(samsungs1);
        phoneUser lulu=new phoneUser(oppo11);
        
//         dian.turnOn();
//         dian.makeLouder();
        
        while (true){
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            int aksi=masukkan.nextInt();

switch (aksi){
    case 1:
        dian.turnOn();
//        lala.turnOn();
//        lili.turnOn();
//        lulu.turnOn();
        break;

    case 2:
        dian.turnOff();
//        lala.turnOff();
//        lili.turnOff();
//        lulu.turnOff();
        break;

    case 3:
        dian.makeLouder();
//        lala.makeLouder();
//        lili.makeLouder();
//        lulu.makeLouder();
        break;

    case 4:
        dian.makeSilent();
//        lala.makeSilent();
//        lili.makeSilent();
//        lulu.makeSilent();
        break;

    case 0:
        System.exit(0);
        break;
        
    default:
        System.out.println("salah input!!!!");
        }

            
//            if (aksi==1){
//                dian.turnOn();
//            }
//            else if (aksi==2){
//                dian.turnOff();
//            }
//             else if (aksi==3){
//                dian.makeLouder();
//            }
//             else if (aksi==4){
//                dian.makeSilent();
//            }
//             else if (aksi==0){
//               System.exit(0);
//            }
//             else{
//                 System.out.println("salah input");
//                 System.exit(0);
//             }

    }
        
        
    
}
}
