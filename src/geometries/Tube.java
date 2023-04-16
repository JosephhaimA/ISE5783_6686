package geometries;

import primitives.Point;
import primitives.Ray;
import primitives.Vector;

public class Tube extends RadialGeometry {
 protected final Ray axisRay;

    @Override
    public Vector getNormal(Point v) {
        return null;
    }

    public Tube(double radius, Ray aR) {
        super(radius);
        this.axisRay = aR;
    }

    public Ray getAxisRay() {
        return axisRay;
    }
}
