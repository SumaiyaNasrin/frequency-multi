package array_test.io.naztech;

public class max_multiplication {
	
	
	
	
	
	public int maxx()
	{
	int arr []= {10,2,14,4,6,7}; 
	int s=arr.length;
int max=0;
int k=0;
//System.out.println("size "+s);

for (int i=0;i<s;i++)
{
	for(int j=0;j<s;j++)
	{
		if(i!=j)
		{
			 k=arr[i]*arr[j];
			if(k>max)
			{
				max=k;
				k=0;
			}
		}
	}
}
//System.out.println("max  "+max);
return max;
	}

}
