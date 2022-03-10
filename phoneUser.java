
package interface2;


public class phoneUser {
    
    private phone Phone; // private namaClass namaObject/namaAtribut (membuat object dari class lain)

    phoneUser(phone phone) { //method konstruktor //parameter nya itu nama objek yg di mainclass
        this.Phone=phone;
    }
    
    
    public void turnOn(){
      this.Phone.powerOn(); //this.namaObject di class ini.method diclass lain ====> buat manggil method
    }
    public void turnOff(){
        this.Phone.powerOff();
    }
    public void makeLouder(){
        this.Phone.volumeUp();
    }
    public void makeSilent(){
        this.Phone.volumeDown();
    }
    
}
