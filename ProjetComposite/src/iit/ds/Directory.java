package iit.ds;

import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFile {

	private String dName;
	private List<AbstractFile> files = new ArrayList<AbstractFile>();

	public Directory(String name) {
		super();
		this.dName = name;
	}

	public void add(AbstractFile abstractFile) {
		files.add(abstractFile);
	}

	@Override
	public void ls() {
		System.out.println(dName);
		for (int i = 0; i < files.size(); i++) {
			AbstractFile file = files.get(i);
			file.ls();
		}
	}

}
