package com.thoughtworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo {
  public static void main(String[] args) {
      File file = new File("src/com/thoughtworks/file/input.txt");
      try (InputStream inputStream = new FileInputStream(file)) {
        int length = inputStream.available();
        byte[] data = new byte[length];
        while (inputStream.read(data) != -1) {
          System.out.println(new String(data));
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
  }
}
