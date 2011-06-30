package org.EntityJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EntityTest
{
	@Test
	public void testEntityX() {
		Entity tester = new Entity(4000,500,500);
		assertEquals("Result", 5, tester.getX());
	}
	@Test
	public void testEntityCollidable() {
		Entity e = new Entity(4000,500,500);
		Entity e2 = new Entity(4000,500,500);
		assertEquals("Result", true, e.collidesWith(e2));
	}
	@Test
	public void testEntityCollidable2() {
		Entity e = new Entity(4000,500,500);
		Entity e2 = new Entity(4000,500,500);
		e2.x1 = 500;
		e2.x2 = 400;
		assertEquals("Result", true, e.collidesWith(e2));
	}
}
