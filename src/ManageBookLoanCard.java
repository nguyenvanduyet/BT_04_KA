import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ManageBookLoanCard {
    Map<String, BookLoanCard> list = new HashMap();
    Set<String> keyList = list.keySet();

    public void addStudent(String cardID , BookLoanCard bookLoanCard) {
        list.put(cardID, bookLoanCard);
    }

    public void displayAll() {
        for (String k : keyList) {
            BookLoanCard bookLoanCard = list.get(k);
            System.out.println(bookLoanCard);
        }
    }

    public void displayBooksToPayLastOfMonth() {
        boolean showLastDayOfMonth = true;
        for (String key : keyList) {
            BookLoanCard bookLoanCard = list.get(key);
            String payDay = bookLoanCard.getPayDay();
            String day = payDay.substring(0, 2);
            String lastDayOfMonth = testDayOfMonth(payDay);
            showLastDayOfMonth = day.equalsIgnoreCase(lastDayOfMonth);
            if (showLastDayOfMonth){
                System.out.println(bookLoanCard);
            }
        }
        if (!showLastDayOfMonth){
            System.out.println("không có sách được trả vào cuối tháng");
        }
    }

    public String testDayOfMonth(String payDay) {
        String month = payDay.substring(3, 5);
        int year = Integer.parseInt(payDay.substring(6, 10));
        String lastDayOfMonth = "";
        switch (month) {
            case "01":
            case "03":
            case "05":
            case "07":
            case "08":
            case "10":
            case "12":
                lastDayOfMonth = "31";
                break;
            case "04":
            case "06":
            case "09":
            case "11":
                lastDayOfMonth = "30";
                break;
            case "02":
                if ((year % 4 == 0 && year % 100 != 0)||year % 400 == 0 ){
                    lastDayOfMonth="29";
                }else {
                    lastDayOfMonth="28";
                    break;
                }
        }
        return lastDayOfMonth;
    }


}


