package Chapter11.Music;

// For this project we'll be using MIDI which gives the appropriate instrument instructions to make sound
import javax.sound.midi.*;

public class MusicTest1 {
	
	public void play() {
		// So this is actually a risky method that can fail at runtime for reasons a programmer can't control
		// This forces you to set up a try/catch in case this does happen
		// The compiler needs to know you know you're taking a risk
		// Otherwise you won't be allowed to run the method
		try {
			// A sequencer takes all the MIDI data and sends it to the instruments
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("We've got a sequencer");
		// Catch takes an object of type Exception as a parameter
		} catch (MidiUnavailableException ex) {
			System.out.println("Bummer");
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}
	
}
