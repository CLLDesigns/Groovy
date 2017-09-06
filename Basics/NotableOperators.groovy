class NotableOperators {
  static main(args) {
    // Groovy doesn't require variable type declaration.
    def foo = "bar";
    println foo;
    foo = 2;
    println foo;
    // As Groovy doesn't require type declarations you need to be more specific with computation.
    println "5/4 = " + 5/4;
    println "5/4 as Integers = " + 5.intdiv(4);
    // Math functions.
    println "Absolute of -10 = " + Math.abs(-10);
    println "Round 10.1 = " + Math.round(10.1);
    println "2 to the power of 2 = " + foo.power(2);
    println "Equality check of 1.equals(2): " + 1.equals(2);
    println "Check if the number is a float, 1.equals(Float.NaN): " + 1.equals(Float.NaN);
    println "Square root of 9 = " + Math.sqrt(9);
    println "Cube root of 27 = " + Math.cbrt(27);
    println "Ceiling of 1.2 = " + Math.ceil(1.2);
    println "Floor of 1.2 = " + Math.floor(1.2);
    println "Min of 1 and 10 = " + Math.min(1, 10);
    println "Max of 1 and 10 = " + Math.max(1, 10);
    // String literals
    def string = "string";
    println 'Literally a ${string}';
    println "Literally a ${string}";
    // Multi string print.
    def multiComment = '''line 1
    line 2
    line 3'''
    println multiComment;
    // Splitting Strings.
    def splitter = "split";
    println "Original: " + splitter;
    println "indexOf l: " + splitter.indexOf('l');
    println "split[1]: " + splitter[1];
    println "Substring of first three characters: " + splitter[0..2];
    println "Substring of characters at index 2 and 4: " + splitter[2,4];
    println "Substring from index 1 on: " + splitter.substring(1);
    println "Substring from 1-4: " + splitter.substring(1,4);
    // Modifying Strings.
    def modify = "modify me";
    println "Original: " + modify;
    println "Remove 'me': " + (modify - 'me');
    println "Split on whitespace: " + modify.split(' ');
  }
}
