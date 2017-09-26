package com.lenovo.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.jumpmind.symmetric.ClientSymmetricEngine;

public class Store {
	private ClientSymmetricEngine cEngine;
	private File propFile;


	public Store(File file) throws FileNotFoundException, IOException {
		propFile = file;
		Properties propertiesFile = new Properties();
		propertiesFile.load(new FileReader(propFile));
		cEngine = new ClientSymmetricEngine(propertiesFile, true);
		
		getcEngine().openRegistration("store", "001");// client is the name of the node group and 001 is the ID
		
		//I think the setup() function creates the config tables in the database and needs to be called before registration.
		getcEngine().setup();
		
		getcEngine().start();
	}

	public ClientSymmetricEngine getcEngine() {
		return cEngine;
	}

	public void setcEngine(ClientSymmetricEngine cEngine) {
		this.cEngine = cEngine;
	}
}
