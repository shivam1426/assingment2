package question2;

import java.util.ArrayList;

/**
 * Please implement Dynamic Array Interface
 * 
 * @author
 * 
 * shivam chopra
 *
 */
public class MyCollection implements DynamicArray {
	
	@SuppressWarnings("unused")
	private String[] numArray;
	int arraySize;
	int count=0;
	public MyCollection(int arraySize) {
		numArray = new String[arraySize];
	}

	public int search(String searchingNum) {
		int n = numArray.length;
		int value=0;
		for (int i = 0; i < n; i++) {
			if (numArray[i] == searchingNum) {
				int count=0;			value = 1;
				break;
			} else {
				value = 0;

			}

			if (value == 1) {
				System.out.println("Element found at position:" + (i + 1));
			} else {
				return -1;
			}
		}
		return 0;
	}

	public boolean add(String numberToAdd) {
		// TODO Auto-generated method stub
		int k = search(numberToAdd);
	
		if (k > 0 && numArray.length<arraySize) {
numArray[0]=numberToAdd;
count++;
			return true;
		}
		else if(numArray.length>arraySize)
		{
			doubleCapacity();
	count++;
			return true;
		}
			
			return false;
	}

	public void doubleCapacity() {
int size= 2*arraySize;
		numArray = new String[size];
	}

	public boolean remove(String numberToRemove) {
		int src = search(numberToRemove);
		if (src > 0) {
			// numArray= numArray.add(numberToAdd);
			for (int p = 0; p < numArray.length - 1; p++) {
				if (numberToRemove == numArray[p]) {
					numArray[p] = numArray[p + 1];
				}

			}

			for (int k = 0; k < numArray.length - 1; k++)
//			            System.out.println(numArray[k]);
				return true;
		}
		
		return false;
	}

	public int getCount() {
	
		return 0;
	}

	public String[] rotate(int n) {
		ArrayList<String> s= new ArrayList();
		for(int i=0;i<n;i++)
		{
			
		}
		
		return null;
	}

}
