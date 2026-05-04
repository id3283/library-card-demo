public class LibraryCard {
    // TODO 1:
    // Add instance fields here.
    // Each LibraryCard object should have its own:
     String holderName;
     private int booksCheckedOut;
     private int maxBooksAllowed;


    // TODO 2:
    // Add static fields here.
    // All LibraryCard objects should share:
    private static String libraryName = "Central Library";
    private static int totalCardsCreated = 0;
    //
    // The starting library name should be "Central Library".
    // The starting number of cards created should be 0.

    public LibraryCard(String holderName, int maxBooksAllowed) {
        // TODO 3:
        // Store the constructor parameters in this object's fields.
        // A new card should start with 0 books checked out.
        this.holderName = holderName;
        this.maxBooksAllowed = maxBooksAllowed;

        // TODO 4:
        // Increase the shared count of total cards created.
        LibraryCard.totalCardsCreated++;
    }

    /**
     * Return true if the current number of books is less than the maximum allowed.
     * Return false otherwise.
     *
     * This method is static because it does not need one specific LibraryCard object.
     */
    public static boolean canBorrowMore(int booksCheckedOut, int maxBooksAllowed) {
        // TODO 5:
        // Return whether another book can be borrowed.
        return false;
    }

    /**
     * Return the shared library name.
     *
     * This method is static because the library name belongs to the class,
     * not to one particular card.
     */
    public static String getLibraryName() {
        // TODO 6:
        // Return the shared library name.
        return "";
    }

    /**
     * Change the shared library name.
     *
     * This method is static because changing the library name affects all cards.
     */
    public static void renameLibrary(String newLibraryName) {
        // TODO 7:
        // Change the shared library name.
    }

    /**
     * Return the number of LibraryCard objects that have been created.
     *
     * This method is static because the count belongs to the whole class.
     */
    public static int getTotalCardsCreated() {
        // TODO 8:
        // Return the shared total card count.
        return -1;
    }

    /**
     * Return this card holder's name.
     *
     * This is an instance method because each card has its own holder name.
     */
    public String getHolderName() {
        // TODO 9:
        // Return this object's holder name.
        return "";
    }

    /**
     * Return how many books this card currently has checked out.
     *
     * This is an instance method because each card has its own count.
     */
    public int getBooksCheckedOut() {
        // TODO 10:
        // Return this object's number of books checked out.
        return -1;
    }

    /**
     * Return this card's maximum number of allowed books.
     *
     * This is an instance method because different cards may have different limits.
     */
    public int getMaxBooksAllowed() {
        // TODO 11:
        // Return this object's maximum allowed books.
        return -1;
    }

    /**
     * Try to borrow one book using this card.
     *
     * If this card has room for another book:
     * - add 1 to this card's booksCheckedOut
     * - return true
     *
     * If this card is already at the limit:
     * - do not change anything
     * - return false
     */
    public boolean borrowBook() {
        // TODO 12:
        // Use this object's booksCheckedOut and maxBooksAllowed fields.
        return false;
    }

    /**
     * Try to return one book using this card.
     *
     * If this card has at least one book checked out:
     * - subtract 1 from this card's booksCheckedOut
     * - return true
     *
     * If this card has no books checked out:
     * - do not change anything
     * - return false
     */
    public boolean returnBook() {
        // TODO 13:
        // Use and change this object's booksCheckedOut field.
        return false;
    }

    /**
     * Return a String describing this library card.
     *
     * Example:
     * Alex | books: 2/3 | library: Central Library
     */
    public String cardToString() {
        // TODO 14:
        // Use this object's fields and the shared library name.
        return "";
    }

    /**
     * Compare two LibraryCard objects.
     *
     * Return the holder name of the card with more books checked out.
     * Return "tie" if both cards have the same number of books checked out.
     *
     * This method is static because it does not belong to one particular card.
     * But it can still use instance data because it receives objects as parameters.
     */
    public static String holderWithMoreBooks(LibraryCard first, LibraryCard second) {
        // TODO 15:
        // Compare the two objects by asking each object for its books checked out.
        return "";
    }
}