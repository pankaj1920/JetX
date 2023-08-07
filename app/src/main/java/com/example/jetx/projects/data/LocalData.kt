package com.example.jetx.projects.data

import com.example.jetx.R
import com.example.jetx.projects.model.ProjectListModel

object LocalData {
    fun getProjectList(): ArrayList<ProjectListModel> {
        val projectList = ArrayList<ProjectListModel>()
        projectList.add(ProjectListModel(R.drawable.ic_shop, "Big Cart"))
        projectList.add(ProjectListModel(R.drawable.ic_shop, "Hulu"))
        projectList.add(ProjectListModel(R.drawable.ic_shop, "Adventure"))
        projectList.add(ProjectListModel(R.drawable.ic_shop, "Shopping"))
        projectList.add(ProjectListModel(R.drawable.ic_shop, "Rental Service"))
        projectList.add(ProjectListModel(R.drawable.ic_shop, "Home Made"))
        projectList.add(ProjectListModel(R.drawable.ic_shop, "Cookify"))
        projectList.add(ProjectListModel(R.drawable.ic_shop, "Medi Care"))
        projectList.add(ProjectListModel(R.drawable.ic_shop, "Estate"))
        projectList.add(ProjectListModel(R.drawable.ic_shop, "Grocery"))
        projectList.add(ProjectListModel(R.drawable.ic_shop, "Dating"))
        projectList.add(ProjectListModel(R.drawable.ic_shop, "Muvi"))
        projectList.add(ProjectListModel(R.drawable.ic_shop, "Learning"))
        projectList.add(ProjectListModel(R.drawable.ic_shop, "NFT"))
        return projectList
    }
}