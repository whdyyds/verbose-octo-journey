package com.homework08;
import java.util.Scanner;
public class SavingAccount extends BankAccount {
    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }
    public void earnMonthlyInterest(){
        int chance = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            System.out.println("此月是否免手续费？");
            String key = scanner.next();
            if(key == "y" && chance < 3){
                chance += 1;
            } else{
                System.out.println("产生月利息");
            }
        }
    }
}
