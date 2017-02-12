class Ex4{
	
	public static void main(String[] args){
		int spc=4;
		int s=1;
		for(int i=0;i<4;i++){
			System.out.print("*****\t");
			for(int a=spc;a>0;a--){			
				System.out.print(" ");
				
			}
			for(int c=1;c<=s;c++){
				System.out.print("* ");
			}
			s++;
			spc--;
			System.out.print("\n");
		}
		
		
	}
	
}
