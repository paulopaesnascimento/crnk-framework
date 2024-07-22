package io.crnk.servlet.reactive;


import io.crnk.client.ClientException;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepository;
import io.crnk.core.resource.list.ResourceList;
import io.crnk.servlet.AsyncCrnkServlet;
import io.crnk.servlet.reactive.model.SlowResourceRepository;
import io.crnk.servlet.reactive.model.SlowTask;
import io.crnk.servlet.resource.ReactiveServletTestApplication;
import io.crnk.servlet.resource.ReactiveServletTestContainer;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

import java.io.Serializable;
import java.time.Duration;
import java.util.concurrent.TimeoutException;


//@SpringBootTest(classes = {io.crnk.servlet.resource.ReactiveServletTestApplication.class,io.crnk.servlet.reactive.model.SlowResourceRepository.class, io.crnk.servlet.AsyncCrnkServlet.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = {io.crnk.servlet.resource.ReactiveServletTestApplication.class,io.crnk.servlet.reactive.model.SlowResourceRepository.class, io.crnk.servlet.AsyncCrnkServlet.class})
//@DirtiesContext
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AsyncServletTimeoutTest {
/*
	//@Autowired
	private ReactiveServletTestContainer testContainer;

	//@Autowired
	private SlowResourceRepository slowResourceRepository;

	@Bean
	@ConditionalOnMissingBean
	private AsyncCrnkServlet servlet() {
		return new AsyncCrnkServlet();
	}


	@Test
	public void testNoTimeout() {
		servlet().setTimeout(Duration.ofMillis(2000));
		slowResourceRepository.setDelay(100);

		ResourceRepository<SlowTask, Serializable> repository = testContainer.getRepositoryForType(SlowTask.class);
		QuerySpec querySpec = new QuerySpec(SlowTask.class);
		ResourceList<SlowTask> list = repository.findAll(querySpec);
		Assert.assertEquals(1, list.size());
	}

	@Test
	public void testTimeout() {
		servlet().setTimeout(Duration.ofMillis(2000));
		slowResourceRepository.setDelay(4000);

		ResourceRepository<SlowTask, Serializable> repository = testContainer.getRepositoryForType(SlowTask.class);
		QuerySpec querySpec = new QuerySpec(SlowTask.class);
		try {
			repository.findAll(querySpec);
			Assert.fail();
		} catch (ClientException e) {
			Assert.assertTrue(e.getCause() instanceof TimeoutException);
		}
	}
*/
}
