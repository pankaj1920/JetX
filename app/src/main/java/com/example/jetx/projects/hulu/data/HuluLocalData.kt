package com.example.jetx.projects.hulu.data

import com.example.jetx.R
import com.example.jetx.projects.hulu.model.HuluCategoriesModel
import com.example.jetx.projects.hulu.model.HuluContinueWatchingModel
import com.example.jetx.projects.hulu.model.HuluSuggetedMovieModel

object HuluLocalData {

    fun getCategoriesList(): ArrayList<HuluCategoriesModel> {
        val huluCategoriesList = arrayListOf<HuluCategoriesModel>()
        huluCategoriesList.add(HuluCategoriesModel(0,"Popular"))
        huluCategoriesList.add(HuluCategoriesModel(1,"TV Show"))
        huluCategoriesList.add(HuluCategoriesModel(2,"Movies"))
        huluCategoriesList.add(HuluCategoriesModel(3,"Hub"))
        return huluCategoriesList
    }

    fun getContinueWatching():ArrayList<HuluContinueWatchingModel>{
        val continuWatchingList = ArrayList<HuluContinueWatchingModel>()
        continuWatchingList.add(HuluContinueWatchingModel(R.drawable.hulu_continue_1,"Seperti Hujan Yang Jatuh Ke Bumi",0.5f,"Left at : 00:56:45"))
        continuWatchingList.add(HuluContinueWatchingModel(R.drawable.hulu_continue_2,"Warkop DKI Reborn",0.8f,"Left at : 00:10:45"))
        return continuWatchingList
    }

    fun getSuggestedMovie():ArrayList<HuluSuggetedMovieModel>{
        val suggestedMovieList = ArrayList<HuluSuggetedMovieModel>()
        suggestedMovieList.add(HuluSuggetedMovieModel(R.drawable.img_suggested_1))
        suggestedMovieList.add(HuluSuggetedMovieModel(R.drawable.img_suggested_2))
        suggestedMovieList.add(HuluSuggetedMovieModel(R.drawable.img_suggested_3))
        suggestedMovieList.add(HuluSuggetedMovieModel(R.drawable.img_suggested_4))
        return suggestedMovieList
    }
}