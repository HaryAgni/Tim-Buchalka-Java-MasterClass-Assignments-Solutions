public class Point {
    private int x;
    private int y;
    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

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
    public double distance(){
        return distance(0,0);
    }
    public double distance(int x2, int y2){
        double distance=Math.sqrt((double)(x-x2)*(x-x2)+(double)(y-y2)*(y-y2));
        return distance;
    }
    public double distance(Point another){
        return distance(another.getX(),another.getY());
    }
}
