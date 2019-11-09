
public class InnerClass {
	
	private int num=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnerClass ogj = new InnerClass();
		InnerClass.sub inobj  =  ogj.new sub();
		System.out.print(inobj.sum);
	}
	
	public class sub{
		
		
		
		 int sum = num+4;
	}

}
