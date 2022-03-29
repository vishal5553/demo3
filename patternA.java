package day9;
/*
 *  12345
    1234
    123
    12
    1
 */
public class patternA {

	public static void main(String[] args) {

int k=1;
for(int i=1; i<=5;i++)
{
  k=1;
 for(int j=5;j>=i;j--)
{
System.out.print(k);
k++;
}
 System.out.println();
}


	}

}
