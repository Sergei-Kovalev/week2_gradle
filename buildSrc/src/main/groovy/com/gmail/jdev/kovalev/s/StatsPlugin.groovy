package com.gmail.jdev.kovalev.s

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.execution.TaskExecutionGraph

/**
 * Плагин для вывода графа подпроекта и подсчёта тасок в нём.
 */
class StatsPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        calculate(project)
    }

    // метод для вывода графа подпроекта и подсчёта количества тасок в нём
    static void calculate(Project project) {
        project.getGradle().taskGraph.whenReady { TaskExecutionGraph graph ->
            int size = 0
            println '------Graph:'
            graph.allTasks.each {
                //без if'а тянет все задачи основного проекта, а так задачи подпроекта
                if (it.project.name.contains(project.name)) {
                    println it.name + ': ' + it.description
                    size++
                }
            }
            //считает количество задач относящихся к подпроекту
            println '---------------------------------------------------------'
            println 'Project ' + project.name + ' contains ' + size + ' tasks.'
            println '---------------------------------------------------------'
        }
    }
}