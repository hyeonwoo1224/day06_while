package day06_while;

public class Quiz13 {
	public static void main(String[] args) {
		int i,sum=0,sum1=0;
        for(i=1;i<=1000;i++) {
            //3�� ����̸鼭 5�� ������ƴϸ�-> �����ϰ� 3�� ����� ��󳻱�
            if(i%3==0 && i%5!=0) {
                //������ 3�� ����� �����ش�
                sum1 = sum + i;
            }
            sum = sum + i;
        }
        //1~1000�� ���ϰ� ������ 3�� ����� ���ֱ�
        sum = sum-sum1;
        System.out.println(sum);
	}
}
