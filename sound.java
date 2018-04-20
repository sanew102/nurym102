import java.io.File;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import java.util.*;

public class sound {
	public static void main (String[] Args) {
		File Clap = new File("mus.WAV");
		Playsound(Clap);
		
		
	}
	static void Playsound (File Sound) {
		System.out.println("as");
		try {
			Scanner input = new Scanner(System.in);
			int z = (int)(Math.random()*100);
			int x = (int)(Math.random()*100);
			System.out.println("enter correct answer " +z+" + "+x);
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			System.out.println(12==12);
			Thread.sleep(clip.getMicrosecondLength()/1000);
			
			int t = x + z;
			int k = input.nextInt();
			if(k==t) {
				clip.stop();
				System.out.println("Stop!");
			}
			
			
			
			
			
		}
		catch(Exception e) {
			System.out.println("there is no such file");
			
		}
	}
	
	
	

}
