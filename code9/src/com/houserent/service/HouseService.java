package com.houserent.service;

import com.houserent.domain.House;

/**
 * 1.定义House数组，保存对象
 * 2.响应HouseView的调用
 * 3.完成对房屋信息的各种操作
 */
public class HouseService {
    private House[] h;
    private int houseNums = 1;
    private int idCounter = 1;

    public HouseService(int size) {
        h = new House[size];
        h[0] = new House(1,"jack","112","朝阳区",2500,"未出租");
    }

    public House[] list(){
        return h;
    }

    public boolean add(House newHouse){
        if(houseNums == h.length){
            System.out.println("数组已满，不能再添加");
            return false;
        }
        h[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    public boolean del(int delId){
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if(delId == h[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            return false;//delId在数组中不存在
        }
        for (int i = index; i < houseNums - 1; i++) {
            h[i] = h[i+1];
        }
        h[--houseNums] = null;
        return true;

    }

    public House findById(int findId){
        for (int i = 0; i < houseNums; i++) {
            if(findId == i + 1){
                return h[i];
            }
        }
        return null;
    }
}
