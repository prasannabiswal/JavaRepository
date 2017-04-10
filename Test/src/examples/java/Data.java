package examples.java;

public class Data {
	int temp[] = {1,2,3,4};
	
	public void showData () {
		for(int i = 0 ; i< temp.length ; i++) {
			System.out.println("Showing Data : " + temp[i]);
		}
	}
}
