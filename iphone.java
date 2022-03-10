
package interface2;

public class iphone implements phone {
    
    private boolean statusHp;
    private int volume;

    public iphone() {
        this.volume = 50;
    }
    
    @Override
    public void powerOn() {
         statusHp=true;
         System.out.println("menyalakan Hp IPHONE");
    }

    @Override
    public void powerOff() {
         statusHp=false;
        System.out.println("mematikan Hp IPHONE");
    }

    @Override
    public void volumeUp() {
         if (statusHp){
            if (this.volume==maxVolume){
                System.out.println("Volume IPHONE sudah FULL!!!");  
                System.out.println("volume =100%");
            }
            else{
                this.volume+=5;
                System.out.println("volume="+getVol());
            }
        }
        else{
            System.out.println("nyalakan dulu hp nya!!");
        }
    }

    @Override
    public void volumeDown() {
       if (statusHp){
            if (this.volume==minVolume){
                System.out.println("Volume IPHONE 0%");  
            }
            else{
                this.volume-=5;
                System.out.println("volume="+getVol());
            }
        }
        else{
            System.out.println("nyalakan dulu hp nya!!");
        }
    }
    
     int getVol(){
        return this.volume;
    }
}
