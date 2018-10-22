package test.java;

import static org.junit.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.junit.Test;

import main.java.Item;
import main.java.SortDemoData;

public class AlgoTest {

	SortDemoData sortDemoData = new SortDemoData();
	String input;
	StringBuffer expectedOutputStringBuf = new StringBuffer();

	//Unit Testing for BubbleSort
	
	// Test Case 1: When there is no element,
	// Flow 20->21->22->36
	@Test(expected = NullPointerException.class)
	public void ifItemisNull_BubbleSort() {
		sortDemoData.runAlgo(0);
	}

	// Test Case 2: When there is only one element,
	// Flow 20->21->22->23->24->25->26->27->36
	@Test
	public void IfOnlyOneItem_BubbleSort() {
		input = "1";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Bubble Sort" + "\n");
		expectedOutputStringBuf.append("0: 1 --> 1\n");
		expectedOutputStringBuf.append("\r");

		assertEquals("There is only one element, so no need to sort", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(0).toString());
	}

	// Test Case 3: When there are two sorted elements
	// Flow 20->21->22->23->24->25->26->27->36
	@Test
	public void IfTwoSortedItems_BubbleSort() {
		input = "1 2";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Bubble Sort" + "\n");
		expectedOutputStringBuf.append("0: 1 --> 1\n");
		expectedOutputStringBuf.append("1: 2 --> 2\n");
		expectedOutputStringBuf.append("\r");

		assertEquals("There are two sorted elements", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(0).toString());
	}

	// Test Case 4: When there are two unsorted elements
	// Flow 20->21->22->23->24->25->26->27->36
	@Test
	public void IfTwoUnSortedItems_BubbleSort() {
		input = "2 1";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Bubble Sort" + "\n");
		expectedOutputStringBuf.append("0: 2 --> 1\n");
		expectedOutputStringBuf.append("1: 1 --> 2\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are two unsorted elements", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(0).toString());
	}

	// Test Case 5: When there are more than two sorted elements
	// Flow 0->21->22->23->24->25->26->27->28->29->33->34->28->29->33->34->28->35
	// ->27->28->29->33->34->28->35->27->36
	@Test
	public void IfMoreThanTwoSortedItems_BubbleSort() {
		input = "1 2 3 4";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Bubble Sort" + "\n");
		expectedOutputStringBuf.append("0: 1 --> 1\n");
		expectedOutputStringBuf.append("1: 2 --> 2\n");
		expectedOutputStringBuf.append("2: 3 --> 3\n");
		expectedOutputStringBuf.append("3: 4 --> 4\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are more than two sorted elements", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(0).toString());
	}

	// Test Case 6: When there are more than two unsorted elements
	// Flow
	// 0->21->22->23->24->25->26->27->28->29->30->31->32->33->34->28->29->30->31->32->33->34->28->35
	// ->27->28->29->33->34->28->35->27->36
	@Test
	public void IfMoreThanTwoUnSortedItems_BubbleSort() {
		input = "4 3 2 1";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Bubble Sort" + "\n");
		expectedOutputStringBuf.append("0: 4 --> 1\n");
		expectedOutputStringBuf.append("1: 3 --> 2\n");
		expectedOutputStringBuf.append("2: 2 --> 3\n");
		expectedOutputStringBuf.append("3: 1 --> 4\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are more than two unsorted elements", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(0).toString());
	}

	// Test Case 7: When there more than more than two unsorted elements (First Half
	// Sorted)
	@Test
	public void IfMoreThanTwoUnSortedFirstHalfSortedItems_BubbleSort() {
		input = "1 2 3 5 4";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Bubble Sort" + "\n");
		expectedOutputStringBuf.append("0: 1 --> 1\n");
		expectedOutputStringBuf.append("1: 2 --> 2\n");
		expectedOutputStringBuf.append("2: 3 --> 3\n");
		expectedOutputStringBuf.append("3: 5 --> 4\n");
		expectedOutputStringBuf.append("4: 4 --> 5\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are more than two unsorted elements (first half sorted)",
				expectedOutputStringBuf.toString(), sortDemoData.runAlgo(0).toString());
	}

	// Test Case 8: When there are more than two unsorted elements (second half
	// sorted)
	@Test
	public void IfMoreThanTwoUnSortedSecondHalfSortedItems_BubbleSort() {
		input = "2 1 3 4 5";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Bubble Sort" + "\n");
		expectedOutputStringBuf.append("0: 2 --> 1\n");
		expectedOutputStringBuf.append("1: 1 --> 2\n");
		expectedOutputStringBuf.append("2: 3 --> 3\n");
		expectedOutputStringBuf.append("3: 4 --> 4\n");
		expectedOutputStringBuf.append("4: 5 --> 5\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are more than two unsorted elements (second half sorted)",
				expectedOutputStringBuf.toString(), sortDemoData.runAlgo(99).toString());
	}

	///////////////////////////////////////////////////////////////////////////////////////////
	
	//Unit Testing for Selection Sort
	@Test(expected = NullPointerException.class)
	public void ifItemisNull_SelectionSort() {
		sortDemoData.runAlgo(1);
	}
	
	@Test
	public void IfMoreThanTwoUnSortedItems_SelectionSort() {
		input = "4 3 2 1";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Selection Sort" + "\n");
		expectedOutputStringBuf.append("0: 4 --> 1\n");
		expectedOutputStringBuf.append("1: 3 --> 2\n");
		expectedOutputStringBuf.append("2: 2 --> 3\n");
		expectedOutputStringBuf.append("3: 1 --> 4\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are more than two unsorted elements", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(1).toString());
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	/*
	//Unit Testing for Insertion Sort
	@Test(expected = NullPointerException.class)
	public void ifItemisNull_InsertionSort() {
		sortDemoData.runAlgo(2);
	}
	
	@Test
	public void IfMoreThanTwoSortedItems_InsertionSort() {
		input = "1 2 3 4";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Insertion Sort" + "\n");
		expectedOutputStringBuf.append("0: 1 --> 1\n");
		expectedOutputStringBuf.append("1: 2 --> 2\n");
		expectedOutputStringBuf.append("2: 3 --> 3\n");
		expectedOutputStringBuf.append("3: 4 --> 4\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are more than two unsorted elements", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(2).toString());
	}
	
	@Test
	public void IfMoreThanTwoUnSortedItems_InsertionSort() {
		input = "4 3 2 1";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Insertion Sort" + "\n");
		expectedOutputStringBuf.append("0: 4 --> 1\n");
		expectedOutputStringBuf.append("1: 3 --> 2\n");
		expectedOutputStringBuf.append("2: 2 --> 3\n");
		expectedOutputStringBuf.append("3: 1 --> 4\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are more than two unsorted elements", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(2).toString());
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	
	//Unit Testing for Merge Sort
	@Test(expected = NullPointerException.class)
	public void ifItemisNull_MergeSort() {
		sortDemoData.runAlgo(3);
	}
	
	@Test
	public void IfMoreThanTwoSortedItems_MergeSort() {
		input = "1 2 3 4";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Merge Sort" + "\n");
		expectedOutputStringBuf.append("0: 1 --> 1\n");
		expectedOutputStringBuf.append("1: 2 --> 2\n");
		expectedOutputStringBuf.append("2: 3 --> 3\n");
		expectedOutputStringBuf.append("3: 4 --> 4\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are more than two unsorted elements", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(3).toString());
	}
	
	@Test
	public void IfMoreThanTwoUnSortedItems_MergeSort() {
		input = "4 3 2 1";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Merge Sort" + "\n");
		expectedOutputStringBuf.append("0: 4 --> 1\n");
		expectedOutputStringBuf.append("1: 3 --> 2\n");
		expectedOutputStringBuf.append("2: 2 --> 3\n");
		expectedOutputStringBuf.append("3: 1 --> 4\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are more than two unsorted elements", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(3).toString());
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	
	//Unit Testing for Quick Sort
	@Test(expected = NullPointerException.class)
	public void ifItemisNull_QuickSort() {
		sortDemoData.runAlgo(4);
	}
	
	@Test
	public void IfMoreThanTwoSortedItems_QuickSort() {
		input = "1 2 3 4";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Quick Sort" + "\n");
		expectedOutputStringBuf.append("0: 1 --> 1\n");
		expectedOutputStringBuf.append("1: 2 --> 2\n");
		expectedOutputStringBuf.append("2: 3 --> 3\n");
		expectedOutputStringBuf.append("3: 4 --> 4\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are more than two unsorted elements", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(4).toString());
	}
	
	@Test
	public void IfMoreThanTwoUnSortedItems_QuickSort() {
		input = "4 3 2 1";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Quick Sort" + "\n");
		expectedOutputStringBuf.append("0: 4 --> 1\n");
		expectedOutputStringBuf.append("1: 3 --> 2\n");
		expectedOutputStringBuf.append("2: 2 --> 3\n");
		expectedOutputStringBuf.append("3: 1 --> 4\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are more than two unsorted elements", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(4).toString());
	}

	///////////////////////////////////////////////////////////////////////////////////////////
	
	//Unit Testing for Heap Sort
	@Test(expected = NullPointerException.class)
	public void ifItemisNull_HeapSort() {
		sortDemoData.runAlgo(5);
	}
	
	@Test
	public void IfMoreThanTwoSortedItems_HeapSort() {
		input = "1 2 3 4";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Heap Sort" + "\n");
		expectedOutputStringBuf.append("0: 1 --> 1\n");
		expectedOutputStringBuf.append("1: 2 --> 2\n");
		expectedOutputStringBuf.append("2: 3 --> 3\n");
		expectedOutputStringBuf.append("3: 4 --> 4\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are more than two unsorted elements", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(5).toString());
	}
	
	@Test
	public void IfMoreThanTwoUnSortedItems_HeapSort() {
		input = "4 3 2 1";

		sortDemoData.initializeArray(input);

		expectedOutputStringBuf.append("Heap Sort" + "\n");
		expectedOutputStringBuf.append("0: 4 --> 1\n");
		expectedOutputStringBuf.append("1: 3 --> 2\n");
		expectedOutputStringBuf.append("2: 2 --> 3\n");
		expectedOutputStringBuf.append("3: 1 --> 4\n");
		expectedOutputStringBuf.append("\r");
		assertEquals("There are more than two unsorted elements", expectedOutputStringBuf.toString(),
				sortDemoData.runAlgo(5).toString());
	}*/
	
}
