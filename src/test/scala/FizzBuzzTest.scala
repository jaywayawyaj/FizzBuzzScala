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

  test("#filter returns fizz instead 5") {
    assert(FizzBuzz.filter(5) === "Buzz")
  }

  test("#filter returns fizz instead of multiples of 5") {
    assert(FizzBuzz.filter(25) === "Buzz")
  }

  test("#filter returns fizz instead of multiples of 5 (5000)") {
    assert(FizzBuzz.filter(5000) === "Buzz")
  }

  test("#filter returns fizzbuzz instead of 15") {
    assert(FizzBuzz.filter(15) === "FizzBuzz")
  }
}
