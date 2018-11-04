package _21concurrency;


/**  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author cofe  
* @date 2018年11月4日  
*    
*/
public class Demo02 {
	public static void main(String[] args) {
		for(int i=10;i<15;i++) {
			new Thread(new Fibonacci(10)).start();
		}
	}
}

class Fibonacci implements Runnable{
	
	private int num;
	
	public Fibonacci(int num) {
		super();
		this.num = num;
	}
	private int fib(int x) {
		if(x < 2) return 1;
		else return fib(x-1)+fib(x-2);
	}
	@Override
	public void run() {
		int res=fib(num);
		System.out.println("输入num:" +num +"得到结果："+res);
	}
	
}