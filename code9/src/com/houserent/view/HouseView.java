package com.houserent.view;

import com.houserent.domain.House;
import com.houserent.service.HouseService;
import com.houserent.utils.Utility;

/**
 * 1.显示界面
 * 2.接受用户输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接收用户选择
    private HouseService hs = new HouseService(10);
    //显示房屋列表
    public void listHouses(){
        System.out.println("------------房屋列表------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = hs.list();
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("房屋列表显示完毕");
    }
    //接收输入
    public void addHouse(){
        System.out.println("------------添加房屋------------");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("租金：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        House house = new House(0,name,phone,address,rent,state);
        if(hs.add(house)){
            System.out.println("------------添加房屋成功------------");
        } else{
            System.out.println("------------添加房屋失败------------");
        }
    }
    public void delHouse(){
        System.out.println("------------删除房屋------------");
        System.out.print("请输入待删除房屋的编号（-1退出）");
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("------------放弃删除房屋信息------------");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            if(hs.del(delId)){
                System.out.println("------------删除房屋信息成功------------");
            } else{
                System.out.println("------------编号不存在，删除失败------------");
            }
        }
    }
    public void findHouse(){
        System.out.println("------------查找房屋------------");
        System.out.println("请输入要查找的id:");
        int findId = Utility.readInt();
        House byId = hs.findById(findId);
        if(byId != null){
            System.out.println(byId);
        }else{
            System.out.println("------------查找的房屋信息不存在------------");
        }

    }
    public void update(){
        System.out.println("------------修改房屋信息------------");
        System.out.println("请选择待修改房屋的编号（-1表示退出）：");
        int updateId = Utility.readInt();
        if(updateId == -1){
            System.out.println("你放弃了修改房屋信息");
            return;
        }

        House fiId = hs.findById(updateId);
        if(fiId == null){
            System.out.println("------------待修改的房屋信息不存在------------");
            return;
        }
        System.out.print("姓名(" + fiId.getName() + "):");
        String name = Utility.readString(8, "");
        if(!"".equals(name)){
            fiId.setName(name);
        }
        System.out.print("电话(" + fiId.getPhone() + "):");
        String phone = Utility.readString(12, "");
        if(!"".equals(phone)) {
            fiId.setPhone(phone);
        }
        System.out.print("地址(" + fiId.getAddress() + "):");
        String address = Utility.readString(16, "");
        if(!"".equals(address)) {
            fiId.setAddress(address);
        }
        System.out.print("租金(" + fiId.getRent() + "):");
        int rent = Utility.readInt(-1);
        if(rent != -1) {
            fiId.setRent(rent);
        }
        System.out.print("状态(" + fiId.getState() + "):");
        String state = Utility.readString(8, "");
        if(!"".equals(state)) {
            fiId.setState(state);
        }
        System.out.println("------------修改房屋信息成功------------");
    }
    public void exit(){
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            loop = false;
        }
    }
    public void mainMenu(){
        do{
            System.out.println("============房屋出租系统菜单============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 显 示 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请输入你的选择1-6：");
            key = Utility.readChar();
            switch (key){
                case '1' :
                    addHouse();
                    break;
                case '2' :
                    findHouse();
                    break;
                case '3' :
                    delHouse();
                    break;
                case '4' :
                    update();
                    break;
                case '5' :
                    listHouses();
                    break;
                case '6' :
                    exit();
                    break;
            }
        }while(loop);
    }
}
