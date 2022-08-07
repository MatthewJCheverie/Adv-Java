import java.util.InputMismatchException;
import java.util.Scanner;

public class BookExceptionsDemo_MC {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int userOutput;

        do {
            System.out.println("Please enter a number greater than zero");
            userOutput = userInput.nextInt();
        } while (userOutput <= 0); //end of do while

        Book[] books = new Book[userOutput];

        for (int i =0; i < books.length; i++) {

            books[i] = new Book();

            String setTitle;
            do {
                System.out.println("Please enter the title of your book");
                books[i].setTitle(userInput.nextLine());
                setTitle = books[i].getTitle();
            }
            while (books[i].getTitle().equals(""));//end do while

            String setAuthor;
            do {
                System.out.println("Please enter the author of you book");
                books[i].setAuthor(userInput.nextLine());
                setAuthor = books[i].getAuthor();
            }
            while (books[i].getAuthor().equals(""));//end do while

            int setPages = 1;
            boolean PageExceptionCaught = true;
            do {
                try {
                    System.out.println("Please enter the number of pages in your book");
                    books[i].setPages(userInput.nextInt());
                    setPages = books[i].getPages();
                    if(setPages < 0)
                        throw new PagesExceptions("Invalid page number");
                    PageExceptionCaught = false;
                }//end try
                catch (InputMismatchException e) {
                    userInput.next();
                    System.out.println("Not a number");
                }
                catch (PagesExceptions e) {
                    System.out.println(e.getMessage());
                }//end catch
            }
            while (PageExceptionCaught);//end do while

            String setCategory = "Fiction";
            boolean categoryExceptionCaught = true;
            do {
                try {
                    System.out.println("Please enter the category in which your book belongs \n"
                            + "1. Fiction \n" + "2. Non-Fiction \n" + "3. Reference \n"
                            + "4. Text");
                    books[i].setCategory(userInput.next());
                    setCategory = books[i].getCategory();
                    if (!setCategory.equals("Fiction") && !setCategory.equals("Non-Fiction")
                            && !setCategory.equals("Reference") && !setCategory.equals("Text"))
                        throw new CategoryExceptions("Invalid category");
                    categoryExceptionCaught = false;
                }//end try
                catch (CategoryExceptions e) {
                    System.out.println(e.getMessage());
                }//end catch
            }
            while (categoryExceptionCaught);//end do while

            boolean setRead = false;
            boolean readException = true;
            do {
                try {
                    System.out.println("is it true you have read the book true or false");
                    books[i].setRead(userInput.nextBoolean());
                    setRead = books[i].getRead();
                    readException = false;
                }//end try
                catch (InputMismatchException e) {
                    userInput.next();
                    System.out.println("Invalid input");
                }// end catch
            } while (readException);//end do while

            double setCost = 0;
            boolean getCostException = true;
            do {
                try {
                    System.out.println("Please enter the cost of your book");
                    books[i].setCost(userInput.nextInt());
                    setCost = books[i].getCost();
                    if(setCost < 0)
                        throw new CostExceptions("Invalid Cost");
                    getCostException = false;
                }
                catch (InputMismatchException e){
                    userInput.next();
                    System.out.println("Invalid input");
                }
                catch (CostExceptions e) {
                    System.out.println(e.getMessage());
                }
            } while (getCostException);

            books[i] = new Book(setTitle,setAuthor,setPages,setCategory,setRead,setCost);
            System.out.println(books[i].toString());
        }//end for loop
    }//end main
}//end class

