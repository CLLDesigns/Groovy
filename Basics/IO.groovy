class IO {
  static main(args) {
    // Console input.
    println  "Taking input next: ";
    def inputted = System.console().readLine();
    println "Your input: " + inputted;
    // Type conversion
    def num1 = 10;
    def num2 = 1.2;
    println "Num 1: " + num1;
    println "Num 2: " + num2;
    println "Num1 to Double: " + num1.toDouble();
    println "Num2 to Integer: " + num2.toInteger();
    // Input conversion.
    println "We can also convert from integers to Doubles from the command line.";
    def num3 = System.console().readLine().toDouble();
    println "Your input converted to a Double: " + num3;
  }
}
