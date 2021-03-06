/**
 *   Copyright 2012 Christian Trimble
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.github.ctrimble.neon.asm.examples;

import java.net.URL;
import java.net.URLStreamHandlerFactory;

import com.github.ctrimble.neon.classloader.NeonURLClassLoader;

public class ExtendingURLClassLoaderAfter
  extends NeonURLClassLoader
{
	public ExtendingURLClassLoaderAfter(URL[] urls) {
		super(urls);
	}

	public ExtendingURLClassLoaderAfter(URL[] urls, ClassLoader parent) {
		super(urls, parent);
	}

	public ExtendingURLClassLoaderAfter(URL[] urls, ClassLoader parent, URLStreamHandlerFactory handlerFactory) {
		super(urls, parent, handlerFactory);
	}
}
