package com.example.jetx.navigation.project_graph

import com.example.jetx.navigation.ProjectGraph


sealed class ProjectRoute(val route: String) {
    object ProjectListRoute : ProjectRoute("project_list_route")
    object BigCartRoute : ProjectRoute(ProjectGraph.BIGCART_GRAPH)
    object HuluAppRoute : ProjectRoute(ProjectGraph.HULU_GRAPH)

}
