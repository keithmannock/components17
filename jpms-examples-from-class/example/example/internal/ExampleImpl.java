package example.internal;

import example.Example;

public class ExampleImpl implements Example {
	public String msg(String message) {
		return "[ " + message + " ]";
	}
}