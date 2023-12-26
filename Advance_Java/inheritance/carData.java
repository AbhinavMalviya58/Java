public class carData{
    public static void main(String args[]){
        carOeder s1 = new carOeder();
        s1.setPrice(500000);
        s1.setHP(120);
        s1.setseatsCapacity(4);
        s1.setcolour("Red");
        s1.setfule_type("petrol");
        s1.setNoOfOrder(50);
        s1.setDuePayment(25000);
        s1.setOwnerName("MAlviya");
        System.out.println("\n<=====Your car status=====>");
        s1.Show();
        s1.oederShow();
    }
}