package com.hand;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 题目，随机生成0-100之间的50个数，然后将这些数通过<键，值>来存放，其中键为0，1，2，3，4 。。。。值分别是这些数的
 */
public class Exam4 {
    int[] arr= new int[50];
    Map<Integer,List<Integer>> myMap = new HashMap<Integer,List<Integer>>();    //创建一个hshmap表
    //生成随机数
    public void getRandom(){
        for (int i=0 ;i<50;i++){
            arr[i]= (int) (Math.random()*100);
        }
        System.out.print("随机生成的数字为：");
        for (int ar:arr){
            System.out.print(ar+" ");
        }

        System.out.println(" ");
    }

    public void putDate(int i ,int key){
        List ll =null;
        if (myMap.containsKey(key)){    //如果这个元素已经存在了

            ll = myMap.get(key);
            ll.add(arr[i]);
        }else{  //键值不存在
            ll = new ArrayList();  //创建一个list对象
            ll.add(arr[i]);
        }
        myMap.put(key,ll);
    }
    public void userMap(){
        //将我们的数据存放到hashmap表中来
        //首先要将key求出来
        int key =-1;
        for (int i=0 ;i<arr.length;i++){
            key =(int)(arr[i]/10);
            switch (key){
                case 0:
                    putDate(i,key);
                    break;
                case 1:
                    putDate(i,key);
                    break;
                case 2:
                    putDate(i,key);
                    break;
                case 3:
                    putDate(i,key);
                    break;
                case 4:
                    putDate(i,key);
                    break;
                case 5:
                    putDate(i,key);
                    break;
                case 6:
                    putDate(i,key);
                    break;
                case 7:
                    putDate(i,key);
                    break;
                case 8:
                    putDate(i,key);
                    break;
                case 9:
                    putDate(i,key);
                    break;
            }
        }
    }
    public void unSort(Integer key){
        for (int i=0;i<myMap.size();i++){
            if(myMap.containsKey(key)){
                System.out.println("=>"+myMap.get(key));
                return;
            }
        }
        System.out.println("没有这个键值");
    }

    public void getDate(Integer key){
        for (int i=0;i<myMap.size();i++){
            if(myMap.containsKey(key)){
                //对values进行排序
                myMap.get(key).sort(null);
                System.out.println("=>"+myMap.get(key));
                return;
            }else{
                System.out.println("没有这个键值"+key);      //这是C语言思路，java应该抛出异常
                return;
            }
        }
    }
    public static void main(String... args){
        Exam4 ts = new Exam4();
        ts.getRandom();
        ts.userMap();
        System.out.println("map中的数据为：");
        for (int i=0 ; i<10;i++){
            System.out.print(i+"");
            ts.unSort(i);
        }
        System.out.println("排序后的Map为：");
        for (int i=0 ; i<10;i++){
            System.out.print(i+"");
            ts.getDate(i);
        }
    }
}
