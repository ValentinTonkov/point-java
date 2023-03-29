public class Main {

    /**
     * @return the distance between two points
     * */
    static double getDistance(Point p1, Point p2){

        int x1 = p1.getX();
        int x2 = p2.getX();

        int y1 = p1.getY();
        int y2 = p2.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Point p1 = new Point();
        p1.setX(12);
        p1.setY(32);

        Point p2 = new Point();
        p2.setX(-22);
        p2.setY(43);

        System.out.println("P1 coordinates: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("P2 coordinates: (" + p2.getX() + ", " + p2.getY() + ")");

        System.out.println("P1 is in quadrant number: " + p1.getQuadrant());
        System.out.println("P2 is in quadrant number: " + p2.getQuadrant());

        System.out.println(getDistance(p1, p2));

    }
}