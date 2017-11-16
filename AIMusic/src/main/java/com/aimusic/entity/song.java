package com.aimusic.entity;

public class song {
private int songId;
private String songName;
private String singerName;
private String albumsName;
private String lyrics;
private String songImage;
private int collection;
public int getSongId() {
	return songId;
}
public void setSongId(int songId) {
	this.songId = songId;
}
public String getSongName() {
	return songName;
}
public void setSongName(String songName) {
	this.songName = songName;
}
public String getSingerName() {
	return singerName;
}
public void setSingerName(String singerName) {
	this.singerName = singerName;
}
public String getAlbumsName() {
	return albumsName;
}
public void setAlbumsName(String albumsName) {
	this.albumsName = albumsName;
}
public String getLyrics() {
	return lyrics;
}
public void setLyrics(String lyrics) {
	this.lyrics = lyrics;
}
public String getSongImage() {
	return songImage;
}
public void setSongImage(String songImage) {
	this.songImage = songImage;
}
public int getCollection() {
	return collection;
}
public void setCollection(int collection) {
	this.collection = collection;
}
public song(int songId, String songName, String singerName, String albumsName, String lyrics, String songImage,
		int collection) {
	super();
	this.songId = songId;
	this.songName = songName;
	this.singerName = singerName;
	this.albumsName = albumsName;
	this.lyrics = lyrics;
	this.songImage = songImage;
	this.collection = collection;
}
public song() {
	super();
}
@Override
public String toString() {
	return "song [songId=" + songId + ", songName=" + songName + ", singerName=" + singerName + ", albumsName="
			+ albumsName + ", lyrics=" + lyrics + ", songImage=" + songImage + ", collection=" + collection + "]";
}


}
