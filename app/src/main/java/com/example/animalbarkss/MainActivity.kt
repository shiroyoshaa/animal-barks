package com.example.animalbarkss

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.animalbarkss.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ivCat.setOnClickListener {
            val mediapalyer = MediaPlayer.create(this, R.raw.meiw)
            mediapalyer.start()
            it.animate()
                .scaleX(0.95f)
                .scaleY(0.95f)
                .setDuration(170)
                .withEndAction {
                    it.animate()
                        .scaleX(1f)
                        .scaleY(1f)
                        .setDuration(170)
                        .start()
                }.start()
        }
        binding.ivDog.setOnClickListener {
            val mediapalyer = MediaPlayer.create(this, R.raw.dogy)
            mediapalyer.start()
            it.animate()
                .scaleX(0.95f)
                .scaleY(0.95f)
                .setDuration(170)
                .withEndAction {
                    it.animate()
                        .scaleX(1f)
                        .scaleY(1f)
                        .setDuration(170)
                        .start()
                }.start()
        }
        binding.ivLion.setOnClickListener {
            val mediaplayer = MediaPlayer.create(this, R.raw.lion)
            mediaplayer.start()
            it.animate()
                .scaleX(0.95f)
                .scaleY(0.95f)
                .setDuration(170)
                .withEndAction {
                    it.animate()
                        .scaleX(1f)
                        .scaleY(1f)
                        .setDuration(170)
                        .start()
                }.start()

        }
        binding.IvBird.setOnClickListener {
            val mediaplayer = MediaPlayer.create(this, R.raw.bird_sound)
            mediaplayer.start()
            it.animate()
                .scaleX(0.95f)
                .scaleY(0.95f)
                .setDuration(170)
                .withEndAction {
                    it.animate()
                        .scaleX(1f)
                        .scaleY(1f)
                        .setDuration(170)
                        .start()
                }.start()
        }
        binding.ivPig.setOnClickListener {
            val mediaplayer = MediaPlayer.create(this, R.raw.pig_sound)
            mediaplayer.start()
            it.animate()
                .scaleX(0.95f)
                .scaleY(0.95f)
                .setDuration(170)
                .withEndAction {
                    it.animate()
                        .scaleX(1f)
                        .scaleY(1f)
                        .setDuration(170)
                        .start()
                }.start()
        }
        binding.ivElephant.setOnClickListener {
            val mediaplayer = MediaPlayer.create(this, R.raw.elephant_anime_girls_sound)
            mediaplayer.start()
            it.animate()
                .scaleX(0.95f)
                .scaleY(0.95f)
                .setDuration(170)
                .withEndAction {
                    it.animate()
                        .scaleX(1f)
                        .scaleY(1f)
                        .setDuration(170)
                        .start()
                }.start()
        }
        binding.ivFrog.setOnClickListener {
            val mediaplayer = MediaPlayer.create(this, R.raw.frog_sound)
            mediaplayer.start()
            it.animate()
                .scaleX(0.95f)
                .scaleY(0.95f)
                .setDuration(170)
                .withEndAction {
                    it.animate()
                        .scaleX(1f)
                        .scaleY(1f)
                        .setDuration(170)
                        .start()
                }.start()
        }
        binding.ivGoose.setOnClickListener {
            val mediaplayer = MediaPlayer.create(this, R.raw.anime_goose)
            mediaplayer.start()
            it.animate()
                .scaleX(0.95f)
                .scaleY(0.95f)
                .setDuration(170)
                .withEndAction {
                    it.animate()
                        .scaleX(1f)
                        .scaleY(1f)
                        .setDuration(170)
                        .start()
                }.start()
        }
        binding.ivFox.setOnClickListener {
            val mediaplayer = MediaPlayer.create(this, R.raw.fox_anime)
            mediaplayer.start()
            it.animate()
                .scaleX(0.95f)
                .scaleY(0.95f)
                .setDuration(170)
                .withEndAction {
                    it.animate()
                        .scaleX(1f)
                        .scaleY(1f)
                        .setDuration(170)
                        .start()
                }.start()
        }
    }
}