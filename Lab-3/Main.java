public class Main {
  public static void main(String[] args) {
    String text = "QWERTYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYZ";
    
    String bestCase = "QW";

    // * Initialize startTime here
    long startTime = System.nanoTime();
    int index = match(text, bestCase);
    // * Initialize endTime here
    long endTime = System.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTime = endTime - startTime;
    System.out.println( " Time for operation best case: " + elapsedTime + " nanoseconds");
    if (index >= 0)
      System.out.println("best-case input matched at index " + index);
    else
      System.out.println("best-case input unmatched");   

    String worstCase = "YYYYZ";
    
    // * Initialize startTime here
    startTime = System.nanoTime();
    index = match(text, worstCase);
    // * Initialize endTime here
    endTime = System.nanoTime();
    // * Calculate elapsedTime here
    elapsedTime = endTime - startTime;
    System.out.println( " Time for operation worst case: " + elapsedTime + " nanoseconds");
    if (index >= 0)
      System.out.println("worst-case input matched at index " + index);
    else
      System.out.println("worst-case input unmatched");  
  }

  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }

    return -1;
  }
	
  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, 
      String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    
    return true;
  }
}