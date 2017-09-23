import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by AaronR on 9/23/17.
 * for ?
 */
public class MyUnimprovedArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] items;
    private int count;


    public MyUnimprovedArrayList() {
        this.items = new Object[DEFAULT_CAPACITY];
        count = 0;
    }


    public E get(int idx) throws MyArrayIndexOutOfBounds{
        if (isGoodIndex(idx)) {
            return (E) items[idx];
        }else{
            throw new MyArrayIndexOutOfBounds();
        }
    }

    private boolean isGoodIndex(int idx){
        return (count > idx);
    }

    public void add(E obj){
        if(items.length == count){
            growArray();
        }
        items[count] = obj;
        count++;
    }

    private void growArray(){
        items = Arrays.copyOf(items, items.length * 2);
    }

    public E remove(int idx) throws MyArrayIndexOutOfBounds{

            E item = get(idx);
            shiftItems(idx);
            count--;
            return item;

    }

    private void shiftItems(int start){
        System.arraycopy(items, start + 1, items,start, items.length - start - 1);
        /*
        if(start == count - 1){
            items[start] = null;
        }else{
            for (int i = start; i < count - 1; i++) {
                items[i] = items[i+1];
            }
        }
        */
    }

    public int size(){
        return items.length;
    }

    public int getCount(){
        return count;
    }





}
