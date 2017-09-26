package com.lenovo.main;

import java.io.File;

import org.jumpmind.symmetric.SymmetricWebServer;

public class Store2 {

	public static void main(String[] args) throws Exception {
		//new Store(new File("src/main/resources/store-001.properties"));
		SymmetricWebServer node = new SymmetricWebServer("src/main/resources/store-001.properties");
		node.setWebAppDir("webapp"); 
		node.setJoin(false);
		node.start(31405);
	}

}
