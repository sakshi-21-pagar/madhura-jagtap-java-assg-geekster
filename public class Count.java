public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345, count=0;
		if(n==0)
		{
		    System.out.println("count is 1");
		    }
		for (int i = n; i>0; i=i/10 ) {
			count++;
			
			
		}
		System.out.println("Count is " +count);

	}

}