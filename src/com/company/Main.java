package com.company;

import java.util.Locale;

import java.util.Scanner;
public  class Main {

    public static void main(String args[]){
        String str="grass is greener on the other side";
        int[] freg=new int[str.length()];
        char minChar=str.charAt(0),maxChar=str.charAt(0);
        int min,max;
        char string[]=str.toCharArray();
        for(int i=0;i<string.length;i++){
            freg[i]=1;
            for(int j=i+1;j<string.length;j++){
                if(string[i]==string[j] && string[i]!=' ' && string[i]!='0'){
                    freg[i]++;
                }
            }
        }
        min=max=freg[0];
        for(int i=0;i<freg.length;i++){
            if(min>freg[i] && freg[i]!='0'){
                min=freg[i];
                minChar=string[i];
            }
            if(max<freg[i]){
                max=freg[i];
                maxChar=string[i];
            }
        }
        System.out.println("minimum occurring character:"+minChar);
        System.out.println("maximum occurring character:"+maxChar);

    }
}








