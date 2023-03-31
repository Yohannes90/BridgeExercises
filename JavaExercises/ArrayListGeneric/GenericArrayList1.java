import java.util.Arrays;

public class GenericArrayList1<T> {
    private T[] list;
    private int size;
    private int count = 0;

    GenericArrayList1(int size) {
        this.size = size;
        list = (T[]) new Object[size];
    }
    void addElement(T item)
    {
        if (count == size)
        {
            T[] temp = (T[]) new Object[size * 2];
            System.arraycopy(list, 0, temp, 0, size);
            list = temp;
            size *= 2;
        }
        list[count] = item;
        count++;
    }
    void deleteElement(int index) {
        T[] temp = (T[]) new Object[size - 1];
        for (int i = 0; i < index ; i++)
        {
            temp[i] = list[i];
        }
        for (int i = index; i < size - 1; i++)
        {
            temp[i] = list[i + 1];
        }
        list = temp;
    }
    void updateElement(int index, T value) {
        list[index] = value;
    }
    void insertElement(int index, T value) {
        T[] temp = (T[]) new Object[size + 1];
        for (int i = 0; i < size - 1; i++)
        {
            if (i < index)
                temp[i] = list[i];
            if (i == index)
                temp[index] = value;
            if (i >= index)
                temp[i + 1] = list[i];
        }
        list = temp;
    }
    int indexOf(T item)
    {
        for(int i = 0; i < count; i++)
        {
            if(list[i].equals(item))
                return i;
        }
        return -1;
    }
    void printElements() {
        System.out.println(Arrays.toString(list));
    }
    int size()
    {
        return count;
    }
}
