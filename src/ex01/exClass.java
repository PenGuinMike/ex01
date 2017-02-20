package ex01;
import java.util.*;
public class exClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		Student student=new Student("kevin");
	}

}
class Student{
	private String name,ID,depart,email,address,phone;
	private int height,weight;
	public void setName(String name1){
		name=name1;
	}
	public void setID(String ID1){
		ID=ID1;
	}
	public void setDpart(String depart1){
		depart=depart1;
	}
	public void setAddress(String address1){
		address=address1;
	}
	public void setPhone(String phone1){
		phone=phone1;
	}
	public void setHeight(int height1){
		height=height1;
	}
	public void setWieght(int weight1){
		weight=weight1;
	}
	
	
}