object FizzBuzz extends App {
  def filter(num: Int) = {
    if (num % 3 == 0)
      "Fizz"
    else if (num == 5)
      "Buzz"
    else
      num
  }
}
