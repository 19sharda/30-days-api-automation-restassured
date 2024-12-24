package Coding_Practice.Strings;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Reverse {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        char[] a={'w','o','r','l','d'};
        for(char i:reverse_a(a)){System.out.print(i);}
    }
    public static char[] reverse_a(char[] a){
        for(int i=0;i<a.length/2;i++){
            char temp=a[i];
            a[i]=a[a.length-(i+1)];
            a[a.length-(i+1)]=temp;
        }
        return a;
    }
}