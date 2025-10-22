import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    // ----- Triângulos válidos -----
    @Test
    public void testIfTriangleIsEquilateral_ECP1() {
        Triangle equilateral = new Triangle(3, 3, 3);
        assertEquals("equilateral", equilateral.classify());
    }

    @Test
    public void testIfTriangleIsIsosceles_ECP2() {
        Triangle isosceles = new Triangle(3, 3, 1);
        assertEquals("isosceles", isosceles.classify());
    }

    @Test
    public void testIfTriangleIsScalene_ECP3() {
        Triangle scalene = new Triangle(5, 4, 6);
        assertEquals("scalene", scalene.classify());
    }

    // ----- Casos inválidos / limites -----
    @Test
    public void testIfTriangleIsNotEquilateral_ECP1() {
        Triangle equilateral = new Triangle(3, 0, 3);
        assertEquals("impossible", equilateral.classify());
    }

    @Test
    public void testIfTriangleIsNotIsosceles_ECP2() {
        Triangle isosceles = new Triangle(1, 2, 3);
        assertEquals("impossible", isosceles.classify());
    }

    @Test
    public void testIfTriangleIsNotScalene_ECP3() {
        Triangle scalene = new Triangle(2, 2, 3);
        assertEquals("isosceles", scalene.classify());
    }

    @Test
    public void testIfTriangleIsNotPossible_ECP4() {
        Triangle impossible = new Triangle(1, 10, 12);
        assertEquals("impossible", impossible.classify());
    }
}
