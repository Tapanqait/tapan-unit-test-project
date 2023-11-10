package com.hello;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
 class StudentTest {
  @Test
  void studentTest() {
       Student student   = new Student("Tapan", "40");
       assertEquals("Tapan",student.getName());
       assertEquals("40",student.getAge());

  }








 }
















