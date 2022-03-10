
package interface2;

public class oppo implements phone {
    private boolean statusHp;
    private int volume;
    
    oppo(){
        this.volume=80;
    }
 
    @Override
    public void powerOn() {
         statusHp=true;
         System.out.println("menyalakan Hp OPPO");
    }

    @Override
    public void powerOff() {
         statusHp=false;
        System.out.println("mematikan Hp OPPO");
    }

    @Override
    public void volumeUp() {
         if (statusHp){
            if (this.volume==maxVolume){
                System.out.println("Volume OPPO sudah FULL!!!");  
                System.out.println("volume =100%");
            }
            else{
                this.volume+=20;
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
                System.out.println("Volume OPPO 0%");  
            }
            else{
                this.volume-=20;
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
