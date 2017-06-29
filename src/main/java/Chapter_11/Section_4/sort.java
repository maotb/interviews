package main.java.Chapter_11.Section_4;

/**
 * 排序算法
 * 
 * @author maotb
 * @version 1.0 2017-06-13
 */
public class sort {

	static int[] sortStr = { 8, 6, 5, 7, 2, -3, 9, -4, 1, 0 };

	/**
	 * 冒泡排序 
	 * 稳定 
	 * 时间复杂度： 最差、平均O(n^2);最好O(n) 
	 * 空间复杂度：1
	 */
	public static void bubble() {
		for (int j = 0; j < sortStr.length - 1; j++) {
			boolean exchange = false; // 判断如果已经有序了则跳出循环，不需要做交换
			for (int i = sortStr.length - 1; i > j; i--) {
				if (sortStr[i - 1] > sortStr[i]) {
					swap(i, i - 1);
					exchange = true;
				}
			}
			if (!exchange) {
				break;
			}
		}
	}

	/**
	 * 选择排序
	 * 不稳定 
	 * 时间复杂度： 最差、平均O(n^2) 
	 * 空间复杂度：1
	 */
	public static void select() {
		for (int i = 0; i < sortStr.length; i++) {
			boolean exchange = false;
			for (int j = i + 1; j < sortStr.length; j++) {
				if (sortStr[i] > sortStr[j]) {
					swap(i, j);
					exchange = true;
				}
			}
			if (!exchange) {
				break;
			}
		}
	}

	/**
	 * 插入排序
	 * 稳定 
	 * 时间复杂度： 最差、平均O(n^2) ;最好O(n) 
	 * 空间复杂度：1
	 */
	public static void insert() {
		for (int i = 1; i < sortStr.length; i++) {
			for (int j = i; (j > 0) && (sortStr[j] < sortStr[j - 1]); j--) {
				swap(j, j - 1);
				// System.out.printf("\n i=%d,j=%d \n",i,j);
				// print();
			}
		}
	}
	
	
	/**
	 * 希尔（Shell）排序 
	 * 不稳定 
	 * 时间复杂度： O(n log n)
	 * 空间复杂度：1
	 */
	public static void shell(){
		int index = sortStr.length;
		int j,k;	//循环计数变量
		int temp;	//暂存变量
		boolean change; //数据是否改变
		int dataLength;	//分割集合的间隔长度
		int pointer;	//进行处理的位置
		
		dataLength = (int) index/2;	//初始集合间隔长度
		
		while (dataLength!=0) {	//数列仍可进行分割
			
			for (j = dataLength; j < index; j++) {
				change = false;
				temp = sortStr[j];	//暂存 Data[j]的值，待交换值时使用
				pointer = j - dataLength;	//计算进行处理的位置
				
				//进行集合内数值的比较与交换值
				while(temp<sortStr[pointer] && pointer >= 0 && pointer <=index ){
					sortStr[pointer + dataLength] = sortStr[pointer];
					//计算下一个欲进行处理的位置
					pointer = pointer - dataLength;
					change = true;
					if(pointer < 0 || pointer >index){
						break;
					}
				}
				
				//与最后的数值交换
				sortStr[pointer + dataLength] = temp;
				
				if(change){
					//打印目前排序结果
					System.out.println("排序中：");
					for (k = 0; k < index; k++) {
						System.out.printf("%3s ",sortStr[k]);
					}
					System.out.println();
				}
			}
			dataLength = dataLength /2 ;	//计算下次分割的长度
		}
	}
	
	/**
	 * 二分排序
	 * 稳定 
	 * 时间复杂度： O(n^2)
	 * 空间复杂度：1
	 * 算法思想
		二分法插入排序是在插入第i个元素时，对前面的0～i-1元素进行折半，先跟他们中间的那个元素比，如果小，则对前半再进行折半，否则对后半进行折半，
		直到low>high，然后再把第i个元素前1位与目标位置之间的所有元素后移，再把第i个元素放在目标位置上。
	 */
	public static void binary() {
		int i, j;
		int low, high, mid;
		int temp;
		for (i = 0; i < sortStr.length; i++) {
			temp = sortStr[i];
			low = 0;
			high = i - 1;
			
			//对前面的0～i-1元素进行折半，先跟他们中间的那个元素比，如果小，则对前半再进行折半，否则对后半进行折半,直到low>high
			while (low <= high) {
				mid = (low + high) / 2;
				if (sortStr[mid] > temp) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
			
			//然后再把第i个元素前1位与目标位置之间的所有元素后移，再把第i个元素放在目标位置上
			for(j =i-1;j>high;j--){
				sortStr[j+1] = sortStr[j];
			}
			sortStr[high+1] = temp;
		}
	}
	
	/**
	 * 快速排序
	 * 不稳定 
	 * 时间复杂度： 平均 O(n log n) ,最坏 O(n^2)
	 * 空间复杂度：O(log n)
	 * 基本思想：通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
	 * 		      然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
	 */
	public static void quick(int r[],int low,int high){
		int pivotpos = 0;	//划分后的基准记录的位置
		if(low<high){	//仅当区间长度大于1时才需排序
			 pivotpos = partition(r,low,high);	//对source做划分
			 quick(r, low, pivotpos -1 );	//对左区间递归排序
			 quick(r, pivotpos+1, high ); //对右区间递归排序
		}
	}
	
	public static int partition(int r[],int i,int j){
		// 对 r[low……high] 做划分。
		//并返回基准记录的位置
		int pivot = r[i] ;	//用区间的第一个记录作为基准
		while (i <j ) {	//从区间两端交替向中间扫描，直至 i = j 为止
			
			/**从右向左扫描 将比基准值小的数据全部扔到基准值左边**/
			while(i<j && r[j] > pivot){	//pivot 相当于在位置i上
				j--;	//从右向左扫描，查找第一个关键字小于pivot的记录r[j]
			}
			if(i<j){	//表示找到r[j]的关键字 < pivot
				r[i++] = r[j]; //相当于交换r[i]和r[j],交换后i指针加1。注意 i++是先使用后自增
			}
			
			/**从左向右扫描 将比基准值大的数据全部扔到基准值右边**/
			while(i<j&&r[i]<pivot){	//pivot相当于在位置j上
				i++;	//从左向右扫描，查找第一个关键字大于pivot的记录r[i]
			}
			if(i<j){	//表示找到了r[i],使r[i] > pivot
				r[j--] = r[i];
			}
		}//当i和j相遇时划分完成，此时i=j 同时指向基准值
				
		r[i] = pivot;	//基准记录已被最后定位
		return i;
	}
	
	
	
	/**
	 * 归并排序
	 * 不稳定 
	 * 时间复杂度：O(nlog n)
	 * 空间复杂度：O(n)
	 * 先分割再排序
	 */
	public static void division(int array[],int start,int end){
		if(start < end){
			
			//两路归并
			int mid = (start+end)/2;
			division(array, start, mid);
			division(array, mid+1, end);
			merge(array, start, mid, mid+1, end);
			
			//多路归并
			/*int mid = (start + end)/4;
			division(array, start, 1*mid);
			division(array, 1*mid+1, 2*mid);
			division(array, 2*mid+1, 3*mid);
			division(array, 3*mid+1, end);
			merge(array, start, 1*mid, 1*mid+1, 2*mid);
			merge(array, 2*mid+1,3*mid, 3*mid+1, end);
			merge(array, start, 2*mid, 2*mid+1, end);*/
		}
	}
	
	public static void merge(int array[],int start1,int end1,int start2,int end2){
		if(start1>end2){
			return ;
		}
		int i,j;	//i,j分别为表1和表2的游标
		{
			i = start1;
			j = start2;
		}
		
		int k=0; int [] temp = new int[end2-start1+1]; //建立一个临时长度为两个子列表长度之和的数组
		while( i<=end1 && j<= end2){
			if(array[i]>array[j]){
				temp[k++]=array[j++];
			}else{
				temp[k++]=array[i++];
			}
		}
		
		//把剩下的元素一次放入临时数组中(肯定是只剩一方)
		while(i<=end1){
			temp[k++] = array[i++];
		}
		while(j<=end2){
			temp[k++] = array[j++];
		}
		
		k = start1;
		
		for(int element :temp){	//把临时数组元素复制给原数组
			array[k++] = element;
		}
	}
	
	
	/**
	 * 交换
	 * 
	 * @param x
	 * @param y
	 */
	public static void swap(int x, int y) {
		int temp = sortStr[x];
		sortStr[x] = sortStr[y];
		sortStr[y] = temp;
	}

	public static void print() {
		for (int i : sortStr) {
			System.out.printf("%d ", i);
		}
	}
	
	public static void main(String[] args) {

		// bubble();

		// select();

		// insert();

		// shell();

		// binary();

		// quick(sortStr, 0, sortStr.length-1);

		// division(sortStr, 0, sortStr.length-1);

		print();
	}
}
