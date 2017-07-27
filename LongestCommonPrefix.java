package basics;

import java.util.Arrays;

public class LongestCommonPrefix {
	String LCP(String[] arr)
	{
		int[] len=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			len[i]=arr[i].length();
			
		}
		Arrays.sort(len);
		int shortLength=len[0];
		String common="";
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[0].substring(0, shortLength).equalsIgnoreCase(arr[i].substring(0, shortLength)))
			{
				count++;
			}
			else
			{
				
				
					shortLength--;
					count=0;
					i=-1;
				
			}
			}
		if(count==arr.length)
		{
			common=arr[0].substring(0, shortLength);
		}
		
		return common;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] a={"Planet","PlanetMars","PLanetPavithra","PlanetooMeena","Planeturanus","Planetjupiter"};
System.out.println(new LongestCommonPrefix().LCP(a));
	}

}
