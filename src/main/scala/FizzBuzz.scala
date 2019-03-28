object FizzBuzz extends App {
  def filter(num: Int) = {
    if (num % 15 == 0)
      "FizzBuzz"
    else if (num % 3 == 0)
      "Fizz"
    else if (num % 5 == 0)
      "Buzz"
    else
      num
  }
}
