import java.util.ArrayList;
public class Compressor {

	public String compress(String text, int k) 
	{
		/*Create and initialize List of strings segmentDictionary as an empty list*/
		ArrayList<String> segmentDictionary = new ArrayList<>();
		
		/*Create and initialize List of integers segmentList as an empty list*/
		ArrayList<Integer> segmentList = new ArrayList<>();

		/*Create and initialize List of integers outputList as an empty list*/
		ArrayList<Integer> outputList = new ArrayList<>();
		/*while there is still text to read in the text argument*/
		String currentSegment="";
		boolean finished=false;
		int i = 0;
		while(!finished)
		{
			String finalSegment="";
			if(i<text.length())
			{
				finished = true;
				finalSegment=currentSegment;
			}
			else if(text.charAt(i)<48)
			{
				if(currentSegment.length()==0)
				{
					finalSegment=String.valueOf(text.charAt(i));
					i++;
				}
				else
				{
					finalSegment=currentSegment;
					currentSegment="";
				}
			}
			else if(currentSegment.length()>=k)
			{
				finalSegment=currentSegment;
				currentSegment="";
			}
			else
			{
				currentSegment.concat(String.valueOf(text.charAt(i)));
			}
			/*create a segment, put it in currentSegment*/
			
			/*if segmentDictionary contains the same segment
				create an integer listIndex equal to the index of (the index of the segment in 					segmentDictionary) in segmentList
				append the value of |segmentList|-1-listIndex to outputList
				remove the integer at listIndex from the list, and add it back at the end of the list
			else
				add the new segment to the end of segmentDictionary
				append the value of |segmentList| to outputList
				append |segmentDictionary|-1 to segmentList
		end while*/
		}
		/*create a new string called outputString
		for each element in outputList, add that element followed by a space to outputString
		add a new line character to outputString
		for each element in segmentDictionary, add to outputString i:e , where e is the element and i is its index.
		Return outputString*/
		return "";
		
		
	}

}
