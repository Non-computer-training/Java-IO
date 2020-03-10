package com.thoughtworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo {
  public static void main(String[] args) {
    File file = new File("src/com/thoughtworks/file/input.txt");
    try (InputStream inputStream = new FileInputStream(file)) {
      byte[] data = new byte[1024];
      int length;
      while ((length = inputStream.read(data)) != -1) {
        System.out.println(new String(data,0, length));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
