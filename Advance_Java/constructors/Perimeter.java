public class Perimeter {
    public static void main(String []args){
        perimeter P = new perimeter();
        P.a = 8;
        P.show();
        int ans = P.Trianglperimeter();
        System.out.println(ans);
    }
}
class perimeter{
    int a,b,c;
    perimeter(){
        this.a = 2;
        this.b = 4;
        this.c = 6;
    }
    perimeter(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    int Trianglperimeter(){
        int p = a+b+c;
        return p;
    }
    void show(){
        System.out.println("a = "+a+" b = "+b+" c = "+c);
    }
}