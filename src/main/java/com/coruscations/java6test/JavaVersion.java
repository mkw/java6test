package com.coruscations.java6test;

public class JavaVersion {

  private static final String SPECIFICATION = System.getProperty("java.specification.version", "1.6");

  private static final int MAJOR;

  static {
    int firstDot = SPECIFICATION.indexOf('.');
    int secondDot = SPECIFICATION.indexOf('.', firstDot + 1);
    MAJOR = Integer.parseInt(SPECIFICATION.substring(firstDot + 1,
        secondDot > firstDot ? secondDot : SPECIFICATION.length()));
  }

  static String specification() {
    return SPECIFICATION;
  }

  static int majorVersion() {
    return MAJOR;
  }
}
