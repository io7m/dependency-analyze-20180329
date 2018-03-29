package com.io7m.dependencies;

import com.io7m.jaffirm.core.Preconditions;
import com.io7m.junreachable.UnreachableCodeException;

public final class Main
{
  private Main()
  {

  }

  public static void main(final String[] args)
  {
    Preconditions.checkPrecondition(true, "No problem!");

    if (args == null) {
      throw new UnreachableCodeException();
    }
  }
}
