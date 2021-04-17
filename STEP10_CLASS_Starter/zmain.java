package STEP10_CLASS_Starter;

public class zmain {
    public static void main(String[] args) {
        z input=new z();
        input.setName("ali AT");
        input.setNumber(56);
        input.setAccount(5687.7);


        System.out.println("name= " + input.getName());
        System.out.println("musteri yasi=" + input.getNumber());
        System.out.println("hesap tutari=" + input.getAccount());
    }
}
