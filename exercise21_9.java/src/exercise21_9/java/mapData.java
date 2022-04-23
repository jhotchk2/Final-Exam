package exercise21_9.java;

import java.util.HashMap;
import java.util.Map;


public class mapData {
  /**
   * Big O notation
   * 
   * Map<String, String> map = new HashMap<>(); = 1 
   * States state = new States(); = 1 
   * String[][] data = state.getState(); = 1
   * 
   * for (int i = 0; i < data.length; i++) { = n map.put(data[i][0], data[i][1]); = 1 }
   * 
   * Therefore the Big O notation of this class is O(1 + 1 + 1 + n * 1) = O(3 + n) 
   * = O(n)
   * 
   */
    public Map<String, String> getData() {
        Map<String, String> map = new HashMap<>();
        States state = new States();
        String[][] data = state.getState();

        for (int i = 0; i < data.length; i++) {
            map.put(data[i][0], data[i][1]);
        }

        return map;
    }
}

