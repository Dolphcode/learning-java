package Chapter11.MultiExceptions;

import Chapter11.CustomExceptions.ParalysisException;
import Chapter11.CustomExceptions.PoisonException;

public class Fungiologist {
	
	//Instance variables
	static SolCap mrSun = new SolCap();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sense = (int) Math.round(Math.random());
		mrSun.recordData();
		try {
			// We're gonna try one of the two randomly
			if (sense == 1) {
				System.out.println("Gonna sniff it!");
				mrSun.sniff();
			} else {
				System.out.println("Gonna touch it!");
				mrSun.touch();
			}
		} catch (PoisonException poex) {
			// If we catch a poison exception
			System.out.println(poex);
		} catch (ParalysisException paex) {
			// If we catch a paralysis exception
			System.out.println(paex);
		}
	}

}
