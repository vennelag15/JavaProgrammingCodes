class Basicprograms
{
public static void main(String args[])
{
int num=75;int sum=0;
int dup=num;
while(dup>0)
{int rem=dup%10;
sum=(sum*10)+rem;
 dup=dup/10;
    
}

System.out.println(sum);


}}