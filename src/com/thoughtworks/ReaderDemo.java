package com.thoughtworks;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo {
  public static void main(String[] args) {
    File file = new File("/Users/huanhuan.ma/test/test/Java-IO/src/com/thoughtworks/file/input.txt");
    try (Reader reader = new FileReader(file)) {
      char[] data = new char[1024];
      int length;
      while ((length = reader.read(data)) != -1) {
        System.out.println(new String(data,0, length));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
