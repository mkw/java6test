package com.coruscations.java6test;

import java.util.Deque;

public class Main {

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";

  public static void main(String[] args) {
    String arg = args.length == 1 ? args[0] : "";
    final Deque<?> deque;
    if (arg.equals("fully-qualified")) {
      deque = FullyQualifiedReference.createDeque();
    } else if (arg.equals("import")) {
      deque = ImportReference.createDeque();
    } else {
      printRed("Please specify either 'fully-qualified' or 'import' as an argument");
      System.exit(-1);
      return;
    }

    if (deque == null) {
      printRed("No deque created");
      System.exit(1);
    } else {
      printGreen(
          "Created `" + deque.getClass().getName() + "` with " + arg + " on Java " + JavaVersion.specification());
    }
  }

  private static void printRed(String msg) {
    System.out.println(ANSI_RED + msg + ANSI_RESET);
  }

  private static void printGreen(String msg) {
    System.out.println(ANSI_GREEN + msg + ANSI_RESET);
  }
}
