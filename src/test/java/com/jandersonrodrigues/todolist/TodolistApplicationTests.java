package com.jandersonrodrigues.todolist;

import com.jandersonrodrigues.todolist.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
class TodolistApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreatTodoSuccess() {
		var todo = new Todo("todo 1", "desc todo", false, 1);
	}

	@Test
	void testCreatTodoFailure() {
	}
}
