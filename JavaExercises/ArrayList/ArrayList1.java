import java.util.Arrays;

public class ArrayList1 {
    private int [] array;
    private int size;
    private int count = 0;
    ArrayList1(int size){
        this.size = size;
        array = new int[size];
    }
    void addElement(int value) {
        if (count == (size)) {
            int[] temp = new int[size * 2];
            System.arraycopy(array, 0, temp, 0, size);
            array = temp;
            size*=2;
        }
        array[count] = value;
        count++;
    }
    void deleteElement(int index) {
        int[] temp = new int[size - 1];
        for (int i = 0; i < index ; i++)
        {
            temp[i] = array[i];
            System.out.println(Arrays.toString(temp));
        }
        for (int i = index; i < size - 1; i++)
        {
            temp[i] = array[i + 1];
            System.out.println(Arrays.toString(temp));
        }
        array = temp;

    }
    void updateElement(int index, int value) {
        array[index] = value;
    }
    void insertElement(int index, int value) {
        int[] temp = new int[size + 1];
        for (int i = 0; i < index; i++)
        {
            temp[i] = array[i];
        }
        temp[index] = value;
        for (int i = index; i < size - 1; i++)
        {
            temp[i + 1] = array[i];
        }
        array = temp;
    }
    void printElements() {
        System.out.println(Arrays.toString(array));
    }
}
