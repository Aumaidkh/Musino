package com.android.musino.ui.fragments.songs_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.musino.R
import com.android.musino.data.Song
import com.android.musino.databinding.FragmentSongsListBinding

class SongsListFragment : Fragment(R.layout.fragment_songs_list) {

    private lateinit var binding: FragmentSongsListBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSongsListBinding.bind(view)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        val songs = ArrayList<Song>()
        songs.add(Song("","Bekhaayali","Void","Kabir Singh",null,null))
        songs.add(Song("","Tujhe Kitna","Arjit Singh","Kabir Singh",null,null))
        songs.add(Song("","Kaisay Hua","Arjit Singh","Kabir Singh",null,null))
        songs.add(Song("","Tum Hi ho","Void","Kabir Singh",null,null))
        songs.add(Song("","Tum Mile","Sanam","Kabir Singh",null,null))
        songs.add(Song("","Bin Tere","Palak Muchal","Kabir Singh",null,null))
        songs.add(Song("","Jannat jahaan","Void","Kabir Singh",null,null))
        songs.add(Song("","Zara si","Enrique","Kabir Singh",null,null))
        songs.add(Song("","Tune Jo Na Kaha","Kumar Sanu","Kabir Singh",null,null))
        songs.add(Song("","Hai Junoon","Sajid Wajid","Kabir Singh",null,null))
        songs.add(Song("","Malangg","Kishor Kumar","Kabir Singh",null,null))
        songs.add(Song("","Dum Maro Dum","Void","Kabir Singh",null,null))
        songs.add(Song("","Faltu","Void","Kabir Singh",null,null))

        binding.songsRv.apply {
            adapter = SongAdapter(songs)
            layoutManager = LinearLayoutManager(this@SongsListFragment.context)

        }
    }

}