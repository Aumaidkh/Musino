package com.android.musino.ui.fragments.songs_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.musino.R
import com.android.musino.data.Song
import com.android.musino.databinding.SongRvBinding

class SongAdapter(
    private val songs: ArrayList<Song>
) : RecyclerView.Adapter<SongAdapter.SongViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val binding = SongRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SongViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songs[position]
        holder.bind(song)
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class SongViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val rvSongName = itemView.findViewById<TextView>(R.id.rvSongName)
        private val rvAlbumName = itemView.findViewById<TextView>(R.id.rvAlbumName)

        fun bind(song: Song) {

            rvSongName.text = song.name
            rvAlbumName.text = song.album
            //TODO: Implement ALbum art here
        }

    }
}