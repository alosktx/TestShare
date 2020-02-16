package com.tx.java;

import java.util.ArrayList;

/*
* 1.IDEA中模板所处的位置：settings -Editor -Live Templates/Postfix completion
* 2.常用的模板有哪些
* */
public class Hello {

    //模板六：prsf:可生成private static final
    private static final int I=1;
    //变形：psf
    public static final  int J=10;
    //变形：psfi
    public static final int JU=12;
    //变形：psfs
    public static final String NATION="China";

   //模板一：psvm
   public static void main(String[] args) {
       //模板二：sout
       System.out.println("hello");
       //变形：soutp soutm  soutv xxx.sout
       System.out.println("args = [" + args + "]");
       System.out.println("Hello.main");
       int num=10;
       int num2=20;
       System.out.println("num2 = " + num2);
       System.out.println(num);

       //模板三：fori
       String[] arr=new String[]{"Tom","Jerry","Hanmeimei","Lilei"};
       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
       //变形：iter
       for (String s : arr) {
           System.out.println(s);
       }
       //变形：itar
       for (int i = 0; i < arr.length; i++) {
           String s = arr[i];
           System.out.println(s);
       }

       //模板四:list.for
       ArrayList list=new ArrayList();
       list.add(123);
       list.add(345);
       list.add(567);
       for (Object o : list) {
           
       }
       //变形:list.fori
       for (int  i = 0;  i < list.size();  i++) {
           
       }
       //变形:List.forr
       for (int i = list.size() - 1; i >= 0; i--) {
           
       }
   }

   public void method(){
       System.out.println("Hello.method");
       ArrayList list=new ArrayList();
       list.add(123);
       list.add(345);
       list.add(567);
       //模板五:ifn
       if (list == null) {
           
       }
       //变形：inn
       if (list != null) {
           
       }
       //变形：xxx.nn xxx.null
       if (list == null) {

       }
    }
}