class Lab3Ex6{

	public static void main(String[] args){
		int num=6483;
		
		int i=0;
		int[] arr=new int[4];
		do{
			
		arr[i]=num%10;
		num=num/10;		
		i++;
		
		}while(num>0);
		
		
		for(int a=3;a>-1;a--){
			System.out.println(arr[a]);
		}
	}
}
