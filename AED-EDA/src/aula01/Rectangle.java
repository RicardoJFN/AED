package aula01;

public class Rectangle {

    int x1, y1, x2, y2;

    public Rectangle() {
    }

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Rectangle(Point p1, Point p2){
        p1.x = x1;
        p1.y = y1;
        p2.x = x2;
        p2.y = y2;
    }
}
