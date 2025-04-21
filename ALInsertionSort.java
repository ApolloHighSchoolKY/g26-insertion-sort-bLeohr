import java.util.ArrayList;

public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNums[] = {0, 15, 6, 8, 2, 37, 102, -21, 30, 7, 12};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;

		//Add the first number to the array list

		//Loop once for all of the remaining numbers in the unsorted list

			//Check with each of the numbers in the sorted list

				//If this number is less than one in the sorted list,
				//insert it there

			//If it was not inserted, stick it on the end.


		//End Loop for unsorted list

		for(int i=0; i<myNums.length; i++)
		{
			for(int j=0; j<sorted.size(); j++)
			{
				if(myNums[i]<sorted.get(j))
					{
						sorted.add(j,myNums[i]);
						inserted=true;
						j=sorted.size();
					}
			}		

			if(!inserted)
				sorted.add(sorted.size(),myNums[i]);

			inserted=false;
		}

		//for(int i=0; i<myNums.length; i++)
		//	myNums[i]=sorted.get(i);

		System.out.println(sorted);

		//Move the data back to the array

		//Print the contents of the array

    }


}
