package others;

public class insertionoptimal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] newarr = new int[arr.length+1];
        int newelement = 4;
        int pos = 3;

        for(int i=0;i <pos;i++){
            newarr[i]=arr[i];
        }
        for(int i=pos;i <arr.length-1;i++){
            newarr[i+1]=arr[i];
        }
        System.out.println();
        for(int j = 0; j<=arr.length;j++){
            System.out.print(newarr[j]+" ");
        }
    }
}
