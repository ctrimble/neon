package com.github.ctrimble.neon.asm.isolated;


import com.github.ctrimble.neon.asm.URLLoader;
import static org.junit.Assert.assertNotSame;

public class NestedURLLoader implements URLLoader
{
	public String loadUrl(String systemId) throws Exception {
		IsolatedClassLoader classLoader = new IsolatedClassLoader(this.getClass().getClassLoader());
		@SuppressWarnings("unchecked")
		Class<? extends URLLoader> simpleClass = (Class<? extends URLLoader>)classLoader.loadClass("com.github.ctrimble.neon.asm.isolated.IsolatedURLLoader");

		assertNotSame("Test failed to load a new class.", simpleClass, this.getClass().getClassLoader().loadClass("com.github.ctrimble.neon.asm.isolated.IsolatedURLLoader"));
		
		return simpleClass.newInstance().loadUrl(systemId);
	}
}
