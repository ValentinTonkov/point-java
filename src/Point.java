
public class Point {

    private int x;
    private int y;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int getQuadrant() {

        if (x > 0 && y > 0){
            return 1;
        } else if (x < 0 && y > 0){
            return 2;
        } else  if (x < 0 && y < 0){
            return 3;
        } else if (x > 0 && y < 0){
            return 4;
        } else {
            return 0;
        }

    }
}