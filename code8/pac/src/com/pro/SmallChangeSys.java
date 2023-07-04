package com.pro;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        String key = "";
        String details = "---------------零钱通明细---------------";
        double money = 0;
        double balance = 0;
        String note = "";
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n----------------零钱通菜单----------------");
            System.out.println("1 零钱通明细\n2 收益入账\n3 消费\n4 退出");
            System.out.print("请选择（1-4）");
            key = scanner.next();
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                    if(money <= 0){
                        System.out.println("收益金额应大于0");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额" + balance;
                    break;
                case "3":
                    System.out.print("消费金额：");
                    money = scanner.nextDouble();
                    if(money <= 0){
                        System.out.println("消费金额应大于0");
                        break;
                    }
                    if(money > balance){
                        System.out.println("余额不足");
                        break;
                    }
                    System.out.print("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额" + balance;
                    break;
                case "4":
                    String choice = "";
                    while(true){
                        System.out.println("确定要退出吗？y/n");
                        choice = scanner.next();
                        if("y".equals(choice)||"n".equals(choice)){
                            break;
                        }
                    }
                    if("y".equals(choice)) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }

        }while(loop);
        System.out.println("-------退出了零钱通--------");
    }
}
