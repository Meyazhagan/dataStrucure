package Arrays;

public class Array {
    private int[] ar;
    private int itemCount;
    public Array(final int length) {
        this.ar = new int[length];
    }

    public void insert(final int item) {
        if (itemCount == ar.length) {
            final int[] temp = new int[2 * ar.length];

            for (int i = 0; i < itemCount; i++)
                temp[i] = ar[i];

            ar = temp;
        }
        ar[itemCount++] = item;
    }

    public void print() {
       for(int i = 0; i< itemCount; i++)
            System.out.println(ar[i]);
    }

    public void removeAt(int i) {
        if(i < 0 || i >= itemCount)
            throw new IndexOutOfBoundsException();

        for (; i < itemCount - 1; i++) {
            ar[i] = ar[i + 1];
        }
        itemCount--; 
    }

    public int indexOf(final int i) {
        for(int j = 0 ; j< itemCount ; j++){
            if(ar[j] == i){
                return j;
            }
        }
        return -1;
	}
}