package lab1;
public class triangle_problem {

	 public String check(int x) {
		 
		 int money[]= {50,20,5,5,1,1,1};
		 int i=0;
		 while(x>0&&i<money.length)//从大到小遍历所有金额，直到遍历完或拿到恰好等于x的钱
		 {
			 if(money[i]<=x)//能使用则使用
				 x-=money[i];
			 i++;
		 }
		 if(x==0) return "yes";
		 else return "no";
	 }
}
