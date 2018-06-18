package org.cn.kkl.structuralmodel.compositepattern;

import java.util.ArrayList;
import java.util.List;


public interface AbstractFile {
	void killVirus();
}

class ImageFile implements AbstractFile{
	
	private String name;
	
	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("---image file:"+name+",antivirus operating");
	}
}

class TestFile implements AbstractFile{
	
	private String name;
	
	public TestFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("---text file:"+name+",antivirus operating");
	}
}

class VideoFile implements AbstractFile{
	
	private String name;
	
	public VideoFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("---video file:"+name+",antivirus operating");
	}
}

class Folder implements AbstractFile{
	
	private String name;
	
	private List<AbstractFile> list = new ArrayList<AbstractFile>();
	
	public Folder(String name) {
		super();
		this.name = name;
	}
	
	public void add(AbstractFile file){
		list.add(file);
	} 
	
	public void remove(AbstractFile file){
		list.remove(file);
	}
	
	public AbstractFile getChild(int index){
		return list.get(index);
	}


	@Override
	public void killVirus() {
		System.out.println("---folder:"+name+", antivirus operating ");
		for (AbstractFile file : list) {
			file.killVirus();
		}
	}
	
}
