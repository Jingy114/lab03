public class SearchDriver2 {

	public static double mean(long[] a) {
		long sum = 0;
		for (int i = 0; i < a.length; i ++) {
			sum += a[i];
		}
		return ((double) sum) / a.length;
	}

	public static int binSearch(Comparable[] a, Comparable target) {
		return BinSearch.binSearch(a, target);
	}

	public static int linSearch(Comparable[] a, Comparable target) {
		return LinSearch.linSearch(a, target);
	}

  public static void run(Comparable[] arr){
	// Populate array in ascending order
	for (int i = 0; i < arr.length; i ++) {
		arr[i] = i * 2;
	}

	// Temporary Variables
	long sTime = 0;
	long eTime = 0;
	int foundIndex = 0;

	// Test average time to Binary Search
	sTime = System.currentTimeMillis();
	for (int i = 0; i < arr.length; i ++) {
		foundIndex = binSearch(arr, arr[i]);
	}
	eTime = System.currentTimeMillis();

	System.out.println(eTime - sTime);



	// Test avg time to Linear Search
	sTime = System.currentTimeMillis();
	for (int i = 0; i < arr.length; i ++){
		foundIndex = linSearch(arr, arr[i]);
	} 
	eTime = System.currentTimeMillis();
	System.out.println(eTime - sTime);


  }


	public static void main(String[] args){
	
	System.out.println("-----------array-length-----------" + "\n" + "binary search time" + "\n" + "linear search time");
		
	System.out.println("-----------one-thousand-----------");
	Comparable[] thousand = new Comparable[1000];
	run(thousand);
	
	System.out.println("-----------ten-thousand-----------");
	Comparable[] tenT = new Comparable[10000];
	run(tenT);
	
	System.out.println("-----------one-hundred-thousand-----------");
	Comparable[] hundredT = new Comparable[100000];
	run(hundredT);
	
	System.out.println("----------five-hundred-thousand-----------");
	Comparable[] fiveHT = new Comparable[500000];
	run(fiveHT);
	
// 	System.out.println("-----------one-million-----------");
// 	Comparable[] mil = new Comparable[1000000];
// 	System.out.println(run(thousand));
	
// 	System.out.println("-----------five-million-----------");
// 	Comparable[] fiveM = new Comparable[5000000];
// 	System.out.println(run(thousand));
	

	}

}
