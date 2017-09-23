import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AaronR on 9/23/17.
 * for ?
 */
public class MyUnimprovedArrayListTest {

    MyUnimprovedArrayList<Integer> terrible;
    @Before
    public void setup(){
        terrible = new MyUnimprovedArrayList();
        terrible.add(1);
        terrible.add(2);
        terrible.add(3);

    }
    @Test(expected = MyArrayIndexOutOfBounds.class)
    public void get() throws Exception {
        int exp = 1;
        // Tried to use assertEquals but was getting an error about my parameters's matching multiple method signatures.
        Assert.assertTrue(exp == terrible.get(0));
        // Will throw the MyArrayIndexOutOfBounds error
        terrible.get(99);
    }

    @Test
    public void add() throws Exception {
        Assert.assertTrue(terrible.getCount() == 3);
        terrible.add(4);
        Assert.assertTrue(terrible.getCount() == 4);

    }

    @Test(expected = MyArrayIndexOutOfBounds.class)
    public void remove() throws Exception {
        Assert.assertTrue(terrible.getCount() == 3);
        Assert.assertTrue(terrible.get(0) == 1);
        Assert.assertTrue(terrible.get(1) == 2);
        Assert.assertTrue(terrible.get(2) == 3);
        terrible.remove(1);
        Assert.assertTrue(terrible.getCount() == 2);
        Assert.assertTrue(terrible.get(0) == 1);
        Assert.assertTrue(terrible.get(1) == 3);
        terrible.get(2);

    }

    @Test
    public void getCount() throws Exception {
        
        Assert.assertTrue(terrible.getCount() == 3);
        
        terrible.add(4);
        Assert.assertTrue(terrible.getCount() == 4);
        
        terrible.remove(3);
        Assert.assertTrue(terrible.getCount() == 3);

    }

    @Test
    public void testSize(){
        Assert.assertTrue(terrible.size() == 10);
        for (int i = 0; i < 10; i++) {
            terrible.add(i);
        }
        Assert.assertTrue(terrible.size() == 20);
    }

}