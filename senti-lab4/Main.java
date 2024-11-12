import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      Lab4.outputList(bubbleSortedList);

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);
      Lab4.outputList(insertionSortedList);
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
    long startTime = System.nanoTime();
    for(int i = 1; i < integerList.size(); i++){
      int k = integerList.get(i);
      int j = i-1;
      while(j >= 0 && integerList.get(j) > k){
        integerList.set(j+1, integerList.get(j));
        j = j - 1;
      }
      integerList.set(j+1, k);
    }
    long totalTime = System.nanoTime();
    System.out.println("Result time taken: "+(totalTime-startTime)+" nanoseconds");
    return integerList;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    long startTime = System.nanoTime();
    int len = integerList.size();
    for(int i = 0; i < len -1; i++){
      for(int j = 0; j < len - i - 1; j++){
        if(integerList.get(j)>integerList.get(j+1)){
          int temp = integerList.get(j);
          integerList.set(j, integerList.get(j+1));
          integerList.set(j+1, temp);
        }
      }
    }
    long totalTime = System.nanoTime();
    System.out.println("Result time taken: "+(totalTime-startTime)+" nanoseconds");
    return integerList;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}

/*
 *  1. If I had to choose from this lab I would choose insertion sort for sure. 
 *     But otherwise I would use merge sort because it is the fastest algorithm with a time complexity of O(nlogn).
 * 
 *  2. Yes there was a large difference in the time it took for bubble sort to run.
 *     Bubble sort was easier to code, however it took far longer due to the fact that the list was went over multiple times.
 *     This algorithm has a time complexity of O(n^2). It makes sense given the amount of data that was processed.
 * 
 *  3. The bubble sort was definitely the easier of the two to implement.
 *     Conceptually it makes sense to keep swapping the lesser integer until the loop is over.
 *     
 * 
 */