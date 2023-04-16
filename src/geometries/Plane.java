package geometries;

import primitives.Point;
import primitives.Vector;

public class Plane implements Geometry {
    private final Point q0;

    private final Vector normal;

    public Plane(Point q0, Vector normal) {
        normal.normalize();
        this.q0 = q0;
        this.normal = normal;
    }

    public Plane (Point p1, Point p2, Point p3)
    {
        this.q0 = p1;
        this.normal = null;
    }
    @Override
    public Vector getNormal(Point v) {
        return null;
    }

    public Point getQ0() {
        return q0;
    }

    public Vector getNormal() {
        return normal;
    }
}

