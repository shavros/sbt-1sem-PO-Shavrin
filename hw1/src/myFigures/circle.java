package myFigures;

public class circle {
    int r;

    public circle(int r){
        this.r = r;
    }

    public double calculateArea(){
        return 3.14 * this.r * this.r;
    }
}
