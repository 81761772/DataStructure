package study;

public class InsertionSort {
	
	/*�˷������ǰѴ���������Ϊ�����֣������������ģ��ұ���δ����ģ��ӡ������顱�������ѡȡԪ�أ�
	      ���ӡ������顱���ұ��������αȽϲ����룬��ʵ���ϲ��ޡ��������顱֮�֡�*/
	public static void insertionsort(int[] arr){
		//��ѭ���ǴӴ�����������ѡȡԪ�ؽ��бȽϣ����������һ��Ԫ���Ѿ����򣬹ʴ�i=1��ʼѭ����
		for(int i=1;i<arr.length;i++){
			int j = i;
			/*ע��˴�������arr[i]����temp��������棬������е�һ��ѭ��ʱ��
			      ��16�д���Ϊ"arr[1]=4;"������20�д���Ϊ"arr[0]=arr[1]"��
			      ʹ�õ�һ��ѭ�����Ϊ��arr[0]��arr[1]��ֵ��Ϊ4��Ԫ��2��ʧ�ˡ�*/
			int temp = arr[i];
			//��ѭ���ǶԵ�ǰԪ�ؽ��в������������֮ǰ����Ԫ�غ��Ԫ�������λ��
			while((j>0)&&(temp<arr[j-1])){
				//��λ�������Ⱥ������arr[j]�ĵ�ַ���Ⱥ��ұ���arr[j-1]��ֵ��
				arr[j] = arr[j-1];
				j--;
			}
			//����������Ⱥ������arr[j-1]�ĵ�ַ���Ⱥ��ұ���arr[i]��ֵ��
			arr[j] = temp;
		}
		for(int m=0;m<arr.length;m++){
			System.out.print(arr[m]+" ");
		}
	}
	
	public static void main(String[] args){
		int[] arr = {4,2,6,3,1,5,7,9,8};
		InsertionSort.insertionsort(arr);
	}
}
