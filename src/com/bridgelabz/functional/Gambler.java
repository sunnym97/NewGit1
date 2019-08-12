package com.bridgelabz.functional;

public class Gambler {

	public static void main(String[] args) {
		int stake=Integer.parseInt(args[0]);
		int goal=Integer.parseInt(args[1]);
		int trails=Integer.parseInt(args[2]);
		
		int winCount=0,loseCount=0,totalBets;
		/*while((stake!=goal)&&(stake!=0))
		{*/
		
		while(trails!=0)
		{
			double game=Math.random();
			if(game>0.5) 
			{
				winCount++;
				stake++;
			}
			else
			{
				loseCount++;
				stake--;
			}
			trails--;
		}
		//}
		trails=winCount+loseCount;
		System.out.println(stake);
		System.out.println(trails);
		System.out.println(winCount);
		System.out.println(loseCount);
		double percentWin=((winCount*100/trails));
		System.out.println(percentWin);

	}

}
