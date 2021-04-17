package STEP10_CLASS_Starter;

public class property {

    private String color;
    private int doors;
    private double engine;

    public void setColor(String color){
        if(color=="blue"||color=="orange"){
            this.color=color;
        }
        else
            System.out.println("you can choose just orange or blue");
    }
    public String getColor(){
        return this.color;
    }
    public void setDoors(int doors){
        if (doors==2|doors==4){
            this.doors=doors;
        }
        else
            System.out.println("you can choose 2 or 4");
    }
    public int getDoors(){
        return this.doors;
    }

}
