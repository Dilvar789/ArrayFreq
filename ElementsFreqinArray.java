import java.util.*;
public class ElementsFreqinArray
	{
	    public static void main(String args[])
	    {
	        int t, i, j, len, count=0;
	        Scanner in = new Scanner(System.in);
	        len = in.nextInt();
	        int[] arr = new int[len];
	        for(i=0;i<len;i++)
	        {
	            t = in.nextInt();
	            arr[i] = t;
	        }
	        for(i=0;i<len;i++)
	        {
	            count=1;
	            for(j=i+1;j<=len-1;j++)
	            {
	                if(arr[i]==arr[j] && arr[i]!='\0')
	                {
	                    count++;
	                    arr[j] = '\0';
	                }
	            }
	            if(arr[i]!='\0')
	            {
	                System.out.println(arr[i] + " is " + count + " times.");
	            }
	        }
	    }
	}