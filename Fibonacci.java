import java.io.*;
import java.util.*;
class Fibonacci
{
public static void main (String args[])
{
int i,a,b,c;
a=-1;
b=1;
for(i=1;i<=10;i++)
{
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
}
}
}
