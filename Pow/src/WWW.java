class pass
{
	private int a=20,b=5;//instance variable
	private static int c=10;
	
	public pass()
	{
		
	}
	
	public pass(int a)
	{
		this.a=a;
	}
	
	public void display(){
		//System.out.println(a+"\n"+b+"\n"+c);
		System.out.println(getA()+"\n"+getB()+"\n"+getC());
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static int getC() {
		return c;
	}

	public static void setC(int c) {
		pass.c = c;
	}
	
}
public class WWW {
	public static void main(String[] args)
	{
		pass obj=null;
		//pass obj=new pass(100);
		WWW Clas = new WWW();
		obj=new pass();
		Clas.ref(obj);
		
	}
	public void ref(pass p)//pass by reference
	{
		p.display();
	}
}
