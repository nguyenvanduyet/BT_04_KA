import java.util.Scanner;

public class TestMain {
    static Scanner sc = new Scanner(System.in);
    static ManageBookLoanCard manageBookLoanCard = new ManageBookLoanCard();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. nhập thông tin thẻ mượn sách");
            System.out.println("2. hiện thị danh sách sinh viên mượn sách");
            System.out.println("3. hiện thị sinh viên và sách phải trả vào cuối tháng");
            System.out.println("0. thoát chương trình");
            System.out.println("nhập biến choice");
            choice =Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập số lượng sv mượn sách");
                    int number= Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNew();
                    }
                    break;
                case 2:
                    manageBookLoanCard.displayAll();
                    break;
                case 3:
                    manageBookLoanCard.displayBooksToPayLastOfMonth();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        } while (choice != 0);
    }
    public static void addNew(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("nhập tên sv");
        String name=sc1.nextLine();
        System.out.println("nhập mã sv");
        String studentCode=sc.nextLine();
        System.out.println("nhập ngày tháng năm sinh");
        String birthDay=sc1.nextLine();
        System.out.println("nhập tên lớp");
        String className=sc.nextLine();
        System.out.println("nhập CardID");
        String cardID=sc1.nextLine();
        System.out.println("nhập ngày mượn");
        String dateBorrowed=sc.nextLine();
        String payDay ="";
        do {
            System.out.println("nhập ngày trả (dd/mm/yyyy)");
            payDay=sc1.nextLine();
        }while (payDay.length()!=10);
        System.out.println("nhập số hiệu sách");
        int bookstoreNumber=Integer.parseInt(sc1.nextLine());

        Student student=new Student(name,studentCode,birthDay,className);
        BookLoanCard bookLoanCard =new BookLoanCard(student,cardID,dateBorrowed,payDay,bookstoreNumber);
        manageBookLoanCard.addStudent(cardID,bookLoanCard);
        System.out.println("_______________________________________________________");
    }

}
