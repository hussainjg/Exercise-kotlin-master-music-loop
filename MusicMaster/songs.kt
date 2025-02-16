fun main(){
    val songs: MutableList<String> = mutableListOf()
    songs.add("Song 1")
    songs.add("Song 2")
    songs.add("Song 3")
    songs.add("Song 4")
    songs.add("Song 5")
    songs.add("Song 6")
    songs.add("Song 7")
    songs.add("Song 8")
    songs.add("Song 9")
    songs.add("Song 10")
    playAll(songs)

}
fun playAll(songs: MutableList<String>){
    for (i in 0..songs.size - 1){
        println("Now playing: ${songs[i]}")
    }
    println("Done Playing ${songs.size} songs.")
}
fun addSong(songs: MutableList<String>, songName: String){
    songs.add(songName)
}
fun removeSong(songs: MutableList<String>, songName: String) {
    for (i in 0..songs.size - 1) {
        if (songs[i] == songName) {
            println("Can't remove song: $songName because not found")
        } else {
            songs.remove(songName)
            println("$songName Removed..")
        }
    }
}
fun shuffleSongs(songs: MutableList<String>){
    songs.shuffle()
}
fun showPlaylist(songs: MutableList<String>){
    println("Playlist:")
    for (i in 0..songs.size - 1){
        println("${songs[i]}")
    }

}

