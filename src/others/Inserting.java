package others;

public class Inserting {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] newarr = new int[arr.length+1];
        for (int i=0;i<=arr.length-1;i++){
            newarr[i] = arr[i];
            if(i==3){
                newarr[i]=422;
                newarr[i+1]=arr[i];

            }
            if(i>3 ){
                newarr[i+1]=arr[i];
            }


            }

        for(int start=0;start<=arr.length-1;start++){
            System.out.print(newarr[start]+" ");

        }    }
}

