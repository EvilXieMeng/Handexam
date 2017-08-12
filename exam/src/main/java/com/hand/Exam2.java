package com.hand;

import java.util.Scanner;

public class Exam2 {
    public static void main(String... args){
        float salary=0;
        System.out.print("请输入工资：");
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextFloat()){
            salary = scan.nextFloat();
        }
        if(salary<1500){    //小于1500
            System.out.println("所需缴纳的税费是："+salary*0.03);
        }else{
            if ((salary>=1500)&&(salary<4500)){  //1500-4500
                System.out.println("所需缴纳的税费是："+salary*0.1);
            }else{
                if ((salary>=4500)&&(salary<9000)){
                    System.out.println("所需缴纳的税费是："+salary*0.2);
                }else {
                    if ((salary >= 9000) && (salary < 35000)) {
                        System.out.println("所需缴纳的税费是：" + salary * 0.25);
                    } else {
                        if ((salary >= 35000) && (salary < 55000)) {
                            System.out.println("所需缴纳的税费是：" + salary * 0.30);
                        } else {
                            if ((salary >= 55000) && (salary < 80000)) {
                                System.out.println("所需缴纳的税费是：" + salary * 0.35);
                            } else {
                                System.out.println("所需缴纳的税费是：" + salary * 0.45);
                            }
                        }
                    }
                }
            }
        }
    }
}
