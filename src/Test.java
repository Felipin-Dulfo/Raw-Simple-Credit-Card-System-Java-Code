import java.util.Scanner;
import static java.lang.System.out;
public class Test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        CreditCard wallet[] = new CreditCard[10];
        wallet[0] = new CreditCard("5391 0375  9387 5309",
                "John Bowman", "California Savings", 0.0, 100);
        wallet[1] = new CreditCard("5391 0375  9387 5309",
                "John Bowman", "California Savings", 0.0, 3500);
        wallet[2] = new CreditCard("5391 0375  9387 5309",
                "John Bowman", "California Savings", 0.0, 5000);
        for(int i = 1; i <=16; i++ ){
            wallet[0].chargeIt((double)i);
            wallet[1].chargeIt(2.0*i); //implicit cast
            wallet[2].chargeIt((double)3*i); //explicit cast
        }
        for(int i=0; i<3; i++){
            CreditCard.printCard(wallet[i]);
            while(wallet[i].getBalance() > 100.0){
                wallet[i].makePayment(100.0);
                System.out.println("New Balance = " + wallet[i].getBalance());
            }
        }
        int walletNum = in.nextInt();
        int num = in.nextInt();
        switch(num){
            case 1:
                String no = in.nextLine();
                wallet[walletNum].setNumber(no);
                break;
            case 2:
                String nm = in.nextLine();
                wallet[walletNum].setName(nm);
                break;
            case 3:
                String bk = in.nextLine();
                wallet[walletNum].setBank(bk);
                break;
            case 4:
                double bal = in.nextDouble();
                wallet[walletNum].setBalance(bal);
                break;
            case 5:
                int lim = in.nextInt();
                wallet[walletNum].setLimit(lim);
                break;
            default:
                out.println("Invalid input.");
                break;
        }
        out.println(wallet[walletNum].getBalance());
    }
}
