package dsa.array.sorting;

public class MergeSort {

    private static void merge(int[] leftArray, int[] rightArray , int[] array){
        int i =0 , l =0  , r = 0 ;
        while(l < leftArray.length && r <rightArray.length){


            if(leftArray[l]<= rightArray[r] ){
                array[i++]= leftArray[l++];
            }else{
                array[i++] =  rightArray[r++];
            }
        }

        while(l<leftArray.length){
            array[i++] = leftArray[l++];
        }
        while(r<rightArray.length){
            array[i++] = rightArray[r++];
        }

    }
    private static void mergeSort(int[] arr) {
        int length = arr.length;
        if (length<= 1) return ;

        int mid = length / 2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];


        // split array
        for (int i =0 ; i < length ; i++ ){
            if ( i < mid ){
                leftArray[i] = arr[i];
            }else {
                rightArray[i-mid]= arr[i];
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,arr);





    }


    public static void main(String[] args) {
        int[] arr = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(arr);

        for(int i =0 ; i<arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
    }




}
