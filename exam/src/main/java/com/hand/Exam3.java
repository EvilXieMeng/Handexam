package com.hand;

import java.util.Scanner;

/**
 * 测试一个日期，根据这个日期，来判断返回下一天
 * 问题，如果是一年的最后一天、一个月的最后一天、闰年2月的最后一天
 */
public class Exam3 {
    private int year =-1;
    private int mon = -1;
    private int day =-1;
    private int[] arrDay={31,28,31,30,31,30,31,31,30,31,30,31};
    public void inputYMD(){
        String date="";
        String[] ymd=null;
        System.out.print("请输入日期：");
        Scanner scan = new Scanner(System.in);
        date=scan.nextLine();
        ymd=date.split("-");    //对字符串进分割
        year=Integer.parseInt(ymd[0]);
        mon =Integer.parseInt(ymd[1]);
        day=Integer.parseInt(ymd[2]);
    }

    public void nextDay(){
        int oldMon = mon;
        //判断是否是闰年
        if ((year%4==0)||(year%100==0)&&(year%400)!=0){
            //这是一个闰年
            this.arrDay[1]++;   //2月是29天
        }
        //这里一定要先判断闰年后判断日期是否存在
        if (year<0 || mon<0 || mon>12 || day<0 ||day>arrDay[mon-1]){
            System.out.println("您输入的日期不存在");
            return;
        }
        //求下一天是哪一年
        if (mon==12){
            year=(year+(day/arrDay[oldMon-1]));//如果不是12月，这个年份不会变化
        }
        mon = (oldMon+(day/arrDay[oldMon-1]))%12;  //12月+1.也就是13，然后模12，就变成了1月

        day=(day%(arrDay[oldMon-1]))+1;
        System.out.println("下一天为："+year+"-"+mon+"-"+day);
    }

    public static void main(String... args){
        Exam3 ts = new Exam3();
        ts.inputYMD();  //获取输入的数据
        ts.nextDay();
    }
}

