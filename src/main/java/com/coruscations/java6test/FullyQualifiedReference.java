package com.coruscations.java6test;

import java.util.ArrayDeque;
import java.util.Deque;

public class FullyQualifiedReference {
  static <E> Deque<E> createDeque() {
    if (JavaVersion.majorVersion() >= 7) {
      //noinspection UnnecessaryFullyQualifiedName
      return new java.util.concurrent.ConcurrentLinkedDeque<E>();
    }
    return new ArrayDeque<E>();
  }
}
