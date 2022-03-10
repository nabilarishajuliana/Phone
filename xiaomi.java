
package interface2;

public class xiaomi implements phone {
    
    private boolean statusHp;
    private int volume;
    
    xiaomi(){
        this.volume=50;
    }
    
     public  void powerOn(){
         statusHp=true;
         System.out.println("menyalakan Hp XIAOMI");
     }
    public  void powerOff(){
        statusHp=false;
        System.out.println("mematikan Hp XIAOMI");
    }
    public  void volumeUp(){
        if (statusHp){
            if (this.volume==maxVolume){
                System.out.println("Volume XIAOMI sudah FULL!!!");  
                System.out.println("volume ="+this.volume+"%");
            }
            else{
                this.volume+=10;
                System.out.println("volume="+this.volume);
            }
        }
        else{
            System.out.println("nyalakan dulu hp nya!!");
        }
    }
    public  void volumeDown(){
        if (statusHp){
            if (this.volume==minVolume){
                System.out.println("Volume XIAOMI 0");  
            }
            else{
                this.volume-=10;
                System.out.println("volume="+this.volume);
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
