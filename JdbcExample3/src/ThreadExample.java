
class A extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("\t from thread a:i="+i);
}
System.out.println("Exit from a");
}
}

class B extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("\t from thread b:i="+i);
}
System.out.println("Exit from b");
}
}

class ThreadExample
{
public static void main(String args[]){
A obj1 =new A();
obj1.start();
B obj2 =new B();
obj2.start();
}
}
