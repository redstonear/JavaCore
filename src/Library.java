//import homeWorks.bookStorage.model.Book;
//import homeWorks.bookStorage.model.BookStorage;
//
//import java.util.Scanner;
//
//public class Library {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        BookStorage bookStorage = new BookStorage();
//        boolean isRunning = true;
//        while (isRunning) {
//            System.out.println("Please input 0 or EXIT");
//            System.out.println("Please input 1, or ADD_BOOK");
//            System.out.println("Please input 2 or PRINT_ALL_BOOKS");
//            System.out.println("Please input 3 for SEARCH_BOOK_BY_BOOK_NAME");
//            String command = sc.nextLine();
//            switch (command) {
//                case "EXIT":
//                    isRunning = false;
//                    break;
//                    case "ADD_BOOK":
//                        System.out.println("Please input book id");
//                        String id = sc.nextLine();
//                        System.out.println("Please input book title");
//                        String title = sc.nextLine();
//                        System.out.println("Please input book author");
//                        String authorName = sc.nextLine();
//                        System.out.println("Please input book price");
//                        double price = Double.parseDouble(sc.nextLine());
//                        Book book = new Book(id,title,authorName,price);
//                        bookStorage.add(book);
//                        System.out.println("Book added");
//                        break;
//                        case "PRINT_ALL_BOOKS":
//                            bookStorage.print();
//                            break;
//                            case "SEARCH_BOOK_BY_BOOK_NAME":
//                                System.out.println("Please input book keyword");
//                                String keyword = sc.nextLine();
//                                bookStorage.searchByBookName(keyword);
//                                break;
//                                default:
//                                    System.out.println("Invalid command");
//            }
//        }
//    }
//}