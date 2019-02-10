public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane){
        this.plane = plane;

    }

    public int getCapacity() {
        return plane.planeCapacity();
    }

    public int getWeight() {
        return plane.planeWeight();
    }

    public int getBagWeight(){
        return plane.planeBagWeight();
    }
}
