package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {

  private Calc c;

  @BeforeEach
  void setUp() {
    this.c = new Calc();
  }

  @Test
  void add_pass() {
    assertEquals(4, c.add(2,2));
  }

//  @Test
  void add_fail() {
    assertEquals(5, c.add(2,2));
  }
}
