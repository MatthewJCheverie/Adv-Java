import java.util.Scanner;
//class declaration
public class Book
{

    private String title;
    private String author;
    private int pages;
    private String category;
    private boolean read;
    private double cost;

    public Book()
    {
        title="";
        author="";
        pages= 1;
        category="Fiction";
        read= false;
        cost= 0;
    }

    public Book(String title, String author, int pages, String category, boolean read, double cost) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.category = category;
        this.read = read;
        this.cost = cost;
    }

    //Returns the title of the instance of the class Book that called the method
    public String getTitle()
    {
        return title;
    }

    //Returns the author of the instance of the class Book that called the method
    public String getAuthor()
    {
        return author;
    }

    //Returns the number of pages of the instance of the class Book that
//called the method
    public int getPages()
    {
        return pages;
    }

//Returns the category of the instance of the class Book that called the
//method

    public String getCategory()
    {
        return category;
    }

    //Returns the value of read of the instance of the class Book that called
//the method
    public boolean getRead()
    {
        return read;
    }

    //Returns the cost of the instance of the class Book that called the method
    public double getCost()
    {
        return cost;
    }

    //Sets the title of the instance of the class Book that called the method
//to the value passed to the method
    public void setTitle(String titlePassed)
    {
        title= titlePassed;
    }//end method


//Sets the author of the instance of the class Book that called the method
//to the value passed to the method

    public void setAuthor(String authorPassed)
    {
        author=authorPassed;
    }
    //Sets the number of pages of the instance of the class Book that called the
//method to the value passed to the method.
    public void setPages(int pagesPassed)
    {
        pages = pagesPassed;
    }//end method

    //Sets the cost of the instance of the class Book that called the
//method to the value passed to the method.
    public void setCost(double costPassed)
    {
        cost = costPassed;
    }//end method

//Sets the variable read of the instance of the class Book that called the
// method to the value passed to the method

    public void setRead(boolean readPassed)
    {
        read=readPassed;
    }

    //Sets the variable category of the instance of the class Book that called
//the method to the value passed to the method.
    public void setCategory(String categoryPassed)
    {
        category = categoryPassed;
    }//end method

    public String toString() {
        return "Information on your book: \n"
                + "Title: " + title + "\n"
                + "Author: " + author + "\n"
                + "Pages: " + pages + "\n"
                + "Category: " + category + "\n"
                + "Read: " + read + "\n"
                + "Cost: " + cost + "\n";
    }
}//end class
