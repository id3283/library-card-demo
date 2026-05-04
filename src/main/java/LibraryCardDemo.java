public class LibraryCardDemo {
    public static void main(String[] args) {
        System.out.println("=== Checkpoint 1: Static methods before objects ===");

        System.out.println("2 of 3 can borrow more: " + LibraryCard.canBorrowMore(2, 3));
        System.out.println("3 of 3 can borrow more: " + LibraryCard.canBorrowMore(3, 3));
        System.out.println("Library: " + LibraryCard.getLibraryName());
        System.out.println("Cards created: " + LibraryCard.getTotalCardsCreated());

        System.out.println();
        System.out.println("=== Checkpoint 2: Create two card objects ===");

        LibraryCard alex = new LibraryCard("Alex", 2);
        LibraryCard jordan = new LibraryCard("Jordan", 1);

        System.out.println(alex.cardToString());
        System.out.println(jordan.cardToString());
        System.out.println("Cards created: " + LibraryCard.getTotalCardsCreated());

        System.out.println();
        System.out.println("=== Checkpoint 3: Borrow books from different objects ===");

        System.out.println("Alex borrow 1: " + alex.borrowBook());
        System.out.println("Alex borrow 2: " + alex.borrowBook());
        System.out.println("Alex borrow 3: " + alex.borrowBook());

        System.out.println("Jordan borrow 1: " + jordan.borrowBook());
        System.out.println("Jordan borrow 2: " + jordan.borrowBook());

        System.out.println(alex.cardToString());
        System.out.println(jordan.cardToString());

        System.out.println();
        System.out.println("=== Checkpoint 4: One object changes, the other does not ===");

        System.out.println("Jordan returns a book: " + jordan.returnBook());

        System.out.println(alex.cardToString());
        System.out.println(jordan.cardToString());

        System.out.println();
        System.out.println("=== Checkpoint 5: Static method receives objects ===");

        System.out.println("Holder with more books: " + LibraryCard.holderWithMoreBooks(alex, jordan));

        LibraryCard casey = new LibraryCard("Casey", 3);
        LibraryCard morgan = new LibraryCard("Morgan", 3);

        casey.borrowBook();
        morgan.borrowBook();

        System.out.println("Tie check: " + LibraryCard.holderWithMoreBooks(casey, morgan));
        System.out.println("Cards created: " + LibraryCard.getTotalCardsCreated());

        System.out.println();
        System.out.println("=== Checkpoint 6: Static field is shared ===");

        LibraryCard.renameLibrary("Downtown Branch");

        System.out.println(alex.cardToString());
        System.out.println(jordan.cardToString());
        System.out.println(casey.cardToString());
        System.out.println(morgan.cardToString());
        System.out.println("Library: " + LibraryCard.getLibraryName());
    }
}