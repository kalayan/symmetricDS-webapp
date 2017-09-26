package com.lenovo.main;

import java.io.File;

import org.jumpmind.symmetric.SymmetricWebServer;
import org.jumpmind.symmetric.web.SymmetricContextListener;

public class Crop {

	public static void main(String[] args) throws Exception {
		//new Store(new File("src/main/resources/store-001.properties"));
		SymmetricWebServer node = new SymmetricWebServer("src/main/resources/corp-000.properties");
		node.setWebAppDir("src/main/webapp"); 
		node.setJoin(false);
		
		node.start(31415);
	}

}
