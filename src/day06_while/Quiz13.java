package day06_while;

public class Quiz13 {
	public static void main(String[] args) {
		int i,sum=0,sum1=0;
        for(i=1;i<=1000;i++) {
            //3의 배수이면서 5의 배수가아니면-> 순수하게 3의 배수만 골라내기
            if(i%3==0 && i%5!=0) {
                //순수한 3의 배수만 더해준다
                sum1 = sum + i;
            }
            sum = sum + i;
        }
        //1~1000을 더하고 순수한 3의 배수만 빼주기
        sum = sum-sum1;
        System.out.println(sum);
	}
}
