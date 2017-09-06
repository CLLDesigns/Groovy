class MatrixModification {
  static main(args) {
    // Arrays can hold multiple data types and array's themselves turning them into matrices.
    def multiType = ['String', 10, [20, 20]];
    println multiType;
    println "What about [2][0]: " + multiType[2][0];
    println "Size: " + multiType.size();
    // Add to the matrix.
    println "Add in a number: ";
    multiType.add(System.console().readLine());
    println multiType;
    multiType<<19;
    println multiType;
  }
}
