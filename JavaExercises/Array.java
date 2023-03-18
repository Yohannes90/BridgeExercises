import java.util.Arrays;
public class Array {
    private int [] array;
    private int size;
    private int count = 0;
    Array(int size){
        this.size = size;
        array = new int[size];
    }
    void addElement(int value) {
        if (count == (size)) {
            int[] temp = new int[size * 2];
            System.arraycopy(array, 0, temp, 0, size);
            array = temp;
        }
        array[count] = value;
        count++;
    }
    void deleteElement(int index) {
        int[] temp = new int[size + 1];
        for (int i = 0; i < index; i++)
        {
            temp[i] = array[i];
        }
        temp[index] = value;
        for (int i = index; i < size + 1; i++)
        {
            temp[i + 1] = array[i];
        }
        array = temp;
    }
    void updateElement(int index, int value) {
        array[index] = value;
    }
    void insertElement(int index, int value) {
        int[] twmp = new int[size + 1];
        for (int i = 0; i < index; i++)
        {
            twmp[i] = array[i];
        }
        twmp[index] = value;
        for (int i = index; i < size + 1; i++)
        {
            twmp[i + 1] = array[i];
        }
        array = twmp;
    }
}
