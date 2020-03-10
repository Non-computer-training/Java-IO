package com.thoughtworks;

import java.io.*;

public class OutputStreamDemo {
  public static void main(String[] args) {
    File inputFile = new File("src/com/thoughtworks/file/input.txt");
    File outputFile = new File("src/com/thoughtworks/file/output.txt");
    try (InputStream inputStream = new FileInputStream(inputFile);
         OutputStream outputStream = new FileOutputStream(outputFile)) {
      int length = inputStream.available();
      byte[] data = new byte[length];
      while (inputStream.read(data) != -1) {
        outputStream.write(data);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
