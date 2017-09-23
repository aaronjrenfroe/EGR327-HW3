import org.junit.Assert;
import org.junit.Test;

/**
 * Created by AaronR on 9/23/17.
 * for ?
 */
public class TripleTest {

    @Test
    public void testGenerics1() {
        Triple<String, Integer, Double> triple = new Triple<>("left", new Integer(2), new Double(3.0));
        Assert.assertEquals(String.class, triple.getLeft().getClass());
        Assert.assertEquals(Integer.class, triple.getMiddle().getClass());
        Assert.assertEquals(Double.class, triple.getRight().getClass());

    }

    @Test
    public void testGenerics2() {
        Triple<Integer, Double, String> triple = new Triple<>(new Integer(1), new Double(2.0), "right");
        Assert.assertEquals(Integer.class, triple.getLeft().getClass());
        Assert.assertEquals(Double.class, triple.getMiddle().getClass());
        Assert.assertEquals(String .class, triple.getRight().getClass());

    }

    @Test
    public void testGenerics3() {
        Triple<Double, String, Integer> triple = new Triple<>(new Double(1.0), "middle", new Integer(3));
        Assert.assertEquals(Double.class, triple.getLeft().getClass());
        Assert.assertEquals(String.class, triple.getMiddle().getClass());
        Assert.assertEquals(Integer.class, triple.getRight().getClass());
    }

    @Test
    public void testGetters() {
        Triple<Double, String, Integer> triple = new Triple<>(new Double(1.0), "middle", new Integer(3));
        Double left = triple.getLeft();
        String middle = triple.getMiddle();
        Integer right = triple.getRight();

        Assert.assertEquals(left, triple.getLeft());
        Assert.assertEquals(right, triple.getRight());
        Assert.assertEquals(middle, triple.getMiddle());

    }

    @Test
    public void testSetters() {
        Double left = 1.0;
        String middle = "middle";
        Integer right = 3;

        Triple<Double, String, Integer> triple = new Triple<>(0.0, "", 0);

        Assert.assertNotEquals(left, triple.getLeft());
        Assert.assertNotEquals(right, triple.getRight());
        Assert.assertNotEquals(middle, triple.getMiddle());

        triple.setLeft(left);
        triple.setMiddle(middle);
        triple.setRight(right);

        Assert.assertEquals(left, triple.getLeft());
        Assert.assertEquals(right, triple.getRight());
        Assert.assertEquals(middle, triple.getMiddle());

    }

    @Test
    public void testToString(){
        Triple<Double, String, Integer> triple = new Triple<>(0.0, "foo", 0);
        String string = triple.toString();
        Assert.assertEquals("(0.0, foo, 0)",string);
    }

}

