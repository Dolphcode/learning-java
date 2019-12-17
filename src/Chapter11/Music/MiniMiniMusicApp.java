package Chapter11.Music;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMiniMusicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniMiniMusicApp mmma = new MiniMiniMusicApp();
		mmma.play();
	}
	
	public void play() {
		
		try {
			Sequencer player = MidiSystem.getSequencer(); // Get the sequencer
			player.open(); // Open the sequencer
			
			Sequence seq = new Sequence(Sequence.PPQ, 4); // Make a sequence
			
			Track track = seq.createTrack(); // Create a track
			
			// Put some Midi events into the track
			ShortMessage a = new ShortMessage(); // Make a music
			a.setMessage(144, 1, 44, 100); // Put the instructions in the message
			MidiEvent noteOn = new MidiEvent(a, 1); // Create a MidiEvent using the instructions, MidiEvent says what to do and when to do it
			track.add(noteOn); // Add the event to the track
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);
			
			player.setSequence(seq); // Give the sequence to the sequencer
			
			player.start(); // Start the sequencer
			
			System.out.println("Done!");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
