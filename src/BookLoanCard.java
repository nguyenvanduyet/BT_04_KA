public class BookLoanCard {
    private Student student;
    private String cardID;
    private String dateBorrowed;
    private String payDay;
    private int bookstoreNumber;

    public BookLoanCard(Student student, String cardID, String dateBorrowed, String payDay, int bookstoreNumber) {
        this.student = student;
        this.cardID = cardID;
        this.dateBorrowed = dateBorrowed;
        this.payDay = payDay;
        this.bookstoreNumber = bookstoreNumber;
    }

    public String getCardID() {
        return cardID;
    }

    public String getPayDay() {
        return payDay;
    }

    @Override
    public String toString() {
        return "BookLoanCard{" +
                "student=" + student +
                ", cardID='" + cardID + '\'' +
                ", dateBorrowed='" + dateBorrowed + '\'' +
                ", payDay='" + payDay + '\'' +
                ", bookstoreNumber=" + bookstoreNumber +
                '}';
    }
}

