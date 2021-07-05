import java.util.*;
class Duplicate
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size,i;
System.out.println("Enter Array size=");
size= sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter Array elements=");
for( i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<size;i++)
{
for(int j=i+1;j<size;j++)
{
if(arr[i]==arr[j])
System.out.println(arr[j]);
}}}}
