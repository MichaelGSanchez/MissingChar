package edu.cnm.deepdive;

public class EveryNth {

  public String everyNth(String str, int n) {

    char [] input = str.toCharArray();
    char [] output = new char[(str.length() -1) /n+1];
    for (int i = 0; i < output.length; i++){

      output[i] = input[n * i];

    }

  return new String(output);
  }

}
