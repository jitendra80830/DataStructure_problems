//Find the average of array
public class AverageCal{
	public static void main(String[] args){
		float numbers[]={3.2f,1.2f,9.8f,10.1f,5.1f,7.0f};
		float sum=0.0f;
		float average;
		for(float i : numbers){
			
			sum+=i;
		}
		System.out.println("Sum= "+sum);
		average=sum/numbers.length;
		System.out.println("Average= "+average);
	}
}
		
