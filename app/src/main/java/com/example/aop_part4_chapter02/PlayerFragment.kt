package com.example.aop_part4_chapter02

import androidx.fragment.app.Fragment

class PlayerFragment:Fragment(R.layout.fragment_player) {



    //나중의 편의성을 위해서 이런 설계를 한다. 전체 인스턴스를 바꾸면 다른 곳에 오류가 날 수 있음.
    companion object{
        fun newInstance():PlayerFragment {
            return PlayerFragment()
        }
    }
}