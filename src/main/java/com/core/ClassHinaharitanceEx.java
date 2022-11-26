package com.core;
/*class left{
	int x =0;
}
class right extends left{
	int x=1;
}*/
interface left{
	int x=0;
}
interface right extends left{
	int x=1;
}
public class ClassHinaharitanceEx implements right{
//public class ClassHinaharitanceEx implements right , left{
//public class ClassHinaharitanceEx extends right{
	//static int x =3;
	public void m1() {
		System.out.println(x);	
		System.out.println(right.x);	
	}
	public static void main(String[] args) {
		ClassHinaharitanceEx classHinaharitanceEx = new ClassHinaharitanceEx();
         classHinaharitanceEx.m1();
	}

}
