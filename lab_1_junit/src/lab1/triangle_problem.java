package lab1;
public class triangle_problem {

	 public String check(int x) {
		 
		 int money[]= {50,20,5,5,1,1,1};
		 int i=0;
		 while(x>0&&i<money.length)//�Ӵ�С�������н�ֱ����������õ�ǡ�õ���x��Ǯ
		 {
			 if(money[i]<=x)//��ʹ����ʹ��
				 x-=money[i];
			 i++;
		 }
		 if(x==0) return "yes";
		 else return "no";
	 }
}
