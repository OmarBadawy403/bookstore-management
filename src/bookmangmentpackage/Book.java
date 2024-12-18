/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmangmentpackage;

public class Book {
    
        String nameOfBook ;
        String nameOfAuthor;
        int numberOfPages;
        int yearOfpublication;

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" + "nameOfBook=" + nameOfBook + ", nameOfAuthor=" + nameOfAuthor + ", yearOfpublication=" + yearOfpublication + '}';
    }
       
        
        
        
        
        
    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

 

    public int getYearOfpublication() {
        return yearOfpublication;
    }

    public void setYearOfpublication(int yearOfpublication) {
        this.yearOfpublication = yearOfpublication;
    }
        
    
}
