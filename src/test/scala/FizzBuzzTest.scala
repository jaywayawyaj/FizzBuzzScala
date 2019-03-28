import org.scalatest.FunSuite

class FizzBuzzTest extends FunSuite {
  test("#filter returns number") {
    assert(FizzBuzz.filter(1) === 1)
  }
}
