class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 6
    
    // STEP 3
    MyMap<String, Integer> creditHours = new MyHashMap<>();
    
    // STEP 4
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);
    
    // STEP 5
    System.out.println("Checking for value 'IT-1025': "+creditHours.containsKey("IT-1025"));
    System.out.println("Checking for value 'IT-2110': "+creditHours.containsKey("IT-2110"));
    
    // STEP 6
    System.out.println("Contents of map: "+creditHours);
    
    // STEP 7
    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150");
    
    // STEP 8
    System.out.println("New contents of map after removal: "+creditHours);
  }
}