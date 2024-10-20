package homeWorks.bookStorage.model;

public class BookStorage {
//    private Book[] books = new Book[10];
//    private int size;
//
//    public void add(Book book) {
//        if (books.length == size) {
//            extendStorage();
//        }
//        books[size++] = book;
//    }
//
//    private void extendStorage() {
//        Book[] tmp = new Book[size + 10];
//        System.arraycopy(books, 0, tmp, 0, size);
//        books = tmp;
//    }
//
//    public void print(){
//        for (int i = 0; i < size; i++) {
//            System.out.println(books[i]);
//        }
//    }
//
//    public void searchByBookName(String keyword) {
//        for (int i = 0; i < size; i++) {
//            if (books[i].getTitle().contains(keyword)) {
//                System.out.println(books[i]);
//            }
//
//        }
//    }
//    public void searchBookByPrice(double price) {
//        for (int i = 0; i < size; i++) {
//            if (books[i].getPrice() > 100) {
//                System.out.println(books[i]);
//            }
//        }
//    }
//    public void deleteBook(String bookId){
//            int index = getBookById(bookId);
//            if (index != -1) {
//                for (int i = index; i < size; i++) {
//                    books[i] = books[i - 1];
//                }
//                size--;
//            }
//    }
//
//    private int getBookIndexById(String bookId){
//        for (int i = 0; i < size; i++) {
//            if (books[i].getId().equals(bookId)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public Book getBookById(String bookId){
//        for (int i = 0; i < size; i++) {
//            if (books[i].getId().equals(bookId)) {
//                return books[i];
//            }
//        }
//        return null;
//    }
}
