public class TestAlgorithms {

    public static void main(String[] args) {

        int arr[] = {64,34,25,12,22,11,90};

        System.out.println("Original Array:");

        for(int x:arr)
            System.out.print(x+" ");

        BubbleSort.sort(arr);

        System.out.println("\n\nBubble Sorted Array:");

        for(int x:arr)
            System.out.print(x+" ");

        int linear = LinearSearch.search(arr,22);

        System.out.println("\n\nLinear Search (22): Index = " + linear);

        int binary = BinarySearch.search(arr,64);

        System.out.println("Binary Search (64): Index = " + binary);

    }
}