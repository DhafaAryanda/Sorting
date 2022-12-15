public class SortArray {

    //bubbleSort Algoritm
    public static <T extends Comparable<? super T>>
    void bubbleSort(T[] arr)
    {
        for(int i = arr.length; i > 1; i--){
            for(int j = 0; j < i - 1; j++){
              //if greater swap elements
              if(arr[j].compareTo(arr[j+1]) > 0){
                T temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;   
              }
            } 
      }
   }

   //selectionSort Algoritm
   public static <T extends Comparable<? super T>>
   void selectionSort(T[] arr)
   {
        int smallIndex;
        int pass, j, n = arr.length;
        T temp;

        for (pass = 0; pass < n-1; pass++)
        {
            smallIndex = pass;

            for (j = pass+1; j < n; j++)
                if (arr[j].compareTo(arr[smallIndex]) < 0)
                smallIndex = j;

                temp = arr[pass];
                arr[pass] = arr[smallIndex];
                arr[smallIndex] = temp;
        }
   }

    // insertionSort Algoritm
   public static <T extends Comparable<? super T>>
    void insertionSort(T[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int currentIndex = i;
            /*
             * Check:
             *      1. that currentIndex is at least 1
             *      2. that the item directly before the currentIndex is greater than the item at currentIndex
             *
             * If both conditions are met, swap the indexes
             */
            while (currentIndex > 0 && arr[currentIndex - 1].compareTo(arr[currentIndex]) > 0)
            {
                T temp = arr[currentIndex];
                arr[currentIndex] = arr[currentIndex - 1];
                arr[currentIndex - 1] = temp;
                currentIndex--;
            }
        }
   }

}
