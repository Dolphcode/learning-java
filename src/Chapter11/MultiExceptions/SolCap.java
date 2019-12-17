package Chapter11.MultiExceptions;

import Chapter11.CustomExceptions.ParalysisException;
import Chapter11.CustomExceptions.PoisonException;

//Hey it's that sol cap, but now let's make it more dangerous, more risky!
public final class SolCap extends Mushroom {
	
	public SolCap() {
		super(true, "Gold with Reds and Oranges", "Sol-cap");
	}
	
	/**
	 * A fungiologist will sniff with a risky chance of being poisoned
	 * @throws PoisonException
	 */
	public void sniff() throws PoisonException {
		int poison = (int) (Math.random() * 100);
		if (poison > 25 && poison < 75) {
			throw new PoisonException();
		} else {
			System.out.println("Smells like healthy grass with a touch of lavender :)");
		}
	}
	
	/**
	 * A fungiologist will touch with a risky chance of being paralyzed
	 * @throws ParalysisException
	 */
	public void touch() throws ParalysisException {
		int paralysis = (int) (Math.random() * 100);
		if (paralysis > 25 && paralysis < 75) {
			throw new ParalysisException();
		} else {
			System.out.println("Feels nice and soft, also very smooth, somewhat warm and cozy :)");
		}
	}
	/**
	 * A fungiologist will touch with a risky chance of being paralyzed
	 * @throws ParalysisException
	 * @throws PoisonException
	 */
	// This throws multiple exceptions
	public void eat() throws ParalysisException, PoisonException {
		int eat = (int) (Math.random() * 100);
		if (eat > 25 && eat < 50) {
			throw new ParalysisException();
		} else if (eat > 50 && eat < 75) {
			throw new PoisonException();
		} else {
			System.out.println("Tastes sweet and warm, make you want to nap :)");
		}
	}

}
