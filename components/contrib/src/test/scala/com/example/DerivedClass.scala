package com.example

import org.scalatest.{FreeSpec, Matchers}

class DerivedClass extends FreeSpec with Matchers with BaseTrait {
  "Demo" in {
    someMethod shouldEqual "hello world"
  }
}
