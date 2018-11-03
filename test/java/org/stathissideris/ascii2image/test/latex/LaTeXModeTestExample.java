package org.stathissideris.ascii2image.test.latex;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

@Ignore
public class LaTeXModeTestExample extends LaTeXModeTestBase {
  @Test
  public void exampleTest() throws IOException {
    execute("_example", 0.98);
  }
}
