
package com.dihuib.camel;

import org.apache.camel.spring.Main;

/**
 * @author dihui.bao
 *
 */
public final class CamelConsoleMain {
	
	private CamelConsoleMain(){
	}

	public static void main(String[] args) {
		Main main = new Main();
		
		main.setApplicationContextUri("META-INF/spring/camel-context.xml");
		main.enableHangupSupport();
		try {
			main.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
