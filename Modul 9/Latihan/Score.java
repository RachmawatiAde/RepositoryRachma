public class Score {
    /* Sebelum refactoring
    if (score > 700)
accept();
else if ((income >= 40000) && (income <= 100000)
&& authorized && (score > 500))
accept();
else if (income > 100000)
accept();
else
reject(); */
    public static void main(String[] args) {
        int score = 650; 
        int income = 50000; 
        boolean authorized = true; 

        if ((score <= 700) && ((income < 40000) || (income > 100000) || !authorized || (score <= 500)) && (income <= 100000)) {
            reject();
        } else {
            accept();
        }
    }

    public static void reject() {
        System.out.println("Application rejected.");
    }

    public static void accept() {
        System.out.println("Application accepted.");
    }
}
