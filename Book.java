/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author - Dhruba Dey
 * @version 02/08/2020
 */

import java.util.*;
import java.lang.Boolean;
import java.io.*;

class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
        
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
        
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    
    {
        this.author = bookAuthor;
        this.title = bookTitle;
        this.pages = bookPages; 
        this.refNumber = "";
        this.borrowed = 0 ;
        //this.courseText = bookCourseText.booleanValue();
        this.courseText = bookCourseText;
    }
    
    /**
     * Print the author's name 
     */
    public void printAuthor()
    {
        System.out.println ("Author's name =" + this.author);
    }
    
    /**
     * Print the book's title 
     */
    public void printTitle()
    {
        System.out.println ("Book's tile =" + this.title);
    }      
    
    /**
     * Return the page numbers of the book
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * Print the book's title, author and pages in one line
     */
    public void printDetails()
    {
        System.out.println ("Title: " + title + "|  Author: " + author + "|  Pages: " + pages);
    }
    
    /**
     * Set the reference number based on the reference value passed via ref parameter
     */
    public void setRefNumber (String ref)
    {
        refNumber = ref;
    }
    
    /**
     * Access the refNumber 
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Print details with the condition such that refNumber will be printed if values are available or else print ZZZ
     */
    public void printDetailsModified()
    {
        if (refNumber.length() > 0 ){        
            System.out.println ("Title: " + title + "|  Author: " + author + "|  Pages: " + pages + "|  Refnumber:" + refNumber);
        }else {
            System.out.println ("Title: " + title + "|  Author: " + author + "|  Pages: " + pages + "|  Refnumber:" + "ZZZ");
        }
    }
    
    /**
     * Modified the setNumberModified mutator to accept the change if the field length is more than 3
     */
    public void setRefNumberModified (String ref)
    {
        if(ref.length() > 3) {
            refNumber = ref;
        }else {
            System.out.println ("Error : Reference number must be more than 3 letter long");
        }
    }
    
    /**
     * Update the number of times the book is borrowed 
     */
    public void borrow (int bookCheckInOut)
    {
        borrowed = borrowed + bookCheckInOut;
        bookCheckInOut = 0;
    }
    
    /**
     * Create an accessor getBorrowed to print out along with other information 
     */
    public void getBorrowed ()
    {
        System.out.println ("Title: " + title + "|  Author: " + author + "|  Pages: " + pages + "|  Refnumber:" + refNumber + "|  Numbers of times borrowed" + borrowed);
    }
    
    /**
     * Use boolean to decide whether the book is courseText or not  
     */
    public boolean isCourseText()
    {
      return this.courseText;
    }
    
}
