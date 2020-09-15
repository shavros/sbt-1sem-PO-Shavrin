package myFigures;

public class rectangle {
    int a;
    int b;

    public rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int calculateArea(){
        return this.a * this.b;
    }
}
