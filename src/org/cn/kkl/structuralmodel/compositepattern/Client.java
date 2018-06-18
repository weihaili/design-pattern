package org.cn.kkl.structuralmodel.compositepattern;

public class Client {
	
	public static void main(String[] args) {
		Client client = new Client();
		client.test01();
	}

	private void test01() {
		AbstractFile imageFile = new ImageFile("abc.jpg");
		imageFile.killVirus();
		
		AbstractFile textFile = new TestFile("hello.txt");
		Folder myFolder = new Folder("myFolder");
		myFolder.add(imageFile);
		myFolder.add(textFile);
		myFolder.killVirus();
	}

}
