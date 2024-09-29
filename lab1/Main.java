//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Daniel Senti
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    int[] testArray = {5, 9, 3, 12, 7, 3, 11, 5};

    int counter = 0;
    while (counter < (testArray.length)) {
      System.out.print(testArray[counter]+" ");
      counter++;
    }
    System.out.println(); // nl for neatness.
    for (int i = testArray.length-1; i>=0; i--) {
      System.out.print(testArray[i]+" ");
    }
    System.out.println(); // nl for neatness.
    System.out.println("First: "+testArray[0]+" Last: "+testArray[testArray.length-1]);

    //   \/\/testing lab methods here\/\/
    System.out.println(lab.max(3,4));//4
    System.out.println(lab.min(3,4));//3
    System.out.println(lab.sum(testArray));//55
    System.out.println(lab.average(testArray));//6
    System.out.println(lab.max(testArray));//12
    System.out.println(lab.min(testArray));//3
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    if(a > b) {
      return a;
    }
    return b;
  }

  public int min(int a, int b) {
    if(a < b) {
      return a;
    }
    return b;
  }

  public int sum(int[] nums) {
    int out = 0;
    for (int i : nums) {
      out += i;
    }
    return out;
  }

  public int average(int[] nums) {
    int avg = 0;
    for (int i : nums) {
      avg += i;
    }
    return avg / nums.length; // will do integer division
  }

  public int max(int[] nums) { 
    int out = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (out < nums[i]) {
        out = nums[i];
      }
    }
    return out;
  }

  public int min(int[] nums) {
    int out = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (out > nums[i]) {
        out = nums[i];
      }
    }
    return out;
  }
}