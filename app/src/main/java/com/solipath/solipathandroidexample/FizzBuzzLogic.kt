package com.solipath.solipathandroidexample

class FizzBuzzLogic {
    companion object {
        fun doFizzBuzz(numericInput: Int): String {
            var output = ""
            if(isDivisibleBy3(numericInput)){
                output += "Fizz"
            }
            if(isDivisibleBy5(numericInput)){
                output += "Buzz"
            }
            return output.ifEmpty {
                numericInput.toString()
            }
        }

        private fun isDivisibleBy5(numericInput: Int) = numericInput % 5 == 0

        private fun isDivisibleBy3(numericInput: Int) = numericInput % 3 == 0
    }
}