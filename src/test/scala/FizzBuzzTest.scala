import org.scalatest.FunSuite

class FizzBuzzTest extends FunSuite {
  test("#filter returns number") {
    assert(FizzBuzz.filter(1) === 1)
  }

  test("#filter returns fizz instead of 3") {
    assert(FizzBuzz.filter(3) === "Fizz")
  }

  test("#filter returns fizz instead of multiples of 3") {
    assert(FizzBuzz.filter(9) === "Fizz")
  }

  test("#filter returns fizz instead of multiples of 3 (30)") {
    assert(FizzBuzz.filter(33) === "Fizz")
  }
}
