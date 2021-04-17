package STEP10_CLASS_Starter;

public class tata {
    private String color;
    private int number;
    private double heavy;

    public tata() {
        System.out.println("kemal");

    }

    public tata(String color, int number, double heavy){ //constractur bu
        this.color=color;
        this.number=number;
        this.heavy=heavy;
    }
    public  void showInfos(){
        System.out.println("araba modeli=" + this.color);
        System.out.println("araba kapi sayisi=" + this.number);
        System.out.println("araba agiriligi=" + this.heavy);
    }
}

