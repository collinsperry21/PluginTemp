package com.github.collinsperry21.plugintemp.services

import com.intellij.openapi.project.Project
import com.github.collinsperry21.plugintemp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
