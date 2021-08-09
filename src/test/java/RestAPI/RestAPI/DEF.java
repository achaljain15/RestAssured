package RestAPI.RestAPI;

public class DEF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		int length=arr.length;
		int j=length-1;
		int[] reverse=new int[length];

		if(length==1)
			System.out.println(arr);
		else
		{
			for (int i=0;i<length;i++)
			{
				reverse[i]=arr[j];
				j--;
			}
		}

		for(int i=0;i<length;i++)
			System.out.println(reverse[i]);
	}

}
