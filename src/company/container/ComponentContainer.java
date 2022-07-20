package com.company.container;

import com.company.controller.TasksController;
import com.company.service.TaskService;
import com.company.taskRepository.TaskIOSystem;

import java.util.Scanner;

public interface ComponentContainer {
		Scanner scanner = new Scanner(System.in);
		TasksController tasksController = new TasksController();
		TaskService taskService = new TaskService();
		TaskIOSystem taskIOSystem = new TaskIOSystem();
}
