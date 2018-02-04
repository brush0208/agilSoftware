package org.brush.geometry;

public class Line {

    private Point itsP1;
    private Point itsP2;

    public Line(Point itsP1, Point itsP2) {
        this.itsP1 = itsP1;
        this.itsP2 = itsP2;
    }
    public void getSlope(){ }
    public void getIntercept(){}
    public Point getP1(){return itsP1;}

    public Point getP2() {
        return itsP2;
    }
}
