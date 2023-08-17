package stringProgram;

public class StringProgram9 {
    public static void main(String[] args) {
        String str = "This is core java Batch";

        String[] arr = str.split(" " );
        for (int i = arr.length-1; i>=0 ; i--)
            System.out.print(arr[i]+" ");

    }
}
