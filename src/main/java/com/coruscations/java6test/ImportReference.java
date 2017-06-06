package com.coruscations.java6test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ImportReference {

  static <E> Deque<E> createDeque() {
    if (JavaVersion.majorVersion() >= 7) {
      return new ConcurrentLinkedDeque<E>();
    }
    return new ArrayDeque<E>();
  }
}
