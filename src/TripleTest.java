import org.junit.Assert;
import org.junit.Test;

/**
 * Created by AaronR on 9/23/17.
 * for EGR327
 */
public class TripleTest {

    @Test
    public void testGenerics1() {
        Triple<String> triple = new Triple<>("left", "middle", "right");
        Assert.assertEquals(String.class, triple.getLeft().getClass());
        Assert.assertEquals(String.class, triple.getMiddle().getClass());
        Assert.assertEquals(String.class, triple.getRight().getClass());

    }

    @Test
    public void testGenerics2() {
        Triple<Integer> triple = new Triple<>(1, 2, 3);
        Assert.assertEquals(Integer.class, triple.getLeft().getClass());
        Assert.assertEquals(Integer.class, triple.getMiddle().getClass());
        Assert.assertEquals(Integer .class, triple.getRight().getClass());

    }

    @Test
    public void testGenerics3() {
        Triple<Double> triple = new Triple<>(1.0,2.0, 3.0);
        Assert.assertEquals(Double.class, triple.getLeft().getClass());
        Assert.assertEquals(Double.class, triple.getMiddle().getClass());
        Assert.assertEquals(Double.class, triple.getRight().getClass());
    }

    @Test
    public void testGetters() {
        Triple<Double> triple = new Triple<>(1.0, 2.0, 3.0);
        Double left = triple.getLeft();
        Double middle = triple.getMiddle();
        Double right = triple.getRight();

        Assert.assertEquals(left, triple.getLeft());
        Assert.assertEquals(right, triple.getRight());
        Assert.assertEquals(middle, triple.getMiddle());

    }

    @Test
    public void testSetters() {
        String left = "left";
        String middle = "middle";
        String right = "right";

        Triple<String> triple = new Triple<>("","", "");

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
        Triple<String> triple = new Triple<>("foo", "bar", "bat");
        String string = triple.toString();
        Assert.assertEquals("(foo, bar, bat)",string);
    }

}

