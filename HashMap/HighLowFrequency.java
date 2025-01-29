package HashMap;

import java.util.HashMap;

class HighLowFrequency {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 1, 1, 2, 2, 2 };

    // pre compute
    HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
    for (int i = 0; i < arr.length; i++) {
      hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
    }
    int minFreq = Integer.MAX_VALUE;
    int maxFreq = Integer.MIN_VALUE;

    int maxFreqElement = -1;
    int minFreqElement = -1;

    for (Integer key : hash.keySet()) {
      int freq = hash.get(key);

      if (freq > maxFreq) {
        maxFreq = freq;
        maxFreqElement = key;
      }

      if (freq < minFreq) {
        minFreq = freq;
        minFreqElement = key;
      }
    }

    System.out.println("Maximum is : " + maxFreqElement);
    System.out.println("Minimum is : " + minFreqElement);
  }
}