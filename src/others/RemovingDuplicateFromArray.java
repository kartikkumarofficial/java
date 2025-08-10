package others;

public class RemovingDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,553,11,2,3,4,4,1};
        int[] nondup = new int[arr.length];
        System.out.print("Original Array:");
        for(int m:arr){
            System.out.print(m+ " ");
        }
        System.out.println();
        java.util.Arrays.sort(arr);
        System.out.print("Sorted Array:");
        for(int n:arr){
            System.out.print(n+ " ");
        }
        System.out.println();



        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1 ; j++) {
                if(arr[i]!=arr[j]){
                    System.out.println("no added to non duplicate array :"+arr[i]);
//                    temp[]




                }


            }
        }

        System.out.print("Non-Duplicate array:");
        for(int k:nondup){
            System.out.print(k+ " ");
        }

            }
        }
