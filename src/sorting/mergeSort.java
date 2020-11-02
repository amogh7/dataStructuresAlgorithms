package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
        int[] first={2,3,4,6,8};
        int[] second={1,5,9,8,10};
        int [] third=mergeSort(second,0, second.length-1);
        System.out.println(Arrays.toString(third));

        }


    public static int[] mergeSortedArrays(int []first, int[] second){

        int  []third=new int[first.length+second.length];
      int i=0;
      int j=0;
      int k=0;
         while( i<first.length &&  j<second.length){
             if(first[i]<second[j]){
                 third[k]=first[i];
                 i++;
                 k++;
             }
             else{
                 third[k]=second[j];
                 j++;
                 k++;
             }
         }
         if(i==first.length) {
             while (j < second.length) {
                 third[k] = second[j];
                 k++;
                 j++;

             }
         }
             if(j==second.length){
                 while(i<first.length){
                     third[k]=first[i];
                     i++;
                     k++;
                 }
             }
             return third;

    }
    public static int[] mergeSort(int arr[],int si,int ei){
              if(si==ei){
                  int[] ar=new int[1];
                  ar[0]= arr[si];
                  return ar;

              }
              int mid=(si+ei)/2;

         int f[] =mergeSort(arr,si,mid);
          int s[]=mergeSort(arr,mid+1,ei);
         int[] sortedArray= mergeSortedArrays(f,s);

          return sortedArray;


    }

}