/**
 * Created by AaronR on 9/23/17.
 * for ?
 */
public class Triple<E> {

    private E left;
    private E middle;
    private E right;

    public Triple(E left, E middle, E right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }


    public E getLeft() {
        return left;
    }

    public void setLeft(E left) {
        this.left = left;
    }

    public E getMiddle() {
        return middle;
    }

    public void setMiddle(E middle) {
        this.middle = middle;
    }

    public E getRight() {
        return right;
    }

    public void setRight(E right) {
        this.right = right;
    }

    @Override
    public String toString() { return "("+left+ ", "+middle+", "+right+")"; }
}
