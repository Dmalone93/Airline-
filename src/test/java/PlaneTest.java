import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaneTest {

    Plane plane;
    Plane planeTwo;

    @Before
    public void SetUp(){
        plane = new Plane(PlaneType.BOEING707);
        planeTwo = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void doesBothPlanesHaveCapacity(){
        assertEquals(10, plane.getCapacity());
        assertEquals(20, planeTwo.getCapacity());
    }

    @Test
    public void doBothPlanesHaveWeight(){
        assertEquals(300, plane.getWeight());
        assertEquals(400, planeTwo.getWeight());
    }

    @Test
    public void doesPlaneHaveBagAllowance(){
        assertEquals(25, plane.getBagWeight());
    }


}
