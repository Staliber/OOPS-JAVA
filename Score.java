import java.io.*;
import java.util.*; 
class Student 
{ 
String name="Jithu"; 
String batch="MCA"; 
} 
class sports extends Student{ 
String sports="football"; 
} 
class result extends sports{ 
String result="win"; 
void display() 
{ 
System.out.println("Student name:"+name); 
System.out.println("Student class:"+batch); 
System.out.println("Student participated in:"+sports); 
System.out.println("Sports result:"+result); 
} 
} 
class Score 
{ 
public static void main(String args[]) 
{ 
result r = new result(); 
r.display(); 
} 
}
