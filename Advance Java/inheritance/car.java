public class car{
    private int price;
    private int engine_Hp;
    private int capacity;
    private String colour;
    private String fuel_type;

    public void setPrice(int Price){
        price = Price;
    }
    public void setHP(int HP){
        engine_Hp = HP;
    }
    public void setseatsCapacity(int seats){
        capacity = seats;
    }
    public void setfule_type(String fule){
        fuel_type = fule;
    }
    public void setcolour(String Colour){
        colour = Colour;
    }
    int getPrice(){
        return (price);
    }
    int getEngine_Hp(){
        return (engine_Hp);
    }
    int getSeatsCapacity(){
        return (capacity);
    }
    String getfule_type(){
        return(fuel_type);
    }
    String getcolour(){
        return(colour);
    }
    void Show(){
        System.out.println("Price: "+price+", Engine HP: "+engine_Hp+"\nSeat capactity: "+capacity+", Fule type: "
        +fuel_type+"\nColour: "+colour);
    }
}