class TestMemoryCell {

  public static void main(String[] args} {

    // m is an instance variable
    MemoryCell m = new MemoryCell();

    // Store value in MemoryCell
    m.write(new Integer(46));

    // Store value in an Integer Object
    Integer valWrapped = (Integer) m.read();

    // Return the primitive
    int valUnwrapped = valWrapped.intValue();

    System.out.println("Wrapped: " + valWrapped +
            "\nUnwrapped: " + valUnwrapped);

    // Repeat with a float: 45.6, use same memory cell

    // Repeat with String

    