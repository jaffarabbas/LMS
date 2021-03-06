package lms;

import java.util.Date;
public class BookRecord {
    User issuer;
    User issuedTo;
    Book book;
    Date issueDate;
    Date returnDate;
    Date dueDate;
    public BookRecord(User issuer, User issuedTo, Book book, Date issueDate, Date dueDate) {

        this.issuer = issuer;
        this.issuedTo = issuedTo;
        this.book = book;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.returnDate = null;
    }

    public BookRecord(User issuer, User issuedTo, Book book, Date issueDate, Date returnDate, Date dueDate) {
        this.issuer = issuer;
        this.issuedTo = issuedTo;
        this.book = book;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.dueDate = dueDate;
    }

    public User getIssuer() {
        return issuer;
    }

    public User getIssuedTo() {
        return issuedTo;
    }

    public Book getBook() {
        return book;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public int getFine() { //fifty rupees per day after due date
        int totalFine;
        if(returnDate == null){
            Date curr = new Date();
            if(curr.before(dueDate)){
                return 0;
            }else{
                long timeDiff1 = curr.getTime() - dueDate.getTime();
                totalFine = (int)(timeDiff1/(1000*60*60*24) * 50);
                return totalFine;
            }
        }
        if(returnDate.before(dueDate)){
            return 0;
        }
        long timeDiff2 = returnDate.getTime() - dueDate.getTime();
        totalFine = (int)(timeDiff2/(1000*60*60*24) * 50);
        return totalFine;
    }
}
