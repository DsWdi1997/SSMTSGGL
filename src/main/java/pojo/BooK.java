package pojo;

public class BooK {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

    public  BooK() {
    }

    public  BooK(int bookID, String bookName, int bookCounts, String detail) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookCounts = bookCounts;
        this.detail = detail;
    }

    public void setBookID(int bookID){
        this.bookID =bookID ;
    }
    public int getBookID(){
        return bookID;
    }

    public void setBookName(String bookName){
        this.bookName = bookName ;
    }
    public String getBookName(){
        return bookName;
    }

    public void setBookCounts(int bookCounts){
        this.bookCounts = bookCounts;
    }
    public int getBookCounts(){
        return bookCounts;
    }

    public void setDetail(String detail){
        this.detail = detail ;
    }
    public String getDetail(){
        return detail ;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", bookCounts=" + bookCounts +
                ", detail='" + detail + '\'' +
                '}';
    }
}
