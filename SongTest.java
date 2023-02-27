import java.util.Iterator;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

public class SongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song song1 = new Song("Jhoome Jo Pathhan","Arijit Singh","Pathan",2022);
        Song song2 = new Song("Zhingat","Ajay Atul","Sairat",2025);
        Song song3 = new Song("Jane Kyo Log Pyar Karte Hai","Udit Narayan","Dil Chahta Hai",1999);
        Song song4 = new Song("Aaj Ki party","Mika Singh","Bajrangi Bhai Jan",2026);
        Song song5 = new Song("Baby Doll","Sunny Leone","Ragini MMS",1995);
        Song song6 = new Song("Bajrang Bali","Mika Singh","Bajrangi Bhai Jan",2026);
        
        
        System.out.println("Content is ready....all songs are ready...");
		
		ArrayList<Song> myPlayList = new ArrayList<Song>();//not  sorted in array list 
        //TreeSet<Song> myPlayList = new TreeSet<Song>();
		
		System.out.println("Song adding..");
		myPlayList.add(song1);
		
		System.out.println("Song adding..");
		myPlayList.add(song2);
		
		System.out.println("Song adding..");
		myPlayList.add(song3);
		
		System.out.println("Song adding..");
		myPlayList.add(song4);
		
		System.out.println("Song adding..");
		myPlayList.add(song5);
		
		System.out.println("Song adding..");
		myPlayList.add(song6);

		
		//sort arraylist using collections.sort()
		
		System.out.println("Sorting..");
		Collections.sort(myPlayList);
		System.out.println("Sorted..\n");
		
		
		Iterator<Song> it = myPlayList.iterator();
		
		while(it.hasNext()) {
			
			Song a = it.next();
			System.out.println("a = "+a);
		}
		

	}

}

class Song implements Comparable<Song>{
	
	String title;
	String artist;
	String album;
	int year;
	public Song(String title, String artist, String album, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		
		System.out.println("Comparing "+album+" and "+o.album);
		return album.compareTo(o.album);
	}

}