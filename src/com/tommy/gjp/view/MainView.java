package com.tommy.gjp.view;

import java.util.Scanner;

/**
 * Created by humingtao on 2017/7/4.
 */
public class MainView {
    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---------------管家婆家庭记账软件---------------");
            System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
            System.out.println("请输入要操作的功能序号[1-5]:");
            int selectIndex = sc.nextInt();
            switch (selectIndex) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
