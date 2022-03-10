
package interface2;


public class samsung implements phone{
    private boolean statusHp;
    private int volume;
    
    samsung(){
        this.volume=80;
    }

    @Override
    public void powerOn() {
         statusHp=true;
         System.out.println("menyalakan Hp SAMSUNG");
    }

    @Override
    public void powerOff() {
         statusHp=false;
        System.out.println("mematikan Hp SAMSUNG");
    }

    @Override
    public void volumeUp() {
         if (statusHp){
            if (this.volume==maxVolume){
                System.out.println("Volume SAMSUNG sudah FULL!!!");  
                System.out.println("volume ="+getVol()+"%");
            }
            else{
                this.volume+=15;
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
                System.out.println("Volume SAMSUNG 0");  
            }
            else{
                this.volume-=15;
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
