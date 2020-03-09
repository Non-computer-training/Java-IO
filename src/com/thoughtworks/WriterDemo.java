package com.thoughtworks;

import java.io.*;

public class WriterDemo {
  public static void main(String[] args) {
    File inputFile = new File("/Users/huanhuan.ma/test/test/Java-IO/src/com/thoughtworks/file/input.txt");
    File outputFile = new File("/Users/huanhuan.ma/test/test/Java-IO/src/com/thoughtworks/file/output.txt");
    try (Reader reader = new FileReader(inputFile);
         Writer writer = new FileWriter(outputFile)) {
      char[] data = new char[1024];
      int length;
      while ((length = reader.read(data)) != -1) {
        writer.write(data, 0, length);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
