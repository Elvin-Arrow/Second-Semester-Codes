public class SpecialSort{
  public static void main(String[] args){
        int min;
        int minIndex;
        int [] indexes = {0, 1, 2, 3, 4};
        int[] array = {0, 7, 12, 3 , 5};
        for (int i = 0; i < array.length - 1; i++) {
            min = array[indexes[i]];
            minIndex = indexes[i];
            for (int j = i+1; j < array.length; j++) {
                if (min > array[indexes[j]]) {
                    min = array[indexes[j]];
                    minIndex = j;
                }
            }
            if (minIndex != indexes[i]) {
                indexes[minIndex] = indexes[i];
                indexes[i] = minIndex;
            }
        }
        for (int i = 0; i < array.length; i++)
            System.out.println(array[indexes[i]]);
    }
}
