import java.util.Arrays;

class Prog1{

 public static void main(String args[]){

   	if(args.length == 0){

		System.out.println("Enter String : ");
		return;

	}

    	Arrays.sort(args);

	System.out.println("Sorted String");

        for(String str : args )
  	{
             System.out.println(str);
        }

 }

}