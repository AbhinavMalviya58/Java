public class carOeder extends car{
    private int noOfOrder;
    private int duePatment;
    private String ownerName;
    public void setNoOfOrder(int order){
        noOfOrder = order;
    }
    public void setDuePayment(int pay){
        duePatment = pay;
    }
    public void setOwnerName(String Name){
        ownerName = Name;
    }
    int getNoOfOrder(){
        return(noOfOrder);
    }
    int getDuePayment(){
        return(duePatment);
    }
    String getOwnerName(){
        return(ownerName);
    }
    void oederShow(){
        System.out.println("Number of order: "+noOfOrder+"\nDue payment: "+duePatment+"\nOwner name: "+ownerName);
    }
}