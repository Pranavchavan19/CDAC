package probabing;

public class Linear_probabing {

    static final int size = 5;
    int arr[] = new int[size];

    public  int [] Linearprobabing(int a[])
    {
        int i;
        for (i = 0; i < size; i++) {
            arr[i] = -1;

        }
return a;
    }

    public int insert(int value) {

        int key = value % size;
        int index = key;
        while (arr[index] != -1) {
            index = (index + 1) % size;
            if (index == key) {

                System.out.println("Hash Table Full");
                return 0;
            }
        }
        arr[index] = value;
        return 1;
    }

    public int del(int value) {
        int key = value % size;
        int index = key;
        while (arr[index] != value) {
            index = (index + 1) % size;
            if (index == key) {

                return 0;
            }
        }
        arr[index] = -1;

        return 1;
    }

    public int search(int value) {

        int key = value % size;
        int index = key;
        while (arr[index] != value) {
            index = (index + 1) % size;
            if (index == key) {

                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Linear_probabing h = new Linear_probabing();
    
        h.Linearprobabing( a   );
        h.insert(3);
        h.insert(33);
        h.insert(32);
        h.insert(323);
       
    }

}
